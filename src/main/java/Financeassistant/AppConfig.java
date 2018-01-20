package Financeassistant;

import org.springframework.context.annotation.Bean;

import pl.financeassistant.services.CurrencyRateProvider;
import pl.financeassistant.services.FileCurrencyRateProvider;
import pl.financeassistant.services.FileTaxRate;
import pl.financeassistant.services.FixedPrecisionProvider;
import pl.financeassistant.services.InterfaceTestowy;
import pl.financeassistant.services.JpyPrecisionProvider;
import pl.financeassistant.services.RateConversionService;
import pl.financeassistant.services.RoundPrecisionProvider;
import pl.financeassistant.services.TaxesService;

public class AppConfig {
	
	@Bean
	public CurrencyRateProvider fileCurrenRateProvider() {
		return new FileCurrencyRateProvider();
	}
	
	@Bean
	public InterfaceTestowy it() {
		return new FileTaxRate();
	}
	
	@Bean
	public TaxesService ts() {
		TaxesService ts = new TaxesService();
		return ts;
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
	
	@Bean
	public RoundPrecisionProvider precisionJpyProvider() {
		return new JpyPrecisionProvider();
	}
}