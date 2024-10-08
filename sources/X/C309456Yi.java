package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Yi  reason: invalid class name and case insensitive filesystem */
public abstract class C309456Yi {
    public static final void A01(UserSession userSession, C250973mM r8, int i) {
        C255773uh A08 = r8.A08(userSession);
        if (!A02(r8) && C297785sK.A0i(A08, r8) && i > 1) {
            ArrayList arrayList = new ArrayList();
            1Xj r4 = A08.A0b;
            r4.getClass();
            double min = Math.min(C297785sK.A00(r4) - 1.0d, r4.A0k() / ((double) i));
            double d = 0.0d;
            int i2 = 0;
            do {
                arrayList.add(Double.valueOf(d));
                d += min;
                i2++;
            } while (i2 < i);
            r8.A0H.A17 = arrayList;
            A08.A0M = arrayList;
        }
    }

    public static final long A00(C250973mM r9, long j) {
        List list = r9.A0H.A17;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int A01 = r9.A01();
        if (A01 < list.size()) {
            long doubleValue = (long) (((Number) list.get(A01)).doubleValue() * 1000.0d);
            if (A01 != list.size() - 1) {
                j = (long) (((Number) list.get(A01 + 1)).doubleValue() * 1000.0d);
            }
            return j - doubleValue;
        }
        throw new IllegalStateException("Out of bounds video to carousel index");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.C250973mM r1) {
        /*
            com.instagram.model.reels.Reel r0 = r1.A0H
            java.util.List r0 = r0.A17
            if (r0 == 0) goto L_0x000d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309456Yi.A02(X.3mM):boolean");
    }

    public static final boolean A03(C250973mM r4) {
        List list = r4.A0H.A17;
        if (list == null || list.isEmpty() || list.size() - 1 != r4.A01()) {
            return false;
        }
        return true;
    }
}
