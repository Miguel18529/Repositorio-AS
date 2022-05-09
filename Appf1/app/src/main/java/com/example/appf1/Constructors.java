package com.example.appf1;

public class Constructors {

    public String positionseasonteam;
    public String colorteam;
    public String nameteam;
    public String nameteamdrivers;
    public String pointsseasonteam;

    public String ftn;
    public String base;
    public String teamchief;
    public String technicalchief;
    public String chassis;
    public String pu;
    public String fte;
    public String wcteam;
    public String hrfteam;
    public String pp;
    public String fl;

    public int imageTeamLogo;
    public int imageCar;

    // <--- Necesario para expandir (inicio) --->
    boolean visibility;
    // <---- Necesario para expandir (fin) ---->

    public Constructors(String positionseasonteam, String colorteam, String nameteam, String nameteamdrivers,
                        String pointsseasonteam, String ftn, String base, String teamchief,
                        String technicalchief, String chassis, String pu, String fte, String wcteam,
                        String hrfteam, String pp, String fl, int imageTeamLogo, int imageCar) {

        this.positionseasonteam = positionseasonteam;
        this.colorteam = colorteam;
        this.nameteam = nameteam;
        this.nameteamdrivers = nameteamdrivers;
        this.pointsseasonteam = pointsseasonteam;

        this.ftn = ftn;
        this.base = base;
        this.teamchief = teamchief;
        this.technicalchief = technicalchief;
        this.chassis = chassis;
        this.pu = pu;
        this.fte = fte;
        this.wcteam = wcteam;
        this.hrfteam = hrfteam;
        this.pp = pp;
        this.fl = fl;

        this.imageTeamLogo = imageTeamLogo;
        this.imageCar = imageCar;

        // <--- Necesario para expandir (inicio) --->
        this.visibility = false;
        // <---- Necesario para expandir (fin) ---->
    }

    public String getPositionseasonteam() {
        return positionseasonteam;
    }

    public String getColorteam() {
        return colorteam;
    }

    public String getNameteam() {
        return nameteam;
    }

    public String getNameteamdrivers() {
        return nameteamdrivers;
    }

    public String getPointsseasonteam() {
        return pointsseasonteam;
    }

    public String getFtn() {
        return ftn;
    }

    public String getBase() {
        return base;
    }

    public String getTeamchief() {
        return teamchief;
    }

    public String getTechnicalchief() {
        return technicalchief;
    }

    public String getChassis() {
        return chassis;
    }

    public String getPu() {
        return pu;
    }

    public String getFte() {
        return fte;
    }

    public String getWcteam() {
        return wcteam;
    }

    public String getHrfteam() {
        return hrfteam;
    }

    public String getPp() {
        return pp;
    }

    public String getFl() {
        return fl;
    }

    public int getImageTeamLogo() {
        return imageTeamLogo;
    }

    public int getImageCar() {
        return imageCar;
    }

    // <--- Necesario para expandir (inicio) --->
    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }
    // <---- Necesario para expandir (fin) ---->
}
