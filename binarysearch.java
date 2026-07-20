public class binarysearch {
  public static void main(String[]args){
    int[] arr = {3,5,6,7,9};
    int target = 7;
    int index = binarysearch(arr, target, 0, arr.length - 1);
    System.out.println("Index of " + target + " is: " + index);


  }
  public static int binarysearch(int[]arr,int target,int left,int right){
    if(left>right){
      return -1;
    }
    int mid = left + (right - left) / 2;
    if(arr[mid] == target){
      return mid;
    }
    if(arr[mid] > target){
      return binarysearch(arr, target, left, mid - 1);
    }
    return binarysearch(arr, target, mid + 1, right);
  }
}
