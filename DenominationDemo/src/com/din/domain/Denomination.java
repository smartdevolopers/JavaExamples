package com.din.domain;

public enum Denomination {
	NICKEL(5), DIME(10), QUARTER(25);

	private int denominationValue;

	private Denomination(int val) {
		this.denominationValue = val;
	}

	public int getDenominationValue() {
		return denominationValue;
	}

	public void setDenominationValue(int denominationValue) {
		this.denominationValue = denominationValue;
	}
}
