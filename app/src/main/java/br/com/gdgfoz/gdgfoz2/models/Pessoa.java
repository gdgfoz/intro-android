package br.com.gdgfoz.gdgfoz2.models;

import java.io.Serializable;

/**
 * Created by hussan on 11/30/15.
 */
public class Pessoa implements Serializable {
    String name;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
