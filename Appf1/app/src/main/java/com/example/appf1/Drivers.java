package com.example.appf1;

import com.example.appf1.ui.login.BaseDatos;

public class Drivers {

    public String positionseason;
    public String color;
    public String name;
    public String surname;
    public String team;
    public String pointsseason;

    public int imageLogoteam;
    public int imageFlag;
    public int imageNumber;
    public int imageDriver;
    public int imageHelmet;

    public String country;
    public String podium;
    public String points;
    public String gpe;
    public String wc;
    public String hrf;
    public String hgp;
    public String dob;
    public String pob;

    // <--- Necesario para expandir (inicio) --->
    boolean visibility;
    // <---- Necesario para expandir (fin) ---->

    public Drivers(String positionseason, String color, String name, String surname, String team, String pointsseason,
                   int imageLogoteam, int imageFlag, int imageNumber, int imageDriver, int imageHelmet,
                   String country, String podium, String points, String gpe, String wc,
                   String hrf, String hgp, String dob, String pob) {

        this.positionseason = positionseason;
        this.color = color;
        this.name = name;
        this.surname = surname;
        this.team = team;
        this.pointsseason = pointsseason;

        this.imageLogoteam = imageLogoteam;
        this.imageFlag = imageFlag;
        this.imageNumber = imageNumber;
        this.imageDriver = imageDriver;
        this.imageHelmet = imageHelmet;

        this.country = country;
        this.podium = podium;
        this.points = points;
        this.gpe = gpe;
        this.wc = wc;
        this.hrf = hrf;
        this.hgp = hgp;
        this.dob = dob;
        this.pob = pob;

        // <--- Necesario para expandir (inicio) --->
        this.visibility = false;
        // <---- Necesario para expandir (fin) ---->
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPointsseason(String pointsseason) {
        this.pointsseason = pointsseason;
    }

    public void setImageLogoteam(int imageLogoteam) {
        this.imageLogoteam = imageLogoteam;
    }

    public void setImageFlag(int imageFlag) {
        this.imageFlag = imageFlag;
    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }

    public void setImageDriver(int imageDriver) {
        this.imageDriver = imageDriver;
    }

    public void setImageHelmet(int imageHelmet) {
        this.imageHelmet = imageHelmet;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPodium(String podium) {
        this.podium = podium;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public void setGpe(String gpe) {
        this.gpe = gpe;
    }

    public void setWc(String wc) {
        this.wc = wc;
    }

    public void setHrf(String hrf) {
        this.hrf = hrf;
    }

    public void setHgp(String hgp) {
        this.hgp = hgp;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public void setPositionseason(String positionseason) {
        this.positionseason = positionseason;
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

    public int getImageFlag() {
        return imageFlag;
    }

    public int getImageNumber() {
        return imageNumber;
    }

    public int getImageDriver() {
        return imageDriver;
    }

    public int getImageHelmet() {
        return imageHelmet;
    }

    public String getCountry() {
        return country;
    }

    public String getPodium() {
        return podium;
    }

    public String getPoints() {
        return points;
    }

    public String getGpe() {
        return gpe;
    }

    public String getWc() {
        return wc;
    }

    public String getHrf() {
        return hrf;
    }

    public String getHgp() {
        return hgp;
    }

    public String getDob() {
        return dob;
    }

    public String getPob() {
        return pob;
    }

    // <--- Necesario para expandir (inicio) --->
    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }
    // <---- Necesario para expandir (fin) ---->

    public String toString(){
        return "-" + this.name + "-";
    }
}
