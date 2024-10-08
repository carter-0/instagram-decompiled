package X;

/* renamed from: X.8pf  reason: invalid class name and case insensitive filesystem */
public final class C366788pf extends 1P0 {
    public final /* synthetic */ AnonymousClass8BA A00;

    public C366788pf(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1032462765(0x3d8a21ad, float:0.067447044)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.8pd r15 = (X.C366768pd) r15
            r0 = 578130242(0x22759142, float:3.328059E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.8BA r3 = r14.A00
            boolean r0 = r3.A0d
            if (r0 == 0) goto L_0x010b
            X.8Ce r9 = r3.A1N
            r8 = 0
            X.0qQ.A0B(r15, r8)
            X.05G r7 = r9.A06
            X.8uP r11 = r15.A00
            if (r11 == 0) goto L_0x009b
            java.util.List r0 = r11.A03
            if (r0 == 0) goto L_0x0077
            java.util.Set r0 = X.00k.A0k(r0)
        L_0x002a:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.List r2 = r15.A03
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x007a
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x007a
            java.util.Iterator r13 = r2.iterator()
        L_0x0045:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r13.next()
            X.8u4 r1 = (X.C369238u4) r1
            java.util.List r1 = r1.A00()
            java.util.Iterator r12 = r1.iterator()
        L_0x0059:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0045
            java.lang.Object r10 = r12.next()
            X.6nz r10 = (X.C317876nz) r10
            java.lang.String r2 = r10.A0Z
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r6.get(r2)
            if (r1 != 0) goto L_0x0059
            r6.put(r2, r10)
            goto L_0x0059
        L_0x0077:
            X.0sl r0 = X.0sl.A00
            goto L_0x002a
        L_0x007a:
            java.util.List r0 = r11.A03
            if (r0 == 0) goto L_0x009b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0087:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L_0x0087
            r2.add(r0)
            goto L_0x0087
        L_0x009b:
            X.0sn r2 = X.0sn.A00
        L_0x009d:
            r7.Epw(r2)
            X.05G r1 = r9.A05
            X.8uP r0 = r15.A00
            if (r0 == 0) goto L_0x00e9
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r0.booleanValue()
        L_0x00ae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Epw(r0)
            r3.A0g = r8
            java.util.List r0 = r15.A03
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            if (r0 != 0) goto L_0x00eb
            java.util.List r0 = r15.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x00c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r2.next()
            X.8u4 r0 = (X.C369238u4) r0
            java.util.List r0 = r0.A00()
            java.util.Iterator r1 = r0.iterator()
        L_0x00d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r1.next()
            X.6nz r0 = (X.C317876nz) r0
            X.AnonymousClass8BA.A03(r0, r3)
            goto L_0x00d9
        L_0x00e9:
            r0 = 0
            goto L_0x00ae
        L_0x00eb:
            java.util.List r0 = r15.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x00f1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r1.next()
            X.6nz r0 = (X.C317876nz) r0
            X.AnonymousClass8BA.A03(r0, r3)
            goto L_0x00f1
        L_0x0101:
            android.app.Activity r1 = r3.A0n
            X.8vX r0 = new X.8vX
            r0.<init>(r15, r3)
            r1.runOnUiThread(r0)
        L_0x010b:
            r0 = -749665002(0xffffffffd3510516, float:-8.9773349E11)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1611293744(0x600a6430, float:3.9888593E19)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366788pf.onSuccessInBackground(java.lang.Object):void");
    }
}
