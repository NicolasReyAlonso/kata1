/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class person {
    private String name;
    private GregorianCalendar birthdate;
    public person(){
    
    }
    
    public person (String name, GregorianCalendar birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName(){
        return name;
    }
    
    public GregorianCalendar getDateofBirth(){
        return birthdate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDateofBirth(GregorianCalendar birthdate){
        this.birthdate=birthdate;
    }
    
}
