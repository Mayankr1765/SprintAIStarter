package com.genai.ollama.SpringAI.CarPucho.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;


public class CarResponse {

    private String title;
    private String content;
    private String responseYear;

    public CarResponse(String title, String content, String responseYear) {
        this.title = title;
        this.content = content;
        this.responseYear = responseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResponseYear() {
        return responseYear;
    }

    public void setResponseYear(String responseYear) {
        this.responseYear = responseYear;
    }
}
