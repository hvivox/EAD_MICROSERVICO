package com.ead.course.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ModuleDto {

    @NotBlank
    private String title;
    @NotBlank
    private String description;
}
