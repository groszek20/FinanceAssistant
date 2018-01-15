package pl.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class RateConversionService {

	private CurrencyRateProvider rateProvider;

	@Autowired
	public void setRateProvider(CurrencyRateProvider rateProvider) {
		this.rateProvider = rateProvider;
	}
	
	@Autowired(required = false)
	private RoundPrecisionProvider precisionProvider;

	public BigDecimal convertAmount(BigDecimal amount, String currency) {
		BigDecimal rate = rateProvider.getRate(currency, new Date());
		System.out.println("RateConversionService: Obliczam Kwot�");
		int precision = 2;
		if (precisionProvider != null) {
			precision = precisionProvider.getRoundPrecision("PLN");
		} else {
			System.out.println("Brak providera precyzji");
		}
		BigDecimal result = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
		return result;
	}

}
