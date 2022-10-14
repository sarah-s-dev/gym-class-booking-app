public class Time
{
    private String classTime;

    /**
     * Constructor for objects of class Time
     */
    public Time (String time)
    {
        this.setClassTime(time);
    }

    /**
     * Constructor for objects of class Time
     */
    public Time ()
    {
        this.classTime = "Time";
    }

    /**
     * Accessor - getClassTime
     * @return - the class time
     */
    public String getClassTime()
    {
        return classTime;
    }

    /**
     * Mutator - setClassTime
     * @add - the class time
     */

    public void setClassTime(String classTime)
    {
        this.classTime = classTime;
    }

    public String toString()
    {
        return classTime;
    }
}
