package pro.patrykkrawczyk.lab6.word.domain;

public class Word {

    private String word;

    public Word() {
        super();
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return getWord();
    }
}
