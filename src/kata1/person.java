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
public class person {
    String name;
    Date birthdate;
    public person(){
    
    }
    
    public person (String name, Date birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName(){
        return name;
    }
    
    public Date getDateofBirth(){
        return birthdate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDateofBirth(Date birthdate){
        this.birthdate=birthdate;
    }
    
}
