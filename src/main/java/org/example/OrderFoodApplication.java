package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName EmpApplication
 * @Description TODO
 * @Author lixiaoru
 * @Date 2020/11/18
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.jxd.orderfood.dao")
public class OrderFoodApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderFoodApplication.class);
    }
}
