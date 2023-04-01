package domain.model;


import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.time.Duration;
import java.util.Objects;
@Entity
public class LoanApplication {
    @Id
private long id;
    private int amount;

    private User borrower;
    private Duration repaymentTerm;
    private double interestRate;


    public LoanApplication(long id, int amount, User borrower, Duration repaymentTerm, double interestRate) {
        this.id = id;
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTerm = repaymentTerm;
        this.interestRate = interestRate;

    }
    public long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public User getBorrower() {
        return borrower;
    }

    public Duration getRepaymentTerm() {
        return repaymentTerm;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanApplication that = (LoanApplication) o;
        return id == that.id && amount == that.amount && Double.compare(that.interestRate, interestRate) == 0 && Objects.equals(borrower, that.borrower) && Objects.equals(repaymentTerm, that.repaymentTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, borrower, repaymentTerm, interestRate);
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "id=" + id +
                ", amount=" + amount +
                ", borrower=" + borrower +
                ", repaymentTerm=" + repaymentTerm +
                ", interestRate=" + interestRate +
                '}';
    }
}
