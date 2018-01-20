package pl.financeassistant.services;

public class JpyPrecisionProvider implements RoundPrecisionProvider {

	public int getRoundPrecision(String currency) {
		return 0;
	}

	public boolean isSupportedCurrency(String currency) {
		return "JPY".equals(currency);
	}

}
