package com.company;

import java.util.Vector;
public class StringCalc extends Thread{
    Vector<Kancelyaria> kancelyarias = new Vector<>();
    String insertComp;
    Thread thread;
    StringCalc(Vector<Kancelyaria> kancelyarias,String insertSurname){
        for(int i=0;i<kancelyarias.size();i++) this.kancelyarias.add(kancelyarias.get(i));
        this.insertComp = insertSurname;
        thread = new Thread(this,"StringCalc");
        start();
    }
    public void run(){
        int kolvo=0;
        try {
            for (int i = 0; i < kancelyarias.size(); i++) {
                if (kancelyarias.get(i).getCalculated().getClass().getTypeName().contains("String"))
                    if (kancelyarias.get(i).getCalculated().equals(insertComp))
                        kolvo++;
            }
        }
        catch (Exception e){
            System.out.println("Процесс прерван" + e.getMessage());
        }
        System.out.println("Количество товаров заданной фирмы - "+ kolvo + " Название потока - " + thread.getName());
    }
}
