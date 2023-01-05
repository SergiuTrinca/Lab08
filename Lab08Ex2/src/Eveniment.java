public class Eveniment
{
    public final static int pret=35;
    public final static int l=50;
    public final static int pretmic=32;
    public final static int pretmare=35;
    public int tip;
    private int Guests;
    public boolean largeEvent;
    public final String tip1="Nunta",tip2="Botez",tip3="Zi de nastere",
            tip4="Corporativ",tip5="Alt eveniment";

    private char[] eveniment;
    private char[] telefon;
    private static int  invitati;
    private String tipEveniment;

    private int p;

    public Eveniment( char[] _eveniment,int _invitati, char[] _telefon )//constructor
    {
        if((eveniment[0]>='a' && eveniment[0]<='z')||(eveniment[0]>='A' && eveniment[0]<='Z'))
            if((eveniment[1]>='0' && eveniment[1]<='9'))
                if((eveniment[2]>='0' && eveniment[2]<='9'))
                    if((eveniment[3]>='0' && eveniment[3]<='9'))
                        if(eveniment.length==4)
                            eveniment=_eveniment;
                        else  eveniment= "A000".toCharArray();
        if(eveniment[0]>='a' && eveniment[0]<='z') eveniment[0]= (char) (eveniment[0]-'a'+'A');//tranf prima litera mica in litera mare
        invitati=_invitati;
        int i=0,k=0;
        char[] tel= "".toCharArray();

        while(i<_telefon.length) {
            if(_telefon[i]>='0' && _telefon[i]<='9')
            { tel[k]=_telefon[i];k++;}
            i++;
        }
        if(tel.length>10||tel.length<10)
            telefon="0000000000".toCharArray();
        else
            telefon=tel;
    }
    public Eveniment()
    {
        eveniment= "A000".toCharArray();
        invitati=0;
    }
    public char[] getEventNumber()
    {
        return eveniment;
    }
    public  void setEventNumber(String _eveniment)
    {
        //eveniment=_eveniment;
    }
    public int getInvitati()
    {
        return invitati;
    }
    public char[] getTelefon()
    {
        char[] tel="".toCharArray();
        int i=0,k=0;
        while(i<=9)
        {
            if(i==0) {tel[k]='(';k++;}else
            if(i==2){tel[k]=')';k++;tel[k]=' ';k++;}else
            if(i==5){tel[k]='-';k++;}else
                tel[k]=telefon[i];k++;
            i++;
        }
        return tel;
    }
    public void setTip(int tip)
    {
        if(tip==1)
            tipEveniment=tip1;
        if(tip==2)
            tipEveniment=tip2;
        if(tip==3)
            tipEveniment=tip3;
        if(tip==4)
            tipEveniment=tip4;
        if(tip==5)
            tipEveniment=tip5;

    }
    public String getTip()
    {
        return tipEveniment;
    }
    public  void setInvitati( int _invitati)
    {
        // invitati=_invitati;
    }
    public int getGuests()
    {
        return pret;
    }
    public  void setGuests(boolean x)
    {
        if(x==true)
            p=pretmic*invitati;
        else p=pretmare*invitati;
    }

    public int Pret_per_persoana()
    {
        return pret;
    }

    public  boolean isLargeEvent()
    {
        if(Guests > l)
        {
            return largeEvent=true;
        }
        else return largeEvent=false;
    }
}

