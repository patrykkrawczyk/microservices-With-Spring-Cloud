package pro.patrykkrawczyk.lab8.sentence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.patrykkrawczyk.lab8.sentence.service.SentenceService;

@RestController
public class SentenceController {

    private static final String NEWLINE = "<br/><br/>";

    @Autowired
    private SentenceService sentenceService;

    @GetMapping
    public String getSentence() {
        return "<h3>Some Sentences</h3>" + NEWLINE +
                sentenceService.buildSentence() + NEWLINE +
                sentenceService.buildSentence() + NEWLINE +
                sentenceService.buildSentence() + NEWLINE +
                sentenceService.buildSentence() + NEWLINE +
                sentenceService.buildSentence() + NEWLINE;
    }
}
