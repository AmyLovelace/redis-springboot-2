package com.redis.expensive;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StopWatch;

@EnableCaching
@SpringBootApplication
public class ExpensiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensiveApplication.class, args);
	}


	@Bean
	ApplicationRunner applicationRunner(ExpensiveService es){
		return  event ->{
			var sw = new StopWatch();
			var input = 42;
			time(es,sw,input);
			time(es,sw,input);
			//retorna dos eventos con stopwatch y el input
		};
	}
	private static Response time(ExpensiveService es, StopWatch sw,double input){
		sw.start();
		Response response = es.performExpensiveCalculations(input);
		sw.stop();
		System.out.println("tengo una respuesta "+response.toString() +" despues "+ sw.getTotalTimeMillis());
		return response;

		//devuelve los milisegundos que se demora en dar cada respuesta

	}

}
