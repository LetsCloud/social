/**
 * 
 */
package io.demo.social.server.repository;

import java.util.Optional;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

import io.demo.social.server.entity.User;

/**
 * @author robi
 *
 */
public interface UserRepository extends DatastoreRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
