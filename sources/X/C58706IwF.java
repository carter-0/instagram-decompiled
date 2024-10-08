package X;

/* renamed from: X.IwF  reason: case insensitive filesystem */
public final class C58706IwF extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58706IwF(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C58706IwF A00(C286575Wy r1, Object obj, int i) {
        C58706IwF iwF = new C58706IwF(obj, i);
        r1.FLL(iwF);
        return iwF;
    }

    public static C58706IwF A01(Object obj, int i) {
        return new C58706IwF(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ff, code lost:
        return new X.C52369GPq(r2, X.DbS.A0t(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0175, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e7, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0008;
                case 1: goto L_0x0037;
                case 2: goto L_0x0037;
                case 3: goto L_0x003e;
                case 4: goto L_0x0046;
                case 5: goto L_0x0054;
                case 6: goto L_0x0078;
                case 7: goto L_0x00af;
                case 8: goto L_0x0005;
                case 9: goto L_0x00c0;
                case 10: goto L_0x00c7;
                case 11: goto L_0x00ce;
                case 12: goto L_0x00ea;
                case 13: goto L_0x0100;
                case 14: goto L_0x0123;
                case 15: goto L_0x0144;
                case 16: goto L_0x00af;
                case 17: goto L_0x0005;
                case 18: goto L_0x00c0;
                case 19: goto L_0x00c7;
                case 20: goto L_0x014d;
                case 21: goto L_0x0037;
                case 22: goto L_0x0169;
                case 23: goto L_0x0037;
                case 24: goto L_0x0005;
                case 25: goto L_0x00c0;
                case 26: goto L_0x00c7;
                case 27: goto L_0x0176;
                case 28: goto L_0x0037;
                case 29: goto L_0x018c;
                case 30: goto L_0x01a8;
                case 31: goto L_0x0005;
                case 32: goto L_0x00c0;
                case 33: goto L_0x00c7;
                case 34: goto L_0x01af;
                case 35: goto L_0x0037;
                case 36: goto L_0x01a8;
                case 37: goto L_0x01c1;
                case 38: goto L_0x0037;
                case 39: goto L_0x01dd;
                case 40: goto L_0x01e8;
                case 41: goto L_0x0005;
                case 42: goto L_0x00c0;
                case 43: goto L_0x00c7;
                case 44: goto L_0x01f9;
                case 45: goto L_0x0005;
                case 46: goto L_0x00c0;
                case 47: goto L_0x00c7;
                case 48: goto L_0x020f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r7.A01
            return r3
        L_0x0008:
            java.lang.Object r1 = r7.A01
            X.H0U r1 = (X.H0U) r1
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            X.0eM r0 = r1.A08
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r3 = r1.A05
            java.lang.String r2 = X.DbS.A0t(r3)
            X.0eM r0 = r1.A02
            java.lang.String r1 = X.DbS.A0t(r0)
            X.H6K r0 = new X.H6K
            r0.<init>(r4, r2, r1)
            X.2YN r2 = new X.2YN
            r2.<init>(r0, r5)
            java.lang.String r1 = X.DbS.A0t(r3)
            java.lang.Class<X.H2d> r0 = X.C54183H2d.class
            X.2YL r3 = r2.A01(r0, r1)
            return r3
        L_0x0037:
            java.lang.Object r0 = r7.A01
            X.DbS.A1U(r0)
            goto L_0x01e5
        L_0x003e:
            java.lang.Object r0 = r7.A01
            int r0 = X.DbS.A05(r0)
            goto L_0x0171
        L_0x0046:
            java.lang.Object r1 = r7.A01
            X.Gzs r1 = (X.C54123Gzs) r1
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A03
            goto L_0x00f6
        L_0x0054:
            java.lang.Object r3 = r7.A01
            X.Gzs r3 = (X.C54123Gzs) r3
            X.0eM r0 = r3.A01
            java.lang.Object r2 = r0.getValue()
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0C
            java.lang.String r0 = r2.A00
            X.C52369GPq.A02(r1, r2, r0)
            X.H0G r0 = r3.A00
            if (r0 == 0) goto L_0x0073
            r1 = 0
            X.GhL r0 = X.G9w.A0Y(r0)
            r0.A01(r1)
        L_0x0073:
            X.DbZ.A15(r3)
            goto L_0x01e5
        L_0x0078:
            java.lang.Object r6 = r7.A01
            X.Gzs r6 = (X.C54123Gzs) r6
            X.0eM r0 = r6.A01
            java.lang.Object r2 = r0.getValue()
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0A
            java.lang.String r0 = r2.A00
            X.C52369GPq.A02(r1, r2, r0)
            X.H0G r0 = r6.A00
            if (r0 == 0) goto L_0x00aa
            X.GhL r0 = X.G9w.A0Y(r0)
            X.05G r5 = r0.A0A
        L_0x0095:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.GnI r3 = (X.C53386GnI) r3
            r2 = 0
            r1 = 1
            r0 = 24575(0x5fff, float:3.4437E-41)
            X.GnI r0 = X.C53386GnI.A00((com.instagram.common.typedurl.ImageUrl) null, r2, r3, (X.C255943uy) null, (java.lang.String) null, (java.lang.String) null, r0, false, false, false, r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0095
        L_0x00aa:
            X.DbZ.A15(r6)
            goto L_0x01e5
        L_0x00af:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131165185(0x7f070001, float:1.794458E38)
            int r0 = r1.getDimensionPixelSize(r0)
            goto L_0x0171
        L_0x00c0:
            java.lang.Object r0 = r7.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x00c7:
            java.lang.Object r0 = r7.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x00ce:
            java.lang.Object r3 = r7.A01
            X.Gzs r3 = (X.C54123Gzs) r3
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A02
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A03
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H6M r3 = new X.H6M
            r3.<init>(r2, r1, r0)
            return r3
        L_0x00ea:
            java.lang.Object r1 = r7.A01
            X.H0G r1 = (X.H0G) r1
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A02
        L_0x00f6:
            java.lang.String r0 = X.DbS.A0t(r0)
            X.GPq r3 = new X.GPq
            r3.<init>(r2, r0)
            return r3
        L_0x0100:
            java.lang.Object r0 = r7.A01
            X.H0G r0 = (X.H0G) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A04
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.6Yo r1 = X.DbS.A0M(r2, r1)
            X.H1z r0 = new X.H1z
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            goto L_0x01e5
        L_0x0123:
            java.lang.Object r0 = r7.A01
            X.H0G r0 = (X.H0G) r0
            X.GhL r0 = X.G9w.A0Y(r0)
            X.05G r5 = r0.A0A
        L_0x012d:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.GnI r3 = (X.C53386GnI) r3
            r2 = 0
            r1 = 0
            r0 = 24575(0x5fff, float:3.4437E-41)
            X.GnI r0 = X.C53386GnI.A00((com.instagram.common.typedurl.ImageUrl) null, r1, r3, (X.C255943uy) null, (java.lang.String) null, (java.lang.String) null, r0, false, false, false, r2)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x012d
            goto L_0x01e5
        L_0x0144:
            java.lang.Object r0 = r7.A01
            X.H0G r0 = (X.H0G) r0
            X.H0G.A00(r0)
            goto L_0x01e5
        L_0x014d:
            java.lang.Object r3 = r7.A01
            X.H0G r3 = (X.H0G) r3
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A01
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A02
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H6M r3 = new X.H6M
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0169:
            java.lang.Object r0 = r7.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            int r0 = r0.A00()
        L_0x0171:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x0176:
            java.lang.Object r2 = r7.A01
            X.H0O r2 = (X.H0O) r2
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A00
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H60 r3 = new X.H60
            r3.<init>(r1, r0)
            return r3
        L_0x018c:
            java.lang.Object r3 = r7.A01
            X.Gzn r3 = (X.C54118Gzn) r3
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A02
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A01
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H6L r3 = new X.H6L
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01a8:
            java.lang.Object r0 = r7.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x01af:
            java.lang.Object r2 = r7.A01
            X.Gzn r2 = (X.C54118Gzn) r2
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r0 = r2.mArguments
            X.H61 r3 = new X.H61
            r3.<init>(r0, r1)
            return r3
        L_0x01c1:
            java.lang.Object r3 = r7.A01
            X.GzX r3 = (X.C54102GzX) r3
            X.0eM r0 = r3.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A01
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A00
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H6L r3 = new X.H6L
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01dd:
            java.lang.Object r1 = r7.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
            r1.invoke(r0)
        L_0x01e5:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x01e8:
            java.lang.Object r0 = r7.A01
            X.Gzj r0 = (X.C54114Gzj) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.GPq r3 = new X.GPq
            r3.<init>(r1, r0)
            return r3
        L_0x01f9:
            java.lang.Object r2 = r7.A01
            X.Gzj r2 = (X.C54114Gzj) r2
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A01
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H62 r3 = new X.H62
            r3.<init>(r1, r0)
            return r3
        L_0x020f:
            java.lang.Object r0 = r7.A01
            X.K4q r0 = (X.C61372K4q) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5e r3 = new X.H5e
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58706IwF.invoke():java.lang.Object");
    }
}
