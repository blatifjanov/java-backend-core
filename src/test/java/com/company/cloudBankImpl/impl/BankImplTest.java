package com.company.cloudBankImpl.impl;

import com.company.dto.*;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankImplTest {


    @Test
    public void testCreateBankCard_ReturnsCreditBankCard() {
        //GIVEN
        var bankImpl = new BankImpl();
        var user = new User("Donald", "Trump",LocalDate.of(1946,6,14));
        var cardType = BankCardType.CREDIT;

        // WHEN
        BankCard bankCard = bankImpl.createBankCard(user, cardType);

        // THEN
        assertTrue(bankCard instanceof CreditBankCard, "Should return a CreditBankCard");
    }

    @Test
    public void testCreateBankCard_ReturnsDebitBankCard() {
        //GIVEN
        var bankImpl = new BankImpl();
        var user = new User("Donald", "Trump",LocalDate.of(1946,6,14));
        var cardType = BankCardType.DEBIT;

        // WHEN
        BankCard bankCard = bankImpl.createBankCard(user, cardType);

        // THEN
        assertTrue(bankCard instanceof DebitBankCard, "Should return a DebitBankCard");
    }
}
