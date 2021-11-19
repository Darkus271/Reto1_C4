package com.costume.repository.crud;

import com.costume.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer>{
    
}
