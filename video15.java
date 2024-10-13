public class video15 {

// // 1. Bubble sort -> time complexity= O(n^2)
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

//     public static void main(String[] args) {
//     int arr[] = { 1, 5, 3, 6, 8, 99, 23 };
//     int l = arr.length;
//     System.out.println(l);
//     for (int i = 0; i < l - 1; i++) {
//         for (int j = 0; j < l - i - 1; j++) {
//             if (arr[j] > arr[j + 1]) {
//             int temp = arr[j];
//             arr[j] = arr[j + 1];
//             arr[j + 1] = temp;
//             }
//         }   
//     }
//     printArray(arr);
//     }

// // 2. Selection sort -> time complexity = O(n^2)
//     public static void main(String[] args) {
//         int arr[] = { 1, 5, 3, 6, 8, 99, 23 };
//         int l = arr.length;
//         for(int i=0; i<l-1; i++){
//             int smallest= i;
//             for(int j=i+1; j<l; j++){
//                 if (arr[smallest]>arr[j]) {
//                     smallest= j;
//                 }
//             }
//             int temp= arr[smallest];
//             arr[smallest]= arr[i];
//             arr[i]= temp;                    
//         }
//         printArray(arr);
//     }

// 3. Insertion sort
    public static void main(String[] args) {
        int arr[]= {7,8,3,1,2};
        for(int i=1; i<arr.length; i++){
            int current= arr[i];  //current element which is comparing
            int j= i-1; // index upto which array is sorted
            while (j>=0 && current<arr[j]) {
                arr[j+1]= arr[j];
                j--;
            }
            //placing
            arr[j+1]= current;
        }
        System.out.print("sorted array is: ");
        printArray(arr);
    }

}
