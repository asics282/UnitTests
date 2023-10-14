import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.AddressBook;
import org.example.Contact;

public class AddressBookIntegrationTest {
    // Интеграционные тесты
    @Test
    void testEditContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Павел", "1234567890");
        addressBook.addContact(contact);

        Contact newContact = new Contact("Вика", "9876543210");
        addressBook.editContact("Павел", newContact);
        assertEquals(newContact, addressBook.getContacts().get(0));
    }

    @Test
    void testAddAndDeleteContacts() {
        AddressBook addressBook = new AddressBook();
        Contact contact1 = new Contact("Павел", "1234567890");
        Contact contact2 = new Contact("Вика", "9876543210");

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        assertEquals(2, addressBook.getContacts().size());

        addressBook.deleteContact("Павел");
        assertEquals(1, addressBook.getContacts().size());
    }
}
