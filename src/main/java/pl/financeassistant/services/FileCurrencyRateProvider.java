package pl.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class FileCurrencyRateProvider implements CurrencyRateProvider {

	public BigDecimal getRate(String currency, Date rateDate) {
		System.out.println("FileCurrencyRateProvider: wczytano z pliku");
		System.out.println(currency);
		return BigDecimal.valueOf(4.25);
	}
}
