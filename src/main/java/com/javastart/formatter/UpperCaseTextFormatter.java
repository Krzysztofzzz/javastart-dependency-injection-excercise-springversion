package com.javastart.formatter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@Primary
public class UpperCaseTextFormatter implements TextFormatter {

    @Override
    public String format(String originalText) {
        return originalText.toUpperCase();
    }
}
