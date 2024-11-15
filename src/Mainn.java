import java.util.Scanner;
public class Mainn {
    public static void main(String []args){
        Scanner scanner=new Scanner (System.in);
        Employe E1=new Employe();
        Employe E2=new Employe("waed ","sidiBouzid",9);
        System.out.println("entrer employe ");
        E1.setnom(scanner.nextLine());
        E1.setadresse(scanner.nextLine());
        E1.setId(scanner.nextLine());
        E1.setnbr_heure(scanner.nextInt());
        E1.affiche();
        E2.affiche();
        System.out.println(E1);
    }
}
