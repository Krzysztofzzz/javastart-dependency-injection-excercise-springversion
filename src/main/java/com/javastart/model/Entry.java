package com.javastart.model;

public class Entry {
    private String original;
    private String translation;

    public Entry(String original, String translation) {
        this.original = original;
        this.translation = translation;
    }

    public String getOriginal() {
        return original;
    }

    void setOriginal(String original) {
        this.original = original;
    }

    public String getTranslation() {
        return translation;
    }

    void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return original + ";" + translation;
    }
}