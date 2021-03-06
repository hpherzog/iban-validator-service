package com.hph.finance.account.validator;

import com.hph.finance.account.PreparedAccountNumber;
import com.hph.finance.account.Validator;
import com.hph.finance.account.ValidatorData;

@ValidatorData(modulus = 7, weights = { 2, 1, 2, 1, 2 })
public class Validator80MB extends Validator {

	protected boolean validate(PreparedAccountNumber accountNumber) {

		int sum = sumRightLeft(accountNumber.getExtracted(), weights, true);
		int rest = sum % modulus;
		int checksum = modulus - rest;

		if (rest == 0) {
			checksum = 0;
		}

		return checksum == accountNumber.getChecksumAsInt();
	}
}
