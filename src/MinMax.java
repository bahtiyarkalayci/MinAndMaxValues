import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int maxNumber=Integer.MIN_VALUE;
        int minNumber=Integer.MAX_VALUE;

        Scanner scanner=new Scanner(System.in);
        System.out.println("how many number you will be enter");
        int number=scanner.nextInt();

        for (int i=1;i<=number;i++){
            System.out.println("enter"+i+".value");
            int value =scanner.nextInt();
            if (value>maxNumber){
                maxNumber=value;


            } else if (value<minNumber) {
                minNumber=value;
            }

        }
        System.out.println("max number ="+maxNumber);
        System.out.println("min number="+minNumber);



       }
    }

