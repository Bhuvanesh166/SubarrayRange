import java.util.Scanner;
public class SubarrayRange {
    public static void findSubArray(int arr[],int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String arg[]){
        Scanner scanner =new Scanner (System.in);
        int sze=scanner.nextInt();
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        findSubArray(arr,start,end);
    }
}