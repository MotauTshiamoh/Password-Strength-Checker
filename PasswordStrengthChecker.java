import java.util.Scanner;

public class PasswordStrengthChecker {
    

   public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your password");
    String password = input.nextLine();
    
    String strength = checkStrength(password);
    System.out.println("Your Password: "+ password + " is "+ strength);
    input.close();
   }

   public static String checkStrength(String password){

      int strengthPoint = 0;

      // Check for length
      if (password.length() >= 8) {
          strengthPoint++;
      }

      // Check for uppercase letters
      if (password.matches(".*[A-Z].*")) {
          strengthPoint++;
      }

      // Check for lowercase letters
      if (password.matches(".*[a-z].*")) {
          strengthPoint++;
      }

      // Check for digits
      if (password.matches(".*\\d.*")) {
          strengthPoint++;
      }

      // Check for special characters
      if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
          strengthPoint++;
      }

      // Check overall score and assign strength
      if (strengthPoint <= 3) {
          return "Weak.";

      }else if (strengthPoint == 3){
          return "medium.";
      } else if (strengthPoint >= 4) {
          return "Strong.";
      }

      return "Very Weak";

   }
   


   }
    

