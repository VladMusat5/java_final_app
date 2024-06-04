package com.sda.java_final.service.impl;

import com.sda.java_final.exceptions.BadRequestException;
import com.sda.java_final.exceptions.ResourceNotFoundException;
import com.sda.java_final.model.User;
import com.sda.java_final.repository.UserRepository;
import com.sda.java_final.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        if (id < 0) {
            throw new BadRequestException("Id-ul userului este invalid");
        }
        return this.userRepository.findById(id);
    }

    @Override
    public User saveUser(User user) {
        if (user == null) {
            throw new BadRequestException("Datele trimise sunt invalide");
        }
        if (user.getName() == null || user.getName().isBlank()) {
            throw new BadRequestException("Numele nu este introdus corect");
        }
        if (user.getAddress() == null || user.getAddress().isBlank()) {
            throw new BadRequestException("Adresa nu este introdusa corect");
        }
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new BadRequestException("Emailul nu este introdusa corect");
        }
        if (user.getPhone() == null || user.getPhone().isBlank()) {
            throw new BadRequestException("Telefonul nu este introdusa corect");
        }
        if (user.getPassword() == null || user.getPassword().isBlank()) {
            throw new BadRequestException("Parola nu este introdusa corect");
        }
        return this.userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        if (user == null) {
            throw new BadRequestException("Datele trimise sunt invalide");
        }
        if (user.getId() == null || user.getId() < 0) {
            throw new BadRequestException("Id-ul userului nu exista in baza de date");
        }
        if (user.getName() == null || user.getName().isBlank()) {
            throw new BadRequestException("Numele nu este introdus corect");
        }
        if (user.getAddress() == null || user.getAddress().isBlank()) {
            throw new BadRequestException("Adresa nu este introdusa corect");
        }
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new BadRequestException("Emailul nu este introdusa corect");
        }
        if (user.getPhone() == null || user.getPhone().isBlank()) {
            throw new BadRequestException("Telefonul nu este introdusa corect");
        }
        if (user.getPassword() == null || user.getPassword().isBlank()) {
            throw new BadRequestException("Parola nu este introdusa corect");
        }
        Optional<User> userOptional = getUserById(user.getId());
        if (userOptional.isEmpty()) {
            throw new ResourceNotFoundException("Userul nu a fost gasit");
        }
        return this.userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        Optional<User> userOptional = getUserById(id);
        if (userOptional.isEmpty()) {
            throw new ResourceNotFoundException("Userul nu a fost gasit");
        }
        this.userRepository.deleteById(id);
    }
}
