package com.costume.controller;

import com.costume.model.User;
import com.costume.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Representa la Categoria
 * @author dario
 */
@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 
     * @return 
     */
    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }
    /**
     * 
     * @param user
     * @return 
     */
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user){
        return userService.save(user);
    }
}
