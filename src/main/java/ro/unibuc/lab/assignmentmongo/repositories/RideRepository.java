package ro.unibuc.lab.assignmentmongo.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.lab.assignmentmongo.model.Ride;

import java.util.List;

@Repository
public interface RideRepository extends MongoRepository<Ride, String> { }
