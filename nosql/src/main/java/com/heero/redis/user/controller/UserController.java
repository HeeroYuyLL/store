package com.heero.redis.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heero.redis.user.po.UserInfo;
import com.heero.redis.user.service.UserService;
import com.heero.redis.user.vo.ResultMessageVo;

/**
 * 用户登录控制层
 * 
 * @author lilin
 */
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * 用户service层接口
     */
    @Resource
    private UserService userService;

    /**
     * 用户登录
     * 
     * @param userInfo 用户信息
     * @param session 会话
     * @return 登录结果信息
     */
    @ResponseBody
    @RequestMapping("login")
    public ResultMessageVo login(UserInfo userInfo, HttpSession session, HttpServletResponse response) {
        // 写cookie
        Cookie cookie = new Cookie("nosql.sessionid", session.getId());
        cookie.setPath("/");
        response.addCookie(cookie);
        userInfo.setSessionid(session.getId());
        return userService.login(userInfo);
    }
    
    /**
     * 用户注销
     * 
     * @param userInfo 用户信息
     * @param session 会话
     * @return 登录结果信息
     */
    @RequestMapping("logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        String sessionId = null;
        
        // 删除cookie
        for (Cookie cookie : request.getCookies()) {
            if ("nosql.sessionid".equals(cookie.getName())) {
                // 从cookie中取sessionId
                sessionId = cookie.getValue();
                
                // 超时时间设为0，即删除cookie
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        // 销毁session
        request.getSession().invalidate();
        userService.logout(sessionId);
        
        return "redirect:/index.html";
    }

    /**
     * 用户注册
     * 
     * @param userInfo 用户信息
     * @return 注册结果信息
     */
    @ResponseBody
    @RequestMapping("reg")
    public ResultMessageVo reg(UserInfo userInfo) {
        return userService.reg(userInfo);
    }
}
