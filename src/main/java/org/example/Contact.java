package org.example;

import java.util.Objects;

public abstract class Contact {
    private String name;

    public Contact() {
    }

    public Contact(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
