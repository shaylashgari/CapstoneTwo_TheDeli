package com.ps;

public class Drink implements Product{
    private String Coke;
    private String Sprite;
    private String sweetTea;
    private String lemonade;

    public Drink(String sprite, String coke, String sweetTea, String lemonade) {
        Sprite = sprite;
        Coke = coke;
        this.sweetTea = sweetTea;
        this.lemonade = lemonade;
    }

    public String getCoke() {
        return Coke;
    }

    public void setCoke(String coke) {
        Coke = coke;
    }

    public String getSprite() {
        return Sprite;
    }

    public void setSprite(String sprite) {
        Sprite = sprite;
    }

    public String getSweetTea() {
        return sweetTea;
    }

    public void setSweetTea(String sweetTea) {
        this.sweetTea = sweetTea;
    }

    public String getLemonade() {
        return lemonade;
    }

    public void setLemonade(String lemonade) {
        this.lemonade = lemonade;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "Coke='" + Coke + '\'' +
                ", Sprite='" + Sprite + '\'' +
                ", sweetTea='" + sweetTea + '\'' +
                ", lemonade='" + lemonade + '\'' +
                '}';
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
