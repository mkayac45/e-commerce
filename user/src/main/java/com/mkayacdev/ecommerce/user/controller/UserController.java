package com.mkayacdev.ecommerce.user.controller;

import com.mkayacdev.ecommerce.user.dto.CreateUserRequest;
import com.mkayacdev.ecommerce.user.dto.UpdateUserRequest;
import com.mkayacdev.ecommerce.user.dto.UserDto;
import com.mkayacdev.ecommerce.user.model.User;
import com.mkayacdev.ecommerce.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserRequest userRequest){
        return ResponseEntity.ok(userService.createUser(userRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable Long id,@RequestBody UpdateUserRequest updateUserRequest){
        return ResponseEntity.ok(userService.updateUser(id,updateUserRequest));
    }

//    @PatchMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id){
//        userService.deactiveUser(id);
//        return ResponseEntity.ok().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id){
//        userService.deleteUser(id);
//        return ResponseEntity.ok().build();
//
//    }


}
