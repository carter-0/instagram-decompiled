package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.ArL  reason: case insensitive filesystem */
public final class C41280ArL implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return 29b.A00(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }
}
