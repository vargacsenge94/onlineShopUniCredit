package com.unicredit.service;

import com.unicredit.model.entity.ExchangeRate;
import com.unicredit.repository.ExchangeRateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ExchangeRateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExchangeRateService.class);

    private ExchangeRateRepository exchangeRateRepository;

    public ExchangeRate insertExchangeRate(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

    public List<ExchangeRate> getAllExchangeRates() {
        return exchangeRateRepository.findAll();
    }

    public List<ExchangeRate> getExchangeRateByCurrency() {
        //todo do the query in repo
        return Collections.emptyList();
    }

    /**
     * A new method will be created which will allow the insertion of bulk exchange rates from csv for example.
     * In this case it will be much easier to add new exchange rates when we will have them by day.
     * Most likely in a real life scenario this would be connected to curs BNR or something.
     *
     * @param exchangeRates - rates to be saved
     * @return - list of saved exchange rates
     */
    public List<ExchangeRate> insertExchangeRates(List<ExchangeRate> exchangeRates) {
        return exchangeRateRepository.saveAll(exchangeRates);
    }

    @Autowired
    public void setExchangeRateRepository(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }
}
