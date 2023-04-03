package com.peerlender.lendingengine.application.model;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;

public final  class LoanRequest {

    private final int amount;
    private final long borrowerId;

    private final int dayToPay;

    private final double interestRate;

    public LoanRequest(int amount, long borrowerId, int dayToPay, double interestRate) {
        this.amount = amount;
        this.borrowerId = borrowerId;
        this.dayToPay = dayToPay;
        this.interestRate = interestRate;
    }

    public int getAmount() {
        return amount;
    }

    public long getBorrowerId() {
        return borrowerId;
    }

    public int getDayToPay() {
        return dayToPay;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanRequest that = (LoanRequest) o;
        return amount == that.amount && borrowerId == that.borrowerId && dayToPay == that.dayToPay && Double.compare(that.interestRate, interestRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, borrowerId, dayToPay, interestRate);
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "amount=" + amount +
                ", borrowerId=" + borrowerId +
                ", dayToPay=" + dayToPay +
                ", interestRate=" + interestRate +
                '}';
    }
}
