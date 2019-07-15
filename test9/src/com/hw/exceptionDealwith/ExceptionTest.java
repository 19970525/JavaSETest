package com.hw.exceptionDealwith;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) throws ABCException {

        Scanner scan = new Scanner(System.in);

        try {
            Integer x = scan.nextInt();
            Integer y = scan.nextInt();
            System.out.println(x + y);
        }
        catch (InputMismatchException e){
            System.out.println("你输入有问题！");
            throw new ABCException("你输入有问题！");
        }
    }
}
