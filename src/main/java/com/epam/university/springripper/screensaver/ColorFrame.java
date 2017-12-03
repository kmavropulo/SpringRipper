package com.epam.university.springripper.screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Component
//default spring's scope is @Scope("singleton")
public abstract class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1720), random.nextInt(1880));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}