package com.peerlender.lendingengine.application;

import com.peerlender.lendingengine.application.model.LoanRequest;
import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.LoanRepository;
import com.peerlender.lendingengine.domain.repository.UserRepository;
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
