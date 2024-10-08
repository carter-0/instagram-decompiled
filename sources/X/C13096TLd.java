package X;

import java.util.Comparator;

/* renamed from: X.TLd  reason: case insensitive filesystem */
public final /* synthetic */ class C13096TLd implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C256383vg r4 = (C256383vg) obj;
        C256383vg r5 = (C256383vg) obj2;
        int i = r4.A00;
        int i2 = r5.A00;
        if (i == i2) {
            return r4.A02.compareTo(r5.A02);
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }
}
