package org.qianrenxi.brook.system.repository;

import org.qianrenxi.brook.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
