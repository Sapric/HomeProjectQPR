package pl.luxoft.qpr.bilykov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.luxoft.qpr.bilykov.model.Role;

/**
 * Repository for role
 *
 * @author Bondar Dmytro.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}
