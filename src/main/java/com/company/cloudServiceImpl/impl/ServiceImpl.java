package com.company.cloudServiceImpl.impl;

import java.time.LocalDate;
import java.util.*;

import com.company.dto.BankCard;
import com.company.dto.Database;
import com.company.dto.Subscription;
import com.company.dto.User;
import com.company.serviceApi.Service;

import java.util.List;
import java.util.Optional;


public class ServiceImpl implements Service {
    private final List<Subscription>subscriptions = new ArrayList<>();

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public void subscribe(BankCard bankCard) {
        var bankCardNumber = bankCard.getNumber();
        var subscriptionDate = LocalDate.now();

        Subscription subscription = new Subscription(bankCardNumber,subscriptionDate);
        subscriptions.add(subscription);
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return subscriptions.stream()
                .filter(s -> s.getBankcard().equals(cardNumber))
                .findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return new Database().getUsers();
    }
}
