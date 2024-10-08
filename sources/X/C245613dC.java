package X;

import java.util.Comparator;

/* renamed from: X.3dC  reason: invalid class name and case insensitive filesystem */
public final class C245613dC implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C245523d3 r4 = (C245523d3) obj;
        C245523d3 r5 = (C245523d3) obj2;
        int i = r4.A04.top;
        int i2 = r5.A04.top;
        if (i == i2 && (i = r4.A02) == (i2 = r5.A02)) {
            return 0;
        }
        if (i <= i2) {
            return -1;
        }
        return 1;
    }
}
