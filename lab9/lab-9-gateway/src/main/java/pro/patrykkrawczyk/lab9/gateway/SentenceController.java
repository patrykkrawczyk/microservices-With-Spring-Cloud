package pro.patrykkrawczyk.lab9.gateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SentenceController {

    @GetMapping("/")
    public String sentence() {
        return "sentence";
    }
}
