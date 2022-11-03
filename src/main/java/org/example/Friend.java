package org.example;

public class Friend extends Contact{
    private String telefonnummer;

    public Friend() {
    }

    public Friend(String name, String telefonnummer) {
        super(name);
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return "\nFriend{" +
                "name='" + getName()+ '\'' +
                "telefonnummer='" + telefonnummer + '\'' +
                '}';
    }
}
