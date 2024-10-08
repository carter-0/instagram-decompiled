package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.ArM  reason: case insensitive filesystem */
public final class C41281ArM implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return 29b.A00(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
    }
}
