# Data Transfer Objects (DTO)

## Table Of Contents

# DTO Objects

- A **DTO** is a design pattern used to transfer data between different parts of a software system, typically between layers or processes like client-server communication or service-to-service interactions. DTOs help in decoupling the internal data models from the external representation, improving maintainability and security.
- Features of DTO include:
  1. **Lightweight**: Only contains data, with no business logic.
  2. **Immutable** or **mutable**: Depends on use case, but immutability is often preferred to avoid unintended modifications.
  3. **Serializable**: Suitable for transmission over the network (e.g., JSON, XML, etc.).
- When to use a DTO:#
  1. Client-Server Communication: When transferring data between a frontend (React, Angular) and backend (Node.js, Java).
  2. Microservices: For communication between services to avoid exposing internal models.
  3. APIs: To shape data responses, ensuring only relevant data is sent and sensitive fields are hidden.
  4. Decoupling Layers: Helps to prevent tight coupling between application layers (e.g., database models vs. API responses).
- Benefits of DTOs include:
  1. Security: Prevents exposing sensitive or internal data (e.g., passwords, system details).
  2. Performance: Reduces payload size by sending only necessary fields.
  3. Maintainability: Changes in one layer (like the database schema) don’t immediately impact external clients.
  4. Consistency: Standardizes data representation across layers or services.

# DTO vs. Other Patterns

## 1. DTo vs. Entity

- Entity: Represents a database object and often contains business logic.
- DTO: Used purely for transporting data, often with simpler structures.

## 2. DTO vs View Model:

- A View Model is tailored for rendering UI views, which may include formatting logic or properties relevant only to presentation.
- A DTO is only concerned with transferring data.

# Examples of a DTO

## 1. Example of a DTO in Node.js / TypeScript

- Examples:

  ```ts
  // UserDTO.ts
  export class UserDTO {
    id: number;
    username: string;
    email: string;

    constructor(id: number, username: string, email: string) {
      this.id = id;
      this.username = username;
      this.email = email;
    }
  }
  ```

- Usage in a service:

  ```ts
  // userService.ts
  import { UserDTO } from "./UserDTO";
  import { UserEntity } from "./UserEntity"; // Hypothetical database model

  function toUserDTO(userEntity: UserEntity): UserDTO {
    return new UserDTO(userEntity.id, userEntity.username, userEntity.email);
  }

  const userEntity = new UserEntity(
    1,
    "johndoe",
    "johndoe@example.com",
    "hashedpassword"
  );
  // Convert entity to DTO before sending it in API response
  const userDTO = toUserDTO(userEntity);

  console.log(userDTO); // UserDTO { id: 1, username: 'johndoe', email: 'johndoe@example.com' }
  ```

## 2. Example of DTO in Java with Spring Boot

- Step 1: Create a DTO Class
- Step 2: Create an Entity (JPA Model)
- Step 3: Create a Mapper (Entity ↔ DTO Conversion):
  - A **mapper** helps to convert between **DTOs** and **entities**. You can write these mappings manually or use a tool like MapStruct.
- Step 4: Use DTO in a Service and Controller

# Automating DTO Mapping with MapStruct

- Writing mappers manually can become tedious. `MapStruct` automates the process:
  ```java
    @Mapper
    public interface UserMapper {
        UserDTO toDTO(UserEntity entity);
        UserEntity toEntity(UserDTO dto);
    }
  ```
- Add the `@Mapper` annotation and `MapStruct` generates the implementation during compilation.

# Defining the Mapper

- With the configuration in place, we can define the mapper:
- Example (Convert between `Customer` and `CustomerDTO`):

  ```java
    import org.mapstruct.Mapper;
    import org.mapstruct.Mapping;

    @Mapper(componentModel = "spring")
    public interface CustomerMapper {
        @Mapping(source = "name", target = "customerName")
        CustomerDTO toDTO(Customer customer);
        @Mapping(source = "customerName", target = "name")
        Customer toEntity(CustomerDTO customerDTO);
    }
  ```

## Example 2. Map `LocalDateTime` to `Instant` in `MapStruct`

- When working with dates and times in Java, we often encounter different formats, such as `LocalDateTime` and `Instant`. While `LocalDateTime` represents a date-time without a time zone, `Instant` represents a specific point in time, usually with reference to the epoch (**January 1, 1970, 00:00:00 UTC**). In many scenarios, we need to map between these two types. Fortunately, `MapStruct`, a powerful Java mapping framework, allows us to do this easily.
- Understanding `LocalDateTime` and `Instant`
  - `LocalDateTime` is useful for representing events that occur at a specific local time, without considering time zones. We commonly use it to store timestamps in databases and log files. `LocalDateTime` **is a good choice for applications where all users operate in the same time zone**.
  - `Instant` is great for tracking global events, ensuring time zone consistency and providing a reliable format for interacting with external systems or APIs. In addition, it’s also useful for storing timestamps in a database with a need for time zone consistency.
- Mapping Scenario:

  - Suppose we’re implementing an order processing service. We have two flavours of orders – order and local order. Order uses `Instant` to support global order processing whereas the local order uses `LocalDateTime` to represent the local time.
  - Here is the implementation of the order model:
    ```java
        public class Order {
            private Long id;
            private Instant created;
            // other fields
            // getters and setters
        }
    ```
  - Then, we have the implementation of the local order:
    ```java
        public class LocalOrder {
            private Long id;
            private LocalDateTime created;
            // other fields
            // getters and setters
        }
    ```

- Mapping `LocalDateTime` to `Instant`:

  - Implement the mapper to convert `LocalDateTime` to `Instant`.

    ```java
        @mapper
        public interface OrderMapper {
            OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

            ZoneOffset DEFAULT_ZONE = ZoneOffset.UTC;

             @Named("localDateTimeToInstant")
            default Instant localDateTimeToInstant(LocalDateTime localDateTime) {
                return localDateTime.toInstant(DEFAULT_ZONE);
            }

            @Mapping(target = "id", source = "id")
            @Mapping(target = "created", source = "created", qualifiedByName = "localDateTimeToInstant")
            Order toOrder(LocalOrder source);
    }
    ```

    - This `OrderMapper` interface is a **MapStruct mapper** that converts a `LocalOrder` object to an `Order` object while handling a custom conversion for date-time fields. It declares a constant `DEFAULT_ZONE` with a value of `ZoneOffset.UTC`, which represents the UTC timezone.
    - The `localDateTimeToInstant()` method, annotated with `@Named`, converts a `LocalDateTime` into an `Instant` using the specified `ZoneOffset`.
    - The `toOrder()` method maps `LocalOrder` to `Order`. It uses `@Mapping` to define how fields are mapped. The `id` field is directly mapped from source to target. For the `created` field, it applies the custom `localDateTimeToInstant()` method by specifying `qualifiedByName = “localDateTimeToInstant”.` This ensures that the `LocalDateTime` in `LocalOrder` is properly converted to `Instant` in `Order`.

- **Remarks**:
  - `MapStruct` uses conventions for mapping data types. Mapping complex objects with nested properties or converting between certain data types can raise errors. Default methods in a `MapStruct` interface can define explicit conversions between types that `MapStruct` doesn’t natively support. These methods resolve ambiguities and provide necessary instructions for conversion. That ensures accurate and reliable mappings. In addition, they’re also useful for complex or nested property mapping. In conclusion, they’re a best practice for maintaining clean, maintainable code in MapStruct mappings.
- Let's Test Our Mapper:

  ```java
    class OrderMapperUnitTest {
        private OrderMapper mapper = OrderMapper.INSTANCE;

        @Test
        void whenLocalOrderIsMapped_thenGetsOrder() {
            LocalDateTime localDateTime = LocalDateTime.now();
            long sourceEpochSecond = localDateTime.toEpochSecond(OrderMapper.DEFAULT_ZONE);
            LocalOrder localOrder = new LocalOrder();
            localOrder.setCreated(localDateTime);

            Order target = mapper.toOrder(localOrder);

            Assertions.assertNotNull(target);
            long targetEpochSecond = target.getCreated().getEpochSecond();
            Assertions.assertEquals(sourceEpochSecond, targetEpochSecond);
        }
    }
  ```

  - This test case checks if OrderMapper correctly converts a LocalOrder to an Order, focusing on the created field mapping from LocalDateTime to Instant. It creates a LocalDateTime, calculates its epoch second value, sets it to a new LocalOrder, maps it to an Order, and checks if the result isn’t null. Finally, it compares the epoch second values between the LocalDateTime of LocalOrder and the Instant of Order. If they match, the test passes.

## Example 3. Mapping `Instant` to `LocalDateTime`

- map the `Instant` back to `LocalDateTime`:

  ```java
    @Mapper
    public interface OrderMapper {
        OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
        ZoneOffset DEFAULT_ZONE = ZoneOffset.UTC;

        @Named("instantToLocalDateTime")
        default LocalDateTime instantToLocalDateTime(Instant instant) {
            return LocalDateTime.ofInstant(instant, DEFAULT_ZONE);
        }

        @Mapping(target = "id", source = "id")
        @Mapping(target = "created", source = "created", qualifiedByName = "instantToLocalDateTime")
        LocalOrder toLocalOrder(Order source);
    }
  ```

- The `OrderMapper` now defines a mapping that converts Order objects to LocalOrder objects. It includes a custom mapping method, `instantToLocalDateTime()`, which converts `Instant` to `LocalDateTime` using a predefined `ZoneOffset (UTC)`.
- The `@Mapping` annotations in `toLocalOrder()` indicate that the `id` field is directly mapped from `Order` to `LocalOrder`. Then it uses the custom method (qualifiedByName = “instantToLocalDateTime”) for the created field and converts Instant to LocalDateTime.
- Test Mapping by:

  ```java
    @Test
    void whenOrderIsMapped_thenGetsLocalOrder() {
        Instant source = Instant.now();
        long sourceEpochSecond = source.getEpochSecond();
        Order order = new Order();
        order.setCreated(source);

        LocalOrder target = mapper.toLocalOrder(order);

        Assertions.assertNotNull(target);
        long targetEpochSecond = target.getCreated().toEpochSecond(OrderMapper.DEFAULT_ZONE);
        Assertions.assertEquals(sourceEpochSecond, targetEpochSecond);
    }
  ```

- This test verifies that the OrderMapper correctly converts an Order object to a LocalOrder object, focusing on mapping Instant to LocalDateTime.
- The test creates an Instant object with the current timestamp and calculates its epoch second. It then creates an Order object and sets the Instant value to its created field.

# Using the Mapper in Your Services

- With the **mapper** in place, you can now convert the **DTO** to the model and vice versa in your services.

# Exposing the DTO Objects via REST Endpoint

# Resources and Further Reading

1. [https://www.mastertheboss.com/java-ee/jpa/how-to-map-your-dto-objects-with-mapstruct/?ref=dailydev#google_vignette](https://www.mastertheboss.com/java-ee/jpa/how-to-map-your-dto-objects-with-mapstruct/?ref=dailydev#google_vignette)
2. [https://www.baeldung.com/java-mapstruct-localdatetime-instant?ref=dailydev#understanding-localdatetime-and-instant](https://www.baeldung.com/java-mapstruct-localdatetime-instant?ref=dailydev#understanding-localdatetime-and-instant)
