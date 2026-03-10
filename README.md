# Spring REST API Messaging App

## Project Overview

This project demonstrates the implementation of basic **REST APIs using Spring Boot**.
It showcases different HTTP methods such as **GET, POST, and PUT** and how parameters can be passed using **Query Parameters, Path Variables, and Request Body**.

The application returns greeting messages such as **"Hello from BridgeLabz"** and variations of it based on the type of request sent.

---

# Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Maven
* REST API
* CURL (for testing APIs)

---

# Project Structure

```
spring-rest-api-messaging-app
│
├── pom.xml
│
└── src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           └── spring_rest_api_messaging_app
        │
        │               ├── SpringRestApiMessagingAppApplication.java
        │               │
        │               ├── controller
        │               │       HelloController.java
        │               │
        │               └── dto
        │                       UserDTO.java
        │
        └── resources
            └── application.properties
```

---

# Use Cases Implemented

## UC1 – Basic Hello REST API

Demonstrates a simple **GET request**.

### Endpoint

```
GET /hello
```

### Response

```
Hello from BridgeLabz
```

### CURL

```
curl localhost:8080/hello
```

---

## UC2 – Query Parameter

Demonstrates passing parameters using **Query Parameters**.

### Endpoint

```
GET /hello/query?name=Mark
```

### Response

```
Hello Mark from BridgeLabz
```

### CURL

```
curl localhost:8080/hello/query?name=Mark
```

---

## UC3 – Path Variable

Demonstrates passing parameters using **Path Variables**.

### Endpoint

```
GET /hello/param/{name}
```

### Example

```
GET /hello/param/Mark
```

### Response

```
Hello Mark from BridgeLabz
```

### CURL

```
curl localhost:8080/hello/param/Mark
```

---

## UC4 – POST Request with Request Body

Demonstrates sending data using **POST request and JSON body**.

### Endpoint

```
POST /hello/post
```

### Request Body

```
{
  "firstName": "Mark",
  "lastName": "Taylor"
}
```

### Response

```
Hello Mark Taylor from BridgeLabz
```

### CURL

```
curl -X POST -H "Content-Type: application/json" \
-d '{"firstName":"Mark","lastName":"Taylor"}' \
"http://localhost:8080/hello/post"
```

---

## UC5 – PUT Request

Demonstrates using **PUT request with Path Variable and Query Parameter**.

### Endpoint

```
PUT /hello/put/{firstName}?lastName=Taylor
```

### Example

```
PUT /hello/put/Mark?lastName=Taylor
```

### Response

```
Hello Mark Taylor from BridgeLabz
```

### CURL

```
curl -X PUT localhost:8080/hello/put/Mark/?lastName=Taylor
```

---

# How to Run the Project

### 1. Clone the Repository

```
git clone <repository-url>
```

### 2. Navigate to Project Directory

```
cd spring-rest-api-messaging-app
```

### 3. Run the Application

```
mvn spring-boot:run
```

or

```
mvn clean package
java -jar target/spring-rest-api-messaging-app-0.0.1-SNAPSHOT.jar
```

---

# Access the APIs

The application runs on:

```
http://localhost:8080
```

Example:

```
http://localhost:8080/hello
```

---

# Learning Outcomes

Through this project you will learn:

* Basics of **Spring Boot REST APIs**
* Different **HTTP methods (GET, POST, PUT)**
* Passing data using **Query Parameters**
* Passing data using **Path Variables**
* Handling **JSON request body using DTO**
* Testing APIs using **CURL**

---

# Author

Tanmay Bhosale
