    public class newnewnew {
        public static void main(String[] args) {
            int number = 2446;
            
            int temp = number;
            int count = 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }
            int[] digits = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = number % 10;  
                number /= 10;             
            }
            System.out.println("Individual digits:");
            for (int digit : digits) {
                System.out.println(digit);
            }
        }
    }
    
