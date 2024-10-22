package com.example.users.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateUserDto(
        @NotBlank(message = "Nome é obrigatorio") String name,
        @NotBlank(message = "Email é obrigatorio") @Email(message = "Email invalido") String email,
        @NotNull(message = "Idade é obrigatorio") @Min(value = 1, message = "Idade invalido") Integer age,
        @NotNull(message = "Id é obrigatorio") @Min(value = 1, message = "Id invalido") Integer id
) {
}
