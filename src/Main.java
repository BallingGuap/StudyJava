import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
    }

   public static void Task1() {
       for(;;) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Type password:   ");
           String pass = scanner.nextLine();

           if(pass.length()  < 10){
               System.out.println("Uncorrected password: " + pass);
               continue;
           }
           if(hasSpecialSymbols(pass)){
               System.out.println("Uncorrected password: " + pass);
               continue;
           }
           if(countNumbers(pass) < 2){
               System.out.println("Uncorrected password: " + pass);
               continue;
           }
           System.out.println("Correct password: " + pass);
       }
   }

    public static int countNumbers(String str){
        int lettersCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                lettersCount++;
            }
        }
        return lettersCount;
    }

    public static boolean hasSpecialSymbols(String str){
        return str.matches("[\\p{L}| ]+");
    }


}

