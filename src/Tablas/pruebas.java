package Tablas;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



/**
 * Tablas
 * Nombre_project: NominasJava-marcos
 * pruebas
 * Created by: MarcosRa
 * Date : 09/05/2021
 * Description:
 **/

public class pruebas {
    public static void main(String[] args) {

        String dateBeforeString = "2016-05-08";
        //String dateAfterString = "2017-07-29";
        //Parsing the date
        LocalDate dateBefore = LocalDate.parse(dateBeforeString);
        LocalDate dateAfter = LocalDate.now();
        //calculating number of days in between
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        //displaying the number of days
        System.out.println(noOfDaysBetween);
    }

}
