package pro.patrykkrawczyk.lab9.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceService {

    @Autowired
    private WordService wordService;

    public String buildSentence() {
        return String.format("%s %s %s %s %s.",
                wordService.getSubject().toString(),
                wordService.getVerb().toString(),
                wordService.getArticle().toString(),
                wordService.getAdjective().toString(),
                wordService.getNoun().toString());
    }
}
