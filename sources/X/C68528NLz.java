package X;

/* renamed from: X.NLz  reason: case insensitive filesystem */
public final class C68528NLz extends 1P0 {
    public final /* synthetic */ 2b4 A00;
    public final /* synthetic */ boolean A01;

    public C68528NLz(2b4 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(243740891);
        if (this.A01) {
            2b4 r4 = this.A00;
            2b4.A02(r4, ((long) r4.A08.C82().A01) * 1000);
        }
        AnonymousClass0fD.A0A(541517758, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = -308138412(0xffffffffeda22e54, float:-6.2740724E27)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.3JC r12 = (X.AnonymousClass3JC) r12
            r0 = 45045563(0x2af573b, float:2.5764007E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r8 = r12.A01
            if (r8 == 0) goto L_0x00b7
            X.3FZ r8 = (X.AnonymousClass3FZ) r8
            java.lang.Class<X.N1o> r4 = X.C68125N1o.class
            java.lang.String r3 = "viewer"
            X.3FZ r0 = r8.A00(r4, r3)
            if (r0 == 0) goto L_0x00b7
            X.3FZ r0 = r8.A00(r4, r3)
            java.lang.Class<X.N1n> r2 = X.N1n.class
            java.lang.String r1 = "zero_cms_native"
            X.3FZ r0 = r0.A00(r2, r1)
            if (r0 == 0) goto L_0x00b7
            X.2b4 r7 = r11.A00
            X.3FZ r0 = r8.A00(r4, r3)
            X.3FZ r2 = r0.A00(r2, r1)
            X.3kW r0 = r7.A08
            X.1R7 r0 = r0.C82()
            int r0 = r0.A00
            r7.A00 = r0
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = r0.toString()
            r7.A04 = r0
            java.lang.String r0 = "hash_code"
            java.lang.String r0 = r2.A05(r0)
            r7.A02 = r0
            java.lang.Class<X.N1m> r1 = X.C68124N1m.class
            java.lang.String r0 = "cms_pairs"
            com.google.common.collect.ImmutableList r0 = r2.A02(r0, r1)
            X.3kN r4 = r0.listIterator()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
        L_0x0064:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r2 = r4.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            java.lang.String r0 = "text_key"
            java.lang.String r1 = r2.A05(r0)
            java.lang.String r0 = "content"
            java.lang.String r0 = r2.A05(r0)
            r3.put(r1, r0)
            goto L_0x0064
        L_0x0080:
            r7.A05 = r3
            X.4da r1 = new X.4da
            r1.<init>()
            java.util.Map r0 = r7.A05     // Catch:{ 1bF -> 0x00c1 }
            java.lang.String r10 = r1.A0F(r0)     // Catch:{ 1bF -> 0x00c1 }
            X.1Av r9 = r7.A0A     // Catch:{ 1bF -> 0x00c1 }
            int r1 = r7.A00     // Catch:{ 1bF -> 0x00c1 }
            X.0xa r8 = r9.A01     // Catch:{ 1bF -> 0x00c1 }
            X.0xY r0 = r8.AR4()     // Catch:{ 1bF -> 0x00c1 }
            java.lang.String r4 = "cms_client_hash"
            r0.E5Z(r4, r1)     // Catch:{ 1bF -> 0x00c1 }
            r0.apply()     // Catch:{ 1bF -> 0x00c1 }
            java.lang.String r3 = r7.A04     // Catch:{ 1bF -> 0x00c1 }
            X.0s0 r1 = r9.A8Z     // Catch:{ 1bF -> 0x00c1 }
            X.0YZ[] r2 = X.1Av.A8a     // Catch:{ 1bF -> 0x00c1 }
            r0 = 179(0xb3, float:2.51E-43)
            X.DbS.A1a(r9, r3, r1, r2, r0)     // Catch:{ 1bF -> 0x00c1 }
            java.lang.String r0 = r7.A02     // Catch:{ 1bF -> 0x00c1 }
            X.DbX.A1U(r8, r4, r0)     // Catch:{ 1bF -> 0x00c1 }
            X.0s0 r1 = r9.A8Y     // Catch:{ 1bF -> 0x00c1 }
            r0 = 180(0xb4, float:2.52E-43)
            X.DbS.A1a(r9, r10, r1, r2, r0)     // Catch:{ 1bF -> 0x00c1 }
            goto L_0x00c9
        L_0x00b7:
            X.2b4 r7 = r11.A00
            java.lang.String r1 = "ZeroCmsAPIUtil"
            java.lang.String r0 = "zero cms native object is null because we haven't changed since last time"
            X.0wb.A03(r1, r0)
            goto L_0x00c9
        L_0x00c1:
            r2 = move-exception
            java.lang.String r1 = "ZeroCmsAPIUtil"
            java.lang.String r0 = "Error while serializing cms data"
            X.0wb.A06(r1, r0, r2)
        L_0x00c9:
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00dc
            X.3kW r0 = r7.A08
            X.1R7 r0 = r0.C82()
            int r0 = r0.A01
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            X.2b4.A02(r7, r0)
        L_0x00dc:
            r0 = 1651584834(0x62712f42, float:1.11226765E21)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1694363015(0xffffffff9b021279, float:-1.0759317E-22)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68528NLz.onSuccess(java.lang.Object):void");
    }
}
