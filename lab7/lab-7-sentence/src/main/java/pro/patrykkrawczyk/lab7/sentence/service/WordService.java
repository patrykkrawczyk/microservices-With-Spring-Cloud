package pro.patrykkrawczyk.lab7.sentence.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.patrykkrawczyk.lab7.sentence.dao.AdjectiveClient;
import pro.patrykkrawczyk.lab7.sentence.dao.ArticleClient;
import pro.patrykkrawczyk.lab7.sentence.dao.NounClient;
import pro.patrykkrawczyk.lab7.sentence.dao.SubjectClient;
import pro.patrykkrawczyk.lab7.sentence.dao.VerbClient;
import pro.patrykkrawczyk.lab7.sentence.domain.Word;

@Service
public class WordService {

    @Autowired
    private AdjectiveClient adjectiveClient;

    @Autowired
    private ArticleClient articleClient;

    @Autowired
    private NounClient nounClient;

    @Autowired
    private SubjectClient subjectClient;

    @Autowired
    private VerbClient verbClient;

    @HystrixCommand(fallbackMethod = "getAdjectiveFallback")
    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    @HystrixCommand(fallbackMethod = "getArticleFallback")
    public Word getArticle() {
        return articleClient.getWord();
    }

    @HystrixCommand(fallbackMethod = "getNounFallback")
    public Word getNoun() {
        return nounClient.getWord();
    }

    @HystrixCommand(fallbackMethod = "getSubjectFallback")
    public Word getSubject() {
        return subjectClient.getWord();
    }

    @HystrixCommand(fallbackMethod = "getVerbFallback")
    public Word getVerb() {
        return verbClient.getWord();
    }

    private Word getAdjectiveFallback() {
        return new Word("");
    }

    private Word getArticleFallback() {
        return new Word("");
    }

    private Word getNounFallback() {
        return new Word("something");
    }

    private Word getSubjectFallback() {
        return new Word("Someone");
    }

    private Word getVerbFallback() {
        return new Word("");
    }
}
