import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class mainClass {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        List<Regiune> list = new ArrayList<>();
        int perioada1, perioada2, max;
        String tara, regiune;

        list.add(new Regiune("Schi", 20, 12, 2, 75.00, "Brasov", "Romania"));
        list.add(new Regiune("Parapanta", 27, 3, 5, 125.00, "Predeal", "Romania"));
        list.add(new Regiune("ATV", 15, 1, 12, 50.00, "Brasov", "Romania"));
        list.add(new Regiune("Schi", 30, 12, 2, 150.00, "Tirol", "Austria"));
        list.add(new Regiune("Caiac", 35, 7, 9, 15.00, "Constanta", "Romania"));
        list.add(new Regiune("Vaporas", 22, 7, 9, 10.00, "Constanta", "Romania"));
        list.add(new Regiune("Schi", 26, 2, 4, 80.00, "Predeal", "Romania"));

        System.out.println("Introduceti perioada in care doriti sa mergeti in vacanta(1-12) : ");
        System.out.print("De la (luna) : ");
        perioada1 = scan.nextInt();
        if(perioada1 <= 0 || perioada1 > 12) System.exit(1);
        System.out.print("Pana la (luna) : ");
        perioada2 = scan.nextInt();
        if(perioada2 <= 0 || perioada2 > 12) System.exit(1);

        System.out.print("Introduceti tara :");
        tara = scan.next();
        tara = tara.toLowerCase();

        System.out.print("Introduceti regiunea : ");
        regiune = scan.next();
        regiune = regiune.toLowerCase();


            for(int i = 0 ; i < list.size() ; i++)
            {
                if(tara.equals(list.get(i).getTara().toLowerCase()) && regiune.equals(list.get(i).getRegiune().toLowerCase()) && (perioada1 >= list.get(i).getPerioada1() && perioada2 <= list.get(i).getPerioada2()))
                {
                    System.out.println(list.get(i));
                }
            }







    }
}
