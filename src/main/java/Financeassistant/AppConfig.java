package Financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import pl.financeassistant.services.CurrencyRateProvider;
import pl.financeassistant.services.DatabaseCurrencyRateProvider;
import pl.financeassistant.services.FileCurrencyRateProvider;
import pl.financeassistant.services.FixedPrecisionProvider;
import pl.financeassistant.services.JpyPrecisionProvider;
import pl.financeassistant.services.RateConversionService;
import pl.financeassistant.services.RoundPrecisionProvider;

@Configuration
public class AppConfig {
	
	@Bean
	@Profile("dev")
	public CurrencyRateProvider fileCurrenRateProvider() {
		return new FileCurrencyRateProvider();
	}
	
	@Bean
	@Profile("prod")
	public CurrencyRateProvider databaseCurrenRateProvider() {
		return new DatabaseCurrencyRateProvider();
	}
	
	
	@Bean
	public RateConversionService rateConversionService() {
		RateConversionService rateConversionService = new RateConversionService();
		return rateConversionService;
	}
	
	@Bean
	public RateConversionService rateConversionService(CurrencyRateProvider currencyRateProvider) {
		RateConversionService rateConversionService = new RateConversionService();
		rateConversionService.setRateProvider(currencyRateProvider);
		return rateConversionService;
	}
	
	
	@Bean
	public RoundPrecisionProvider precisionProvider() {
		return new FixedPrecisionProvider();
	}
	
	@Bean(name= {"dupa","przezwiskoDupy"})
	public RoundPrecisionProvider precisionJpyProvider() {
		return new JpyPrecisionProvider();
	}
}