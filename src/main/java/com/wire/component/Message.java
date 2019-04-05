package com.wire.component;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class Message {

  private final MessageSource messageSource;

  private final String messageKey;

  public Message(MessageSource messageSource, String messageKey) {
    this.messageSource = messageSource;
    this.messageKey = messageKey;
  }

  public String format(Object ... args) {
    Locale locale = LocaleContextHolder.getLocale();
    return messageSource.getMessage(messageKey, args, locale);
  }
}

