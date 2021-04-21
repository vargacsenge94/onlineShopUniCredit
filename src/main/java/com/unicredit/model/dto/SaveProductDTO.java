package com.unicredit.model.dto;

import com.unicredit.model.entity.PricePerDay;
import lombok.Data;

import java.util.List;

@Data
public class SaveProductDTO {

    private String name;
    private boolean isValid;
    private List<PricePerDay> pricePerDays;
}
