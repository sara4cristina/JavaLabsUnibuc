package ro.unibuc.lab.assignmentmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import ro.unibuc.lab.assignmentmongo.dtos.RideDto;
import ro.unibuc.lab.assignmentmongo.model.Ride;
import ro.unibuc.lab.assignmentmongo.repositories.RideRepository;
import java.util.List;


@Service
@EnableMongoRepositories("ro.unibuc.lab.assignmentmongo.repositories")
public class SimpleRideService implements RideService{

    @Autowired
    private final RideRepository rideRepo;
    public SimpleRideService(RideRepository rideRepo) {
        this.rideRepo = rideRepo;
    }

    @Override
    public void addRide(RideDto rideDto) {
        final var savedRide = rideRepo.insert(new Ride(rideDto.getDeparture(), rideDto.getArrival(), rideDto.getPrice()));
    }

    @Override
    public List<RideDto> getAllRides() {
        return rideRepo.findAll().stream().map(SimpleRideService::mapToDto).toList();
    }

    private static RideDto mapToDto(Ride ride){
        return new RideDto(ride.getId(), ride.getDeparture(), ride.getArrival(), ride.getPrice());

    }
}
