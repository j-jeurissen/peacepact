package org.peacepact.repo;

import org.peacepact.domain.Peacekeeper;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author j-jeurissen
 * @since 0.1.0
 */
public interface PeacekeeperRepository extends MongoRepository<Peacekeeper,String>{
}
