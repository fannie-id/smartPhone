package org.example;

import java.util.List;

public class Smartphone implements GPS,Radio{
    private String modell;
    private String marke;
    private List<Contact> contactList;


    public Smartphone() {
    }

    public Smartphone(String modell, String marke, List<Contact> contactList) {
        this.modell = modell;
        this.marke = marke;
        this.contactList = contactList;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;

    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modell='" + modell + '\'' +
                ", marke='" + marke + '\'' +
                ", contactList=" + contactList +
                '}';
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public int getContact(Contact contact){
        return contactList.indexOf(contact);
    }

    public Contact getContactByName(String name){
        for(Contact c : contactList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }


    public void removeContactByName(String name){

        for(Contact c : contactList){
            if(c.getName().equals(name)){
                System.out.println(name+"  was deleted.");
                contactList.remove(c);
                return;
            }
        }

    }
}
