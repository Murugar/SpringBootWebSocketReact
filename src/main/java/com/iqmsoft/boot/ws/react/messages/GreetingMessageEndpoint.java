package com.iqmsoft.boot.ws.react.messages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.iqmsoft.boot.ws.react.messages.dto.Greeting;
import com.iqmsoft.boot.ws.react.messages.dto.HelloMessage;

@Slf4j
@Controller
public class GreetingMessageEndpoint {

    @MessageMapping("/sendgreeting")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        log.info("received: {}", message);
        Thread.sleep(1000); // simulated delay
        return new Greeting("Welcome, " + message.getName() + "!");
    }
}
