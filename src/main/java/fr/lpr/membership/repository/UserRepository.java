package fr.lpr.membership.repository;

import fr.lpr.membership.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the User entity.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findOneByActivationKey(String activationKey);

	List<User> findAllByActivatedIsFalseAndCreatedDateBefore(LocalDateTime dateTime);

	Optional<User> findOneByResetKey(String resetKey);

	Optional<User> findOneByEmail(String email);

	Optional<User> findOneByLogin(String login);

	@Override
	void delete(User t);
}
