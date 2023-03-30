package com.ead.authuser.controller;


import com.ead.authuser.dtos.UserDto;
import com.ead.authuser.models.UserModel;
import com.ead.authuser.services.UserService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin( origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body( userService.findAll() );
    }
    @GetMapping("/{userId}")
    public ResponseEntity<Object> getOneUser(@PathVariable(value = "userId") UUID userId ){
        Optional<UserModel> userModelOptional = userService.findById( userId );

        if(! userModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(userModelOptional.get());
        }
    }




    @DeleteMapping
    public ResponseEntity<Object> deleteuser( @PathVariable(value = "userId") UUID userId ){

        Optional<UserModel> userModelOptional = userService.findById(userId);

        if(! userModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }else{
            userService.delete(userModelOptional.get());
            return ResponseEntity.status(HttpStatus.OK).body("User delete success");
            //ResponseEntity.status(HttpStatus.OK).body();
        }

    }



    @PutMapping("/{userId}")
    public ResponseEntity<Object> updateUser(@PathVariable(value = "userId") UUID userId, @RequestBody UserDto userDto ){

        Optional<UserModel> userModelOptional = userService.findById(userId);

        if(!userModelOptional.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        } else{
            var userModel = userModelOptional.get();
            userModel.setFullName(userDto.getFullName());
            userModel.setPhoneNumber(userDto.getPhoneNumber());
            userModel.setCpf(userDto.getCpf());
            userModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));
            userService.save(userModel);
            return  ResponseEntity.status(HttpStatus.OK).body(userModel);
        }
    }



}
