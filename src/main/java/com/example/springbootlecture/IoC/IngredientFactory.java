package com.example.springbootlecture.IoC;

public class IngredientFactory {
    public static Ingredient getIngredient(String name) throws Exception {
        if(name.equals("치킨")){
            return Chicken.builder().name("닭").build();
        }else if(name.equals("스테이크")){
            return Pork.builder().name("돼지고기").build();
        }else{
            throw new Exception("재료가 없습니다.");
        }
    }
}
