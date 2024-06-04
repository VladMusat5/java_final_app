package com.sda.java_final.controller;

import com.sda.java_final.exceptions.ResourceNotFoundException;
import com.sda.java_final.model.User;
import com.sda.java_final.service.UserService;
import com.sda.java_final.utils.ApiResponse;
import com.sda.java_final.utils.ResponseHandler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200") // pentru a primi requesturi din Angular
@RequestMapping("/api/users")

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService; // s-a realizat dependency injection
    }

    @GetMapping(value = "")
    public ResponseEntity<ApiResponse> getAllUsers() {
        List<User> userList = this.userService.getAllUsers();

        return ResponseHandler.onSuccess("Lista toti utilizatori", userList);
    }

    @GetMapping("/userById/{id}")
    public ResponseEntity<ApiResponse> getUserById(@PathVariable Long id) {
        Optional<User> optionalUser = this.userService.getUserById(id);
        optionalUser.orElseThrow(() -> new ResourceNotFoundException("Userul cu id-ul: " + id + " nu exista"));

        return ResponseHandler.onSuccess("Userul cu id-ul" + id, optionalUser.get());
    }

    @PostMapping("")
    public ResponseEntity<ApiResponse> saveUser(@RequestBody User user) {
        User userResponse = this.userService.saveUser(user);

        return ResponseHandler.onSuccess("User salvat cu succes", userResponse);
    }

    @PutMapping("")
    public ResponseEntity<ApiResponse> updateUser(@RequestBody User user) {
        User userResponse = this.userService.updateUser(user);

        return ResponseHandler.onSuccess("Userul a fost actualizat cu success", userResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable Long id) {
        this.userService.deleteUserById(id);

        return ResponseHandler.onSuccess("Userul a fost sters cu succes", null);
    }
}

