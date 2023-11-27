package com.redis.expensive;

import lombok.SneakyThrows;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ExpensiveService {

    @SneakyThrows
    @Cacheable("expensive")
    public Response performExpensiveCalculations(double input){
        Thread.sleep(10*1000);
        return new Response("respuesta del input"+ input + "@"+ Instant.now());
    }

}
