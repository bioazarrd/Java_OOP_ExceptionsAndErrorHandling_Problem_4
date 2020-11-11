package D_JavaAdvancedOOP.Lecture9_ExceptionsAndErrorHandling.ExProblem_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            Person peter = new Person("Franco", "Aimee", 19);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception thrown: " + ex.getMessage());
        }


        try {
            Person noName = new Person(" ", "Aimee", 19);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception thrown: " + ex.getMessage());
        }

        try {
            Person noLastName = new Person("Franco", null, 19);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception thrown: " + ex.getMessage());
        }


        try {
            Person negativeAge = new Person("Franco", "Aimee", -1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception thrown: " + ex.getMessage());
        }

        try {
            Person tooOldForThisProgram = new Person("Franco", "Aimee", 121);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception thrown: " + ex.getMessage());
        }










    }
}
