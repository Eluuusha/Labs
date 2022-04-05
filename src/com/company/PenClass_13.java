package com.company;

public class PenClass_13 extends Kancelyaria_13{
    String colourPen;
    public PenClass_13(int price, String proizvName,String colourPen) {
        super(price, proizvName);
        this.colourPen = colourPen;
    }

    public String getColourPen() {
        return colourPen;
    }
}
