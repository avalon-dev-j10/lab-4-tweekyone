package ru.avalon.java.dev.j10.labs.person;

public class NameGiver {
   private String[] names = {
    "John", "Boris", "Bob", "Eugene", "Peter", "Mark", "Shanon"
    };
   
   public String getName(){
       String name = names[0 + (int) (Math.random() * (names.length - 1))];
       return name;
   }
}
