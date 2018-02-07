package seedu.addressbook.data.person;

/**
 * Represents a Person's Postal Code address in the address book.
 * Guarantees: immutable
 */
public class PostalCode {

    private final String postalCode;

    public PostalCode(String postalCode) {
        String trimmedPostalCode = postalCode.trim();
        this.postalCode = trimmedPostalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.postalCode.equals(((PostalCode) other).postalCode)); // state check
    }

    @Override
    public int hashCode() {
        return postalCode.hashCode();
    }
}
