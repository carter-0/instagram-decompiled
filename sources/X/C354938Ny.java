package X;

import java.util.Comparator;

/* renamed from: X.8Ny  reason: invalid class name and case insensitive filesystem */
public final class C354938Ny implements Comparator {
    public static final C354938Ny A00 = new C354938Ny();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i = ((C378669Qs) ((B3f) obj)).A0f;
        int i2 = ((C378669Qs) ((B3f) obj2)).A0f;
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }
}
