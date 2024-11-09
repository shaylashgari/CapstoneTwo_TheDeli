package com.ps;

public class BagOfChips {
    private String lays;
    private String doritos;
    private String popChips;
    private String sunChips;

    public BagOfChips(String lays, String doritos, String popChips, String sunChips) {
        this.lays = lays;
        this.doritos = doritos;
        this.popChips = popChips;
        this.sunChips = sunChips;
    }

    public String getLays() {
        return lays;
    }

    public void setLays(String lays) {
        this.lays = lays;
    }

    public String getDoritos() {
        return doritos;
    }

    public void setDoritos(String doritos) {
        this.doritos = doritos;
    }

    public String getPopChips() {
        return popChips;
    }

    public void setPopChips(String popChips) {
        this.popChips = popChips;
    }

    public String getSunChips() {
        return sunChips;
    }

    public void setSunChips(String sunChips) {
        this.sunChips = sunChips;
    }


    @Override
    public String toString() {
        return "Chips{" +
                "lays='" + lays + '\'' +
                ", doritos='" + doritos + '\'' +
                ", popChips='" + popChips + '\'' +
                ", sunChips='" + sunChips + '\'' +
                '}';
    }
}
