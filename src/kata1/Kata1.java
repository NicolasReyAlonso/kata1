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
public class Kata1 {

    public static void main(String[] args) {
        person Gonzi = new person ("Gonzalo", new Date (98, 11, 3));
        System.out.print(Gonzi.getName() +" age " +BirthCalculator.calculate_BirthDate(Gonzi));
    }
    
}
