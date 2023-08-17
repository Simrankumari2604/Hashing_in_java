package hashset;
import java.util.*;
public class hashsetqtwo {
public static void unionarray(int arr1[],int arr2[]) {
	int n1=arr1.length;
	int n2=arr2.length;
	HashSet<Integer>set=new HashSet<>();
	for(int i=0;i<n1;i++) {
		set.add(arr1[i]);
	}
	for(int i=0;i<n2;i++) {
		set.add(arr2[i]);
	}
	System.out.println(set.size());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {7,3,9};
int arr2[]= {6,3,9,2,9,4};
unionarray(arr1,arr2);
	}

}
