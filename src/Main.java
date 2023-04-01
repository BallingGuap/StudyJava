import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
    }

   public static void Task1() {
       Bird bird = new Bird();
       bird.walk();
       bird.fly();
       bird.sing();
   }

    public static void Task2() {
        for(;;) {


            var scanner = new Scanner(System.in);
            System.out.println("Write first number!");
            var number1 = scanner.nextLine();
            if(!hasOnlyNumbers(number1)){
                System.out.println("Incorrect format of number!");
                continue;
            }

            System.out.println("Write second number!");
            var number2 = scanner.nextLine();
            if(!hasOnlyNumbers(number2)){
                System.out.println("Incorrect format of number!");
                continue;
            }

            Adder adder = new Adder(Integer.parseInt(number1),
                                    Integer.parseInt(number2));
            System.out.println("Result: " + adder.add());
        }
    }

    public static boolean hasOnlyNumbers(String str){
        int lettersCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
       return true;
    }





}

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}

 class Arithmetic{
    protected int add(int n1, int n2){
        return n1 + n2;
    }
}


class Adder extends  Arithmetic{
    private int _n1;
    private int _n2;
    Adder(int n1, int n2) {
        _n1 = n1;
        _n2 = n2;
    }

    public int add(){
        return super.add(_n1,_n2);
    }
}

