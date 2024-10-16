import java.util.ArrayList;

public class video19 {
    // // 1. print permution -> time complexity = O(n!)
    // public static void prtPermuatations(String str, String permulation){
    //     if (str.length()==0) {
    //         System.out.println(permulation);
    //         return;
    //     }
    //     for(int i=0; i<str.length(); i++){
    //         char currChar= str.charAt(i);
    //         String newStr= str.substring(0, i) + str.substring(i+1);
    //         prtPermuatations(newStr, permulation+currChar);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str= "abcd";
    //     prtPermuatations(str, "");
    // }



    // // 2. count total paths in maze to move from (0,0) to (n,m)  m=row , n column
    // public static int calcMazePaths(int i, int j, int n, int m){
    //     if (i>=m || j>=n) {
    //         return 0;
    //     }
    //     if (i== m-1 && j== n-1) {
    //         return 1;
    //     }
    //     //downpaths
    //     int downpaths= calcMazePaths(i+1, j, n, m);
    //     //rightpaths
    //     int rightpaths= calcMazePaths(i, j+1, n, m);
    //     return downpaths + rightpaths;
    // }
    // public static void main(String[] args) {
    //     int n=2, m= 4;
    //     int a= calcMazePaths(0, 0, n, m);
    //     System.out.println("total number of paths: " + a);
    // }



    // // 3. place tiles of size 1xm in floor of size nxm #HARD
    // public static int tilePlacement(int n, int m){
    //     if (n==m) {
    //         return 2; // when n==m there are only 2 ways to place tiles
    //     }
    //     if (n<m) {
    //         return 1; // when n<m then there will be one way to place tiles
    //     }
    //     //placing tiles horizontally
    //     int horPlactment= tilePlacement(n-1, m); //when you place 1xm tile horizontally the n will reduce to n-1
    //     //placing tiles vertically
    //     int verPlacement= tilePlacement(n-m, m); //when you place 1xm tile horizontally the n will reduce to n-1
    //     return horPlactment + verPlacement;
    // }
    // public static void main(String[] args) {
    //     int n=4, m=2;
    //     int a= tilePlacement(n, m);
    //     System.out.println("total ways of placing tiles: " + a);
    // }



    // // 4. find the number of ways in which you can invite n people to your party single or in pairs.
    // public static int callGuest(int n){
    //     if (n==1) {
    //         return 1;
    //     }
    //     if (n<1) {
    //         return 0;
    //     }
    //     //single
    //     int single= callGuest(n-1); // if one guest called as single, next n-1 should be called.
    //     //in pair
    //     int pair= (n-1)*callGuest(n-2); //here if there are n guest and one pair is formed then remaining n-2 guests can be paired so they will be called after, and  n-1 multiplied to this bcz 1 guest can pair with remaining guests, i,e., if nth guest is about paired , he can pair with remaining n-1 guests.
    //     return single+pair;
    // }
    // public static void main(String[] args){
    //     int n= 0;
    //     int a= callGuest(n);
    //     System.out.println("total possible ways is: " + a);
    // }

    // 5. print all the subset of a set of first n natural numbers   bit confusing need to do it again
    public static void printSubset(ArrayList<Integer> subset){
        for (int i=subset.size()-1; i>=0; i--){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if (n == 0) {
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubset(n-1, subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset= new ArrayList<>();
        findSubset(n, subset);
    }


}
