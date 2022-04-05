package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class pr10_1 {
    static String[] companies = {"Снежинка","Bic","InfoLine","Erich Krause","АЦБК","ПинскДрев","Svetocopy","FaberCastel","Smoant"};
    static String[] penCol = {"Черный","Синий","Красный","Зеленый", "Фиолетовый", "Желтый"};
    static String[] papForm = {"A4","A3","A2","A5","A6", "A7"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 100000;
        ArrayList<PenKanc> PenArray = new ArrayList<>();
        System.out.println("Доступные команды: 1 - создать список, 2 - найти элемент списка, 3 - удалить элемент списка, 4 - найти вычисляемый показатель, 5 - выход ");
        int menuCommand = scanner.nextInt();
        while(menuCommand!=5){
            switch (menuCommand){
                case 1:{
                    long startCrTimeArrList = System.currentTimeMillis();
                    for(int i=0;i<n;i++)
                    {
                        if(i<=n/2) PenArray.add(new PenKanc((int)(Math.round(Math.random()*200000+100000)),
                                companies[(int)Math.round(Math.random()*8)],
                                penCol[(int)Math.round(Math.random()*4)]));
                    }
                    long crTimeArrList = System.currentTimeMillis() - startCrTimeArrList;
                    System.out.println("Время создания списка: " + crTimeArrList);
                    break;
                }
                case 2:{
                    System.out.println("Введите искомую компанию: ");
                    scanner.nextLine();
                    String searchComp = scanner.nextLine();
                    long startSearchTimeArrList = System.currentTimeMillis();
                    for (PenKanc el : PenArray)
                    {
                        if (el.getProizv().equals(searchComp))
                            System.out.println("Найдено:\t" + el.getProizv()+"\t" + el.getColour());
                    }
                    long searchTimeArrList = System.currentTimeMillis() - startSearchTimeArrList;
                    System.out.println("Время поиска: " + searchTimeArrList);
                    break;
                }
                case 3:{
                    System.out.println("Введите компанию: ");
                    scanner.nextLine();
                    String searchComp = scanner.nextLine();
                    long startDeleteTimeArrList = System.currentTimeMillis();
                    Iterator<PenKanc> penIterator = PenArray.iterator();
                    while(penIterator.hasNext()){
                        PenKanc temp = penIterator.next();
                        if(temp.getProizv().equals(searchComp))
                        {
                            System.out.println("Удалено:\t" + temp.getProizv() + "\t" + temp.getColour());
                            penIterator.remove();
                        }
                    }
                    long deleteTimeArrList = System.currentTimeMillis() - startDeleteTimeArrList;
                    System.out.println("Время удаления: " + deleteTimeArrList);
                    break;
                }
                case 4:{
                    System.out.println("Введите искомую компанию: ");
                    int qntSrchComp = 0;
                    scanner.nextLine();
                    String searchComp = scanner.nextLine();
                    long startCalcTimeArrList = System.currentTimeMillis();
                    for (PenKanc el : PenArray)
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
