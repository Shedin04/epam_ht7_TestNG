package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */
public class LongDeposit extends Deposit {
    LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        int i = 0;
        BigDecimal income = BigDecimal.ZERO;
        BigDecimal temp = BigDecimal.ZERO;
        BigDecimal amounttemp = amount;
        while (i<=period){
            if (i >= 7) temp = (amounttemp.multiply(BigDecimal.valueOf(0.15))).setScale(2, RoundingMode.HALF_EVEN);
            amounttemp = amounttemp.add(temp);
            income = income.add(temp);
            i++;
        }
        return income;
    }
}