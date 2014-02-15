package com.hph.finance.account.validator;

import com.hph.finance.account.PreparedAccountNumber;
import com.hph.finance.account.Validator;
import com.hph.finance.account.ValidatorData;

@ValidatorData
public class ValidatorA5 extends Validator {

	@Override
	protected boolean validate(PreparedAccountNumber accountNumber) {

		Validator validator = new ValidatorA5V1();
		if(!validator.isValid(accountNumber.getRawNumber(), accountNumber.getBankNumber())) {
			
			if(accountNumber.getLength() == 10 && extract(accountNumber.getZeroFilled(), 1).equals("9")) {
				return false;
			}
			
			validator = new ValidatorA5V2();
			return validator.isValid(accountNumber.getRawNumber(), accountNumber.getBankNumber());
		}
		
		return true;
	}
}
