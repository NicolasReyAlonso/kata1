/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Kata1 {

    public static void main(String[] args) {
        LocalDate a = LocalDate.of(1998,11,3);
        person Gonzi = new person ("Gonzalo", LocalDate.of(1998,11,3));
        System.out.print(Gonzi.getName() +" age " +BirthCalculator.calculate_BirthDate(Gonzi));
    }
    
}
