public class video7 {
    public static void factorial(int n){
        int fact=1;
        if(n>0){
            for(int i=n; i>=1; i--){
                fact*=i;
            }
            System.out.print("factorial value of " + n + " is " + fact);
        }
    }
    public static void main(String[] args) {
        int n= 4;
        factorial(n);
    }
}
