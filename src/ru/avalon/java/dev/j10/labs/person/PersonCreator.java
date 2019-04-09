package ru.avalon.java.dev.j10.labs.person;

import java.util.Date;

public class PersonCreator implements Person{
    private String name;
    private Date birthDate;
    
    public PersonCreator(){
        setName();
        setBirthDate();
    }
    
    private void setName(){
       NameGiver takeName = new NameGiver();
       name = takeName.getName();
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    private void setBirthDate(){
        Date millisec = new Date(); 
        birthDate = new Date(0 + (long)(Math.random() * millisec.getTime()));
    }
    
    @Override
    public Date getBirthDate(){
        return birthDate;
    }
    
    @Override
    public int compareTo(Person that){
        int result = getName().compareTo(that.getName());
        if (result != 0){
            return result;
        } result = getBirthDate().compareTo(that.getBirthDate());
        return result;
    }

}
