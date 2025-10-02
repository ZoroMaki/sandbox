import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // salary - bonus addition
        // int salary = 1000;
        // int bonusA = 50;
        // int bonusB = 10;
        // if (salary > 100) {
        // salary += bonusA;
        // } else {
        // salary += bonusB;
        // }
        // System.out.println("Salary: " + salary);

        // Prime number or not
        // int number = 17627;
        // int start=2;
        // while (Math.sqrt(number)>start) {
        // if(number%start == 0){
        // System.out.println("Non-prime number");
        // return;
        // }
        // start+=1;
        // }
        // System.out.println("Prime number");

        // int a = 270;
        // byte b = (byte) (a);
        // System.out.println(b);

        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter Celcius: ");
        // Float tempC = in.nextFloat();
        // double tempF =(tempC * 1.8)+32;
        // System.out.println(tempF);

        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // for(int i=1; i<=input;i++){
        // System.out.println(i);
        // }

        // int in =1;
        // while(in<=10){
        // System.out.println(in);
        // in++;
        // }

        // int in =1;
        // do {
        // System.out.println(in);
        // in++;
        // } while (in<=10);

        // Scanner sc= new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int max = a;
        // if(b>max){
        // max=b;
        // }
        // if(c>max){
        // max=c;
        // }
        // System.out.print(max);

        // System.out.println(Math.max(8,Math.max(7, 87)));

        // String name= "Erwin";
        // System.out.println(name.charAt(1));

        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while (count <= 7) { // instead of 7 we can take n & add scanner for that
        // int temp = b; // Must take temp as b, otherwise b value won't be correct one
        // b = b + a; // -> assigning b to addition of b+a
        // a = temp; // -> assigning to the temp value which we take first
        // count++;
        // }
        // System.out.println(b);//why b, because that's updated variable

        // int i=29429;
        // int count=0;
        // while(i>0){
        // int rem=i%10; //-> to pick last digit we are using modulas of 10
        // System.out.println(rem);
        // if(rem==9){
        // count++;
        // }
        // i/=10; //->reduce the digits one by one
        // System.out.println(i);
        // }
        // System.out.println(count);

        // int i=387763;
        // int ans=0;
        // while(i>0){
        // int rem = i%10; // gettting last digit
        // i/=10; // removing last digit from i
        // ans=(ans*10)+rem;
        // }
        // System.out.println(ans);

        // Calculator try

        // Switch
        // Scanner sc = new Scanner(System.in);
        // String fruits = sc.next();

        // switch (fruits) {
        // case "apple":
        // System.out.println("Red healthy sugary");
        // break;
        // case "pomo":
        // System.out.println("Granate with reddie juice");
        // break;
        // default:
        // System.out.println("Something else");
        // break;
        // }

        // int day = sc.nextInt();
        // switch(day){
        // case 1,2,3,4,5 -> System.out.println("weekday");
        // case 6,7 -> System.out.println("Weekend");
        // default -> System.out.println("Not date");
        // }

        // List<Integer> lists= List.of(1,2,9,7,4,6);
        // lists.stream().filter(x->x%2==0).forEach(System.out::println);

        // var result = isPrime(8);
        // System.out.println(result);

        System.out.println(isArmStrongNumber(153));
        System.out.println(isArmStrongNumber(467));
        System.out.println(isArmStrongNumber(977));

        // for (int i = 100; i < 1000; i++) {
        //     if (isArmStrongNumber(i)) {
        //         System.out.println(i);
        //     }
        // }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int count = 2;
        while (count * count <= num) {
            if (num % count == 0) {
                return false;
            }
            count++;
        }
        return count * count > num;
    }

    static boolean isArmStrongNumber(int num) {
        int og = num;
        int sum = 0;
        while (og > sum) {
            int rem = num % 10; // to pick last digit
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == og;
    }
}
