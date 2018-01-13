package Financeassistant;

import org.springframework.context.annotation.Bean;

import pl.financeassistant.services.ConversionService;
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
		return rateConversionService;
	}
	
	@Bean
	public ConversionService conversionService() {
		ConversionService conversionService = new ConversionService();
		return conversionService;
	}
}