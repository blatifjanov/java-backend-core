package com.company.cloudBankImpl.impl;


import com.company.bankApi.service.Bank;
import com.company.dto.*;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BankImpl implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType cardType) {
        var cardNumber = createCardNumber();
        var balance = 0;
        var creditLimit = 1_000_000;

        Function<BankCardType, BankCard> createCard = type ->
                (type == BankCardType.CREDIT)
                        ? new CreditBankCard(cardNumber, user, creditLimit)
                        : new DebitBankCard(cardNumber, user, balance);

        return createCard.apply(cardType);
    }

    private static String createCardNumber() {
        var random = new Random();
        return IntStream.range(0, 16)
                .map(i -> random.nextInt())
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
    }
}
