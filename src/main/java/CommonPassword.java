import java.io.Serializable;

public abstract class CommonPassword {

    public static Serializable isCommonPassword(String password) {
        // List of common passwords
        String[] commonPasswords = {
            "123456", "password", "123456789", "12345678", "12345",
            "111111", "1234567", "sunshine", "qwerty", "iloveyou",
            "princess", "admin", "welcome", "666666", "abc123",
            "football", "monkey", "letmein", "shadow", "master",
            "66666666", "qwertyuiop", "123321", "mustang", "1234567890"
        };

        for (String commonPassword : commonPasswords) {
            if (commonPassword.equals(password)) {
                return "Password is common"; // Password is common
            }
        }
        return false; // Password is not common
    }

    public abstract boolean validar(String password);
}
