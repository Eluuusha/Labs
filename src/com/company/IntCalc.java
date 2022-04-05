package com.company;
import java.util.Vector;
public class IntCalc extends Thread{
    Vector<Kancelyaria> kancelyarias = new Vector<>();
    Thread thread;
    IntCalc(Vector<Kancelyaria> kancelyarias){
        for(int i=0;i<kancelyarias.size();i++) this.kancelyarias.add(kancelyarias.get(i));
        thread = new Thread(this,"IntCalc");
        start();
    }
    public void run(){
        int summa=0;
        try {
            for (int i = 0; i < kancelyarias.size(); i++) {
                if (kancelyarias.elementAt(i).getCalculated().getClass().getTypeName().contains("Integer")) {
                    summa += (int) kancelyarias.elementAt(i).getCalculated();
                }
            }
        }

        catch (Exception e){
            System.out.println("Процесс прерван" + e.getMessage());
        }
        System.out.println("Общая сумма покупки составила - "+ summa + " Название потока - " + thread.getName());
    }
}
