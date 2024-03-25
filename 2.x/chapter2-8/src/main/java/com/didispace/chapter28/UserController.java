package com.didispace.chapter28;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@Controller
public class UserController {

    @PostMapping(value = "/user",
            consumes = MediaType.APPLICATION_XML_VALUE, //表示这个方法接收的请求体的内容类型（Content-Type）应为"application/xml"
            produces = MediaType.APPLICATION_XML_VALUE) //表示这个方法返回的响应的内容类型（Content-Type）应为"application/xml"

    @ResponseBody //表示这个方法的返回值应被用作HTTP响应的主体。
    public User create(@RequestBody User user) {
        user.setName("didispace.com : " + user.getName());
        user.setAge(user.getAge() + 100);
        return user;
    }

}