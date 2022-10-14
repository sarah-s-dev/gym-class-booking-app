import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Booking {

    private int id;
    private String name;
    private boolean booked;
    private String bookingStatus;
    private int bookedPlace;
    private double fee;
    private double totalRevenuePerClass;


}
