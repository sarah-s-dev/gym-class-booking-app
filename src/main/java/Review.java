public class Review
{
    private String review;

    /**
     * Constructor for objects of class Review
     */
    public Review (String review)
    {
        this.setReview(review);
    }

    /**
     * Constructor for objects of class Review
     */
    public Review ()
    {
        this.review = "Review";
    }

    /**
     * Accessor - getReview
     * @return - the customers review
     */
    public String getReview()
    {
        return review;
    }

    /**
     * Mutator - setReview
     * @add - the customers review
     */
    public void setReview(String rev)
    {
        review = rev;
    }

    public String toString()
    {
        return review;
    }
}
