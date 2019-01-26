package pro.patrykkrawczyk.lab7.sentence.dao;

import org.springframework.web.bind.annotation.GetMapping;
import pro.patrykkrawczyk.lab7.sentence.domain.Word;

public interface WordClient {

    @GetMapping
    public Word getWord();

}
