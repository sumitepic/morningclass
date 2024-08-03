package update;

//some comment
import java.util.Iterator;

public class Array {
	
	int maxNumber = 10;

	public void f1() {
		
		for (int i = 0; i < arr.length; i++) {
				if(maxNumber>arr[i]) {
					maxNumber= arr[i];
				}
			}
		System.out.println(maxNumber);
	}
	
	public void duplicate() {
		int count = 0 ;
		for (int i = 1; i < maxNumber; i++) {
			count = 0 ;
			for (int j = 0; j < arr.length; j++) {
				if(i==arr[j]) {
					count++;
					System.out.println("Duplicate number"+i + "and duplicate count id "+count);
					
				}
				
			}
			
		}
	}
	int[] arr= {0,71,2,1,7,2,5,4,5,0,2,4,89,1,100,-1};
	public void sortArray() {
		int swap=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					swap= arr[j+1];  //5
					arr[j+1]=arr[j];  //2=5
					arr[j]=swap;
					
				}
				
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+",");
		}
	}
	
	public static void main(String[] args) {
		Array obj =new Array();
		obj.sortArray();
		//obj.duplicate();
	}
	
	

}
