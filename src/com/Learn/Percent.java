package com.Learn;
/**
 * Ф-ія Percent рахує в ряді Фібоначчі відсоток парних і непарних чисел
 */
public class Percent {

    public void percent(int[] m, int quantity){
        double odd = 0;
        for(int i = 0; i<quantity;i++){
            if((m[i]&1) == 1) odd++;
        }
        System.out.println("Odd numbers -"+ odd/quantity*100+"%");
        System.out.println("Even numbers -"+ (quantity-odd)/quantity*100+"%");
}
}