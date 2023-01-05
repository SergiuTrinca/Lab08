public class Rental {
    public static final int ora=60;
    public static final int rata=40;
    private String nrContract;
    private String numarTelefon;
    private String echipament;
    private int nrOreExtra;
    private int minute;
    private int  HoursAndMinutes;
    private int pret;
    public void setContractNumber(String contact)
    {
        nrContract=contact;
    }
    public void setHoursAndMinutes(int orele) {
        HoursAndMinutes = orele / ora;
    }
    public void setEchipament(String echipament1)
    {
        echipament=echipament1;
    }
    public String getEchipament()
    {
        return echipament;
    }
    public static void motto()
    {

        System.out. print("Motto");
    }
    public void setNumarTelefon(String numar)
    {
        numarTelefon=numar.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNrOreextra(int inchiere)
    {
        int inchiriereExtra = 0, Inchiere;

        if (inchiere > 60)
        {
            for(int i = 60; i < inchiere; i++)
            {
                inchiriereExtra++;

            }
        }

        Inchiere=inchiere+inchiriereExtra;
        nrOreExtra=inchiriereExtra;
        pret=Inchiere;
    }

    public String getNrContract()
    {
        return nrContract;
    }

    public int getHoursAndMinutes() {
        return HoursAndMinutes;
    }
    public int getNrOre()
    {
        return nrOreExtra;

    }
    public int getPret()
    {
        return HoursAndMinutes*rata+nrOreExtra;
    }
    public int getTarif()
    {
        return rata;
    }

}
