package com.luisCadena;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(10.003231d, 10.003d));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {


        firstNumber = (int) (firstNumber*1000);
        System.out.println(firstNumber);


        secondNumber = (int) (secondNumber*1000);
        System.out.println(secondNumber);

        if (firstNumber == secondNumber){

            return true;
        } else {return false;}




        }
}


