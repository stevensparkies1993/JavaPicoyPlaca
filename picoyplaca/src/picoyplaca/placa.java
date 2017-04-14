package picoyplaca;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import pantalla.Consultar;
/**
 *
 * @author autis
 */
public class placa {
    
    int placa;
    String fecha;
    int hora;
    int min;
    int hm;
    
    public placa()
    {    }

    public String puedeManejar(int h, int m, String fecha, String placa)
    {
        String si="Puede manejar";
        String no="NO puede manejar";
        int np, lon;
        int hora;
        String hm;
        String mm = Integer.toString(m);
        if(mm.length()==1)
            mm = "0" + mm;
        hm = h + mm;
        hora = Integer.parseInt(hm);

        if(placa.length()<5 && placa.length()>2)
        {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.ENGLISH);
                LocalDate date = LocalDate.parse(fecha, formatter);
                String day = String.valueOf(date.getDayOfWeek());
                lon = placa.length();
                np = Integer.parseInt(placa.substring(lon-1,lon));
                if (day.equals("MONDAY"))
                {
                    System.out.println(day);
                    if(np == 1 || np == 2)
                    {
                        System.out.println(hora);
                        if(hora>=700 && hora<930)
                            return no;
                        else if(hora>=1600 && hora<=1930)
                            return no;
                    }
                }

                if (day.equals("TUESDAY"))
                {
                    System.out.println(day);
                    if(np == 3 || np == 4)
                    {
                        System.out.println(hora);
                        if(hora>=700 && hora<930)
                            return no;
                        else if(hora>=1600 && hora<=1930)
                            return no;
                    }
                }

                if (day.equals("WEDNESDAY"))
                {
                    System.out.println(day);
                    if(np == 5 || np == 6)
                    {
                        System.out.println(hora);
                        if(hora>=700 && hora<930)
                            return no;
                        else if(hora>=1600 && hora<=1930)
                            return no;
                    }
                }

                if (day.equals("THURSDAY"))
                {
                    System.out.println(day);
                    if(np == 7 || np == 8)
                    {
                        System.out.println(hora);
                        if(hora>=700 && hora<930)
                            return no;
                        else if(hora>=1600 && hora<=1930)
                            return no;
                    }
                }

                if (day.equals("FRIDAY"))
                {
                    System.out.println(day);
                    if(np == 9 || np == 0)
                    {
                        System.out.println(hora);
                        if(hora>=700 && hora<930)
                            return no;
                        else if(hora>=1600 && hora<=1930)
                            return no;
                    }
                }
            }
        else
        {
            return "numero de placa incorrecto";
        }
        return si;
    }
}
