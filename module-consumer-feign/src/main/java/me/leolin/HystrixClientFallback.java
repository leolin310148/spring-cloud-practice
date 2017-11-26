package me.leolin;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeignClient {

    /**
     * hystrix fallback方法
     *
     * @param id id
     * @return 默认的用户
     */
    @Override
    public User findUserById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}


