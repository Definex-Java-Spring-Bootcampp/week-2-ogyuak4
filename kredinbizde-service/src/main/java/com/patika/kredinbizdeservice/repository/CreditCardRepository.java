package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.CreditCard;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreditCardRepository {


    private List<CreditCard> creditCards;

    public List<CreditCard> findAll() {
        return creditCards;
    }
}
