package com.haomostudio.SpringMVCTemplate.controller;

import com.haomostudio.SpringMVCTemplate.AuthToken;
import com.haomostudio.SpringMVCTemplate.service.AuthTokenService;
import com.haomostudio.SpringMVCTemplate.service.HmUtils.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @ClassName AuthTokenController
 * @Description TODO
 * @Author Liuyanqiang
 * @Date 2018-8-2 20:11
 * @Version V1.0
 */
@Controller
public class AuthTokenController {

    @Autowired
    AuthTokenService authTokenService;


    @ResponseBody
    @RequestMapping(value = "/token/add")
    public Object createToken(HttpServletRequest request){

        AuthToken authToken = new AuthToken();
        String id = Tools.getUUID();
        authToken.setId(id);
        String userId = request.getParameter("userId");
        authToken.setUserId(userId);
        String token = request.getParameter("X-Auth-Token");
        authToken.setToken(token);
        authToken.setCreateTime(new Date());
        String validTime = request.getParameter("validTime");
        authToken.setValidTime(Tools.convertStringToDate(validTime, "yyyy-MM-dd HH:mm:ss"));
        authTokenService.create(authToken);

        return authTokenService.get(id);

    }
}
