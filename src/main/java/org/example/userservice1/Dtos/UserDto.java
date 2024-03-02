package org.example.userservice1.Dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.userservice1.Models.Role;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UserDto {
    private String email;
    private Set<Role> roles = new HashSet<>();
}
