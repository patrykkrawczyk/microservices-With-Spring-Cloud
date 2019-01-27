package pro.patrykkrawczyk.lab8.sentence.dao;

import org.springframework.web.bind.annotation.GetMapping;
import pro.patrykkrawczyk.lab8.sentence.domain.Word;

public interface WordClient {

    @GetMapping
    public Word getWord();

}
