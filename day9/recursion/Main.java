package day9.recursion;

public class Main {
    /*
    * function or method calls and returns in a program are managed in the stack memory.
    * How the call stack works in the context of Java:

Function Calls: When a Java program calls a method or function,
*  information about the current state of execution (such as local variables, return addresses,
* and other relevant information) is pushed onto the call stack.
* This information is organized in a stack-like data structure, where the most recently called method resides at the top of the stack.

Nested Calls: If a method calls another method (directly or indirectly), the information related to the new method call is pushed onto the top of the stack, creating a new frame.
* This process continues as more methods are called, creating a stack of method invocation frames.

Returning from Methods: When a method completes its execution (reaches its return statement or encounters an exception), its corresponding frame is removed from the top of the stack, and the program resumes execution at the return address stored in the frame below it.

Stack Overflow: If the call stack becomes too deep due to excessive recursion or infinite loops, it can lead to a stack overflow error, which indicates that the available stack space has been exhausted.
    * */



    /*
    * Base Condition in recursion is where recursion will stop making more calls
    * it's an if condition
    * */

    public static void main(String[] args) {
       // System.out.println(fibonacci(8));

        int answer = factorial(5);
        System.out.println(answer);
    }


    //Find nth Fibonacci number
    static int fibonacci(int n){

        if (n <= 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n - 2);
    }


    //Factorial of nth number

    static int factorial(int n){

        //base
        if (n <= 1){
            return 1;
        }

        return n * factorial(n - 1);
    }

}