package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long account_number;
    @Column
    private String account_holder_name;
    @Column
    private double account_balance;

    public Account() {
    }

    public Account(String account_holder_name, double account_balance) {
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }
}
