package cn.herculas.pokemon.exception;

import cn.herculas.pokemon.enumeration.ExceptionEnum;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final Integer code;

    public BusinessException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getDesc());
        this.code = exceptionEnum.getCode();
    }
}
