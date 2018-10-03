
package me.luguco.vocabtrainer.json;

import java.util.List;

public class Vocab_ {

    private String english;
    private String german;
    private int correctSolutions;
    private List<String> alsoCorrect = null;

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }

    public int getCorrectSolutions() {
        return correctSolutions;
    }

    public void setCorrectSolutions(int correctSolutions) {
        this.correctSolutions = correctSolutions;
    }

    public List<String> getAlsoCorrect() {
        return alsoCorrect;
    }

    public void setAlsoCorrect(List<String> alsoCorrect) {
        this.alsoCorrect = alsoCorrect;
    }

}
