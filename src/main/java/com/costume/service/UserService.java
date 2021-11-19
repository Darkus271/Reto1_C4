package com.costume.service;

import com.costume.model.User;
import com.costume.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Categoria
 * @author dario
 */
@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;
    /**
     * 
     * @return 
     */
    public List<User> getAll() {
        return UserRepository.findAll();
    }
    /**
     * 
     * @param user
     * @return 
     */
    public User save(User user) {
        if (user.getId() == null) {
            return UserRepository.save(user);
        } else {
            Optional<User> user1 = UserRepository.findById(user.getId());
            if (user1.isEmpty()) {
                return UserRepository.save(user);
            } else {
                return user;
            }
        }
    }
}
