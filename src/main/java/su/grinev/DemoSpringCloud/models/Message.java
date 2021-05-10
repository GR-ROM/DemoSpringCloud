package su.grinev.DemoSpringCloud.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    private String text;
    private int value;

    public String getText() {
        return text;
    }

    public int getValue() {
        return value;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setValue(int value) {
        this.value = value;
    }

}