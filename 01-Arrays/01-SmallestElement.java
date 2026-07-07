import java.util.Scanner;
class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }
        int mini=Integer.MAX_VALUE;
        for(int i:arr){
            mini=Math.min(i,mini);
        }
        System.out.println(mini);
        
    }
}