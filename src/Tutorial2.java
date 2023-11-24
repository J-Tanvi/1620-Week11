//libraries
import java.text.*;
public class Tutorial2 {
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("#.###");

        //creating the array
        int[] nums = {11, 23, 45, 66, 25, 69, 55, 31, 77, 92};

        //finding the sum of all the values
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //System.out.println(sum);

        //calculating mean + displaying it
        double mean = sum / nums.length;
        System.out.println("The mean is: " + fmt.format(mean));

        //calculating the summation of the means (also squares them)
        double sdSum = 0;
        double temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i] - mean;
            temp = Math.pow(temp, 2);
            sdSum += temp;
        }
        //System.out.println(sdSum);

        //calculates the standard deviation and prints
        double sd = (1.0/nums.length) * sdSum;
        sd = Math.sqrt(sd);
        System.out.println("The standard deviation is: " + fmt.format(sd));
    }
}
