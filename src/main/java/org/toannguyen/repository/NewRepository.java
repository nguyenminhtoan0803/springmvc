
package org.toannguyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.toannguyen.entity.NewEntity;

/**
 * @author Admin
 * @version 1.0
 */
public interface NewRepository extends JpaRepository<NewEntity, Long> {

	
}
