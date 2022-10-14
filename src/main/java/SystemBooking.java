public class SystemBooking
{
    private Customer cust = new Customer();
    private Review rev = new Review();

    private FitnessClass fit = new FitnessClass();
    private Date dte = new Date();
    private Time tme = new Time();
    private PaymentType ptype = new PaymentType();

    public SystemBooking(Customer newCustomer, FitnessClass fitnessClass, Date date, Time time, PaymentType paymentType,Review newReview) {
        cust.setFirstName(newCustomer.getFirstName());
        cust.setLastName(newCustomer.getLastName());
        fit.setClassName(fitnessClass.getClassName());
        dte.setDate(date.getDate());
        tme.setClassTime(time.getClassTime());
        ptype.setPaymentType(paymentType.getPaymentType());
        rev.setReview(newReview.getReview());
    }

    public SystemBooking() {
        cust.setFirstName("");
        cust.setLastName("");
        fit.setClassName("");
        dte.setDate("");
        tme.setClassTime("");
        ptype.setPaymentType("");
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

    public PaymentType getPaymentType()
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