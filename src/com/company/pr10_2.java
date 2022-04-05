package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class pr10_2 {
    static String[] companies = {"Снежинка","Bic","InfoLine","Erich Krause","АЦБК", "ПинскДрев","Svetocopy","FaberCastel","Smoant"};
    static String[] penCol = {"Черный","Синий","Красный","Зеленый", "Фиолетовый", "Желтый"};
    static String[] papForm = {"A4","A3","A2","A5","A6", "A7"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 100000;
        LinkedList<PaperKanc> paperArray = new LinkedList<>();
        System.out.println("Доступные команды: 1 - создать список, 2 - найти элемент списка, 3 - удалить элемент списка, 4 - найти вычисляемый показатель, 5 - выход ");
        int menuCommand = scanner.nextInt();
        while(menuCommand!=5){
            switch (menuCommand){
                case 1:{
                    long startCrTimeArrList = System.currentTimeMillis();
                    for(int i=0;i<n;i++)
                    {
                        if(i<=n/2) paperArray.add(new PaperKanc((int)(Math.round(Math.random()*200000+100000)),
                                companies[(int)Math.round(Math.random()*8)],
                                papForm[(int)Math.round(Math.random()*3)]));
                    }
                    long crTimeArrList = System.currentTimeMillis() - startCrTimeArrList;
                    System.out.println("Время создания списка: " + crTimeArrList);
                    break;
                }
                case 2:{
                    System.out.println("Введите искомую компанию:");
                    scanner.nextLine();
                    String searchComp = scanner.nextLine();
                    long startSearchTimeArrList = System.currentTimeMillis();
                    for (PaperKanc el : paperArray)
                    {
                        if (el.getProizv().equals(searchComp))
                            System.out.println("Найдено:\t" + el.getProizv()+"\t" + el.getForm());
                    }
                    long searchTimeArrList = System.currentTimeMillis() - startSearchTimeArrList;
                    System.out.println("Время поиска: " + searchTimeArrList);
                    break;
                }
                case 3:{
                    System.out.println("Введите искомую компанию: ");
                    scanner.nextLine();
                    String searchComp = scanner.nextLine();
                    long startDeleteTimeArrList = System.currentTimeMillis();
                    Iterator<PaperKanc> paperKancIterator = paperArray.iterator();
                    while(paperKancIterator.hasNext()){
                        PaperKanc temp = paperKancIterator.next();
                        if(temp.getProizv().equals(searchComp))
                        {
                            System.out.println("Удалено:\t" + temp.getProizv() + "\t" + temp.getForm());
                            paperKancIterator.remove();
                        }
                    }
                    long deleteTimeArrList = System.currentTimeMillis() - startDeleteTimeArrList;
                    System.out.println("Время удаления: " + deleteTimeArrList);
                    break;
                }
                case 4:{
                    System.out.println("Введите искомую компанию:");
                    int qntSrchComp = 0;
                    scanner.nextLine();
                    String searchComp = scanner.nextLine();
                    long startCalcTimeArrList = System.currentTimeMillis();
                    for (PaperKanc el : paperArray)
                    {
                        if (el.getProizv().equals(searchComp)) qntSrchComp++;
                    }
                    long calcTimeArrList = System.currentTimeMillis() - startCalcTimeArrList;
                    System.out.println("Результат вычисления: " + qntSrchComp);
                    System.out.println("Время вычисления: " + calcTimeArrList);
                    break;
                }
            }
            System.out.println("Доступные команды: 1 - создать список, 2 - найти элемент списка, 3 - удалить элемент списка, 4 - найти вычисляемый показатель, 5 - выход ");
            menuCommand = scanner.nextInt();
        }
    }
}
