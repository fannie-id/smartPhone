package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact alex = new Friend("Alex","0123456789");
        Contact bob = new Friend("Bob","0123456789");
        Contact felix = new Friend("Felix","0123456789");
        Contact felix2 = new Friend("Felix","1023456789");
        Contact bob2 = new Friend("Bob","0123456789");

        List<Contact> contactList = new ArrayList<>();
        contactList.add(alex);
        contactList.add(bob);
        contactList.add(felix);
        contactList.add(felix2);
        contactList.add(bob2);


        Smartphone sp = new Smartphone("14","apple",contactList);

        System.out.println(sp);
        System.out.println();
        System.out.println(alex.getName() +" has index of "+ sp.getContact(alex));
        System.out.println(sp.getContactByName("Felix"));
        System.out.println();
        sp.removeContactByName("Bob");
        System.out.println();
        System.out.println(sp);



    }
}