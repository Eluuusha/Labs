package com.company;

public class PenKanc extends Kancelyaria_10 {
    String colour;
    public PenKanc(int price, String proizv, String colour) {
        super(price, proizv);
        this.colour = colour;
    }
    public String getColour(){ return colour; }
}
