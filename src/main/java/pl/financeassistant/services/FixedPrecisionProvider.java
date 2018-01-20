package pl.financeassistant.services;

public class FixedPrecisionProvider implements RoundPrecisionProvider {

	public int getRoundPrecision(String currency) {
		return 2;
	}

	public boolean isSupportedCurrency(String currency) {
		return "PLN".equals(currency);
	}

}
