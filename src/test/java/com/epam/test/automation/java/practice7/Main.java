package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BaseDeposit base = new BaseDeposit(new BigDecimal(3000), 6);
        System.out.println(base.income());
        SpecialDeposit special = new SpecialDeposit(BigDecimal.valueOf(1000),2);
        System.out.println("Special income: " + special.income());

        System.out.println("Client tests");
        Client first = new Client();
        first.addDeposit(new LongDeposit(new BigDecimal(10), 8));
        first.addDeposit(new BaseDeposit(new BigDecimal(20), 4));
        System.out.println("Total income: " + first.totalIncome());
    }
}
