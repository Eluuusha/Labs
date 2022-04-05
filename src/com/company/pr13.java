package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class pr13 {
    static String[] proizv = {"ACBK", "Bic", "Erich Krause", "InfoLine", "Svetocopy", "Komus", "Omega", "Buka", "InFormat"};
    static String[] colour = {"Синий","Красный","Зеленый","Черный"};
    static String[] type = {"A4","A5","A3","A2","A1"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите искомую компанию: ");
        String searchComp = in.nextLine();
        int n = (int)Math.round(Math.random()*2+3);
        ArrayList<PenClass_13> penClass_13ArrayList = new ArrayList<>();
        ArrayList<PaperClass_13> paperClass_13ArrayList = new ArrayList<>();
        for (int i=0;i<n;i++) {
            penClass_13ArrayList.add(new PenClass_13(
                    (int)Math.round(Math.random()*100+200)
                    ,proizv[(int)Math.round(Math.random() * 8)]
                    ,colour[(int)Math.round(Math.random()*3)]));
            System.out.println("В наличии:\n\tПроизводитель: "
                    + penClass_13ArrayList.get(i).getProizvName()
                    + "\n\tСтоимость: " + penClass_13ArrayList.get(i).getPrice()
                    + "\n\tТип бумаги: "
                    + penClass_13ArrayList.get(i).getColourPen());
        }
        for (int i=0;i<n;i++)
        {
            paperClass_13ArrayList.add(new PaperClass_13(
                    (int)Math.round(Math.random()*100+200)
                    ,proizv[(int)Math.round(Math.random() * 8)]
                    ,type[(int)Math.round(Math.random()*4)]));
            System.out.println("В наличии:\n\tПроизводитель: "
                    + paperClass_13ArrayList.get(i).getProizvName()
                    + "\n\tСтоимость: " + paperClass_13ArrayList.get(i).getPrice()
                    + "\n\tЦвет ручки: "
                    + paperClass_13ArrayList.get(i).getTypePaper());
        }
        Calc_13 qntComp = ()->{
            int temp=0;
            for (int i=0;i<n;i++)
            {
                if (paperClass_13ArrayList.get(i).getProizvName().equals(searchComp)) temp++;
                if (penClass_13ArrayList.get(i).getProizvName().equals(searchComp)) temp ++;
            }
            return  temp;
        };
        System.out.println("Количество товаров заданного производителя: " + qntComp.calc());
    }

}

