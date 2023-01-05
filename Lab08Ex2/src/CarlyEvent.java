import java.util.Scanner;
public class CarlyEvent {

    public static String s;
    public static int nr_invitati()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti nr de initati: ");
        s = scanner.next();
        int i=Integer.parseInt(s);
        return i;
    }
    public static void motto()
    {
        System.out.println("*** Carly’s makes the food that makes it a party. *** ");
    }
    public static void pret()
    {
        Eveniment eveniment=new Eveniment();
        int x=eveniment.getGuests();
        if(eveniment.isLargerEvent()==true)
        { eveniment.setGuests(true);
            System.out.println("Evenimentul este mare daca are peste 50 de invitati. ");
            System.out.println("Evenimentul este mare pentru ca are "+x+" invitati ");
        }

    }
    public static  Eveniment event(Eveniment eveniment)
    {
        int i=nr_invitati();
        eveniment.setInvitati(i);
        pret();
        String nr;
        System.out.println("Codul evenimentului este:  ");
        Scanner scanner = new Scanner(System.in);
        nr=scanner.next();
        eveniment.setEventNumber(nr);
        return eveniment;
    }
    public  void comparare(Eveniment primuleveniment,Eveniment eveniment2)
    {
        if (primuleveniment.getInvitati()>eveniment2.getInvitati()) {
            System.out.print("Primul eveniment este mai mare decat al doilea");
            System.out.print("Nr de invitati este : " + primuleveniment.getInvitati());
        }
        else
        if (primuleveniment.getInvitati()<eveniment2.getInvitati()) {
            System.out.print("Primul eveniment este mai mic decat al doilea!");
            System.out.print("Nr de invitati este : " + eveniment2.getInvitati());
        }

        else
            System.out.print("Primul eveniment are acelasi nr de invitati ca si al doilea");
    }
}