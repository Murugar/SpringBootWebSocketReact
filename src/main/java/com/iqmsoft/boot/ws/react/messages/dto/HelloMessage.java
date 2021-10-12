package com.iqmsoft.boot.ws.react.messages.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloMessage implements Serializable {

    private static final long serialVersionUID = 5166155550680045405L;
    String name;
}
