package com.example.crud.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ProductDTO(String id, @NotBlank String name, @NotNull BigDecimal price) {
}
