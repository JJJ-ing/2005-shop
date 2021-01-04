package com.baidu.shop.global;

import com.baidu.shop.base.Result;
import com.baidu.shop.status.HTTPStatus;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName GlobalException
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/12/25
 * @Version V1.0
 **/

@RestControllerAdvice
@Slf4j
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public Result<JsonObject> test(Exception e){
        Result<JsonObject> result = new Result();
        result.setCode(HTTPStatus.ERROR);
        result.setMessage(e.getMessage());

        log.debug(e.getMessage());

        return result;
    }

    @ExceptionHandler(value= MethodArgumentNotValidException.class)
    public List<Result<JsonObject>>
    methodArgumentNotValidHandler(MethodArgumentNotValidException exception) throws
            Exception
    {
        List<Result<JsonObject>> objects = new ArrayList<>();
        //按需重新封装需要返回的错误信息
        for (FieldError error : exception.getBindingResult().getFieldErrors()) {
            Result<JsonObject> jsonObjectResult = new Result<>();
            jsonObjectResult.setCode(HTTPStatus.PARAMS_VALIDATE_ERROR);
            jsonObjectResult.setMessage("Field --> " + error.getField() + " : "
                    + error.getDefaultMessage());
            log.debug("Field --> " + error.getField() + " : " +
                    error.getDefaultMessage());
            objects.add(jsonObjectResult);
        }
        return objects;
    }

}
