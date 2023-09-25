package com.example.springbootlecture.IoC;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Pork implements Ingredient{
    private final String name;
    @Override
    public String getName() {
        return "돼지고기";
    }
}
