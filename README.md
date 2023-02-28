# Datadog-Take-Home
## Spring Security Authentication
In this module, you will learn how to implement HTTP Basic authentication in Spring Security. This module is designed for entry-level Java engineers utilizing the popular Spring Framework who are seeking knowledge on how to secure their applications.

To go through this module you will need the following knowledge and skills:
- Java 11 with Maven
- An understading of Web Authentication
- Hardware capable of running Java Code

By the end of this learning module you will:
1. Understand how HTTP Basic authentication works.
2. Implement an HTTP Basic authentication solution.

---

## Getting Setup
- Begin by cloning this repository to your local machine and open the project using your preferred text editor or IDE.
- Make sure your code runs by inputting the following command to the terminal: `mvn spring-boot:run`
- Once the application is running, try accessing the endpoint http://localhost:8080/. You should be able to successfully navigate to this endpoint.

## Understanding Authentication
Authentication is the process of determining the valid identity of the current user. This is typically accomplished when the user provides some credentials that a system can validate. 

One of the most basic authentication methods is HTTP Basic. Whenever a web client tries to access a backend resource, a user's username and password are encoded in Base6. Then the encoded credentials are sent over a network to the destination server where the credentials are decoded and used to validate the user's identity. 

While simple in nature, HTTP Basic provides some challenges. For instance, the encoded username and password must be sent for every request. There are no cookies used in HTTP Basic, so there is no concept of a user session and nobody to log out.

In order to let Spring know to use HTTP Basic authentication, you must configure the HttpSecurity object in the SecConfig file.
- Open SecConfig.java in your IDE / Editor
- On line XXX add the following line of code: `http.httpBasic();`
- Recompile and run the project using this command at the project's root:  `mvn spring-boot:run`
- Access 


