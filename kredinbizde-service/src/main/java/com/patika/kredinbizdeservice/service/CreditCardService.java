package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.CreditCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {


    private List<CreditCard> creditCards;

    public List<CreditCard> getAllCreditCards() {
        return creditCards;
    }
}
