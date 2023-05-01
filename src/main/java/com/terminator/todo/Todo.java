package com.terminator.todo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private Long id;
    private Long userId;
    private String title;
    private boolean completed;
}
