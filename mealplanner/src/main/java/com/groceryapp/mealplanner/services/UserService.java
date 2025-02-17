package com.groceryapp.mealplanner.services;

import com.groceryapp.mealplanner.models.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByEmail(String enail);
    User saveUser (User user);
}
