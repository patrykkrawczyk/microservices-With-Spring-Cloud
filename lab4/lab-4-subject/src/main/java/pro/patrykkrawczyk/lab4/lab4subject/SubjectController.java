package pro.patrykkrawczyk.lab4.lab4subject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SubjectController {

    private final Random random = new Random();

    @Value("${words}") String[] words;

    @GetMapping
    public String getSubject() {
        return words[random.nextInt(words.length)];
    }
}
