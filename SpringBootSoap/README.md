### Spring Boot 3 and Java 17 SOAP Client

This project is a SOAP client built with Spring Boot 3 and Java 17. It consumes a SOAP web service to perform basic mathematical operations (addition, subtraction, multiplication, and division) and exposes REST endpoints to return the results.

**Features:**

* SOAP client implementation using Spring Web Services
* Exposes REST endpoints for each mathematical operation
* Handles SOAP requests and responses
* Parses XML data using JAXB
* Validates SOAP messages using XML Schema

**Prerequisites:**

* Java 17 or higher
* Maven

**Getting Started:**

1. Clone the repository:

2. Install dependencies:

```
mvn install
```

3. Run the application:

```
mvn spring-boot:run
```

**Usage:**

The application exposes REST endpoints for each mathematical operation:

* `/add`: Adds two numbers
* `/subtract`: Subtracts two numbers
* `/multiply`: Multiplies two numbers
* `/divide`: Divides two numbers

To use the endpoints, send a POST request.


For example, to add 10 and 5, send a POST request to `/add`:

```
curl -X POST http://localhost:8080/add?numberA=10&numberB=5 -H 'Content-Type: application/json'
```

The response will be a JSON object with the result:

```json
{
  "result": 15
}
```

**Contributions:**

Contributions are welcome! Please create a pull request with your changes.

## Author

* **Miguel Caceres** - [Bio](https://github.com/foxneo)

**License:**

This project is licensed under the MIT License.
