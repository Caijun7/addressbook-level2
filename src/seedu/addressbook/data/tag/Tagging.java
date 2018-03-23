package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

import java.util.ArrayList;

/**
 * Represents an adding or deleting of a tag for a specific {@code Person} that happened during a session
 */
public class Tagging {

    private static ArrayList<Tagging> taggings;

    public enum ACTION {
        ADDED, DELETED
    }

    private final Person person;
    private final Tag tag;
    private final ACTION action;

    /**
     * @param person person whose tag was changed
     * @param tag tag that was changed
     * @param action type of action
     */
    public Tagging(Person person, Tag tag, ACTION action) {
        this.person = person;
        this.tag = tag;
        this.action = action;
        addTagging(this);
    }

    /**
     * Adds tagging to class-level variable that stores all taggings during a session
     */
    public static void addTagging(Tagging tagging) {
        taggings.add(tagging);
    }

    /**
     * Returns all Taggings which represent all changes made to tags during a session
     */
    public static ArrayList<Tagging> getTaggings() {
        return taggings;
    }

    public Person getPerson() {
        return person;
    }

    public Tag getTag() {
        return tag;
    }

    public ACTION getAction() {
        return action;
    }
}