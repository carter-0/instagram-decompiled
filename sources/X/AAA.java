package X;

import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

public abstract class AAA {
    public static Person A00(AH5 ah5) {
        Person.Builder name = new Person.Builder().setName(ah5.A01);
        IconCompat iconCompat = ah5.A00;
        Icon icon = null;
        if (iconCompat != null) {
            icon = C66773McJ.A00((Context) null, iconCompat);
        }
        return name.setIcon(icon).setUri(ah5.A03).setKey(ah5.A02).setBot(ah5.A04).setImportant(ah5.A05).build();
    }

    public static AH5 A01(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            iconCompat = C66773McJ.A01(person.getIcon());
        } else {
            iconCompat = null;
        }
        return new AH5(iconCompat, name, person.getKey(), person.getUri(), person.isBot(), person.isImportant());
    }
}
