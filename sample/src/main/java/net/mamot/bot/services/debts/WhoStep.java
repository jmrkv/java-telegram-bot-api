package net.mamot.bot.services.debts;

import com.pengrad.telegrambot.fluent.KeyboardBuilder;

import static java.lang.Integer.parseInt;

public class WhoStep implements WizardStep {
    private final Transaction transaction;

    public WhoStep(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String screen() {
        return "Who?\n" + transaction.toString();
    }

    @Override
    public KeyboardBuilder keyboard() {
        return KeyboardBuilder.keyboard().
                row("jessy", "1").
                row("gus", "2").
                row("saul", "3").
                row("enter", "enter");
    }

    @Override
    public WizardStep callback(String data) {
        if ("enter".equals(data)) {

        }
        transaction.to(parseInt(data));
        return new WhatStep(transaction);
    }
}
