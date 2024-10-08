package X;

import com.instagram.ui.widget.mediapicker.Folder;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public final class MAR implements Comparator {
    public final List A00;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Folder folder = (Folder) obj;
        Folder folder2 = (Folder) obj2;
        AnonymousClass7TG.A1N(folder, folder2);
        List list = this.A00;
        int indexOf = list.indexOf(Integer.valueOf(folder.A02));
        if (indexOf == -1) {
            indexOf = list.size();
        }
        int i = indexOf + 1;
        int indexOf2 = list.indexOf(Integer.valueOf(folder2.A02));
        if (indexOf2 == -1) {
            indexOf2 = list.size();
        }
        int i2 = i - (indexOf2 + 1);
        if (i2 != 0) {
            i2 /= Math.abs(i2);
        }
        String name = folder.getName();
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        String A12 = DbT.A12(locale, name);
        String name2 = folder2.getName();
        Locale locale2 = Locale.getDefault();
        0qQ.A07(locale2);
        int compareTo = A12.compareTo(DbT.A12(locale2, name2));
        if (i2 == 0) {
            return compareTo;
        }
        return i2;
    }

    public MAR(List list) {
        this.A00 = list;
    }
}
