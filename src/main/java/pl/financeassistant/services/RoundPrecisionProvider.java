package pl.financeassistant.services;

public interface RoundPrecisionProvider {
	int getRoundPrecision(String currency);
	boolean isSupportedCurrency(String currency);
}
