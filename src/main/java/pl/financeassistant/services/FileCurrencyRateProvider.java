package pl.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

public class FileCurrencyRateProvider implements CurrencyRateProvider {

	public BigDecimal getRate(String currency, Date rateDate) {
		System.out.println("FileCurrencyRateProvider: wczytano z pliku");
		return BigDecimal.valueOf(4.25);
	}
}
