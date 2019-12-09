package cz.upce.cidemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/")
    public String testIndex() {
        Model model = new Model();
        return "Hello from version 2: " + model.hello("Spring");
    }
    
}
