package com.redis.expensive;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Response implements Serializable {

    //determina el tipo de dato que se guardará en redis
    public final String message;
}
