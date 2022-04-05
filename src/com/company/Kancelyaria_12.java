package com.company;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@interface Annotation{
    String className();
}
public class Kancelyaria_12 {
    static String[] proizv = {"ACBK", "Bic", "Erich Krause", "InfoLine", "Svetocopy", "Komus", "Omega", "Buka", "InFormat"};
    static String[] colour = {"Синий","Красный","Зеленый","Черный"};
    static String[] type = {"A4","A5","A3","A2","A1"};


    String proizvName;
    PaperClass paperClass ;
    PenClass penClass;

    Kancelyaria_12(){
        proizvName = proizv[(int)(Math.round(Math.random()*8))];
        paperClass = new PaperClass();
        penClass = new PenClass();
    }
    public void show()
    {
        System.out.println("Компания производитель - " + proizvName);
        penClass.show();
        paperClass.show();
    }
    @Annotation(className = "PaperClass")
    class PaperClass{
        String typePaper;
        PaperClass(){
            this.typePaper = type[(int)(Math.round(Math.random()*4))];
        }
        public void show(){
            System.out.println("\tТип бумаги - " + typePaper);
        }
    }
    @Annotation(className = "PenClass")
    class PenClass{
        String colourPen;
        PenClass(){
            this.colourPen = colour [(int)(Math.round(Math.random())*3)];
        }
        public void show(){
            System.out.println("\tЦвет ручки - " + colourPen);
        }
    }

    public String getProizvName() {
        return proizvName;
    }
}

