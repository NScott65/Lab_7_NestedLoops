import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int g = 5; g >= 1; g--){
            System.out.println();
            for(int k = g; k <= 5; k++){
                System.out.print("*");
            }
        }
        System.out.println();
        for(int l = 5; l >= 1; l--){
            System.out.println();
            for(int m = l; m >= 1; m--){
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i = 5; i >= 1; i-- ){
            System.out.println();
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
        }
    }
}