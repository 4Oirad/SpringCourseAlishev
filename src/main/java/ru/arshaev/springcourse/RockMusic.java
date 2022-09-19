package ru.arshaev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "DDT - Это всё!";
    }
}
