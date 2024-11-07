package com.company.bankApi.service;

import com.company.dto.BankCard;
import com.company.dto.BankCardType;
import com.company.dto.User;

public interface Bank {
    BankCard createBankCard(User user, BankCardType cardType);
}
