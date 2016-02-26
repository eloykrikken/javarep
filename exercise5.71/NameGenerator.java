
/**
 * Write a description of class NameGenerator here.
 * 
 * @author Eloy Krikken
 * @version 1.0
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String motherName;
    private String city;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator(String myFirstName, String myLastName, String myMotherName, String myCity)
    {
        // initialise instance variables
        firstName = myFirstName;
        lastName = myLastName;
        motherName = myMotherName;
        city = myCity;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void generateStarWarsName()
    {
        // put your code here
        String starFirstName = (lastName.substring(0, 3))+(firstName.substring(0, 2));
        String starLastName = (motherName.substring(0,2))+(city.substring(0,3));
        System.out.println("Your Starwars name is: "+starFirstName+" "+starLastName);
    }
}
