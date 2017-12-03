package com.epam.university.springripper.screensaver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


import java.awt.Color;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "com.epam.university.springripper.screensaver")
public class Config {
    @Bean
    @Scope(value = "prototype")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(
                255));
    }

    @Bean
    public ColorFrame frame() {
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);

        while (true) {
            annotationConfigApplicationContext.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(50);
        }
    }
}