package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Campaign;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CampaignRepository {


    private List<Campaign> campaigns = new ArrayList<>();

    public List<Campaign> findAllOrderByCreateDateDesc() {
        return campaigns.stream()
                .sorted((c1, c2) -> c2.getCreateDate().compareTo(c1.getCreateDate()))
                .collect(Collectors.toList());
    }
}
