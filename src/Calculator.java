public class Calculator {

    public static void main(String[] args) {

        try {
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);

            if (args[0].equals("sum")) {
                msg();
                sum(x, y);
            } else if (args[0].equals("sub")) {
                msg();
                sub(x, y);
            } else if (args[0].equals("mult")) {
                msg();
                mult(x, y);
            } else if (args[0].equals("div")) {
                msg();
                div(x, y);
            } else {
                System.out.println("Please review the correct " +
                        " arguments in 'java [java_file] [operator] [number 1] [number 2]\n" +
                        "Operators: sum, sub, mult, div");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please review the correct " +
                    " arguments in 'java [java_file] [operator] [number 1] [number 2]\n" +
                    "Operators: sum, sub, mult, div");
        }
    }

    static void msg(){
        System.out.println("CALCULATOR INTEGER");
        System.out.println("RESULT:");
    }

    static void sum(int x, int y){
        System.out.println("Sum: " + (x + y));
    }

    static void sub(int x, int y){
        System.out.println("Sub: " + (x - y));
    }

    static void mult(int x, int y){
        System.out.println("Mult: " + (x*y));
    }

    static void div(int x, int y){
        System.out.println("Div: " + (x/y));
    }
}
