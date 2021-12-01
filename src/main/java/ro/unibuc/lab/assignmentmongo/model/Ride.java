package ro.unibuc.lab.assignmentmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "Ride")
public final class Ride {

    @Id
    private final String id;
    private final String departure;
    private final String arrival;
    private final String price;

    @PersistenceConstructor
    public Ride(String id, String departure, String arrival, String price) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public Ride(String departure, String arrival, String price){
        this(null, departure, arrival, price);
    }
    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ride)) return false;
        Ride ride = (Ride) o;
        return price == ride.price && Objects.equals(id, ride.id) && Objects.equals(departure, ride.departure) && Objects.equals(arrival, ride.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departure, arrival, price);
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
}
