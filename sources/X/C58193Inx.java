package X;

/* renamed from: X.Inx  reason: case insensitive filesystem */
public final class C58193Inx extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58193Inx(long j, Object obj, Object obj2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r4 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0055;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r14.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r14.A02
            android.content.Context r4 = (android.content.Context) r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            long r0 = r14.A01
            long r2 = r2.toMillis(r0)
            X.L70 r1 = new X.L70
            r1.<init>(r2)
            X.HDw r0 = new X.HDw
            r0.<init>(r4, r5, r1)
            return r0
        L_0x0020:
            java.lang.Object r0 = r14.A03
            X.5SI r0 = (X.AnonymousClass5SI) r0
            X.5R6 r0 = r0.A0I
            boolean r2 = X.C289045cv.A00(r0)
            X.5RP r0 = r0.A0W
            X.4cg r1 = r0.A04
            X.4cg r0 = r1.A07
            if (r2 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x003e
            X.6GP r0 = r0.A0Z()
        L_0x0038:
            if (r0 == 0) goto L_0x003e
            X.4cl r4 = r0.A05
            if (r4 != 0) goto L_0x0047
        L_0x003e:
            java.lang.Object r0 = r14.A02
            X.4co r0 = (X.C268124co) r0
            X.4cm r4 = new X.4cm
            r4.<init>(r0)
        L_0x0047:
            long r2 = r14.A01
            X.6GP r1 = r1.A0Z()
            X.0qQ.A0A(r1)
            r0 = 0
            r4.A06(r1, r0, r2)
            goto L_0x00b8
        L_0x0055:
            long r1 = r14.A01
            java.lang.Object r6 = r14.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r12 = r14.A03
            X.0lg r12 = (X.0lg) r12
            java.lang.String r13 = "TextPostAppPostTransparencyLabel"
            r10 = 0
            boolean r11 = X.AnonymousClass7TF.A1U(r10, r6, r12)
            r5 = 0
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            r7 = 2
            java.util.BitSet r3 = X.DbS.A0w(r7)
            r0 = 760(0x2f8, float:1.065E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.put(r0, r13)
            r3.set(r10)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = "target_user_id"
            r9.put(r0, r1)
            r3.set(r11)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r12)
            java.lang.String r1 = "com.bloks.www.text_post_app.about_this_profile_bottom_sheet"
            r2.A0R = r1
            int r0 = r3.nextClearBit(r10)
            if (r0 < r7) goto L_0x00bb
            java.util.HashMap r0 = X.C359608dC.A01(r9)
            X.DiU r1 = X.C46649DiU.A06(r1, r0, r8)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r5
            r1.A02 = r5
            r1.A04 = r5
            r1.A0H(r4)
            r1.A0E(r6, r2)
        L_0x00b8:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58193Inx.invoke():java.lang.Object");
    }
}
