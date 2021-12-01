package ro.unibuc.lab.assignmentmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ro.unibuc.lab.assignmentmongo.repositories.RideRepository;

import java.util.*;

@SpringBootApplication
public class AssignmentMongoApplication {
	public static void main(String[] args) { SpringApplication.run(AssignmentMongoApplication.class, args);}
}
