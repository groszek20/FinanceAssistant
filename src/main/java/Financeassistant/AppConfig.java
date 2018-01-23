package Financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.financeassistant.services.CurrencyRateProvider;
import pl.financeassistant.services.FileCurrencyRateProvider;
import pl.financeassistant.services.FileTaxRate;
import pl.financeassistant.services.FixedPrecisionProvider;
import pl.financeassistant.services.InterfaceTestowy;
import pl.financeassistant.services.JpyPrecisionProvider;
import pl.financeassistant.services.RateConversionService;
import pl.financeassistant.services.RoundPrecisionProvider;
import pl.financeassistant.services.TaxesService;

@Configuration
@ComponentScan(basePackages= {"pl.financeassistant.services"})
public class AppConfig {
	
//	@Bean
//	public CurrencyRateProvider fileCurrenRateProvider() {
//		return new FileCurrencyRateProvider();
//	}
//	
//	@Bean
//	public RateConversionService rateConversionService() {
//		RateConversionService rateConversionService = new RateConversionService();
//		return rateConversionService;
//	}
//	
//	@Bean
//	public RateConversionService rateConversionService(CurrencyRateProvider currencyRateProvider) {
//		RateConversionService rateConversionService = new RateConversionService();
//		rateConversionService.setRateProvider(currencyRateProvider);
//		return rateConversionService;
//	}
//	
//	
//	@Bean
//	public RoundPrecisionProvider precisionProvider() {
//		return new FixedPrecisionProvider();
//	}
//	
//	@Bean
//	public RoundPrecisionProvider precisionJpyProvider() {
//		return new JpyPrecisionProvider();
//	}
}