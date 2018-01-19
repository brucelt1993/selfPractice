package com.bruce.structure02;

public class BaseTest {
    /**
     * 递归实现打印数字
     * @param n
     */
     public static void printOut(int n){
         if(n>=10){
             printOut(n/10);
         }
         System.out.print(n%10);
     }

    public static void main(String[] args) {
        printOut(9831);
    }
}
