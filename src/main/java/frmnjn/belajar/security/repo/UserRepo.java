package frmnjn.belajar.security.repo;

import frmnjn.belajar.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
