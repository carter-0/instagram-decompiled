package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3VN  reason: invalid class name */
public final class AnonymousClass3VN implements C231802sQ {
    public final UserSession A00;
    public final UserSession A01;
    public final String A02;

    public AnonymousClass3VN(UserSession userSession, String str) {
        0qQ.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = userSession;
        this.A02 = str;
    }

    public static boolean A00(UserSession userSession, 1Xg r4) {
        1Xj A022;
        if (r4.A06.ordinal() != 1 || ((A022 = 1Xi.A02(r4.A05)) != null && A022.A00 == 0 && !1sd.A00(userSession).A05(A022) && A022.A1u() == 1sw.A05)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r1.equals(r0) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r0.A64() != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean Esp(java.lang.Object r8) {
        /*
            r7 = this;
            X.1Xg r8 = (X.1Xg) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "feed_contextual_self_profile"
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 == 0) goto L_0x002c
            X.1Xn r1 = r8.A05
            X.1Xj r0 = X.1Xi.A02(r1)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.A5G()
            if (r0 != r3) goto L_0x002c
            X.1Xj r0 = X.1Xi.A02(r1)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.A64()
            r6 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            com.instagram.common.session.UserSession r5 = r7.A01
            X.1Av r4 = X.1Au.A00(r5)
            X.0s0 r2 = r4.A5v
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 390(0x186, float:5.47E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006b
            X.1Av r0 = X.1Au.A00(r5)
            java.lang.String r2 = "injected_post_to_feed_id"
            java.lang.String r1 = ""
            X.0xa r0 = r0.A01
            java.lang.String r1 = r0.getString(r2, r1)
            X.0qQ.A07(r1)
            X.1Xn r0 = r8.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = r0.A2n()
        L_0x0064:
            boolean r0 = r1.equals(r0)
            r4 = 1
            if (r0 != 0) goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            X.1UQ r1 = r8.A06
            X.1UQ r0 = X.1UQ.A0j
            if (r1 == r0) goto L_0x0086
            X.1UQ r0 = X.1UQ.A0E
            if (r1 == r0) goto L_0x0086
            X.1UQ r0 = X.1UQ.A0F
            if (r1 == r0) goto L_0x0086
            X.1UQ r0 = X.1UQ.A0D
            if (r1 == r0) goto L_0x0086
            X.1Xn r0 = r8.A05
            boolean r0 = r0 instanceof X.1Xl
            if (r0 == 0) goto L_0x00b2
            if (r6 != 0) goto L_0x00b2
        L_0x0086:
            r2 = 1
        L_0x0087:
            int r0 = r1.ordinal()
            if (r0 != r3) goto L_0x00ad
            X.1Xn r0 = r8.A05
            X.1Xj r1 = X.1Xi.A02(r0)
            if (r1 == 0) goto L_0x00b6
            int r0 = r1.A00
            if (r0 != 0) goto L_0x00b6
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1se r0 = X.1sd.A00(r0)
            boolean r0 = r0.A05(r1)
            if (r0 != 0) goto L_0x00b6
            X.1sw r1 = r1.A1u()
            X.1sw r0 = X.1sw.A05
            if (r1 != r0) goto L_0x00b6
        L_0x00ad:
            if (r2 == 0) goto L_0x00b6
            if (r4 != 0) goto L_0x00b6
            return r3
        L_0x00b2:
            r2 = 0
            goto L_0x0087
        L_0x00b4:
            r0 = 0
            goto L_0x0064
        L_0x00b6:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VN.Esp(java.lang.Object):boolean");
    }
}
