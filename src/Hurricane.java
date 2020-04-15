import java.util.Scanner;

public class Hurricane {
    public static void main(String[] args){
        int x;
        System.out.println("wind Speed: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if (x >= 74 && x <= 95 ){
            System.out.println("Category 1");
        }
        else if (x >= 96 && x <= 110){
            System.out.println("Category 2");
        }
        else if (x >= 111 && x <= 129){
            System.out.println("Category 3");
        }
        else if (x > 130 && x < 156){
            System.out.println("Category 4");
        }
        else if (x <= 157 && x > 157 ){
            System.out.println("Category 5");
        }
    }
}
