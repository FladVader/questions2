package com.example.questions2;

public class pictureDay {

    String question;
    String url;
    String answer;
    String url2;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public pictureDay(String question, String url, String answer, String url2) {
        this.question = question;
        this.url = url;
        this.answer = answer;
        this.url2 = url2;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
