/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class BirthCalculator {
    
    private final long millisOnYear = 31557600000l;
    
    public static int calculate_BirthDate(person a){
    LocalDate b = LocalDate.now();
    int tim = b.getYear();
    
    int time = a.getDateofBirth().getYear();

    return safe_month(tim - time, a.getDateofBirth().getMonth(), b.getMonth());
    }
    
    private static int millisToYear(long a){
    return (int) (a/31557600000l);
    }
    
    private static int safe_month (int a, Month b, Month c){
        int result = a;
        if(b.getValue()-c.getValue()>0){
            result--;
        }
        
        return result;
    }
    
    
}
