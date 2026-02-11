public class Person {
    // Variables statiques (communes à toutes les instances)
    static String firstname = "Youssef";
    static String lastname = "Kallel";
    static int age = 25;
    // Variables d'instance (propres à chaque objet)
    String sport;
    String firstname1;
    String lastname1;
    // Constructeur pour initialiser les variables d'instance
    public Person(String sport, String firstname1, String lastname1) {
        this.sport = sport;           // "this" fait référence à l'objet courant
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;}
    public static void main(String[] args) {
        System.out.println("Ceci est la classe Person");
        // Affichage des variables statiques
        System.out.println("Je m'appelle " + firstname + " " + lastname +
                ", mon âge est " + age + " ans.");
        // Création d'un objet Person avec ses propres valeurs
        Person myprofile = new Person("Swimming pool", "Cristiano", "Rolando");
        System.out.println("Je pratique : " + myprofile.sport);
        // Création d'un deuxième objet Person avec d'autres valeurs
        Person person2 = new Person("Football", "Lionel", "Messi");
        System.out.println("Nom complet : " + person2.firstname1 + " " + person2.lastname1);
    }
}
