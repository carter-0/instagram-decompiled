package X;

public final class GAY implements C250603lj {
    public final int A00;
    public final Object A01;

    public GAY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r0.Dyt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0151, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015c, code lost:
        r0.Dyu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r14, X.C252093oY r15) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0136;
                case 1: goto L_0x011e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Integer r1 = r15.CEk(r14)
            long r3 = r15.B0M(r14)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0015
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x015f
        L_0x0015:
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x015f
            java.lang.Object r4 = r13.A01
            X.GV5 r4 = (X.GV5) r4
            java.lang.Object r0 = r14.A04
            java.lang.Number r0 = (java.lang.Number) r0
            int r12 = r0.intValue()
            X.2rM r0 = r4.A04
            java.util.List r9 = r0.BQW()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x015f
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            com.instagram.common.session.UserSession r6 = r4.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36314442408987181(0x8103cb00010a2d, double:3.0287378337415614E-306)
            boolean r2 = X.182.A06(r7, r6, r0)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r11 = r12
        L_0x0050:
            int r0 = r12 + 2
            if (r11 >= r0) goto L_0x00a4
            int r0 = r9.size()
            int r0 = r0 + -1
            int r0 = java.lang.Math.min(r11, r0)
            java.lang.Object r10 = r9.get(r0)
            X.1Xj r10 = (X.1Xj) r10
            boolean r0 = r10.A5a()
            if (r0 == 0) goto L_0x007f
            java.util.Set r1 = r4.A06
            java.lang.String r0 = r10.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = r10.getId()
            r8.add(r0)
            if (r2 != 0) goto L_0x00a1
        L_0x007f:
            boolean r0 = r10.A4K()
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r10.A4c()
            if (r0 != 0) goto L_0x00a1
            java.util.Set r1 = r4.A05
            java.lang.String r0 = r10.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = r10.getId()
            r5.add(r0)
            r3.add(r10)
        L_0x00a1:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x00a4:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00c2
            java.util.Set r0 = r4.A06
            r0.addAll(r8)
            r0 = 0
            X.1OC r2 = X.C3724090s.A01(r6, r8, r2, r0)
            r1 = 14
            X.EDV r0 = new X.EDV
            r0.<init>(r1, r4, r8)
            r2.A00 = r0
            X.4D6 r0 = r4.A01
            r0.schedule(r2)
        L_0x00c2:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x015f
            r0 = 36328448297352547(0x81108800013d63, double:3.0375952139410046E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 != 0) goto L_0x015f
            java.util.Set r0 = r4.A05
            r0.addAll(r5)
            X.1NY r2 = new X.1NY
            r2.<init>(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A08(r0)
            java.lang.String r0 = "media/comment_infos/"
            r2.A0A(r0)
            java.lang.String r1 = ","
            X.3El r0 = new X.3El
            r0.<init>(r1)
            java.lang.String r1 = r0.A02(r5)
            java.lang.String r0 = "media_ids"
            r2.A9m(r0, r1)
            X.0Rd r0 = X.AnonymousClass4CM.A00(r6)
            boolean r1 = r0.A00()
            java.lang.String r0 = "can_support_carousel_mentions"
            r2.A0H(r0, r1)
            java.lang.Class<X.CFK> r1 = X.CFK.class
            java.lang.Class<X.B6j> r0 = X.C41911B6j.class
            r2.A0R(r1, r0)
            X.1OC r2 = r2.A0M()
            r1 = 10
            X.EDb r0 = new X.EDb
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r3, (java.lang.Object) r4)
            r2.A00 = r0
            X.4D6 r0 = r4.A01
            r0.schedule(r2)
            return
        L_0x011e:
            java.lang.Integer r0 = r15.CEk(r14)
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0131
            r0 = 2
            if (r1 != r0) goto L_0x015f
            java.lang.Object r0 = r13.A01
            X.MdB r0 = (X.C66819MdB) r0
            goto L_0x014e
        L_0x0131:
            java.lang.Object r0 = r13.A01
            X.MdB r0 = (X.C66819MdB) r0
            goto L_0x015c
        L_0x0136:
            java.lang.Integer r0 = r15.CEk(r14)
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0152
            r0 = 2
            if (r1 != r0) goto L_0x015f
            java.lang.Object r1 = r13.A01
            X.Mz5 r1 = (X.C68038Mz5) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MdB r0 = r1.A00
            if (r0 == 0) goto L_0x015f
        L_0x014e:
            r0.Dyt()
            return
        L_0x0152:
            java.lang.Object r1 = r13.A01
            X.Mz5 r1 = (X.C68038Mz5) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MdB r0 = r1.A00
            if (r0 == 0) goto L_0x015f
        L_0x015c:
            r0.Dyu()
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAY.ATF(X.30Y, X.3oY):void");
    }
}
