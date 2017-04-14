package com.turtle.controller;

import com.turtle.model.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AmazingTurtle on 13.04.2017.
 */
@RestController
@RequestMapping("/account")
public class AccountController {



    @RequestMapping(path = "/authenticate/{username}", method = RequestMethod.POST)
    public ResponseEntity<AuthenticationResponse> authenticate(@PathVariable("username") String username) {
        return ResponseEntity.ok(new AuthenticationResponse());
        //return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

}
