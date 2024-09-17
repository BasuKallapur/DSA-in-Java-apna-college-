public class video5 {
    public static void main(String[] args) {
        // // 1. rectangle pattern hallow
        // int a= 4;
        // int b= 5;
        // for(int i=1; i<=a; i++){
        // for(int j=1; j<=b; j++){
        // if (i==1 || j==1 || i==a || j==b) {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 2. star pattern 1
        // int a=4;
        // int b=4;
        // for(int i=1; i<=a; i++){
        // for(int j=1; j<=b; j++){
        // if(j<=i){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // 3. star pattern 2
        // int n = 4;
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // 4. pattern
        // int n= 4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // 5. number pattern
        // int n= 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // // 6. number pattern
        // int n= 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // // 7. Floyd's triangle
        // int n= 5;
        // int num= 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // 8. 1-0 pattern 
        int n= 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i+j)%2==0) {
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
    
}
