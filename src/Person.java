public class Person {
    static String firstname ="youssef";
    static String lastname ="Kallel";
    static int age =25;
    String sport ="Swimming pool";
    String firstname1 ="Cristiano ";
    String lastname1 =" Rolando ";
    public static void main(String[]Args){
        System.out.println("ceci est la classe personne");

    //    System.out.println("my firstname is " +firstname+ " my lastname est "+lastname+" I am " +age+" ans "+" and i practice "+sport);
            Person Person1 = new Person();
        System.out.println(Person1.firstname+ Person1.lastname+  Person1.age);
        System.out.println("je m'appelle " + firstname +"mon prénom est : "+ lastname + " mon age est "+ age );
        Person person2 = new Person();

        System.out.println(person2.firstname1+ person2.lastname1);
        }


}
