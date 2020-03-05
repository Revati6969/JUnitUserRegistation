import java.util.regex.Pattern;

public class Registation {
    String pattern1="^[A-Z][a-zA-Z]{2,}$";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registation");
    }

    public boolean checkName(String fname) {
        return Pattern.matches(pattern1,fname);
    }
}
