package application.model;
import org.springframework.stereotype.Component;

import java.util.Objects;

public final  class LoanRequest {

    private final long id;

    private final int amount;
    private final long borrowerId;

    private final int dayToPay;

    private final double interestRate;

    public LoanRequest(long id, int amount, long borrowerId, int dayToPay, double interestRate) {
        this.id = id;
        this.amount = amount;
        this.borrowerId = borrowerId;
        this.dayToPay = dayToPay;
        this.interestRate = interestRate;
    }

    public long getId() {
        return id;
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
        return id == that.id && amount == that.amount && Double.compare(that.interestRate, interestRate) == 0 && Objects.equals(borrowerId, that.borrowerId) && Objects.equals(dayToPay, that.dayToPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, borrowerId, dayToPay, interestRate);
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "id=" + id +
                ", amount=" + amount +
                ", borrowerId='" + borrowerId + '\'' +
                ", dayToPay=" + dayToPay +
                ", interestRate=" + interestRate +
                '}';
    }
}
