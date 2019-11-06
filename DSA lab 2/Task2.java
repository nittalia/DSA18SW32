import java.util.Arrays;

class Task2
{
   
    public static void main(String args[]){
    int arr1[]={1,3,4,6,5};
    int arr2[]={1,3,4,6,5};
    int arr3[]={1,3,5,4};
   
   if(Arrays.equals(arr1,arr2)==true){
   System.out.println(" equal arrays");
 }  
  else{
  System.out.println(" not equal");
    }
   
   if(Arrays.equals(arr1,arr3)==true){
   System.out.println("Arrays are equal");
 }  
  else{
  System.out.println("Arrays are not equal");
    }

  }
}