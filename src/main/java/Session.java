import java.util.ArrayList;

public class Session
{
    private String sessionId;
    private boolean booked;
    private String bookingStatus;

    private int bookedPlace;
    private int capacity;
    private int numInClass;

    private double fee;
    private double totalRevenue;

    private Date sessionDate;
    private FitnessClass className;
    private Time classTime;
    private PaymentType paymentType;


    private ArrayList<Customer> customers = new ArrayList <Customer> ();
    private ArrayList <Review> reviews = new ArrayList <Review> ();


    public Session (String sessionId, FitnessClass cName, Time cTime, double fee, int place, Date date)
    {
        sessionDate = date;
        className = cName;
        classTime = cTime;

        this.sessionId = sessionId;
        this.fee = fee;
        this.bookedPlace = place;

        capacity = 20;
        numInClass = 0;
        totalRevenue = 0;
    }

    public void bookSession (Customer customer)
    {
        if (numInClass < capacity && bookedPlace < capacity) {
            customers.add (customer);
            numInClass = numInClass + bookedPlace;
            capacity = capacity - bookedPlace;
            totalRevenue += fee;
            booked = true;
            bookingStatus = "Booked";
        } else
        {
            System.out.println ("Sorry this class is full");
        }
    }

    public void cancelSession (Customer customer)
    {
        if (numInClass > bookedPlace)
        {
            customers.remove (customer);
            numInClass = numInClass - bookedPlace;
            capacity = capacity - bookedPlace;
            totalRevenue = totalRevenue - fee;
            totalRevenue = totalRevenue - (fee * bookedPlace);
            System.out.println ("Your class booking has now been cancelled.");
        } else
            System.out.println ("You have tried to cancel too many bookings");
    }

    /**
     * Method getSessionId
     * @return -id for the session
     */
    public String getSessionId ()
    {
        return sessionId;
    }

    /**
     * Method getFee
     * @return -the cost of the session
     */
    public double getFee ()
    {
        return fee;
    }

    /**
     * Method getSessionDate
     * @return -the date of the session
     */
    public Date getSessionDate ()
    {
        return sessionDate;
    }

    /**
     * Method getClassName
     *
     * @return -the name of the class for the session
     */
    public FitnessClass getClassName ()
    {
        return className;
    }

    /**
     * Method showCustomersOnSession
     * Prints out all the details of all the customers in this session
     *
     */
    public void showCustomersOnSession ()
    {
        for (Customer c: customers)// Loop over all customers in this session
        {
            System.out.println (c.toString()); // Print out the customer
        }
    }


    public void addReview (Review review)
    {
        reviews.add (review);
    }

    /**
     * Method showReviewsForSession
     * Prints out all the details of all the reviews for this session
     *
     */
    public void showReviewsForSession ()
    {
        for (Review rw: reviews)// Loop over all reviews for this session
        {
            System.out.println (rw.toString());
        }
    }

    public String toString()
    {
        return "Class: " + className + "\n" +
                "Class date: " + sessionDate + "\n" +
                "Class time: " + classTime + "\n" +
                "Class price: "  + fee + "\n" +
                "Number of customers in class: " + numInClass + "\n" +
                "Total income generated: " + totalRevenue;
    }

}