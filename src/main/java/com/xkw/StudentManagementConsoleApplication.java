package com.xkw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@MapperScan("com.xkw.repository")
//@CrossOrigin(origins = "*")
public class StudentManagementConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementConsoleApplication.class, args);
    }

}
