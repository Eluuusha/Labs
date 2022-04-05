package com.company;

import java.util.ArrayList;

public class CalcClass {
    public int calc(ArrayList<PenClass_13> penClass_13ArrayList, ArrayList<PaperClass_13> paperClass_13ArrayList, String searchComp) {
        int temp = 0;
        for (int i = 0; i < penClass_13ArrayList.size(); i++) {
            if (paperClass_13ArrayList.get(i).getProizvName().equals(searchComp)) temp++;
            if (penClass_13ArrayList.get(i).getProizvName().equals(searchComp)) temp++;
        }
        return temp;
    }
}
