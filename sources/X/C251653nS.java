package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.3nS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C251653nS implements Comparator {
    public final int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        if (file.lastModified() == file2.lastModified()) {
            String name = file.getName();
            String name2 = file2.getName();
            int length = name.length();
            int length2 = name2.length();
            if (length <= length2) {
                if (length2 <= length) {
                    return name2.compareTo(name);
                }
                return 1;
            }
        } else if (file.lastModified() <= file2.lastModified()) {
            return 1;
        }
        return -1;
    }
}
