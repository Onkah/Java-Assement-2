import java.util.Scanner;
public class Main2 {
    public static String longest(String [] arr){

        String s = arr[0];
        int max = arr[0].length();
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i].length()){
                max = arr[i].length();
                s = arr[i];
            }

        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an array of strings");

        String s = scanner.nextLine();
        String [] str = s.split(" ");

        System.out.println(longest(str));
    }
}