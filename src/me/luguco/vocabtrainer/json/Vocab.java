
package me.luguco.vocabtrainer.json;

import java.util.List;

public class Vocab {

    private int level;
    private int minCorrectSolutions;
    private List<Vocab_> vocabs = null;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMinCorrectSolutions() {
        return minCorrectSolutions;
    }

    public void setMinCorrectSolutions(int minCorrectSolutions) {
        this.minCorrectSolutions = minCorrectSolutions;
    }

    public List<Vocab_> getVocabs() {
        return vocabs;
    }

    public void setVocabs(List<Vocab_> vocabs) {
        this.vocabs = vocabs;
    }
}
