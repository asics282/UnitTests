import org.example.AddressBook;
import org.example.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Unit-тесты
public class AddressBookTest {

    @Test
    // Проверка добавления контакта
    void testAddContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Павел", "1234567890");
        addressBook.addContact(contact);
        assertEquals(1, addressBook.getContacts().size());
    }

    // Проверка удаления контакта
    @Test
    void testDeleteContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Павел", "1234567890");
        addressBook.addContact(contact);
        addressBook.deleteContact("Павел");
        assertTrue(addressBook.getContacts().isEmpty());
    }
}
