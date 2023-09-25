package com.example.springbootlecture;

import com.example.springbootlecture.IoC.Chef;
import com.example.springbootlecture.IoC.IngredientFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLectureApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootLectureApplication.class, args);
        IngredientFactory ingredientFactory = new IngredientFactory();
        Chef chef = new Chef(ingredientFactory);

        String food = chef.cook("스테이크");
        System.out.println(food);

    }
}
