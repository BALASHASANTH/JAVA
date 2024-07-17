import java.util.*;

class Kth_pos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size,pos;
        size=sc.nextInt();
        pos=sc.nextInt();
        pos=pos%size;
        int temp[]=new int[size-pos];
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<size-pos;i++){
        temp[i]=arr[i];
      }
      for(int i=0;i<pos;i++){
        arr[i]=arr[size-pos+i];
      }
      for(int i=0;i<size-pos;i++){
        arr[pos+1]=temp[i];
      }
      for(int e:arr)
      System.out.print(e+" ");
    }
}
