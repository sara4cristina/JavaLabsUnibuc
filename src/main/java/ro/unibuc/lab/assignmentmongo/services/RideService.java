package ro.unibuc.lab.assignmentmongo.services;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import ro.unibuc.lab.assignmentmongo.dtos.RideDto;

import java.util.List;
import java.util.Set;

public interface RideService {

    void addRide(RideDto ride);
    List<RideDto> getAllRides();

}
