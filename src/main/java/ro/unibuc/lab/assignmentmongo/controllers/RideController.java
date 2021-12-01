package ro.unibuc.lab.assignmentmongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.lab.assignmentmongo.dtos.RideDto;
import ro.unibuc.lab.assignmentmongo.services.RideService;

@Controller
public class RideController {

    private final RideService service;
    public RideController(RideService service) {this.service = service;}


    @GetMapping("/ride")
    public String getRideList(@ModelAttribute("model") ModelMap model){
        model.addAttribute("rideList", service.getAllRides());
        return "addRide";
    }

    @PostMapping( "/ride")
    public  String addRide(@RequestParam("departure") String departure, @RequestParam("arrival") String arrival,@RequestParam("price") String price, @ModelAttribute("model") ModelMap model){
        service.addRide( new RideDto( departure, arrival, price));
        model.addAttribute("rideList", service.getAllRides());
        return "addRide";
    }
}

