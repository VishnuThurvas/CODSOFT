import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

   
                    /* ************************************************
         ****  My Second Task in CodeSoft Java-Programming Intership  ****
                    * ************************************************** */


        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Student Grade Calculator");

        System.out.println("Excited to Know Your Grades ? , Let's Go !");
        System.out.println("Enter Number of Subjects");
        int totSub = sc.nextInt();
        int total = 0;

        for(int i = 0 ; i<totSub ; i++){
                 System.out.println("Enter Marks of Subject "+(i+1));
                 int marks = sc.nextInt();
                 total += marks;
        }

        System.out.println("Total Marks Obtained  = "+total);
        double aver = (double)(total/totSub);

        String result = String.format("Percentage = %.1f%%", (total / (double) totSub));
         System.out.println(result);
        
         char Grade;
        if(aver >= 90){
             Grade = 'O';
        }else if(aver >= 80){
            Grade = 'A';
        }else if(aver >= 70){
            Grade = 'B';
        }else if(aver >= 60){
            Grade = 'C';
        }else if(aver >=50){
            Grade = 'D';
        }else{
            Grade = 'E';
        }

        System.out.println( "Your Grade is : "+Grade);
        if((total/totSub)*100 >= 45){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
