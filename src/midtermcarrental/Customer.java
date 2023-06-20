
package midtermcarrental;

/**
 * models a car rental customer.
 * Created for midterm exam.
 * @author dancye, 2023
 * @modifier Vasu Tevar
 */
public class Customer
{
    private String lastName;
    private String firstName;
    private int birthYear;
    private boolean insurance;

    //there are two types of possible customers that should not change
    public static final String[] customerTypes = {"Main driver", "occasional driver"};

    /**
     * constructor to set the main parameters
     * @param givenLast
     * @param givenFirst
     * @param givenBirthYear
     */
    public Customer(String givenLast, String givenFirst, int givenBirthYear)
    {
        lastName = givenLast;
        firstName = givenFirst;
        birthYear = givenBirthYear;
    }

    /**
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * @return the insurance
     */
    public boolean hasInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
