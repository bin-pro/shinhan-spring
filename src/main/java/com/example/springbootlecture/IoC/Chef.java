package com.example.springbootlecture.IoC;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Chef {

    private final IngredientFactory ingredientFactory;
    public String cook(String menu) throws Exception {
        Ingredient ingredient = ingredientFactory.getIngredient(menu);

        return ingredient.getName() + "으로 만든 " +  menu;
    }
}
