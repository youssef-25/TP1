import javax.naming.Name;

public class Teacher {
    static String Name = "Amdouni bilel";
    static int age = 45;
    public Teacher() {}
    static void myMethod(String Name, int age) {
        System.out.println(Name + " is " + age + " years old");
    }

    public static void main(String[] args) {
        // Appel de la méthode statique
        System.out.println("le nom est"+ Name+"mon age est :"+age);
    }
}
