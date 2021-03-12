package com.baidu.shop.web;

import com.baidu.shop.base.BaseApiService;
import com.baidu.shop.base.Result;
import com.baidu.shop.business.UserOauthService;
import com.baidu.shop.config.JwtConfig;
import com.baidu.shop.dto.UserInfo;
import com.baidu.shop.entity.UserEntity;
import com.baidu.shop.status.HTTPStatus;
import com.baidu.shop.utils.CookieUtils;
import com.baidu.shop.utils.JwtUtils;
import com.baidu.shop.utils.ObjectUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName UserOauthController
 * @Description: TODO
 * @Author wangjing
 * @Date 2021/3/12
 * @Version V1.0
 **/

@RestController
@RequestMapping(value = "oauth")
public class UserOauthController extends BaseApiService {
    @Autowired
    private UserOauthService userOauthService;

    @Autowired
    private JwtConfig jwtConfig;

    @PostMapping(value = "login")
    public Result<JSONObject> login(@RequestBody UserEntity userEntity, HttpServletRequest request, HttpServletResponse response){
        String token = userOauthService.login(userEntity,jwtConfig);

        if (ObjectUtil.isNull(token)) return this.setResultError("账号或者密码输入错误");

        //将token放到cookie中
        CookieUtils.setCookie(request,response,jwtConfig.getCookieName(),token
                , jwtConfig.getCookieMaxAge(),true);

        return this.setResultSuccess();
    }

    @GetMapping(value = "verify")
    public Result<UserInfo> checkUserIsLogin(@CookieValue(value = "MRSHOP_TOKEN") String token
            ,HttpServletRequest request,HttpServletResponse response){
        UserInfo userInfo = null;
        try {
            userInfo = JwtUtils.getInfoFromToken(token, jwtConfig.getPublicKey());

            String newToken = JwtUtils.generateToken(userInfo, jwtConfig.getPrivateKey(), jwtConfig.getExpire());
            CookieUtils.setCookie(request,response,jwtConfig.getCookieName(),newToken,jwtConfig.getCookieMaxAge(),true);

        } catch (Exception e) {
            e.printStackTrace();
            return this.setResultError(HTTPStatus.USER_NOT_LOGIN,"用户没有登录");
        }
        return this.setResultSuccess(userInfo);
    }
}
