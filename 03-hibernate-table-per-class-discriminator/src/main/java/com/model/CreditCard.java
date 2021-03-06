package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("CC")
public class CreditCard extends BillingDetails {

	@NotNull
	protected String cardNumber;

	@NotNull
	protected String expMonth;

	public CreditCard() {
	}

	public CreditCard(String owner, String cardNumber, String expMonth) {
		super(owner);
		this.cardNumber = cardNumber;
		this.expMonth = expMonth;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", expMonth=" + expMonth + "]";
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

}
