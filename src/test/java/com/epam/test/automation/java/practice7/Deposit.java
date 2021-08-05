package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */
public abstract class Deposit {
    public final BigDecimal amount;
    public final int period;

    Deposit(BigDecimal amount , int period) {
        this.amount = amount ;
        this.period = period;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public abstract BigDecimal income();
}