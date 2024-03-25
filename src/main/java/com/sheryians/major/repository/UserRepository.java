package com.sheryians.major.repository;

import com.sheryians.major.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByEmail(String email);


}
