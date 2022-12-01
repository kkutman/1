package java8.classes;

import java8.enums.Mobile;

public class Terminal {
    private Mobile mobileName;
    private String color;

    public Terminal(Mobile mobileName, String color) {
        this.mobileName = mobileName;
        this.color = color;
    }

    public Mobile getMobileName() {
        return mobileName;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "mobileName=" + mobileName +
                ", color='" + color + '\'' +
                '}';
    }
}
