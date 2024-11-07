package com.company.serviceApi;

import com.company.dto.BankCard;
import com.company.dto.User;
import com.company.dto.Subscription;


import java.util.List;
import java.util.Optional;

public interface Service {

    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    List<User> getAllUsers();
}
