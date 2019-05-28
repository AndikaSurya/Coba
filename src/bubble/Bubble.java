package bubble;

public class Bubble {
    //sort itu artinya mengurutkan
   static void bubbleSort(int[]arr){
       int n = arr.length;
       int temp = 0;
       System.out.println("cokk");
       
       for(int i=0;i<n;i++){
           for(int j=1;j<(n-i);j++){
               if(arr[j-1]>arr[j]){
                   temp = arr[j-1];//z=x
                   arr[j-1] = arr[j];//x=y
                   arr[j] = temp;//y=z
               }
               
           }
       }
   }

   public static void main(String[]args){
       int arr[]={9,6,3,5,8,7};
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+"");
       }
       System.out.println();
       bubbleSort(arr);
       
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+"");}
   }         
}  
    
 
    
 
  
