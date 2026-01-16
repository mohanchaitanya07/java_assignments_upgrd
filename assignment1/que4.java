import java.util.Scanner;
public class que4 {
    public static void main(String[] args){
        System.out.println("Choose Todays Weather:\n1-Sunny \n2-Rainy ");
        Scanner sc = new Scanner(System.in);
        int weather =sc.nextInt();
        if (weather==1){
            System.out.println("Weather is suitable to go to picnic");
        }
        else{
            System.out.println("Weather is not suitable to go to picnic");
        }
        sc.close();
    }
}
