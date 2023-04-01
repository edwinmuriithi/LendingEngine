package domain.repository;
import domain.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanApplication,Long> {

}
