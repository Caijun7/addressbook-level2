package seedu.addressbook.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.UniqueTagList;
import seedu.addressbook.util.TestUtil;

public class SortCommandTest {

    private AddressBook addressBook;

    private Command sortCommand;

    private List<Person> expectedList;

    @Before
    public void setUp() throws Exception {
        Person johnDoe = new Person(new Name("John Doe"), new Phone("61234567", false),
                new Email("john@doe.com", false), new Address("11J Ben Road", false), new UniqueTagList());
        Person zamesRay = new Person(new Name("Zames Ray"), new Phone("91234567", false),
                new Email("zames@ray.com", false), new Address("22Z Ohm Road", false), new UniqueTagList());
        Person samuelTan = new Person(new Name("Samuel Tan"), new Phone("90987654", false),
                new Email("samuel@tan.com", false), new Address("33S Abc Road", false), new UniqueTagList());
        Person benjaminFrank = new Person(new Name("Benjamin Frank"), new Phone("61234321", false),
                new Email("benjamin@frank.com", false), new Address("44B Beta Road", false),
                new UniqueTagList());
        Person annieSoh = new Person(new Name("Annie Soh"), new Phone("65556666", false),
                new Email("annie@soh.com", false), new Address("55A Alpha Road", false),
                new UniqueTagList());

        addressBook = TestUtil.createAddressBook(johnDoe, zamesRay, samuelTan, benjaminFrank, annieSoh);
        expectedList = Arrays.asList(annieSoh, benjaminFrank, johnDoe, samuelTan, zamesRay);
    }

    @Test
    public void execute() {
        assertSortSuccessful(expectedList);
    }

    /**
     * Asserts that sorting of list is successful
     *
     * @param expectedList
     */
    private void assertSortSuccessful(List<Person> expectedList) {
        sortCommand = new SortCommand();
        sortCommand.setData(addressBook, Collections.emptyList());
        sortCommand.execute();

        UniquePersonList people = addressBook.getAllPersons();
        UniquePersonList expected = null;
        try {
            expected = new UniquePersonList(expectedList);
        } catch (Exception e) {
            System.out.println("exception");
        }
        assertTrue(people.equals(expected));
    }
}
