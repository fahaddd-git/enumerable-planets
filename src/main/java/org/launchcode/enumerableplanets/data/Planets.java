package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88,3.7),
    VENUS("Venus",225, 8.87),
    EARTH("Earth",365, 9.81),
    MARS("Mars",687,3.77),
    JUPITER("Jupiter",4333, 24.79),
    SATURN("Saturn",10759, 10.44),
    URANUS("Uranus",30687, 8.69),
    NEPTUNE("Neptune",60200, 11.15);

    private String name;
    private int yearLength;
    private double gravity;

    Planets(String name, int yearLength, double gravity) {
        this.name=name;
        this.yearLength=yearLength;
        this.gravity=gravity;
    }

    public int getYearLength() {
        return yearLength;
    }

    public double getGravity() {
        return gravity;
    }

    public String getName() {
        return name;
    }
}
