package com.example.spring.miniproject.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Article {
    private UUID uuid;
    private String thumbnail;

    @NotBlank (message = "You need to choose the categories")
    private String title;
    @NotBlank (message = "Title is required")
    private String author;
    @NotBlank (message = "Please insert description")
    private String description;
    private String logo;
    @NotBlank (message = "Author is required")
    private String name;

}
