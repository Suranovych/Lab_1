package com.Learn;
/**
 * Ф-ія Fibo устворює ряд Фібоначі
 */
public class Fibonacci {
    int first;
    int last;
    int quantity;

    public Fibonacci(int first, int last, int quantity){
        this.first = first;
        this.last = last;
        this.quantity = quantity;
    }

    public int[] Fibo(){
        int[] arr;
        arr = new int[quantity];
        if((last&1) == 0){
            arr[1] = last;
            last--;
            arr[0] = last;
        }
        else{
            arr[0] = last;
            last--;
            arr[1] = last;
        }
        for(int i = 2; i<quantity; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }

    /**
     * Ф-ія printtFibonacci виводить ряд Фібоначчі у консоль
     */
    public void printtFibonacci(int[]arr){
        for(int i = 0; i<quantity; i++){
            System.out.println(arr[i]);
        }
    }
}