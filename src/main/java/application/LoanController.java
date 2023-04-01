package application;

import application.model.LoanRequest;
import domain.model.User;
import domain.repository.LoanRepository;
import domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {

    private final LoanRepository loanRepository;
    private final UserRepository userRepository;

    @Autowired
    public LoanController(LoanRepository loanRepository, UserRepository userRepository) {
        this.loanRepository = loanRepository;
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/loan/request", method = RequestMethod.POST)
    public void requestLoan(@RequestBody final LoanRequest loanApplication) {

    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findUsers() {
        return userRepository.findAll();

    }
}
