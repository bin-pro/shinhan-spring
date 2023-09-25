package com.example.springbootlecture.IoC;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class Chicken implements Ingredient{
    private final String name;

    @Override
    public String getName() {
        return "닭";
    }
}
