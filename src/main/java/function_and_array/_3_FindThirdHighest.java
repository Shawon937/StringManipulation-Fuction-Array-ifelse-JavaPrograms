//  Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary

package function_and_array;

import java.util.Arrays;

public class _3_FindThirdHighest {
    public static void main(String args[]) {
        int array[] = {35000, 25000, 28000, 32500, 44000, 32800};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("Sorted Salary ::" + Arrays.toString(array));
        int max = array[size - 3];
        System.out.println("3rd Highest Salary is :" + max);
    }
}