/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class BirthCalculator {
    public static int calculate_BirthDate(person a){
    int res = 0;
    Date b = a.getDateofBirth();
    long time = b.getTime();
    b = new Date();
    
    res = (int) ((b.getTime() - time)/31557600000l);
    
    return res;
    }
    
}
