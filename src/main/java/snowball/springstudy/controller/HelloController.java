package snowball.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") // 웹에서 /hello 로 들어오면 이 hello 메서드를 호출해줌
    public String hello( Model model ) {
        model.addAttribute("data", "hello") ;
        return "hello";
    }
}
