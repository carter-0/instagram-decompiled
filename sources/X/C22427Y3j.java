package X;

import java.util.Comparator;

/* renamed from: X.Y3j  reason: case insensitive filesystem */
public final class C22427Y3j implements Comparator {
    public final boolean equals(Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C21413XaN xaN = (C21413XaN) obj;
        C21413XaN xaN2 = (C21413XaN) obj2;
        int i3 = xaN.A01;
        int i4 = xaN2.A01;
        if (i3 >= i4) {
            if (i3 > i4 || (i = xaN.A00) < (i2 = xaN2.A00)) {
                return 1;
            }
            if (i > i2) {
                return -1;
            }
            return 0;
        }
        return -1;
    }
}
