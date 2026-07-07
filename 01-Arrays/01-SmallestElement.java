//import java.util.Scanner;
class SmallestElement {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = {121312,31243546,32434,61312,5};
        int min=Integer.MAX_VALUE;
        // System.out.println(min);
        for(int i:arr){
            min=Math.min(i,min);
        }
        System.out.println(min);
        
    }
}