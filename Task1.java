import java.util.*;
public class Task1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        System.out.printf("Enter %d elements in array:",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("10% ratio of given elements are:");
        Arrays.stream(arr)
        .map(x->x+(x*10)/100)
        .forEach(System.out::println);
    }

}