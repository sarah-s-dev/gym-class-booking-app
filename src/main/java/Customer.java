public class Customer
{
    private int customerId;
    private String firstName;
    private String lastName;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String fName, String lName)
    {
        this.setCustomerId(id);
        this.setFirstName(fName);
        this.setLastName(lName);
    }

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        this.customerId = 1;
        this.firstName = "first name";
        this.lastName = "last name";
    }

    /**
     * Accessor - getCustomerId
     * @return - the customer Id
     */
    public int getCustomerId()
    {
        return customerId;
    }

    /**
     * Mutator - setCustomerId
     * @add - the customer Id
     */
    public void setCustomerId(int id)
    {
        customerId = id;
    }

    /**
     * Accessor - getFirstName
     * @return - the customer first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Mutator - setFirstName
     * @add - the customer first name
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     * Accessor - getLastName
     * @return - the customer last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Mutator - setLastName
     * @add - the customer last name
     */
    public void setLastName(String lName)
    {
        lastName = lName;
    }

    public String toString()
    {
        return "Customer details: " + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Customer ID: " + customerId + "\n";
    }
}


