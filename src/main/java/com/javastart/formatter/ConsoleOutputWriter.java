package com.javastart.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsoleOutputWriter {

    private TextFormatter textFormatter;

    @Autowired
    public ConsoleOutputWriter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void println(String text){
        String formattedText = textFormatter.format(text);
        System.out.println(formattedText);
    }
}
