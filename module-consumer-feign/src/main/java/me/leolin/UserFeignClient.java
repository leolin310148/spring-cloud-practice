package me.leolin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-api", fallback = HystrixClientFallback.class)
public interface UserFeignClient {
    @RequestMapping("/{id}")
    public User findUserById(@RequestParam("id") Long id);

}
