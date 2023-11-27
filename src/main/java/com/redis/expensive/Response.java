package com.redis.expensive;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Response implements Serializable {

    public final String message;
}
