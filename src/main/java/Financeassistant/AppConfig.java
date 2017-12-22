package Financeassistant;

import org.springframework.context.annotation.Bean;

import pl.financeassistant.services.CurrencyRateProvider;
import pl.financeassistant.services.FileCurrencyRateProvider;
import pl.financeassistant.services.RateConversionService;

public class AppConfig {

	@Bean
	public CurrencyRateProvider fileCurrenRateProvider() {
		return new FileCurrencyRateProvider();
	}
	
	@Bean
	public RateConversionService rateConversionService() {
		RateConversionService rateConversionService = new RateConversionService();
		rateConversionService.setRateProvider(fileCurrenRateProvider());
		return rateConversionService;
	}
}
