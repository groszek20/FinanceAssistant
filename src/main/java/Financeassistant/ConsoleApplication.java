package Financeassistant;

import java.math.BigDecimal;
import java.security.Provider.Service;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.financeassistant.services.FileCurrencyRateProvider;
import pl.financeassistant.services.RateConversionService;
import pl.financeassistant.services.TaxesService;

public class ConsoleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		RateConversionService service = context.getBean(RateConversionService.class);
		service.convertAmount(new BigDecimal("124"), "EUR");
//		TaxesService service2 = context.getBean(TaxesService.class);
//		service2.doSomething(10);
	}

}
