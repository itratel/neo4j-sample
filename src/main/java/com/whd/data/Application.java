package com.whd.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;


/**
 * @author MovieService
 * @class Hhe
 * @date 2018/6/30 18:42
 * @description Describe the function of this class in one sentence
 **/
@SpringBootApplication
@EnableNeo4jRepositories("com.whd.data.repos")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
