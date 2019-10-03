# springstart
Hello World Spring Web Application
## Pre-requiste
+ IntelliJ IDEA IDE
+ Java 8
+ An AWS account for deployment
# Set up
1. Go to Spring Initializer website to boostrap your project (https://start.spring.io/)
2. Choose Web, Thymleaf and DevTool dependency for our project
2. Open your IDE and import the generated project from Spring

## Spring
1. Create a Controller class in /src/main/java/rmit/rch/demo folder. This class will handle the routing stuff of the project
```
@Controller
public class HomeController {
    @GetMapping(value = "/hello")
    public String greetHtml () {
        return "welcome";
    }
}
``` 
2. Create a simple HTML file (welcome.html) for display in src/main/resources/templates.
```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Welcome to the tutorial</h1>
    <h1>If you reach this stage. Welcome to Spring</h1>
</body>
</html>
```
3. Adding the following line in application.properties file
```
spring.thymeleaf.template-loader-path: classpath:/templates
spring.thymeleaf.suffix: .html
spring.thymeleaf.cache: false
```
## Run Application
After having the back-end and front-end created, run the application for view your result <3.

Open browser and enter localhost:8080/hello 

## Deploy
1. Login in to your AWS account
2. Choose Elastic BeanStalk
3. Choose "Get Started" 
4. AWS will open the configuration UI for you
5. Enter your application name
6. For platform choose "Java"
7. Go back to IntellJ IDEA
8. Choose "Terminal" tab at the bottom
9. run "$ mvn package". an .jar file will be generated in the target folder 
8. Go back to AWS console and upload that .jar file
9. Waiting for AWS set up ------------- 
10. Open the URL: <yourelasticbeanurl>:8080/hello
11. If the site does not, open EC2 console on AWS
12. Go to Security Section
13. Select Inbound tab
14. Add New Rule: "All Trafic" for type and "Anywhere" for Source

