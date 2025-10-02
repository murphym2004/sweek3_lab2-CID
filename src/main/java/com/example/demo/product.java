package com.example.demo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class product {
    @NotBlank
    private String productname;
    @Positive
    private double productprice;
}
