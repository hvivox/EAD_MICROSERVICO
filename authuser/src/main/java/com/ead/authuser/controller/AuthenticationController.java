package com.ead.authuser.controller;


import com.ead.authuser.dtos.UserDto;
import com.ead.authuser.enums.UserStatus;
import com.ead.authuser.enums.UserType;
import com.ead.authuser.models.UserModel;
import com.ead.authuser.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<Object> resgisterUser(@RequestBody UserDto userDto ){

        if(userService.existsByUsername( userDto.getFullName() )){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Error: username is already taken!");
        }

        if( userService.existsByEmail(userDto.getEmail() ) ){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Error: email is already taken!");
        }

        var userModel = new UserModel();
        BeanUtils.copyProperties( userDto, userModel );

        userModel.setUserStatus(UserStatus.ACTIVE);
        userModel.setUserType(UserType.STUDENT);
        userModel.setCreationDate( LocalDateTime.now(ZoneId.of("UTC")));
        userModel.setLastUpdateDate( LocalDateTime.now( ZoneId.of("UTC")) );
        userService.save(  userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body( userModel );


    }

}























