package com.company.cloudServiceImpl.impl;

import com.company.dto.BankCard;
import com.company.dto.Subscription;
import com.company.dto.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceImplTest {
    @Test
    void testSubscribe() {
        //GIVEN
        var service = new ServiceImpl();
        var user = new User("Barack","Obama", LocalDate.of(1961,8,4));
        var cardNumber = "1234567890123456";
        var bankCard = new BankCard(cardNumber,user);

        //WHEN
        service.subscribe(bankCard);

        //THEN
        assertEquals(1, service.getSubscriptions().size());

    }

    @Test
    void testGetSubscriptionByBankCardNumber() {
        //GIVEN
        var service = new ServiceImpl();
        var user = new User("Jessica","Kent",LocalDate.of(1995,12,13));
        var cardNumber ="1234567890123456";
        var card = new BankCard(cardNumber,user);

        service.subscribe(card);

        //WHEN
        var foundSubscription = service.getSubscriptionByBankCardNumber(cardNumber);

        //THEN
        assertTrue(foundSubscription.isPresent(), "Subscription should be found for bank card number 1234567890123456");

    }
}
