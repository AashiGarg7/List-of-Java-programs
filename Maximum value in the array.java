import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int arr1 [] = {1,3,5,2,7,9,550,4,832,6,100};
        int max=0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("Max value in the array is: "+max);
	}
}
