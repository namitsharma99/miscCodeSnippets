import  java.util.*;

// Problem source: G
class TimeStampMatcherFromGivenUserLoggedInTime {

    public static void main(String[] args) {
        
        int[][] arr = {{0,2}, {0,3}, {6,10}, {1,4}};
        int t = 4;
        
        int[][] arr2 = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(arr2, (a, b) -> a[0] - b[0]);
        
        if (t < arr2[0][0]) {
            System.out.println("No match!");
            return;
        }
            
        Arrays.sort(arr2, (a, b) -> b[1] - a[1]);
        
        if (t > arr2[0][0]) {
            System.out.println("No match!");
            return;
        }
        
        int idx = 0;
        List<Integer> result = new ArrayList();
        
        for (int[] a :  arr) {
            if (t >= a[0] && t <= a[1]) {
                result.add(idx);
            }
            idx++;
        }
        
        for (int r : result) 
            System.out.print(r + " , ");
        
        
    }
}
