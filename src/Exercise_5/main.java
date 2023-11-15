package Exercise_5;

public class main {

    public static void main(String[] args) {

        System.out.println(Library.isEven(4) == true ? "Is even" : "Is odd");
        int num = 1000;
        System.out.println(num + " has " + Library.digitAmount(num) + " digits.");
        int num2 = 555000230;
        System.out.println(Library.isLong(num2) == true ? "Is long" : "Is short"); // Incorrect
        int mul = 20;
        System.out.println(Library.multipleOf10(mul) == true ? mul + " is multiple of 10" : mul + " is not multiple of 10");

    }

}
