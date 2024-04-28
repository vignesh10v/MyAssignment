package week1day2;

public class FindDublicate {
  public static void main(String[] args) {
	int[] arr = {2,5,7,7,5,9,2,3};
	for (int i=0;i<=arr.length-1;i++) {
		for (int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j])
				System.out.println(arr[i]);
				
					}
	}
	
}
	
}
