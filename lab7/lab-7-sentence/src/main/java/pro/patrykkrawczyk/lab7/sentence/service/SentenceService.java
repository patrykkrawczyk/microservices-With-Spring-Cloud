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
    private AdjectiveClient adjectiveClient;

    @Autowired
    private ArticleClient articleClient;

    @Autowired
    private NounClient nounClient;

    @Autowired
    private SubjectClient subjectClient;

    @Autowired
    private VerbClient verbClient;

    public String buildSentence() {
        return String.format("%s %s %s %s %s.",
                subjectClient.getWord().toString(),
                verbClient.getWord().toString(),
                articleClient.getWord().toString(),
                adjectiveClient.getWord().toString(),
                nounClient.getWord().toString());
    }
}
