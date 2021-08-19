package frmnjn.belajar.security.service;

import frmnjn.belajar.security.domain.Role;
import frmnjn.belajar.security.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
