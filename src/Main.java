//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String name = "Youssef";
        String fille = "Aicha";
        final int num1 = 5;
        int num2 = 10;
        float num3 = 5.5f;
        char sexe = 'M';
        boolean actif = true;
        System.out.println(name + "  est le frére de " + fille);
        System.out.println(num1);
        System.out.println(num3);
        System.out.println(sexe);
        int x = 15;
        float y = 10;
        System.out.println("la somme de deux nombre x et y est: " + (x + y));
        System.out.println("la diff de deux nombre x et y est: " + (x - y));
        System.out.println("la multip de deux nombre x et y est: " + (x * y));
        System.out.println("la div de deux nombre x et y est: " + (x / y));
        String NameAcademy = "ali";

        System.out.println(NameAcademy.toUpperCase());
        String nameAcademy1 = "ali";

        System.out.println("index of " + nameAcademy1.charAt(1)); //chbi ikharrejli dima -1
        String text = "youssef";
        System.out.println("la taille du mot est" + text.length());
        String text1="youssef";
        String text2="aichoucha";
        System.out.println(text1.equals(text2));
        String SPORT ="natataion";
        int yo= 25;
    String nom ="youssef";
    String surname =" kallel";
    String age =" 25 ans";
        System.out.println(nom.concat(surname.concat(age)));
        System.out.println("mon nom est " +nom+ " mon prénom "+surname+" j'ai " +yo+" ans "+ "je fait de la "+SPORT);
System.out.println(Math.max(700,100)); //max
System.out.println(Math.min(700,100));//min
System.out.println(Math.sqrt(25));//racineCarré
System.out.println(Math.pow(2,4));//Puissance
System.out.println(Math.round(4.4)); //arrondi le plus proche
System.out.println(Math.ceil(44.4)); //arrondi le plus grand
System.out.println(Math.floor(44.9)); //arrondi le plus petit




    }
}