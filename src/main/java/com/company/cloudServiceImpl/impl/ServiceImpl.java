package com.company.cloudServiceImpl.impl;

import java.util.Collections;

import com.company.dto.BankCard;
import com.company.dto.Subscription;
import com.company.dto.User;
import com.company.serviceApi.Service;

import java.util.List;
import java.util.Optional;


public class ServiceImpl implements Service {
    @Override
    public void subscribe(BankCard bankCard) {

    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return Collections.EMPTY_LIST;
    }
}
