public class video17l {
    // public static void num5to1(int n){
    //     if (n>5) {
    //         return;
    //     }
    //     System.out.println(n);
    //     num5to1(n+1);
    // }
    // public static void main(String[] args) {
    //     num5to1(1);
    // }


    // public static void prtSum(int n, int sum){
    //     if (n>10) {
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=n;
    //     prtSum(n+1, sum);
    // }
    // public static void main(String[] args) {
    //     prtSum(1,0);
    // }



    // public static void prtFactorial(int n, int fact){
    //     if (n==0) {
    //         System.out.println("factorial is: " + fact);
    //         return;
    //     }
    //     fact*=n;
    //     prtFactorial(n-1, fact);
    // }
    // public static void main(String[] args) {
    //     prtFactorial(5, 1);
    // }


    // public static void prtFibonocci(int n, int a, int b){
    //     if (n==0) {
    //         return;
    //     }
    //     int c= a+b;
    //     System.out.print(c + " ");
    //     prtFibonocci(n-1, b, c);
    // }
    // public static void main(String[] args) {
    //     int a= 0;
    //     int b= 1;
    //     int n= 5;
    //     System.out.print(a + " ");
    //     System.out.print(b + " ");
    //     prtFibonocci(n-2,0,1);
    // }


    // public static int prtPwr(int x, int n){
    //     if (x==0) {
    //         return 0;
    //     }
    //     else if (n==0) {
    //         return 1;
    //     }
    //     int xpown= x * prtPwr(x, n-1);
    //     return xpown;
    // }
    // public static void main(String[] args) {
    //     int x= 2;
    //     int n= 5;
    //     int ans= prtPwr(x, n);
    //     System.out.print(ans);
    // }


    public static int prtPwr(int x, int n){
        if (x==0) {
            return 0;
        }
        else if (n==0) {
            return 1;
        }
        //for even n case
        if (n%2==0) {
            return prtPwr(x, n/2)*prtPwr(x, n/2);
        }
        //for odd n case
        else{
            return prtPwr(x, n/2)*prtPwr(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x= 2;
        int n= 5;
        int ans= prtPwr(x, n);
        System.out.print(ans);
    }
}
