package com.javastart.hellospring.controller.dto;


import com.javastart.hellospring.entity.Account;

public class AccountResponseDTO {
    private String name;
    private String email;
    private Integer bill;

    public AccountResponseDTO(String name, String email, Integer bill) {
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountResponseDTO(Account account) {
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getBill() {
        return bill;
    }
}
