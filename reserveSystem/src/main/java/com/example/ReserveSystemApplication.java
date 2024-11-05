package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
/*@MapperScan("com.example.mapper")*/
//@CrossOrigin(origins = "http://localhost:9528", maxAge = 3600)
public class ReserveSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReserveSystemApplication.class, args);
    }

}
