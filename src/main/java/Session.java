import Model.*;

import java.util.ArrayList;

public class Session
{

    private final int bookedPlace;
    private int capacity;
    private int numInClass;

    private final double fee;
    private double totalRevenue;

    private final Date sessionDate;
    private final ExerciseClass className;
    private final Time classTime;


    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList <Review> reviews = new ArrayList <> ();


    public Session (String sessionId, ExerciseClass cName, Time cTime, double fee, int place, Date date)
    {
        sessionDate = date;
        className = cName;
        classTime = cTime;

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