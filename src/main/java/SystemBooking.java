import Model.Customer;
import Model.Date;
import Model.Time;

public class SystemBooking
{
    private Customer cust = new Customer(0,"","");
    private Review rev = new Review("",0);

    private FitnessClass fit = new FitnessClass();
    private Date dte = new Date("");
    private Time tme = new Time("");
    private Payment ptype = new Payment("card");

    public SystemBooking(Customer newCustomer, FitnessClass fitnessClass, Date date, Time time, Payment payment, Review newReview) {
        cust.setFirstName(newCustomer.getFirstName());
        cust.setLastName(newCustomer.getLastName());
        fit.setClassName(fitnessClass.getClassName());
        dte.setDate(date.getDate());
        tme.setClassTime(time.getClassTime());
        ptype.setType(payment.getType());
        rev.setReview(newReview.getReview());
    }

    public SystemBooking() {
        cust.setFirstName("");
        cust.setLastName("");
        fit.setClassName("");
        dte.setDate("");
        tme.setClassTime("");
        ptype.setType("");
        rev.setReview("");
    }

    public Customer getCust()
    {
        return cust;
    }

    public FitnessClass getFitnessClassName()
    {
        return fit;
    }

    public Date getDate()
    {
        return dte;
    }

    public Time getFitnessClassTime()
    {
        return tme;
    }

    public Payment getPaymentType()
    {
        return ptype;
    }

    public Review getReview()
    {
        return rev;
    }

    public String toString()
    {
        return "-------------------------------------------------------------------\n"
                + "--------BOOKING DETAILS--------: " + "\n"
                + "Class: " +fit.getClassName() + "\n"
                + "Class time: " +tme.getClassTime() + "\n"
                + "Class date: " +dte.getDate() + "\n"

                + "Your name: " +cust.getFirstName() +  " " +cust.getLastName() + "\n"
                + "Your review: " +rev.getReview() + "\n"
                + "\n-------------------------------------------------------------------";
    }

}