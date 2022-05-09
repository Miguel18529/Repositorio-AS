package com.example.appf1;

public class LastRace {

    public String positionseason;
    public String color;
    public String name;
    public String surname;
    public String team;
    public String pointsseason;

    public int imageLogoteam;

    public LastRace(String positionseason, String color, String name, String surname,
                    String team, String pointsseason, int imageLogoteam) {

        this.positionseason = positionseason;
        this.color = color;
        this.name = name;
        this.surname = surname;
        this.team = team;
        this.pointsseason = pointsseason;

        this.imageLogoteam = imageLogoteam;

    }

    public String getPositionseason() {
        return positionseason;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTeam() {
        return team;
    }

    public String getPointsseason() {
        return pointsseason;
    }

    public int getImageLogoteam() {
        return imageLogoteam;
    }

}
