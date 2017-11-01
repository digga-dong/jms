package com.holley.controller;

import com.holley.common.utils.CommonUtils;
import com.holley.common.utils.Logger;
import com.holley.model.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/10/31.
 */
public class BaseController {
    protected Logger logger = Logger.getLogger(this.getClass());

    /**
     * 获取HttpServletRequest
     * @return
     */
    public HttpServletRequest getHttpServletRequest(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes.getRequest();
    }

    /**
     * 获取ServletContext
     * @return
     */
    public ServletContext getServletContext(){
        HttpServletRequest request = this.getHttpServletRequest();
        return request.getServletContext();
    }

    /**
     * 获取IP地址
     * @return
     */
    public String getIpAddr(){
        HttpServletRequest request = this.getHttpServletRequest();
        return CommonUtils.getIpAddr(request);
    }

    /**
     * 获取当前登录用户信息
     * @return
     */
    public User getUserInfo(){
        HttpServletRequest request = this.getHttpServletRequest();
        User user = (User) request.getSession().getAttribute("user");
        return user != null ? user : null;
    }
}
