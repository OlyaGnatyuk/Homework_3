package org.example.buckwheat_stocks;

public class BuckwheatStocks {
    private static final int ONE_KILO_PER_MONTH_STORAGE_COST_IN_RUBLES = 100;
    private static final int BUCKWHEAT_CONSUMPTION_PER_MONTH_IN_KILOS = 6;

    public static void countStocks(int buckwheatLeftInKilos) {
        int storageCost = 0;
        while (buckwheatLeftInKilos >= 0) {
            storageCost += buckwheatLeftInKilos * ONE_KILO_PER_MONTH_STORAGE_COST_IN_RUBLES;
            buckwheatLeftInKilos -= BUCKWHEAT_CONSUMPTION_PER_MONTH_IN_KILOS;
        }

        storageCost += (BUCKWHEAT_CONSUMPTION_PER_MONTH_IN_KILOS + buckwheatLeftInKilos) * ONE_KILO_PER_MONTH_STORAGE_COST_IN_RUBLES;

        System.out.println(storageCost);
    }

    public static void countStocksByMonthsNumber(int monthsNumber) {
        int buckwheatLeftInKilos = BUCKWHEAT_CONSUMPTION_PER_MONTH_IN_KILOS * monthsNumber;
        countStocks(buckwheatLeftInKilos);
    }
}
