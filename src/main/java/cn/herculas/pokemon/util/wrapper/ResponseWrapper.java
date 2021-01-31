package cn.herculas.pokemon.util.wrapper;

import cn.herculas.pokemon.data.VO.ResponseVO;
import cn.herculas.pokemon.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseWrapper {

    public static <T> ResponseVO<T> success(T data) {

        ResponseVO<T> responseVO = new ResponseVO<>();

        responseVO.setCode(HttpStatus.OK.value());
        responseVO.setMessage(HttpStatus.OK.getReasonPhrase());
        responseVO.setData(data);

        return responseVO;
    }

    public static ResponseVO<?> success() {
        return ResponseWrapper.success(null);
    }

    private static ResponseVO<?> error(HttpStatus httpStatus, Map<String, Object> errMsgMap) {

        ResponseVO<Map<String, Object>> responseVO = new ResponseVO<>();

        responseVO.setCode(httpStatus.value());
        responseVO.setMessage(httpStatus.getReasonPhrase());
        responseVO.setData(errMsgMap);

        return responseVO;
    }

    public static ResponseVO<?> error(HttpStatus httpStatus, BusinessException exception) {

        Map<String, Object> errMsgMap = new LinkedHashMap<>();

        errMsgMap.put("err_code", exception.getCode());
        errMsgMap.put("err_msg", exception.getMessage());

        return ResponseWrapper.error(httpStatus, errMsgMap);
    }

    public static ResponseVO<?> error(HttpStatus httpStatus, BindingResult bindingResult) {

        Map<String, Object> errMsgMap = new LinkedHashMap<>();

        for (ObjectError error : bindingResult.getAllErrors())
            errMsgMap.put(error.getObjectName(), error.getDefaultMessage());

        return ResponseWrapper.error(httpStatus, errMsgMap);
    }
}
