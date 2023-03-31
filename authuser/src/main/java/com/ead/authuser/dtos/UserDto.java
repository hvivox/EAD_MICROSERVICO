package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.UUID;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    @JsonView(UserView.RegistrationPost.class)
    private String username;

    private UUID userId;
    @JsonView(UserView.RegistrationPost.class)
    private String email;
    @JsonView({UserView.RegistrationPost.class, UserView.PasswordPut.class})
    private String password;
    @JsonView({UserView.PasswordPut.class})
    private String oldPassword;
    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    private String fullName;
    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    private String phoneNumber;
    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    private String cpf;
    @JsonView({UserView.ImagePut.class})
    private String imageUrl;
    public interface UserView {
        interface RegistrationPost {
        }

        interface UserPut {
        }

        interface PasswordPut {
        }

        interface ImagePut {
        }
    }

}
