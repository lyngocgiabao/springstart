package rmit.rch.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping(value = "/hello")
    public String greetHtml () {
        return "welcome";
    }
}
