package com.epam.test.automation.java.practice7;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */
public class Client {
    private final Deposit[] deposits;
    private int num = 0;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        if (num>=deposits.length) return false;
        if (deposits[num] == null) {
            this.deposits[num] = deposit;
            num++;
        }
        boolean flag = false;
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] != null) {
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public BigDecimal totalIncome() {
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] != null) total = total.add(deposits[i].income());
        }
        return total;
    }

    public BigDecimal maxIncome(){
        BigDecimal max = BigDecimal.ZERO;
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] != null && deposits[i].income().compareTo(max) >0) {
                max = deposits[i].income();
            }
        }
        return max;
    }

    public BigDecimal getIncomeByNumber(int number){
        if (deposits[number] == null) return BigDecimal.valueOf(0);
        else {return deposits[number].income();}
    }
}