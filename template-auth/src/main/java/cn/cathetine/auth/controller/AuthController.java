package cn.cathetine.auth.controller;

import cn.cathetine.auth.service.AuthFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:xjk 2019/8/5 14:12
 * cn.cathetine.auth.controller
 */
@RestController
public class AuthController {

    @Autowired
    private AuthFeignService authFeignService;

    /**
     * 模拟Feign远程调用，这里暴露一个请求接口`/feignHello`
     * 这个请求接口将调用`AuthFeignService`（Feign接口）
     * Feign接口（`AuthFeignService`接口）将会通过`@FeignClient(value = "template-admin")`在Eureka注册中心寻找`template-admin`模块
     * Feign接口类似Controller的Rest接口，也暴露一个地址，这个地址对应`template-admin`模块的一个Controller接口地址
     *
     * @param name
     * @return
     */
    @GetMapping("/feignHello/{name}")
    public String feignHello(@PathVariable String name) {
        return authFeignService.hello(name);
    }

}
