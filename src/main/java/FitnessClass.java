public class FitnessClass
{
    private String className;

    /**
     * Constructor for objects of class FitnessClass
     */
    public FitnessClass (String name)
    {
        this.setClassName(name);
    }

    /**
     * Constructor for objects of class FitnessClass
     */
    public FitnessClass ()
    {
        this.className = "Class";
    }

    /**
     * Accessor - getClassName
     * @return - the customers fitness class
     */
    public String getClassName()
    {
        return className;
    }

    public void setClassName(String className)
    {
        this.className = className;
    }

    public String toString()
    {
        return className;
    }

}