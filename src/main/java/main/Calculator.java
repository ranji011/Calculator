package main;
import java.util.*; 

public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:{ans=add( num1,num2);
            System.out.println(ans);}
            break;
        case 2:
        {ans=sub( num1,num2);
        System.out.println(ans);}
            break;      
        case 3:
        {ans=mult( num1,num2);
        System.out.println(ans);}
            break;
        case 4:
        {ans=div( num1,num2);
        System.out.println(ans);}
            break;
            default:
                System.out.println("Illigal Operation");


        }



    }
    public static int add(int x, int y)
    {
    	int result=0;
         result=x+y;
    	
        return result;
    }
    public static int sub(int x, int y)
    {
    	int result=0;
    	result=x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
    	int result=0;
    	result=x*y;      
    	return result;
    }
    public static int div(int x, int y)
    {
    	int result=0;
    	result=x/y;
    	return result;
    }

}