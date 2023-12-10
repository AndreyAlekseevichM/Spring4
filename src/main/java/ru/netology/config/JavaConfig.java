package ru.netology.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.controller.PostController;
import ru.netology.service.PostService;


@Configuration
public class JavaConfig {


    @Bean
    public PostController PostController() {
        return new PostController();
    }

    @Bean
    public PostService postService() {
        return new PostService();
    }

}
