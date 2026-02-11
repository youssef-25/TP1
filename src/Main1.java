public class Main1 {
String fname="youssef";
int age=17;
    public Main1() {


    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age + " years old");
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        myMethod("Youssef", 25);
        myMethod("Aicha", 28);
        myMethod("Khadija", 24);

        checkAge(20); // Call the checkAge

    }
}
