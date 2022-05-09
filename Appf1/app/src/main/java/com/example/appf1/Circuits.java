package com.example.appf1;

public class Circuits {

    public String roundcircuit;
    public String namecountry;
    public String nameevent;

    public String fgp;
    public String nof;
    public String cl;
    public String rd;
    public String lr;

    public String namecircuit;
    public int imageFlagCircuit;
    public int imageCircuit;

    // <--- Necesario para expandir (inicio) --->
    boolean visibility;
    // <---- Necesario para expandir (fin) ---->

    public Circuits(String roundcircuit, String namecountry, String nameevent,
                    String fgp, String nof, String cl, String rd, String lr,
                    String namecircuit, int imageFlagCircuit, int imageCircuit) {

        this.roundcircuit = roundcircuit;
        this.namecountry = namecountry;
        this.nameevent = nameevent;

        this.fgp = fgp;
        this.nof = nof;
        this.cl = cl;
        this.rd = rd;
        this.lr = lr;

        this.namecircuit = namecircuit;
        this.imageFlagCircuit = imageFlagCircuit;
        this.imageCircuit = imageCircuit;

        // <--- Necesario para expandir (inicio) --->
        this.visibility = false;
        // <---- Necesario para expandir (fin) ---->
    }

    public String getRoundcircuit() {
        return roundcircuit;
    }

    public String getNamecountry() {
        return namecountry;
    }

    public String getNameevent() {
        return nameevent;
    }

    public String getFgp() {
        return fgp;
    }

    public String getNof() {
        return nof;
    }

    public String getCl() {
        return cl;
    }

    public String getRd() {
        return rd;
    }

    public String getLr() {
        return lr;
    }

    public String getNamecircuit() {
        return namecircuit;
    }

    public int getImageFlagCircuit() {
        return imageFlagCircuit;
    }

    public int getImageCircuit() {
        return imageCircuit;
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
