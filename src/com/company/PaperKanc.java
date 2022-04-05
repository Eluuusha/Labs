package com.company;

public class PaperKanc extends Kancelyaria_10 {
     String form;
     public PaperKanc(int price, String proizv, String form) {
         super(price, proizv);
         this.form = form;
     }
     public String getForm() { return form; }
}
