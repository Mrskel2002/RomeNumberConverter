package com.example.romedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Conversion {

    public static String solution(int number){

//            final String[] digit = {"", "I", "II", "III", "IV", "V", "VI", "VII",
//                    "VIII", "IX"};
//            final String[] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX",
//                    "LXXX", "XC"};
//            final String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
//                    "DCCC", "CM"};
//            final String[] thousand = {"", "M", "MM", "MMM"};
//
//            String result="";
//            result = thousand[n/1000] + hundred[n%1000/100] + ten[n%100/10] +
//                    digit[n%10];
//            return result;
//        }
//    }
        String romeThousands="";
        String romeNum2="";
        int thousands;
        int hundreds;
        int tens;
        int ones;
        char I = 'I';
        char V = 'V';
        char X = 'X';
        char L = 'L';
        char C = 'C';
        char D = 'D';
        char M = 'M';

        thousands = number / 1000;
        hundreds = number % 1000;
        hundreds = hundreds / 100;
        tens = number % 100;
        tens = tens / 10;
        ones = number % 10;
        ones = ones / 1;
//        System.out.println(thousands + "|" + hundreds + "|" + tens + "|" + ones);
        for (int i = thousands; i > 0;i--){
            romeNum2 += M;
        }
        for (int i = hundreds; i > 0;i--){
            if (i % 9 == 0) {
                romeNum2 += C+""+M;
                i -= 8;
            }else if (i % 5 == 0){
            romeNum2 += D;
            i -= 4;
            }else if (i % 4 == 0) {
                romeNum2 += C+""+D;
                i -= 3;
            } else {
                romeNum2 += C;
            }
        }
        for (int i = tens; i > 0;i--){
            if (i % 9 == 0) {
                romeNum2 += I+""+X;
                i -= 8;
            }else if (i % 5 == 0){
                romeNum2 += L;
                i -= 4;
            }else if (i % 4 == 0) {
            romeNum2 += X+""+L;
            i -= 3;
        } else {
                romeNum2 += X;
            }

        }
        for (int i = ones; i > 0;i--){
            if (i % 9 == 0) {
                romeNum2 += I+""+X;
                i -= 8;
            }else if (i % 5 == 0) {
                romeNum2 += V;
                i -= 4;
            }else if (i % 4 == 0) {
            romeNum2 += I+""+V;
            i -= 3;
        } else {
                romeNum2 += I;
            }

        }

        return romeNum2;
    }
}
public class RomeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RomeDemoApplication.class, args);
        System.out.println(Conversion.solution(1888));
    }
}
