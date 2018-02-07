package seedu.addressbook.data.person;

/**
 * Represents a Person's block address in the address book.
 * Guarantees: immutable
 */
public class Block {

    private final String block;

    public Block(String block) {
        String trimmedBlock = block.trim();
        this.block = trimmedBlock;
    }

    public String getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return block;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.block.equals(((Block) other).block)); // state check
    }

    @Override
    public int hashCode() {
        return block.hashCode();
    }
}
