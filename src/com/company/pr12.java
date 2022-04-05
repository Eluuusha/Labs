package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class pr12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Kancelyaria_12> kancelyaria_12ArrayList = new ArrayList<Kancelyaria_12>();
        for (int i=0;i<10;i++)
        {
            kancelyaria_12ArrayList.add(new Kancelyaria_12());
            kancelyaria_12ArrayList.get(i).show();

        }
        System.out.println("Введите искомого производителя: ");
        String searchName = scanner.nextLine();
        int qntNames = 0;
        for (Kancelyaria_12 el: kancelyaria_12ArrayList)
            if (el.getProizvName().equals(searchName))
                qntNames++;
        System.out.println("Количество товаров, выпущенных заданным производителем: " + qntNames);
    }
}
