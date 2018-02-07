package seedu.addressbook.data.person;

/**
 * Represents a Person's street address in the address book.
 * Guarantees: immutable
 */
public class Street {

    private final String street;

    public Street(String street) {
        String trimmedStreet = street.trim();
        this.street = trimmedStreet;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return street;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.street.equals(((Street) other).street)); // state check
    }

    @Override
    public int hashCode() {
        return street.hashCode();
    }
}
