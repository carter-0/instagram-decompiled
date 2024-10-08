package X;

import java.util.Comparator;

/* renamed from: X.TLq  reason: case insensitive filesystem */
public final class C13107TLq implements Comparator {
    public static final C13107TLq A00 = new Object();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C11284SJc sJc = (C11284SJc) obj;
        C11284SJc sJc2 = (C11284SJc) obj2;
        AnonymousClass7TG.A1N(sJc, sJc2);
        if (sJc.equals(sJc2)) {
            return 0;
        }
        int i = sJc.A04.A00;
        int i2 = sJc2.A04.A00;
        if (i != i2) {
            return i - i2;
        }
        if (sJc.A03 - sJc2.A03 > 0) {
            return 1;
        }
        return -1;
    }
}
