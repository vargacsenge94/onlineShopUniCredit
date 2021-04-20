package com.unicredit.entity.dto;

import com.unicredit.entity.PricePerDay;
import lombok.Data;

import java.util.List;

@Data
public class SaveProductDTO {

    private String name;
    private List<PricePerDay> pricePerDays;
}
