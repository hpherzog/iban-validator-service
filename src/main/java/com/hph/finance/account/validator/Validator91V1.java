package com.hph.finance.account.validator;

import com.hph.finance.account.ValidatorData;

@ValidatorData(modulus=11, weights={2, 3, 4, 5, 6, 7}, posFrom=1, posTo=6, posChecksum=7)
public class Validator91V1 extends Validator06 {

}
