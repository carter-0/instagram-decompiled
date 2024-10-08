package X;

/* renamed from: X.Oyp  reason: case insensitive filesystem */
public final class C72221Oyp implements 1NU {
    public final int A00;
    public final Object A01;

    public C72221Oyp(AnonymousClass3Q2 r1, int i) {
        this.A00 = i;
        switch (i) {
            case 2:
            case 5:
                this.A01 = r1;
                return;
            default:
                this.A01 = r1;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r0.A2k = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x009a;
                case 2: goto L_0x0033;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x001a;
                case 6: goto L_0x004c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A01
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.1GK r6 = (X.1GK) r6
            java.lang.Object r2 = r6.A07()
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L_0x0019
            java.lang.String r0 = r2.getAbsolutePath()
            r1.A2k = r0
        L_0x0019:
            return r2
        L_0x001a:
            X.1GK r6 = (X.1GK) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r6.A07()
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L_0x0019
            java.lang.String r1 = r2.getAbsolutePath()
            java.lang.Object r0 = r5.A01
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            if (r0 == 0) goto L_0x0019
            goto L_0x0049
        L_0x0033:
            X.1GK r6 = (X.1GK) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r6.A07()
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L_0x0019
            java.lang.String r1 = r2.getAbsolutePath()
            java.lang.Object r0 = r5.A01
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
        L_0x0049:
            r0.A2k = r1
            return r2
        L_0x004c:
            X.1GK r6 = (X.1GK) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r0 = r6.A0B()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r5.A01
            X.O5t r0 = (X.C70416O5t) r0
            X.1O9 r1 = new X.1O9
            r1.<init>()
            r1.A00()
            X.1GK r0 = r0.A00
            r0.A08(r1)
        L_0x0069:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x006c:
            boolean r1 = r6.A0D()
            java.lang.String r2 = "Required value was null."
            java.lang.Object r0 = r5.A01
            X.O5t r0 = (X.C70416O5t) r0
            if (r1 == 0) goto L_0x0084
            java.lang.Exception r1 = r6.A06()
            if (r1 == 0) goto L_0x0090
            X.1GK r0 = r0.A00
            r0.A09(r1)
            goto L_0x0069
        L_0x0084:
            java.lang.Object r1 = r6.A07()
            if (r1 == 0) goto L_0x0095
            X.1GK r0 = r0.A00
            r0.A0A(r1)
            goto L_0x0069
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x009a:
            java.lang.Object r0 = r5.A01
            X.OTS r0 = (X.OTS) r0
            java.util.concurrent.CountDownLatch r0 = r0.A01
            r0.countDown()
            r2 = 0
            return r2
        L_0x00a5:
            X.3JC r6 = (X.AnonymousClass3JC) r6
            r4 = 0
            X.0qQ.A0B(r6, r4)
            java.lang.Object r3 = r6.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x00eb
            java.lang.Class<X.B5g> r2 = X.C41887B5g.class
            r0 = 1016(0x3f8, float:1.424E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 352468645(0x15023ea5, float:2.630271E-26)
            X.3lr r2 = r3.getRequiredTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L_0x00eb
            java.lang.Class<X.B5i> r1 = X.B5i.class
            r0 = -2107973840(0xffffffff825adf30, float:-1.6080162E-37)
            X.3lr r1 = r2.reinterpretRequired(r4, r1, r0)
            X.B5i r1 = (X.B5i) r1
            if (r1 == 0) goto L_0x00eb
            java.lang.Object r0 = r5.A01
            X.LOW r0 = (X.LOW) r0
            com.instagram.common.session.UserSession r2 = r0.A03
            X.1E5 r0 = X.1E4.A00(r2)
            X.B5h r0 = r1.A0E(r0)
            X.XEJ r1 = r0.A0q()
            X.1E5 r0 = X.1E4.A00(r2)
            X.Xzo r2 = new X.Xzo
            r2.<init>(r0, r1)
            return r2
        L_0x00eb:
            r0 = 1259(0x4eb, float:1.764E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72221Oyp.then(java.lang.Object):java.lang.Object");
    }

    public C72221Oyp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
