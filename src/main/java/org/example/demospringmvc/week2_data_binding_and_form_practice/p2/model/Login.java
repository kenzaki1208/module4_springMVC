package org.example.demospringmvc.week2_data_binding_and_form_practice.p2.model;

public class Login {
    private String account;
    private String password;

    public Login() {}

    public Login(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
