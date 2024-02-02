import java.util.Scanner;
public class Main {
    public static boolean isSixtyFive(int x,int y){
        if(x == 65 || y == 65 || x + y == 65){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(isSixtyFive(x,y));
    }
}