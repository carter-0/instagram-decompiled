package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6r5  reason: invalid class name and case insensitive filesystem */
public abstract class C319716r5 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (X.182.A06(X.0Tu.A06, r5, 36329410369962087L) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(com.instagram.common.session.UserSession r5) {
        /*
            X.1Av r4 = X.1Au.A00(r5)
            X.0s0 r1 = r4.A2Z
            X.0YZ[] r3 = X.1Av.A8a
            r0 = 224(0xe0, float:3.14E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002c
            boolean r0 = X.AnonymousClass5IJ.A00(r5)
            if (r0 == 0) goto L_0x002c
            X.0Tu r2 = X.0Tu.A06
            r0 = 36329410369962087(0x81116800004067, double:3.038203632533233E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r2 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            X.0s0 r1 = r4.A2a
            r0 = 225(0xe1, float:3.15E-43)
            r0 = r3[r0]
            r1.CDM(r4, r0)
            if (r2 == 0) goto L_0x0040
            r0 = 2131958730(0x7f131bca, float:1.955408E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0040:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319716r5.A00(com.instagram.common.session.UserSession):java.lang.Integer");
    }

    public static final void A01(UserSession userSession) {
        1Av A00 = 1Au.A00(userSession);
        0s0 r2 = A00.A2Z;
        AnonymousClass0YZ[] r5 = 1Av.A8a;
        if (((Boolean) r2.CDM(A00, r5[224])).booleanValue() || !AnonymousClass5IJ.A00(userSession)) {
            A00.A2a.CDM(A00, r5[225]);
        } else {
            r2.Epx(A00, true, r5[224]);
        }
        A00.A5c.Epx(A00, true, r5[223]);
    }
}
