
**Veggy Store Spring Boot** project:-
---
**Veggy Store**, a simple and efficient Spring Boot backend service for managing an online vegetable store. This application supports RESTful APIs.


##  Project Structure

```
veggy-store-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/veggystore/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── VeggyStoreApplication.java
│   │   └── resources/
│   │       └── application.yml
│   │       └── Data.sql
├── pom.xml
└── README.md
```

---
### Setup Instructions

1. **Clone the repository**

```bash
git clone https://github.com/hitesh07hm/veggy-store-springboot.git
cd veggy-store-springboot
```

2. **Configure the database**

Update `src/main/resources/application.yml` with your H2 Memory Db :    

```properties
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    username: sa
    password: password
```

3. **Run the application**
run the file :- 
VegetableStoreApplication.java


4. **Access the API**

Once the server is running, you can access the APIs at:  
`http://localhost:8080/h2-console/`

---
5. Postman Api's :- 

/orders/create-order
```
{
  "customerId": 1,
  "orderItems": [
    {
      "vegetableId": 2,
      "quantity": 2
    },
    {
      "vegetableId": 1,
      "quantity": 5
    }
  ]
}

```

/vegetable/all-vegetables
```



no req body needed
```

********END******
