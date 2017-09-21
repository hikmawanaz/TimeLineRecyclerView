package com.arbaini.recyclerviewtimeline;

/**
 * Created by xplore on 9/21/17.
 */

public class TransactionModel {

    private int balance;

    private int tipeView;

    public TransactionModel(int balance, int tipeView) {
        this.balance = balance;
        this.tipeView = tipeView;
    }

    public int getBalance() {
        return balance;
    }

    public int getTipeView() {
        return tipeView;
    }
}
