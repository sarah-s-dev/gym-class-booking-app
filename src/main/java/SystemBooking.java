import Model.*;

public class SystemBooking
{
    private final Customer customer = new Customer(0,"","");
    private final Review review = new Review("",0);

    private final ExerciseClass fit = new ExerciseClass("class");
    private final Date date = new Date("");
    private final Time time = new Time("");
    private final Payment payment = new Payment("card");

    public SystemBooking(Customer newCustomer, ExerciseClass exerciseClass, Date date, Time time, Payment payment, Review newReview) {
        customer.setFirstName(newCustomer.getFirstName());
        customer.setLastName(newCustomer.getLastName());
        fit.setName(exerciseClass.getName());
        this.date.setDate(date.getDate());
        this.time.setTime(time.getTime());
        this.payment.setType(payment.getType());
        review.setReview(newReview.getReview());
    }

    public Review getReview()
    {
        return review;
    }

    public String toString()
    {
        return "-------------------------------------------------------------------\n"
                + "--------BOOKING DETAILS--------: " + "\n"
                + "Class: " +fit.getName() + "\n"
                + "Class time: " + time.getTime() + "\n"
                + "Class date: " + date.getDate() + "\n"

                + "Your name: " + customer.getFirstName() +  " " + customer.getLastName() + "\n"
                + "Your review: " + review.getReview() + "\n"
                + "\n-------------------------------------------------------------------";
    }

}