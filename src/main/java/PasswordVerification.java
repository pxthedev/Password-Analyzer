import java.io.Serializable;

public class PasswordVerification extends CommonPassword {

    @Override
    public boolean validar(String password) {
        // Check if the password is common
        Serializable commonCheck = isCommonPassword(password);
        if (commonCheck instanceof String) {
            System.out.println(commonCheck); // Print message if password is common
            return false; // Password is not valid
        }
        return true; // Password is valid
    }
}
