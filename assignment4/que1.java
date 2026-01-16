import java.util.Scanner;
public class que1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2f\n", kelvin);
        sc.close();
    }
}