package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TodoDto {
    private long id;
    private String title;
    private int order;
    private boolean completed;
}
