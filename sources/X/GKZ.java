package X;

import com.instagram.common.session.UserSession;

public final class GKZ implements C296145pY {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public GKZ(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (X.GCI.A00(r13.A00) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.HFB AUW(java.lang.Object r14, java.lang.Object r15, java.lang.String r16) {
        /*
            r13 = this;
            X.4bN r14 = (X.C267324bN) r14
            r9 = r16
            X.DbY.A1S(r14, r9)
            boolean r0 = r14.CcK()
            if (r0 == 0) goto L_0x003f
            X.3OA r1 = r14.A06()
        L_0x0011:
            if (r1 == 0) goto L_0x004e
            java.lang.String r4 = r13.A01
            X.1Xj r2 = r1.A0K
            java.lang.String r5 = X.C51971G9r.A0r(r2)
            com.instagram.common.session.UserSession r1 = r13.A00
            java.lang.String r6 = X.C51973G9u.A0i(r14, r1)
            X.1Xj r0 = r14.A02
            java.lang.String r7 = X.C254373sN.A04(r1, r0)
            X.2pg r3 = X.C51972G9s.A0e(r2)
            X.0sn r10 = X.0sn.A00
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = r2.getId()
            if (r8 != 0) goto L_0x0039
            java.lang.String r8 = "n/a"
        L_0x0039:
            X.HFB r2 = new X.HFB
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L_0x003f:
            X.3OA r1 = r14.A07()
            if (r1 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r0 = r13.A00
            boolean r0 = X.GCI.A00(r0)
            if (r0 == 0) goto L_0x004e
            goto L_0x0011
        L_0x004e:
            java.lang.String r0 = "No valid ad found in the item model"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GKZ.AUW(java.lang.Object, java.lang.Object, java.lang.String):X.HFB");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass9JO AUV(Object obj) {
        return C51973G9u.A0I(obj);
    }
}
