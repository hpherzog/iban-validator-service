package com.hph.finance.account.validator;

import com.hph.finance.account.PreparedAccountNumber;
import com.hph.finance.account.Validator;
import com.hph.finance.account.ValidatorData;

@ValidatorData(modulus = 10, weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9 })
public class Validator43 extends Validator {

	protected boolean validate(PreparedAccountNumber accountNumber) {

		String number = accountNumber.getExtracted();
		Integer last = accountNumber.getChecksumAsInt();

		Integer sum = sumRightLeft(number, weights);
		Integer checksum = modulus - sum % modulus;

		if (checksum == 10) {
			checksum = 0;
		}

		return checksum == last;
	}
}
