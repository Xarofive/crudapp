package ru.springsecurity.dao;

import ru.springsecurity.model.Role;

import java.util.List;

public interface RoleDao {
    Role getRoleByName(String name);

    List<Role> listRoles();
}
