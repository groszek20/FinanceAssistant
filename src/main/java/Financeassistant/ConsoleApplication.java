package Financeassistant;

import java.math.BigDecimal;
import java.security.Provider.Service;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.financeassistant.services.ConversionService;
import pl.financeassistant.services.FileCurrencyRateProvider;
import pl.financeassistant.services.RateConversionService;

public class ConsoleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		RateConversionService service = context.getBean(RateConversionService.class);
		ConversionService provider = context.getBean(ConversionService.class);
//		service.convertAmount(123, "EUR");
		provider.convertAmount(10, "EuR");

	}

}
