package cn.herculas.pokemon.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {

    POKEMON_NOT_EXIST(50001, "Pokemon queried not exist.");

    private final Integer code;
    private final String desc;
}
