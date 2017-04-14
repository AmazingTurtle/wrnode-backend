package com.turtle.service;

import com.turtle.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AmazingTurtle on 13.04.2017.
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

}
