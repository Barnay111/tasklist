package com.example.tasklist.domain.user;

import com.example.tasklist.domain.task.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {


    private Long id;

    private String name;

    private String username;

    private String password;

    private String passwordConfirmation;

    private Set<Role> roles;

    private List<Task> tasks;
}
