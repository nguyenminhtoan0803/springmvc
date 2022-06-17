package org.toannguyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.toannguyen.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUserNameAndStatus(String name, int status);
}
