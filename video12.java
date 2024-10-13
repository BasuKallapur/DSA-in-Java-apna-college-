public class video12 {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("basu");
        // System.out.println(sb);
        // sb.insert(4, " Kallapur");
        // System.out.println(sb);

        //reverse string using stringbuilder
        StringBuilder a= new StringBuilder("Basu");
        int l= a.length();
        for(int i=0; i<l/2; i++){
            int front= i;
            int back= l-i-1;
            char frontChar= a.charAt(front);
            char backChar= a.charAt(back);
            a.setCharAt(front, backChar);
            a.setCharAt(back, frontChar);
        }
        System.out.println(a);
    }
}
