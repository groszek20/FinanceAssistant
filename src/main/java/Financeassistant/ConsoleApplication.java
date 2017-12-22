package Financeassistant;

import java.math.BigDecimal;
import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.financeassistant.services.RateConversionService;

public class ConsoleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		RateConversionService service = context.getBean(RateConversionService.class);
		service.convertAmount(BigDecimal.valueOf(123), "EUR");

	}

}
