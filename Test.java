import java.util.Date;
import java.awt.*;
public class Test{
    public static void main(String[] args){
        System.out.println("Hello World");
        Date now = new Date();
        now.getTime();  
        // System.out.println(now);
        Point point1 = new Point(1,2);
        Point point2 = point1; 
        point1.x = 2;
        point2.x = 3;
        System.out.println(point2);
        System.out.println(point1);
    }
}