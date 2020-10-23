package com.Learn;
/**
 * Ф-ія PrintNumbers виводить в консоль непарні числа за зростанням а парні за спаданням
 * та суму парних і непарних чисел
 */
public class PrintNumbers {
    public void printNumbers(int first, int last){
        int sum_ev=0, sum_odd=0;
        for(int i = first; i<=last; i++) {
            if((i&1) != 0){
                System.out.println(i);
                sum_odd+=i;
            }
        }
        System.out.println("-------------------");
        for (int i = last; i>=first; i--){
            if((i&1) == 0){
                System.out.println(i);
                sum_ev+=i;
            }
        }
        System.out.println("Sum even nimbers: "+sum_ev);
        System.out.println("Sum odd numbers: "+sum_odd);
    }
}
