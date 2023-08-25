/*

 */


import java.util.Scanner;

public class Main {
    static int Smallest_subarray_with_sum_greater_than_x(int[] array , int target){
        int length = array.length;
        int start = 0;
        int end = 1;
        int sum = array[start];
        int result = Integer.MAX_VALUE;
        if (sum > target) return 1;
        if (end < length) sum += array[end];
        while (start < length && end < length){
            if (sum > target){
                result = Math.min(result , end - start + 1);
                sum -= array[start];
                start++;
            }
            else {
                end++;
                if (end < length){
                    sum += array[end];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Enter the target");
        int target = input.nextInt();
        System.out.println("Enter the number you want search in array ");
        System.out.println(Smallest_subarray_with_sum_greater_than_x(array,target));
    }
}