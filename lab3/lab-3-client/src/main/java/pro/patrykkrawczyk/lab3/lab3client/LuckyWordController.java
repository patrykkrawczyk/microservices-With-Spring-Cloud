package pro.patrykkrawczyk.lab3.lab3client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}") String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return String.format("The lucky word is: %s", luckyWord);
    }
}
