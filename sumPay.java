import java.util.Scanner;

public class sumPay{
public static void main (String [] args){

Scanner keyboard = new Scanner(System.in);

char answer;
double total = 0;

System.out.println("do you want to start counting? y or n");
char mainAnswer= keyboard.next().charAt(0);

if (mainAnswer == 'y' || mainAnswer == 'Y')
System.out.println("okay lets do this");

else 
System.exit(0);



do {

System.out.println("Enter price ,, Enter -1 to quit");
int num = keyboard.nextInt();
int sum = 0;

while ( num != -1 ) {
sum= sum+num;
System.out.println("Enter price ,, Enter -1 to quit");
num = keyboard.nextInt();
}

if (sum >= 1000) {
sum = ( sum - (sum * 20/100) );
System.out.println("horay you got a 20% off disoucnt ,price= " + sum + "SR");
}

else if (sum >= 500){
System.out.println("horay you got a 10% off disoucnt , price= " + sum + "SR");
sum = ( sum - ( sum * 10/100 ) );
}

else
sum = sum;
System.out.println("price= " + sum);


System.out.println("do you want to count again? (enter y or n)" );
answer = keyboard.next().charAt(0);
total = total + sum;

} while (answer == 'y' || answer == 'Y');

System.out.print("thanks for using our calculator: "+ total);
}
}


