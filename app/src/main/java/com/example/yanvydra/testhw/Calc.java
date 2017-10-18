package com.example.yanvydra.testhw;

/**
 * Created by YanVydra on 11.10.2017.
 */

public class Calc implements ICalc {

    @Override
    public Double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    @Override
    public Double sub(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    @Override
    public String toString() {
        return "";
    }
}
