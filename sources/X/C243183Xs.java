package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Xs  reason: invalid class name and case insensitive filesystem */
public final class C243183Xs {
    public static final boolean A00(UserSession userSession, 1Xj r2, String str) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(str, 2);
        if (!r2.A5G() || new 0rQ(userSession).A03(r2, str) != AnonymousClass4K5.UP_NEXT_OVERLAY) {
            return false;
        }
        return true;
    }

    public final boolean A01(UserSession userSession, 1Xj r4, AnonymousClass3W1 r5, String str) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(str, 3);
        if (A02(userSession, r4, str) || A00(userSession, r4, str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r3 == 3) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(com.instagram.common.session.UserSession r7, X.1Xj r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 3
            X.0qQ.A0B(r9, r0)
            boolean r0 = A00(r7, r8, r9)
            r5 = 1
            if (r0 != 0) goto L_0x002e
            boolean r0 = r8.A5G()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r8.A55()
            if (r0 != 0) goto L_0x0030
            X.0Tu r2 = X.0Tu.A05
            r0 = 36611087210125517(0x821197000018cd, double:3.2163372004741824E-306)
            long r3 = X.182.A01(r2, r7, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x0030
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            return r5
        L_0x0030:
            java.lang.String r0 = "feed_ad_preview"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x002e
            boolean r0 = r8.A5I()
            if (r0 != 0) goto L_0x002f
            boolean r0 = r8.A5G()
            if (r0 != 0) goto L_0x002f
            boolean r0 = X.C231122qu.A0T(r7, r8)
            if (r0 == 0) goto L_0x002e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243183Xs.A02(com.instagram.common.session.UserSession, X.1Xj, java.lang.String):boolean");
    }
}
