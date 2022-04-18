/*
You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). 
You need to write a class called MyCalculator which implements the interface.

The divisorSum function just takes an integer as input and 
return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000

Sample Input
6

Sample Output
12

*/
import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
class interfaces{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
}

