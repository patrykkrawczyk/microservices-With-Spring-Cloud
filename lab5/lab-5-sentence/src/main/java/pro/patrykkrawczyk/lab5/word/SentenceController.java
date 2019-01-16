package pro.patrykkrawczyk.lab5.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class SentenceController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/sentence")
    public String getSentence() {
        return String.format("%s %s %s %s %s.",
                getWord("LAB-5-SUBJECT"),
                getWord("LAB-5-VERB"),
                getWord("LAB-5-ARTICLE"),
                getWord("LAB-5-ADJECTIVE"),
                getWord("LAB-5-NOUN") );
    }

    public String getWord(String serviceName) {
        List<ServiceInstance> list = discoveryClient.getInstances(serviceName);
        Optional<ServiceInstance> service = list.stream().findFirst();

        if ( service.isPresent() ) {
            URI uri = service.get().getUri();
            return (new RestTemplate()).getForObject(uri, String.class);
        }

        return null;
    }
}
