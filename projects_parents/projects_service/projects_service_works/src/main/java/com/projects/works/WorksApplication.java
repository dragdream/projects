package com.projects.works;

import com.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author chumengcheng
 * @date 2023/8/27 3:17 PM
 */
@SpringBootApplication
@EnableEurekaClient
//注意 要使用通用的mapper的组件扫描
@MapperScan(basePackages = {"com.projects.works.dao"})
public class WorksApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorksApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(0,1) ;}
}
