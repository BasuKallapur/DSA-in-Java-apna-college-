import java.util.Scanner;

public class video11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int rows= sc.nextInt();
        System.out.print("enter number of columns: ");
        int col= sc.nextInt();
        int [][] numbers= new int[rows][col];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                numbers[i][j]= sc.nextInt(); //taking input
            }
        }
        System.out.print("enter number to find: ");
        int x= sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if (numbers[i][j]==x) {
                    System.out.print("the number x is found at row " + i + " and at column " + j);
                }
            }
            System.out.println();
        }
    }
}
