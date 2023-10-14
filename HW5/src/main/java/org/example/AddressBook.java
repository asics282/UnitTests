package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(String name, Contact newContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.set(i, newContact);
                return;
            }
        }
    }

    public void deleteContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}