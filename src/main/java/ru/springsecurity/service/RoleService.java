package ru.springsecurity.service;

import ru.springsecurity.model.Role;

import java.util.List;

public interface RoleService {
    Role getRoleByName(String name);
    List<Role> listRoles();
}
