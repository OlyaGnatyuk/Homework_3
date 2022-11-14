package org.example;

import org.example.buckwheat_stocks.BuckwheatStocks;
import org.example.fizz_buzz.FizzBuzz;
import org.example.simple_cycle.SimpleCycle;
import org.example.simple_number.SimpleNumber;
import org.example.simple_sum.SimpleSum;
import org.example.strange_sum.StrangeSum;

public class Main {
    public static void main(String[] args) {
        SimpleCycle.printNumbers();
        System.out.println();
        SimpleSum.calculateGeometricProgression();
        StrangeSum.calculateStrangeSum();
        FizzBuzz.printFizzBuzz();
        SimpleNumber.checkIfNumberIsSimple(5);
        BuckwheatStocks.countStocks(100);
        BuckwheatStocks.countStocksByMonthsNumber(5);
    }
}
