package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */
public class SpecialDeposit extends Deposit {
    SpecialDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal koef = BigDecimal.valueOf(0.01);
        BigDecimal periodinkoef = BigDecimal.valueOf(period).multiply(koef);
        BigDecimal tempamount = amount;
        BigDecimal income = BigDecimal.ZERO;
        while (koef.compareTo(periodinkoef) <= 0) {
            BigDecimal temp = tempamount.multiply(koef);
            tempamount = tempamount.add(temp);
            income = income.add(temp).setScale(2,RoundingMode.HALF_EVEN);
            koef = koef.add(BigDecimal.valueOf(0.01));
        }
        return income;
    }
}