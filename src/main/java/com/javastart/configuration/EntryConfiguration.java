package com.javastart.configuration;

import com.javastart.exceptions.InvalidDecoratorException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class EntryConfiguration {

    private final String decorator;

    public EntryConfiguration(@Value("${app.message.decorator}") String decorator) {
        this.decorator = decorator;
    }
    public Function<String,String> getDecorator(){
        if (decorator.equals("UPPERCASE"))
            return String::toUpperCase;
        throw new InvalidDecoratorException("No decorator found for " + decorator);
    }
}
