package seedu.addressbook.data.person;

/**
 * Represents a Person's Unit address in the address book.
 * Guarantees: immutable
 */
public class Unit {

    private final String unit;

    public Unit(String unit) {
        String trimmedUnit = unit.trim();
        this.unit = trimmedUnit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return unit;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.unit.equals(((Unit) other).unit)); // state check
    }

    @Override
    public int hashCode() {
        return unit.hashCode();
    }
}
