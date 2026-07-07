import java.util.Scanner;
class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }
        int maxi = Integer.MIN_VALUE;
        for(int i:arr)
        {
            maxi = Math.max(i, maxi);
        }
        System.out.print(maxi);
        sc.close();
    }
}