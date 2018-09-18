package vova;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Vova on 15.09.2018.
 */
public class Rectangle {

    private int a;
    private int b;
    private int square;


    public Rectangle(){}


    public int squareRectangle() throws Exception{
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Enter a: ");
        try {
            a = scanInt.nextInt();
            if(a <=0){
                throw new Exception();
            }
            System.out.println("Enter b: ");
            b = scanInt.nextInt();
            if(b <=0) {
                throw new Exception();
            }
            } catch (InputMismatchException e){
            System.out.println(e);
            return squareRectangle();
        }

        square = a*b;
        System.out.println("Square = " + square);
        return square;

    }

}
