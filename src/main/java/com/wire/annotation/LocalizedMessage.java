package com.wire.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Autowired;

@Autowired
@Retention(value=RetentionPolicy.RUNTIME)
public @interface LocalizedMessage {
 
  String value() default "";
 
}