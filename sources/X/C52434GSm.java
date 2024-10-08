package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GSm  reason: case insensitive filesystem */
public final class C52434GSm implements C231802sQ {
    public final UserSession A00;

    public C52434GSm(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r6 = ((X.C296925qs) r8).A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean Esp(java.lang.Object r8) {
        /*
            r7 = this;
            X.5qt r8 = (X.C296935qt) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
            boolean r0 = r8 instanceof X.C296925qs
            java.lang.String r2 = "DiscoveryGridItemFilter"
            r3 = 0
            if (r0 == 0) goto L_0x0055
            r0 = r8
            X.5qs r0 = (X.C296925qs) r0
            X.5oy r6 = r0.A01
            int r1 = r6.A00
            if (r1 < 0) goto L_0x0020
            java.util.List r0 = r6.A02()
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0055
        L_0x0020:
            r5 = 4
            java.lang.String r4 = r6.A0A
            X.5j7 r0 = r6.A01()
            java.lang.String r3 = r0.toString()
            int r0 = r6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            java.util.List r0 = r6.A03(r0)
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r3, r1, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r5)
            java.lang.String r0 = "Clips Unit (%s, %s) has preview index (%s) out of Clips item bounds (%s)"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            X.0wb.A03(r2, r0)
            r3 = 0
            return r3
        L_0x0055:
            boolean r0 = r8 instanceof X.C296965qw
            if (r0 == 0) goto L_0x006b
            X.5qw r8 = (X.C296965qw) r8
            X.1Xj r0 = r8.BPf()
            if (r0 == 0) goto L_0x006b
            int r0 = r0.A00
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "MediaProvider was invalid"
            X.0wb.A03(r2, r0)
            return r3
        L_0x006b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52434GSm.Esp(java.lang.Object):boolean");
    }
}
