package pl.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class ConversionService {

	private CurrencyRateProvider rateProvider;

	@Autowired
	public void setRateProvider(CurrencyRateProvider rateProvider) {
		this.rateProvider = rateProvider;
	}

	public BigDecimal convertAmount(int amount, String currency) {
		BigDecimal rate = rateProvider.getRate(currency, new Date());
		System.out.println("RateConversionService: Obliczam Kwotê");
		return rate;
	}
}
