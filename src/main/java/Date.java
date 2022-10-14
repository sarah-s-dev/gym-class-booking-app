public class Date
{
    private String date;

    /**
     * Constructor for objects of class Date
     */
    public Date (String date)
    {
        this.setDate(date);
    }

    /**
     * Constructor for objects of class Date
     */
    public Date ()
    {
        this.date = "Date";
    }

    /**
     * Accessor - getDate
     * @return - the class date
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Mutator - setDate
     * @add - the class date
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    public String toString()
    {
        return date;
    }

}
