import java.util.Date;
import java.awt.*;
import java.util.Arrays;

public class Test{
    public static void main(String[] args){
        // System.out.println("Hello World");
        // Date now = new Date();
        // now.getTime();  
        // // System.out.println(now);
        // Point point1 = new Point(1,2);
        // Point point2 = point1; 
        // point1.x = 2;
        // point2.x = 3;
        // System.out.println(point2);
        // System.out.println(point1);

        // String message = " Hello \"Mosh\"";

        // String message = "C:\tWindows\\...";

        // System.out.println(message.trim());
        // System.out.println(message);

        // int [] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // System.out.println(Arrays.toString(numbers));
        // int[] numbers= {2,3,5,1,4};
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        // int [][] numbers = new int[2][3];
        // numbers[0][0] = 1;
        int[][] numbers = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers));
    }
}