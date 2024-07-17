import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();

            }
        }  
       int res=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 res=Arrays.binarySearch(arr[i] , n);
               
              

            }
            
        }
        if(res<0 ){
            System.out.println("not found");
           }else{
            System.out.println("found");
           }
    }
}