package me.leolin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonUserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon/{id}")
    public User findUserById(@PathVariable Long id) {
        return restTemplate.getForObject("http://user-api/" + id, User.class);
    }

}
