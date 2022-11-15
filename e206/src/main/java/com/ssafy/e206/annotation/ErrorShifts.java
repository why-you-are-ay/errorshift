package com.ssafy.e206.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.ssafy.e206.configuration.CustomErrorAttributes;
import com.ssafy.e206.controller.CustomErrorController;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({ CustomErrorAttributes.class, CustomErrorController.class })
@ControllerAdvice
public @interface ErrorShifts {
  ErrorShift[] value();
}
