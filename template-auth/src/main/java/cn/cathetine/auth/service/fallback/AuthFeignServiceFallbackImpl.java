package cn.cathetine.auth.service.fallback;

import cn.cathetine.auth.service.AuthFeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author:xjk 2019/8/5 14:27
 * cn.cathetine.auth.service
 */
@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this is template-auth, but request error";    }
}
