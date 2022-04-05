package com.company;

public class Kancelyaria_11 <Ka>{
    private String type = "company";
    private Ka calc;

    Kancelyaria_11(Ka calc) {
        this.calc = calc;
        if (calc.getClass().getTypeName().contains("Integer")) type = "price";
    }

    public String getType() {
        return type;
    }

    public Ka getCalc() {
        return calc;
    }
}
