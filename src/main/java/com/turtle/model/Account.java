package com.turtle.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by AmazingTurtle on 13.04.2017.
 */
@JsonIgnoreProperties
@Document(indexName = "accounts", type = "accounts", shards = 1, replicas = 0)
public class Account {

    private String id;

    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
