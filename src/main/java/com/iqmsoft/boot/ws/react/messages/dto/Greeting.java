package com.iqmsoft.boot.ws.react.messages.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting implements Serializable {

    private static final long serialVersionUID = 5242427420838566738L;
    String content;
}
