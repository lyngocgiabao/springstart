# springstart
Hello World Spring Web Application
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
2. Create a simple HTML file for display in src/main/resources/static. 
3. Adding the following line in application.properties file
```
spring.thymeleaf.template-loader-path: classpath:/templates
spring.thymeleaf.suffix: .html
spring.thymeleaf.cache: false
```
##Run Application
After having the back-end and front-end created, run the application for view your result <3.

Open browser and enter localhost:8080/hello 
 
