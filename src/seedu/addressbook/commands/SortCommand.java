package seedu.addressbook.commands;

/**
 * Sorts the address book by name in alphabetical order
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts the address book by name in "
            + "alphabetical order.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Address book has been sorted";

    @Override
    public CommandResult execute() {
        addressBook.sortAllByName();
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
