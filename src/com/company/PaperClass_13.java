package com.company;

public class PaperClass_13 extends Kancelyaria_13{
    String typePaper;

    public PaperClass_13(int price, String proizvName, String typePaper) {
        super(price, proizvName);
        this.typePaper = typePaper;
    }

    public String getTypePaper() {
        return typePaper;
    }
}
