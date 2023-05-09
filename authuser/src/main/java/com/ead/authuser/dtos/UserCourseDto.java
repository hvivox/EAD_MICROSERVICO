package com.ead.authuser.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class UserCourseDto {

    private UUID userId;
    @NotNull
    private UUID courseId;
}
