package com.costume.repository;
import com.costume.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.costume.repository.crud.UserCrudRepository;
import com.costume.repository.crud.UserCrudRepository;

/**
 * Categoria
 * @author dario
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}