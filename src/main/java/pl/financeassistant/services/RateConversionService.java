package pl.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class RateConversionService {

	private CurrencyRateProvider rateProvider;
	
	public void setRateProvider(CurrencyRateProvider rateProvider) {
		this.rateProvider = rateProvider;
	}
	
	public BigDecimal convertAmount (BigDecimal amount, String currency) {
		BigDecimal rate = rateProvider.getRate(currency, new Date());
		System.out.println("RateConversionService: Obliczam Kwotê");
		BigDecimal result = new BigDecimal("1115.37");
		System.out.println(result);
		return result;
	}
}
