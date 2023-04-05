

public class Main {
    public static void main(String[] args) {
       Task1();
       System.out.println("\n------------------------------------------------------------------\n");
        Task2();
    }



   public  static void Task1() {

        Integer[] arr = {1,2,3};
        arr = swap(arr, 0,2);
        for(var i : arr) {
            System.out.println(i);
        }
   }



   public static <T>
   T[] swap(T[] arr, int pos1, int pos2){
        var Tpos1 = arr[pos1];
        arr[pos1] =  arr[pos2];
        arr[pos2] = Tpos1;
        return  arr;
    }


    public static <T>
    void print(T[] arr){
        for (var elem : arr){
            System.out.println(elem);
        }
    }


    public static void Task2() {
        Integer[] arr = {1,2,3};
        print(arr);
    }

}









