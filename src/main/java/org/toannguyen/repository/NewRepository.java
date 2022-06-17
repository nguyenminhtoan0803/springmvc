package org.toannguyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.toannguyen.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
