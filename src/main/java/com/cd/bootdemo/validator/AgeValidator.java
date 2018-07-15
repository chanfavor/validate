package com.cd.bootdemo.validator;

import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;


//@SupportedValidationTarget(value = { ValidationTarget.PARAMETERS })
public class AgeValidator implements ConstraintValidator<Age, Integer> {

   private int min;
   private int max;

   public void initialize(Age constraint) {

      min = constraint.min();
      max = constraint.max();
   }

   public boolean isValid(Integer obj, ConstraintValidatorContext context) {


      int age = obj;
      if (age < min || age > max) {
         return false;
      }

      return true;
   }
}
