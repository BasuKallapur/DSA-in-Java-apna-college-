import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        System.out.print("enter valid number 1 or 2: ");
        Scanner sc= new Scanner(System.in);
        int choice= sc.nextInt();
        double area;
        int R= 5;
        int L= 5;
        int B= 10;
        switch (choice) {
            case 1:
                area= 3.14*R*R;
                System.out.println(area);
                break;
            case 2:
                area= L*B;
                System.out.println(area);
                break;
        
            default:
            System.out.println("invalid");
                break;
        }

    }
}
