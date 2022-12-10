package org.example;

import java.sql.SQLType;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 13;
        int sayi2 = 11;
        int sayi3 = 12;
        int enbuyuk = sayi2;
        if (enbuyuk<sayi1) enbuyuk =sayi1;
        if (enbuyuk<sayi3) enbuyuk =sayi3;
        System.out.println("en büyük sayi :"+enbuyuk);
    }
}