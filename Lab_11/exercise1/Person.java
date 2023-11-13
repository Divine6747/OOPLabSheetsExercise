package Lab_11.exercise1;

public class Person {
    private String firstName;
    private String LastName;

    public Person(){
        this("Not Supplied", "Not Supplied");

    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "  First name: " + getFirstName() +
                "  Last name: " + getLastName();
    }
}
