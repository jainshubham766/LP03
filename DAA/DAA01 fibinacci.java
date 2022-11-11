public class DAA01 {
    /*
    1.  https://www.baeldung.com/cs/fibonacci-computational-complexity
2. https://www.guru99.com/fibonacci-series-java.html
*/

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return (fib(n - 1) + fib(n - 2));

    }


    public static void main(String[] args) {

        //Fibonnaci Without Recurion

        int n1 = 0, n2 = 1, n3 = 0, number = 10;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < number; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println("\n=========================\nRecursive Approach");


        //=====================================
        // Fibonacci Numbers using Recursion
        int i = 0;
        while (i < number) {
            System.out.print(fib(i)+" ");
            i++;
        }
    }
}
