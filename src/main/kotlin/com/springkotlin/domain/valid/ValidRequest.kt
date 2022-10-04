package com.springkotlin.domain.valid

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class ValidationCategory : ConstraintValidator<ValidCategory, Any>{

    /**
     * 유효성 체크.
     * notice, event, faq 외의 값이 들어오면 false 반환
     */
    override fun isValid(value: Any?, context: ConstraintValidatorContext?): Boolean {
        return when(value){
            "notice", "event", "faq" -> true
            else -> false
        }
    }
}