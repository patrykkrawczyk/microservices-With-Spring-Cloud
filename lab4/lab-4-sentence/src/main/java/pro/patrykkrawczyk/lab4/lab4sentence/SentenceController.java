package pro.patrykkrawczyk.lab4.lab4sentence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
                getWord("LAB-4-SUBJECT"),
                getWord("LAB-4-VERB"),
                getWord("LAB-4-ARTICLE"),
                getWord("LAB-4-ADJECTIVE"),
                getWord("LAB-4-NOUN") );
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
