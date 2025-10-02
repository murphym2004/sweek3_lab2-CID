package com.example.demo;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class product {
    @NotBlank
    @Size(min = 2, max = 12)
    private String productname;
    @Positive
    @DecimalMin(value = "0.10")
    private double productprice;
}
