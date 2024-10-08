package X;

import java.util.Comparator;

/* renamed from: X.TLr  reason: case insensitive filesystem */
public final class C13108TLr implements Comparator {
    public static final Comparator A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C11041S6z s6z = (C11041S6z) obj;
        C11041S6z s6z2 = (C11041S6z) obj2;
        AnonymousClass7TG.A1N(s6z, s6z2);
        if (s6z.equals(s6z2)) {
            return 0;
        }
        int i = s6z.A04.A00;
        int i2 = s6z2.A04.A00;
        if (i == i2) {
            i = s6z.A00;
            i2 = s6z2.A00;
        }
        return i - i2;
    }
}
