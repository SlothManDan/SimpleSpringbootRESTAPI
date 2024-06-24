package uk.co.danielsteeples.simplerestapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.danielsteeples.simplerestapi.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
