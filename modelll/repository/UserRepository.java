package com.example.projectforrft.repository;

import com.example.projectforrft.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

}
