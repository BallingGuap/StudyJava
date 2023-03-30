import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
    }



    public  static void Task2()
    {
        int bulbs = 0;
        Scanner scanner = new Scanner(System.in);
        for(;;) {
        var choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    for (var i = 0; i < 10; ++i) {
                        bulbs = blink(bulbs);
                        showBulbs(bulbs);
                    }
                    break;
                case 2:
                    System.out.println(isFirstLampOn(bulbs));
                    break;
                case 3:
                    for (var i = 0; i < 10; ++i) {
                        bulbs = run(bulbs);
                        showBulbs(bulbs);
                    }
                    break;
                case 4:
                    showBulbs(bulbs);
                    break;
                default:
                    break;
            }
        }
    }

    public static int blink(int bulbs){
        return ~bulbs;
    }

    public static int run(int bulbs){
        return  bulbs >> 1;
    }
    public static boolean isFirstLampOn (int bulbs){
        return (bulbs & 1) == 1;
    }
    public static void showBulbs(int bulbs){
        System.out.println(Integer.toBinaryString(bulbs));
    }

    public static void Task1(){
        for (int i = 2; i <= 100; ++i) {
            if(checkSimple(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}