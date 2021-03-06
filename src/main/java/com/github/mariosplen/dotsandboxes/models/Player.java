package com.github.mariosplen.dotsandboxes.models;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Player {

    private final String name;
    private final Color color;
    private final Image image;
    private int points;

    public Player(String name, Color color, Image image) {
        this.name = name;
        this.color = color;
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void resetPoints() {
        this.points = 0;
    }

}
