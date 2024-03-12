
public class MathOperations{

    public int add(int p, int q) {
        return p + q;
    }
    
    public double add(double p, double q, double r){
        return p+q+r;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations operations = new MathOperations();
        int sumInt = operations.add(20, 30);
        System.out.println("Sum of two integers: " + sumInt);
        double sumDouble = operations.add(18.9, 23.42, 13.43);
        System.out.println("Sum of three doubles: " + sumDouble);
        String concatenatedString = operations.add("Hello, ", "How are you!?");
        System.out.println("Concatenation of two strings: " + concatenatedString);
    }
}
