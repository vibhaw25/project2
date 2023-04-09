
import java.util.*;
class FarToCel{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
  float temperature;
  System.out.println("Enter the temp in Farenheit");
  temperature =sc.nextInt();
  temperature=((temperature-32)*5)/9;
  System.out.println("the temp. in cel is:" +temperature+ "c");
  
 } 
}