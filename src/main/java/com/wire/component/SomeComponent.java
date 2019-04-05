package com.wire.component;


import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.wire.annotation.LocalizedMessage;

@Component
@Scope(value="session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SomeComponent {
	
	 @LocalizedMessage("greeterservice.greeting")
	  private Message greetingMsg;

	 public String sayHello(@NotNull String caller) {
		    return greetingMsg.format(caller);
		  }

}
