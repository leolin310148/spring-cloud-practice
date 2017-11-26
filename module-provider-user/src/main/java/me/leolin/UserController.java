package me.leolin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }

    @GetMapping("/instance-info")
    public ServiceInstance getRegistration() {
        return discoveryClient.getInstances("user-api").get(0);
    }
}
