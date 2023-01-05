import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Eveniment one = new Eveniment();
        one = getData(one);
        System.out.println("Detaliile evenimentului 1");
        System.out.println("Numele evenimentului = " + one.getEventNumber() + " \nNr invitati " + one.getGuests() + " \n" + one.getPretoaspete() + "  RON \n" + one.isLargeEvent()+" \n Nr telefon"+one.getnumarTelefon());
        Eveniment two = new Eveniment();
        two.setEventNumber("A200");
        two.setGuests(0);

        System.out.println("Numele evenimente2" + two.getEventNumber() + "\n Nr de invtati" + two.getGuests());

    }

    public static Eveniment getData(Eveniment event) {
        int numarPersoane;
        String name, z,numarTelefon,nt,repNumar,tipEveniment;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Da numele evenimetului");
        name = keyboard.nextLine();
        z = name;
        for (int i = 0; i < name.length(); i++) {
            if(name.length()==4) {
                if (name.charAt(0) >= 'a' && name.charAt(0) <= 'z') {
                    if (name.charAt(1) >= '0' && name.charAt(1) <= '9') {
                        if (name.charAt(2) >= '0' && name.charAt(2) <= '9') {
                            if (name.charAt(3) >= '0' && name.charAt(3) <= '9') {
                                name = z;
                            } else name = "A000";
                        } else name = "A000";
                    } else name = "A000";
                } else name = "A000";
            }else name = "A000";
        }
        System.out.print("Dati numarul de telefon = ");
        numarTelefon=keyboard.nextLine();

        repNumar=numarTelefon.replaceAll("[^a-zA-Z0-9]","");
        nt=repNumar;
        for(int j=0;j<repNumar.length();j++)
        {
            if(repNumar.length()==10)
            {
                repNumar=nt;
            }
            else repNumar="0000000000000000";
        }


        System.out.print(" \n Dati numarul de persoane ");
        numarPersoane=keyboard.nextInt();
        System.out.print("Dati tipul de eveniment =");
        tipEveniment=keyboard.nextLine();
        String d = name.toUpperCase();
        event.setEventNumber(d);
        event.setGuests(numarPersoane);
        event.setNumarTelefon(Numar);
        event.setTipEveniment(tipEveniment);
        return event;
    }}