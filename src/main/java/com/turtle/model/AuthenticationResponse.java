package com.turtle.model;

/**
 * Created by AmazingTurtle on 13.04.2017.
 */
public class AuthenticationResponse {

    private Boolean success;
    private String accountId;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
