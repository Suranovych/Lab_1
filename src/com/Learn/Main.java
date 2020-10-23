package com.Learn;
import java.util.Scanner;
/**
 * @author Rostyslav Suranovych
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f,l,q;
        System.out.print("Enter first value: ");
        f = scan.nextInt();
        System.out.print("Enter last value: ");
        l = scan.nextInt();
        System.out.print("Enter quantity value: ");
        q = scan.nextInt();
        Fibonacci obj = new Fibonacci(f,l,q);
        int[]mas = obj.Fibo();
        obj.printtFibonacci(mas);
        Percent per = new Percent();
        per.percent(mas, q);
        PrintNumbers pn = new PrintNumbers();
        pn.printNumbers(f,l);
    }
}
