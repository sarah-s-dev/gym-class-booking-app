import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
/**
 * Input Class
 * Holds the user input information
 * @author Sarah Sidders
 * @version 1.9
 */

public class Input
{
    private Scanner input = new Scanner(System.in);

    private final int numOfClasses = 5;
    private final int numOfTimes = 4;
    private final int numOfPtypes = 2;
    private final int numOfDates = 4;

    private FitnessClass[] classList = new FitnessClass[numOfClasses];
    private Time[] timeList = new Time[numOfTimes];
    private PaymentType[] pTypeList = new PaymentType [numOfPtypes];
    private Date[] dateList = new Date [numOfDates];

    static Customer customer = new Customer();
    static Review review = new Review();

    FitnessClass requestedClass = new FitnessClass();
    Time requestedTime = new Time();
    Date requestedDate = new Date();

    //Selecting the fitness class
    private FitnessClass classSelection()
    {
        for(int count = 0; count < numOfClasses; count++){
            System.out.println((count + 1) + ". " + classList[count]);
        }
        System.out.println("Welcome to the Weekend Fitness Club!");
        System.out.println("Which fitness class would you like to book?");
        int selection = input.nextInt();
        selection -= 1;

        if(selection > numOfClasses | selection < 0)
        {
            System.out.println("Invalid number entered.");
            classSelection();
        }

        return classList[selection];

    }

    //Selecting the date
    private Date dateSelection()
    {
        for(int count = 0; count < numOfDates; count++){
            System.out.println((count + 1) + ". " + dateList[count]);
        }
        System.out.println("Which date would you like to book?");
        int selection = input.nextInt();
        selection -= 1;

        if(selection > numOfDates | selection < 0)
        {
            System.out.println("Invalid number entered.");
            dateSelection();
        }
        return dateList[selection];
    }

    //Selecting the Time
    private Time timeSelection()
    {
        for(int count = 0; count < numOfTimes; count++){
            System.out.println((count + 1) + ". " + timeList[count]);
        }
        System.out.println("Which time would you like to book?");
        int selection = input.nextInt();
        selection -= 1;

        if(selection > numOfTimes | selection < 0)
        {
            System.out.println("Invalid number entered.");
            timeSelection();
        }

        return timeList[selection];

    }

    //Selecting the Payment Type
    private PaymentType pTypeSelection()
    {
        for(int count = 0; count < numOfPtypes; count++){
            System.out.println((count + 1) + ". " + pTypeList[count]);
        }
        System.out.println("How would you like to make your payment?");
        int selection = input.nextInt();
        selection -= 1;

        if(selection > numOfTimes | selection < 0)
        {
            System.out.println("Invalid number entered.");
            pTypeSelection();
        }

        return pTypeList[selection];

    }

    private  SystemBooking issueBooking(Customer aCustomer, FitnessClass aClass, Date aDate,Time aTime, PaymentType aPaymentType, Review aReview)
    {
        SystemBooking systemBooking = new SystemBooking(aCustomer, aClass, aDate, aTime, aPaymentType, aReview);

        return systemBooking;
    }

    //Entering the customers details
    private Customer customerDetailsInput()
    {
        String custFirstName = "";
        String custLastName = "";

        do
        {
            System.out.println("Enter your first name: ");
            custFirstName = input.nextLine();
            System.out.println("Enter your last name: ");
            custLastName = input.nextLine();
        }
        while(custFirstName.isEmpty() && custLastName.isEmpty());
        customer.setFirstName(custFirstName);
        customer.setLastName(custLastName);

        return customer;
    }

    //Entering a Review
    private Review reviewInput()
    {
        String revReview = "";

        //Ensures a review is entered.
        do
        {
            System.out.println("Please enter a reveiw: ");
            revReview = input.nextLine();
        }
        while(revReview.isEmpty());
        review.setReview(revReview);

        return review;
    }

    public Input()
    {

        //<-------------------------------------USER INPUT------------------------------------->

        FitnessClass zumba = new FitnessClass("Zumba");
        FitnessClass aerobics = new FitnessClass("Aerobics");
        FitnessClass spin = new FitnessClass("Spin");
        FitnessClass boxing = new FitnessClass("Boxing");
        FitnessClass yoga = new FitnessClass("Yoga");

        classList[0] = zumba;
        classList[1] = aerobics;
        classList[2] = spin;
        classList[3] = boxing;
        classList[4] = yoga;

        Time morning = new Time ("Morning 10:00");
        Time afternoon = new Time ("Afternoon 14:00");
        Time earlyEve = new Time ("Early evening 18:00");
        Time lateEve = new Time ("Late evening 20:00");

        timeList[0] = morning;
        timeList[1] = afternoon;
        timeList[2] = earlyEve;
        timeList[3] = lateEve;

        PaymentType cash = new PaymentType("Cash");
        PaymentType card = new PaymentType("Card");

        pTypeList[0] = cash;
        pTypeList[1] = card;

        Date date1 = new Date ("01,12,2018");
        Date date2 = new Date ("02,12,2018");
        Date date3 = new Date ("08,12,2018");
        Date date4 = new Date ("09,12,2018");

        dateList[0] = date1;
        dateList[1] = date2;
        dateList[2] = date3;
        dateList[3] = date4;

        //<--------------------------------REPORT DATA--------------------------------------->

        Customer c1 = new Customer (1, "Neil","Armstrong");
        Customer c2 = new Customer (2, "Buzz","Aldrin");
        Customer c3 = new Customer (3, "John","Glenn");
        Customer c4 = new Customer (4, "Chris","Hadfield");
        Customer c5 = new Customer (5, "Elon", "Musk");
        Customer c6 = new Customer (6, "Albert","Einstein");
        Customer c7 = new Customer (7, "Stephen","Hawking");
        Customer c8 = new Customer (8, "Charles","Darwin");
        Customer c9 = new Customer (9, "J.K","Rowling");
        Customer c10 = new Customer (10, "Jane","Austen");
        Customer c11 = new Customer (11, "Thomas","Edison");
        Customer c12 = new Customer (12, "Isaac","Newton");
        Customer c13 = new Customer (13, "William","Shakespear");
        Customer c14 = new Customer (14, "Ernest","Hemmingway");
        Customer c15 = new Customer (15, "Charles", "Dickens");

        Review rw1 = new Review ("Great class");
        Review rw2 = new Review ("Not for me");
        Review rw3 = new Review ("Very fun!");
        Review rw4 = new Review ("I didn't enjoy this class");
        Review rw5 = new Review ("Not bad");
        Review rw6 = new Review ("Excellent teacher");
        Review rw7 = new Review ("I struggled with the pace");
        Review rw8 = new Review ("Badly managed class");
        Review rw9 = new Review ("Amazing class, amazing instructor");
        Review rw10 = new Review ("I really didn't enjoy this class");
        Review rw11 = new Review ("Not good, not bad");
        Review rw12 = new Review ("It was okay");
        Review rw13 = new Review ("I'd go again");
        Review rw14 = new Review ("Brilliant!");
        Review rw15 = new Review ("Such a well run class");
        Review rw16 = new Review ("I really enojoyed this class");
        Review rw17 = new Review ("Not great");
        Review rw18 = new Review ("Poor class");
        Review rw19 = new Review ("I didn't like the instructor");
        Review rw20 = new Review ("It was nothing special");

        Session s1 = new Session ("S01", zumba, morning, 5.00, 1, date1);
        Session s2 = new Session ("S02", spin, afternoon, 3.50, 1, date1);
        Session s3 = new Session ("S03", boxing, earlyEve, 4.50, 1, date1);
        Session s4 = new Session ("S04", yoga, lateEve, 4.80, 1, date1);
        Session s5 = new Session ("S05", boxing, morning, 4.50, 1, date2);
        Session s6 = new Session ("S06", zumba, afternoon, 5.00, 1, date2);
        Session s7 = new Session ("S07", yoga, earlyEve,  4.80, 1, date2);
        Session s8 = new Session ("S08", aerobics, lateEve, 4.00, 1, date2);
        Session s9 = new Session ("S09", spin, morning, 3.50, 1, date3);
        Session s10 = new Session ("S010", aerobics, afternoon, 4.00, 1, date3);
        Session s11 = new Session ("S011", spin, earlyEve, 3.50, 1, date3);
        Session s12 = new Session ("S012", boxing, lateEve, 4.50, 1, date3);
        Session s13 = new Session ("S013", zumba, morning, 5.00, 1, date4);
        Session s14 = new Session ("S014", yoga, afternoon, 4.80, 1, date4);
        Session s15 = new Session ("S015", spin, earlyEve, 4.80, 1, date4);
        Session s16 = new Session ("S016", boxing, lateEve, 4.50, 1, date4);





        //Issue a booking loop
        boolean purchaseLoop = true;
        do {
            System.out.println(issueBooking(customerDetailsInput(), classSelection(), dateSelection(), timeSelection(), pTypeSelection(), reviewInput()));
            char purchaseAgain = '0';
            while(purchaseAgain != 'Y' && purchaseAgain != 'N') {
                System.out.println("Would you like to change your booking? (Y / N)");
                purchaseAgain = input.next().charAt(0);
                purchaseAgain = Character.toUpperCase(purchaseAgain);
                if(purchaseAgain == 'N') {
                    System.out.println("Thank you for attending our class, we hope you had a great time!" + "\n");
                    System.out.println("Here is the report for December's classes: ");

                    //<-----------------CUSTOMER REPORT DATA--------------------------------->

                    // Sign up  4 customers to s1 session
                    s1.bookSession (c1);
                    s1.bookSession (c2);
                    s1.bookSession (c3);
                    s1.bookSession (c4);
                    // Sign up  6 customers to s2 session
                    s2.bookSession (c5);
                    s2.bookSession (c6);
                    s2.bookSession (c7);
                    s2.bookSession (c8);
                    s2.bookSession (c9);
                    s2.bookSession (c10);
                    // Sign up  2 customers to s3 session
                    s3.bookSession (c11);
                    s3.bookSession (c12);
                    // Sign up  4 customers to s4 session
                    s4.bookSession (c13);
                    s4.bookSession (c14);

                    System.out.println ("-Total customers on Session 01->");
                    s1.showCustomersOnSession();
                    System.out.println ("-s1->");
                    System.out.println (s1);
                    System.out.println ("-------------------------"+ "\n");

                    System.out.println ("-Total customers on Session 02->");
                    s2.showCustomersOnSession();
                    System.out.println ("-s2->");
                    System.out.println (s2);
                    System.out.println ("-------------------------"+ "\n");

                    System.out.println ("-Total customers on Session 03->");
                    s3.showCustomersOnSession();
                    System.out.println ("-s3->");
                    System.out.println (s3);
                    System.out.println ("-------------------------" + "\n");

                    System.out.println ("-Total customers on Session 04->");
                    s4.showCustomersOnSession();
                    System.out.println ("-s4->");
                    System.out.println (s4);
                    System.out.println ("-------------------------"+ "\n");


                    //<-----------------REVIEW REPORT DATA--------------------------------->

                    //Add 4 reviews for s1 session
                    s1.addReview (rw1);
                    s1.addReview (rw2);
                    s1.addReview (rw3);
                    s1.addReview (rw4);

                    //Add 4 reviews for s2 session
                    s2.addReview (rw5);
                    s2.addReview (rw6);
                    s2.addReview (rw7);
                    s2.addReview (rw8);

                    //Add 4 reviews for s3 session
                    s3.addReview (rw9);
                    s3.addReview (rw10);
                    s3.addReview (rw11);
                    s3.addReview (rw12);

                    //Add 8 reviews for s4 session
                    s4.addReview (rw13);
                    s4.addReview (rw14);
                    s4.addReview (rw15);
                    s4.addReview (rw16);
                    s4.addReview (rw17);
                    s4.addReview (rw18);
                    s4.addReview (rw19);
                    s4.addReview (rw20);

                    System.out.println ("-Total reviews for Session 01->");
                    s1.showReviewsForSession();

                    System.out.println ("-Total reviews for Session 02->");
                    s2.showReviewsForSession();

                    System.out.println ("-Total reviews for Session 03->");
                    s3.showReviewsForSession();

                    System.out.println ("-Total reviews for Session 04->");
                    s4.showReviewsForSession();


                    purchaseLoop = false; //Closes the loop and the program.
                }
                else if(purchaseAgain == 'Y') {
                    continue; //Loops the program
                }
            }

        }
        while(purchaseLoop);
        //System.exit(0);

    }



}