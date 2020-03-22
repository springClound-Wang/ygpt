package com.jeesite.modules.api.userInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 成就客户、专业之上、持续创新、诚信敬业、合作共赢
 * 成为一家世界级的数字商业云服务厂商
 *
 * @Author: xingyan,
 * @Date: 2020/3/22
 * @DESC:
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @GetMapping("/test")
    public  String test(){
        return "test";
    }
}
