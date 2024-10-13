import java.util.HashSet;

public class video18 {
    // // 1. Tower of Hanoi -> time complexity = O(2^n)
    // public static void towerOfHanoi(int n, String src, String hel, String dest) {
    // if (n == 1) {
    // System.out.println(n + " disk is transferred from " + src + " to " + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, hel);
    // System.out.println(n + " disk is transferred from " + src + " to " + dest);
    // towerOfHanoi(n - 1, hel, src, dest);
    // }

    // public static void main(String[] args) {
    // int n = 3;
    // towerOfHanoi(n, "source", "helper", "destination");
    // }

    // // 2. print string in reverse -> time complexity= O(n), where n is string
    // length
    // public static void revStr(int index, String str) {
    // if (index == 0) {
    // System.out.print(str.charAt(index));
    // return;
    // }
    // System.out.print(str.charAt(index));
    // revStr(index - 1, str);
    // }

    // public static void main(String[] args) {
    // String str = "basavaraj";
    // revStr(str.length() - 1, str);
    // }

    // // 3. find the 1st and last occurance of an element in string -> time
    // complexity=
    // O(n), where n is string length

    // public static int first = -1;
    // public static int last = -1;

    // public static void findOcc(int idx, String str, char c) {
    // if (idx == str.length()) {
    // System.out.println("first occurance at " + first);
    // System.out.println("last occurance at " + last);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // if (currChar == c) {
    // if (first == -1) {
    // first = idx;
    // } else {
    // last = idx;
    // }
    // }
    // findOcc(idx + 1, str, c);
    // }

    // public static void main(String[] args) {
    // String str = "bafsfssfabb";
    // findOcc(0, str, 'a');
    // }

    // // 4. check if an array is sorted(strictly increasing) time complexity= O(n),
    // // where n is string length
    // public static boolean sorted(int idx, int array[]) {
    //     if (idx== array.length-1) {
    //         return true;
    //     }
    //     if (array[idx]>=array[idx+1]) {
    //         return false;
    //     }
    //     return sorted(idx+1, array);
    // }
    // public static void main(String[] args) {
    //     int[] array= {1,2,3,4,5,5,5,5,6};
    //     System.out.print(sorted(0, array));
    // }

    // // 5. move all 'x' to the end of the string time complexity= O(n + count)=O(2n) in asymptotic notation we don't consider constants so it's O(n),because {max(count)=n}, where n is string length
    // public static void moveX(int count, String str, int idx, String newStr){
    //     if (idx== str.length()) {
    //         System.out.println("count is :" + count);
    //         System.out.print(newStr);
    //         for(int i=0; i<count; i++){
    //             System.out.print("x");
    //         }
    //         return;
    //     }
    //     if (str.charAt(idx)=='x' ){
    //         count++;
    //         moveX(count, str, idx+1, newStr);
    //     }
    //     else{
    //         newStr+=str.charAt(idx);
    //         moveX(count, str, idx+1, newStr);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str= "axbxxdfdfxxxcxxd";
    //     moveX(0, str, 0,"");
    // }

    // // 6. Remove duplicates in a string time complexity= O(n), where n is string length (****)
    // public static boolean[] map= new boolean[26];
    // public static void remDuplicates(int idx, String str, String newStr){
    //     if (idx==str.length()) {
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char currChar= str.charAt(idx);
    //     if (map[currChar-'a']) {
    //         remDuplicates(idx+1, str, newStr);
    //     }
    //     else{
    //         newStr+= currChar;
    //         map[currChar-'a']= true;
    //         remDuplicates(idx+1, str, newStr);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str= "agsaasdadfsasssa";
    //     remDuplicates(0, str, "");        
    // }

    // // 6. print all the subsequences of the string (***)
    // // time complexity (watch video) => O(2^n) 
    // public static void subsequences(int idx, String str, String newStr){
    //     if (idx==str.length()) {
    //         System.out.println(newStr);
    //         return;            
    //     }
    //     char currChar= str.charAt(idx);
    //     //to be included
    //     subsequences(idx+1, str, newStr+currChar);

    //     //not to be included
    //     subsequences(idx+1, str, newStr);
    // }
    // public static void main(String[] args) {
    //     String str= "abc";
    //     subsequences(0, str, "");
    // }

    // // 8. print unique subsequences of string.
    // // Hashset will contain unique elements.
    // public static void subsequences(int idx, String str, String newStr, HashSet<String> set){
    //     if (idx==str.length()) {
    //         if (set.contains(newStr)) {
    //             return;
    //         }
    //         else{
    //             System.out.println(newStr);
    //             set.add(newStr);
    //             return;            
    //         }
    //     }
    //     char currChar= str.charAt(idx);
    //     //to be included
    //     subsequences(idx+1, str, newStr+currChar,set);

    //     //not to be included
    //     subsequences(idx+1, str, newStr,set);
    // }
    // public static void main(String[] args) {
    //     String str= "aaa";
    //     HashSet<String> set= new HashSet<>();
    //     subsequences(0, str, "", set);
    // }

    // 9. print keypad combination
    public static String[] keypad= {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void keypadCombination(int idx, String str, String combination){
        if (idx==str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar= str.charAt(idx);
        String mapping= keypad[currChar-'0']; //gives mapping currChar     
        for(int i=0; i<mapping.length(); i++){
            keypadCombination(idx+1, str, combination+mapping.charAt(i));
        }   
    }
    public static void main(String[] args) {
        String str= "23";
        keypadCombination(0, str, "");
    }

    
}
