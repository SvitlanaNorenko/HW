public class Task2Calculator {

    /*
    a. add implementation to below calculator methods
    b. invent another calculator method that would do something useful
     */
    public static void main(String[] args) {
        // play around with numbers - try Interger.MAX_VALUE for example and see what happens
        System.out.println(plus(13, 15));
        System.out.println(minus(15, 12));
        System.out.println(multiply(2, 7));
        System.out.println(mod(7, 2));
        System.out.println(pow(6, 2));
    }


    static int plus(int a, int b) {
        return a+b;
    }

    static int minus(int a, int b) {
        return a-b;
    }

    static int multiply(int a, int b) {
        return a*b;
    }

    static int mod(int a, int b) {
        return a%b;
    }

    static int divide(int a, int b) { return a/b; }
    
}


