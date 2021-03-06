package com.hph.finance.account.validator;

import com.hph.finance.account.PreparedAccountNumber;
import com.hph.finance.account.Validator;
import com.hph.finance.account.ValidatorData;

@ValidatorData(modulus = 10, weights = {2, 1, 2, 1, 2}, posFrom = 5, posTo = 9, posChecksum = 10)
public class Validator90ME extends Validator {

	@Override
	protected boolean validate(PreparedAccountNumber accountNumber) {
		
		int sum = sumRightLeft(accountNumber.getExtracted(), weights);
		int rest = sum % modulus;
		int checksum = modulus - rest;
	
		if(rest == 0) {
			checksum = 0;
		}
		
		return checksum == accountNumber.getChecksumAsInt();
	}

}
