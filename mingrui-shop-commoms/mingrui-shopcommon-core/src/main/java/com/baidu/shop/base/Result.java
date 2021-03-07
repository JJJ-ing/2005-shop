package com.baidu.shop.base;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Result
 * @Description: TODO
 * @Author wangjing
 * @Date 2020/12/23
 * @Version V1.0
 **/

@Data
@NoArgsConstructor
public class Result<T> {
    //返回码
    private Integer code;

    //返回消息
    private String message;

    //返回数据
    private T data;

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public boolean isSuccess(){
        return this.code == 200;
    }
}
