public class Main
{
public static boolean binary(int key,int[]arr) {
int start=0;
int end=arr.length-1;
while(start<=end) {
int mid=(start+end)/2;
if(arr[mid]==key) {
System.out.println(mid+" ");
return true;
}
else if(arr[mid]<key) {
start=mid+1;
}
else {
end=mid-1;
}
}
return false;
}

public static void main(String[] args) {
int arr[]= {1,4,6,7,9,10};
int key=4;
System.out.println(binary(key,arr));
	}
}