package com.hph.finance.account.validator;

import com.hph.finance.account.ValidatorData;

@ValidatorData(modulus=11, weights={2, 3, 4, 5, 6, 7, 0, 0, 0}, posFrom=4, posTo=9, posChecksum=10)
public class ValidatorA4V1 extends Validator06 {

}
