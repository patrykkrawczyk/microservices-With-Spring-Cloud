package pro.patrykkrawczyk.lab7.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.patrykkrawczyk.lab7.sentence.dao.AdjectiveClient;
import pro.patrykkrawczyk.lab7.sentence.dao.ArticleClient;
import pro.patrykkrawczyk.lab7.sentence.dao.NounClient;
import pro.patrykkrawczyk.lab7.sentence.dao.SubjectClient;
import pro.patrykkrawczyk.lab7.sentence.dao.VerbClient;

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
