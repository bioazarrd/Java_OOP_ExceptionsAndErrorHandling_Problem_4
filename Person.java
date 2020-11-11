package D_JavaAdvancedOOP.Lecture9_ExceptionsAndErrorHandling.ExProblem_4;
public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    private boolean myStringIsNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public String getFirstName() {
        return firstName;
    }

    private void validateString(String name) {
        if (myStringIsNullOrEmpty(name)) {
            throw new IllegalArgumentException("The name name cannot be null or empty");
        }
    }

    public void setFirstName(String firstName) {
        validateString(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateString(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be in the range [0 ... 120]");
        }
        this.age = age;
    }

}
