package X;

public final class FR9 implements AnonymousClass08u {
    public final int A00;
    public final Object A01;

    public final void onPageScrollStateChanged(int i) {
    }

    public FR9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onPageScrolled(int i, float f, int i2) {
        if (2 - this.A00 == 0) {
            ((C16294UsC) this.A01).A00.get(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (r1 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ac, code lost:
        if (r1 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
        r2.AAJ(X.Dbm.A00(), r1);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00af;
                case 1: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A01
            X.UsC r2 = (X.C16294UsC) r2
            java.util.List r0 = r2.A00
            java.lang.Object r1 = r0.get(r6)
            X.XBP r0 = r2.A01
            r0.DqK(r1)
            r2.A03(r1)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r2 = r5.A01
            X.E5V r2 = (X.E5V) r2
            X.0eM r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.Dkf r0 = (X.C46752Dkf) r0
            X.17i r1 = r0.A00
            java.lang.String r0 = r0.A01
            com.instagram.user.model.User r4 = r1.A02(r0)
            if (r4 == 0) goto L_0x0017
            X.EVo[] r0 = X.C48096EVo.values()
            r0 = r0[r6]
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x007b
            r0 = 1
            if (r1 != r0) goto L_0x00ba
            X.0eM r0 = r2.A03
            java.lang.Object r3 = r0.getValue()
            X.6ud r3 = (X.C321716ud) r3
            X.0wc r1 = r3.A01
            java.lang.String r0 = "instagram_ibc_profile_actions"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0017
            X.C321716ud.A03(r3)
            X.Dbb.A1C(r2)
            java.lang.String r1 = "channel_link_bottom_sheet"
            java.lang.String r0 = "source"
            X.Dba.A1B(r2, r0, r1)
            r0 = 3504(0xdb0, float:4.91E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dbc.A0a(r2, r3, r4, r0)
            X.Dba.A18(r2)
            java.lang.String r1 = r3.A00
            if (r1 != 0) goto L_0x00bf
        L_0x0071:
            java.lang.String r0 = "sessionId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007b:
            X.0eM r0 = r2.A03
            java.lang.Object r3 = r0.getValue()
            X.6ud r3 = (X.C321716ud) r3
            X.0wc r1 = r3.A01
            java.lang.String r0 = "instagram_ibc_profile_actions"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0017
            X.C321716ud.A03(r3)
            X.Dbb.A1C(r2)
            java.lang.String r1 = "channel_link_bottom_sheet"
            java.lang.String r0 = "source"
            X.Dba.A1B(r2, r0, r1)
            r0 = 544(0x220, float:7.62E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dbc.A0a(r2, r3, r4, r0)
            X.Dba.A18(r2)
            java.lang.String r1 = r3.A00
            if (r1 != 0) goto L_0x00bf
            goto L_0x0071
        L_0x00af:
            java.lang.Object r0 = r5.A01
            X.K7k r0 = (X.C61435K7k) r0
            X.JfQ r0 = r0.A00
            if (r0 == 0) goto L_0x0017
            r0.A00 = r6
            return
        L_0x00ba:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bf:
            java.lang.String r0 = X.Dbm.A00()
            r2.AAJ(r0, r1)
            r2.Cgf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FR9.onPageSelected(int):void");
    }
}
