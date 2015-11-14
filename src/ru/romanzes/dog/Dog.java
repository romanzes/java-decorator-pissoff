package ru.romanzes.dog;

public class Dog {
    private String voice;

    public Dog() {
        setVoice("bark!");
    }

    public String getVoice() {
        return voice;
    }

    // Method with package visibility which the decorator can't override
    void setVoice(String message) {
        voice = message;
    }

    public void bark() {
        System.out.println(voice);
    }
}
