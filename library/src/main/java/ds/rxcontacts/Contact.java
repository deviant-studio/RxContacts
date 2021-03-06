package ds.rxcontacts;

import android.support.annotation.Nullable;

import java.util.List;

public class Contact implements Comparable<Contact> {
    public String contactId;
    public String name;
    public String photoUri;
    public List<String> emails;
    public List<String> phones;
    public long lastTimeContacted;
    public boolean isStarred;


    public Contact(String contactId) {
        this.contactId = contactId;
    }

    /**
     * Get first email if available
     * @return
     */
    @Nullable
    public String getEmail() {
        return !emails.isEmpty() ? emails.get(0) : null;
    }

    /**
     * Get first phone if available
     * @return
     */
    @Nullable
    public String getPhone() {
        return !phones.isEmpty() ? phones.get(0) : null;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s\tphones=%s\temails=%s\tphoto=%s",
                contactId, String.valueOf(name), String.valueOf(phones), String.valueOf(emails), String.valueOf(photoUri));
    }

    @Override
    public int compareTo(Contact another) {
        return name != null && another.name != null ? name.compareToIgnoreCase(another.name) : -1;
    }
}
