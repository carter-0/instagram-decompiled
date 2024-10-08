package X;

import java.util.Comparator;

/* renamed from: X.3dD  reason: invalid class name and case insensitive filesystem */
public final class C245623dD implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C245523d3 r4 = (C245523d3) obj;
        C245523d3 r5 = (C245523d3) obj2;
        int i = r4.A04.bottom;
        int i2 = r5.A04.bottom;
        if (i == i2) {
            int i3 = r4.A02;
            int i4 = r5.A02;
            if (i3 == i4) {
                return 0;
            }
            if (i3 < i4) {
                return 1;
            }
            return -1;
        } else if (i > i2) {
            return 1;
        } else {
            return -1;
        }
    }
}
