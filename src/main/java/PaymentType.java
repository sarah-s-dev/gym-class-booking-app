public class PaymentType
{
    private String paymentType;

    /**
     * Constructor for objects of class PaymentType
     */
    public PaymentType (String paymentType)
    {
        this.setPaymentType(paymentType);
    }

    /**
     * Constructor for objects of class PaymentType
     */
    public PaymentType ()
    {
        this.paymentType = "Type";
    }

    /**
     * Accessor - getPaymentType
     * @return - the type of payment
     */
    public String getPaymentType()
    {
        return paymentType;
    }

    /**
     * Mutator - setPaymentType
     * @add - the type of payment
     */
    public void setPaymentType(String pType)
    {
        paymentType = pType;
    }

    public String toString()
    {
        return paymentType;
    }
}
