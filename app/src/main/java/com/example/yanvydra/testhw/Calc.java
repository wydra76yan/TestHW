package com.example.yanvydra.testhw;

/**
 * Created by YanVydra on 11.10.2017.
 */

public class Calc implements ICalc {

    @Override
    public Double add(double a, double b) {
        return a + b;
    }

    @Override
    public Double sub(double a, double b) {
        return a - b;
    }

    @Override
    public String toString() {
        return "";
    }
}
