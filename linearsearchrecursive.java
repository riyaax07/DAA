public class linearsearchrecursive {
  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 4, 2};
    int target = 4;
    int index = linearSearch(arr, target, 0);
    
    if (index != -1) {
      System.out.println("Element found ");
    } else {
      System.out.println("Element not found");
    }
  }

  public static int linearSearch(int[] arr, int target, int index) {
    if (index >= arr.length){
      return -1;
    }
    if (arr[index] == target) {
      return index;
    }
    return linearSearch(arr, target, index + 1);
  }
}