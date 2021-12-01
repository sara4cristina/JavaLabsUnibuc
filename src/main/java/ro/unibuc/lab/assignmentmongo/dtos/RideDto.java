package ro.unibuc.lab.assignmentmongo.dtos;

import java.util.Objects;

public final class RideDto {

    private final String id;
    private final String departure;
    private final String arrival;
    private final String price;

    public RideDto(String id, String departure, String arrival, String price) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public RideDto(String departure, String arrival, String price) {
        this(null, departure, arrival, price);
    }

    public String getId() {
        return id;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RideDto)) return false;
        RideDto rideDto = (RideDto) o;
        return price == rideDto.price && Objects.equals(id, rideDto.id) && Objects.equals(departure, rideDto.departure) && Objects.equals(arrival, rideDto.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departure, arrival, price);
    }

    @Override
    public String toString() {
        return "RideDto{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", price=" + price +
                '}';
    }
}
