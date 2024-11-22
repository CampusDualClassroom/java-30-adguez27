package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor){
        int res = 0;
    try{
        res = dividend/divisor;
    } catch (ArithmeticException e) {
        throw new DivisionByZeroException();
    }
    return res;
    }

    public static void main(String[] args) {

    }
}
