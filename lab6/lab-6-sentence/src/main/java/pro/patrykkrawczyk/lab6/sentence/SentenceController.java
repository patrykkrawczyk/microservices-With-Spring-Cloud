package pro.patrykkrawczyk.lab6.sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

    private static final String URL_FORMAT = "http://%s";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sentence")
    public String getSentence() {
        return String.format("%s %s %s %s %s.",
                getWord("LAB-6-SUBJECT"),
                getWord("LAB-6-VERB"),
                getWord("LAB-6-ARTICLE"),
                getWord("LAB-6-ADJECTIVE"),
                getWord("LAB-6-NOUN") );
    }

    private String getWord(String service) {
        String url = String.format(URL_FORMAT, service);
        return restTemplate.getForObject(url, String.class);
    }
}
