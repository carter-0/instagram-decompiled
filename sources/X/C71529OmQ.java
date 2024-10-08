package X;

/* renamed from: X.OmQ  reason: case insensitive filesystem */
public final class C71529OmQ implements C74290PsI {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71529OmQ(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        r2.markerEnd(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        r4.markerEnd(r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        r0 = 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void run(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x00cb;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            X.OW0 r8 = (X.OW0) r8
            if (r8 != 0) goto L_0x0023
            java.lang.Object r3 = r7.A04
            X.OYu r3 = (X.C71019OYu) r3
            java.lang.Object r2 = r7.A03
            X.ObS r2 = (X.C71087ObS) r2
            int r1 = r7.A01
            X.Nk3 r0 = X.C69363Nk3.A0G
            X.C71019OYu.A01(r3, r0, r2, r1)
            java.lang.Object r1 = r7.A02
            X.OWR r1 = (X.OWR) r1
            java.lang.String r0 = "MISSING_RESULT"
            r1.A01(r0)
            return
        L_0x0023:
            java.lang.Object r2 = r7.A03
            X.ObS r2 = (X.C71087ObS) r2
            java.lang.Object r1 = r7.A04
            X.OYu r1 = (X.C71019OYu) r1
            X.OW0 r0 = X.C71019OYu.A00(r8)
            r2.A05(r0)
            X.Nk3 r5 = r8.A00
            X.Nk3 r0 = X.C69363Nk3.A0A
            if (r5 != r0) goto L_0x0054
            X.OML r0 = r1.A01
            int r2 = r7.A01
            com.facebook.quicklog.QuickPerformanceLogger r1 = r0.A00
            r0 = 178991798(0xaab32b6, float:1.6485776E-32)
            r3 = 2
            r1.markerEnd(r0, r2, r3)
            java.lang.Object r0 = r7.A02
            X.OWR r0 = (X.OWR) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r0.A01
            r1 = 1021649468(0x3ce5223c, float:0.027970426)
            int r0 = r0.A00
        L_0x0050:
            r2.markerEnd(r1, r0, r3)
            return
        L_0x0054:
            X.OML r6 = r1.A01
            int r4 = r7.A01
            if (r5 == 0) goto L_0x01b0
            java.lang.Number r0 = r5.A00
            if (r0 == 0) goto L_0x01b0
        L_0x005e:
            int r0 = r0.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Number r0 = r8.A03
            r2 = 0
            if (r0 == 0) goto L_0x01ad
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0073:
            java.lang.Number r0 = r8.A02
            if (r0 == 0) goto L_0x007b
            java.lang.Long r2 = X.C51968G9o.A0v(r0)
        L_0x007b:
            r6.A01(r3, r1, r2, r4)
            X.Nk3 r0 = X.C69363Nk3.A0E
            if (r5 != r0) goto L_0x00a2
            java.lang.Object r0 = r7.A02
            X.OWR r0 = (X.OWR) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r0.A01
            r2 = 1021649468(0x3ce5223c, float:0.027970426)
            int r1 = r0.A00
            java.lang.String r0 = "network_probe_started"
            r3.markerPoint(r2, r1, r0)
            boolean r0 = X.C69692NqE.A00()
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "network_probe_succeeded"
        L_0x009a:
            r3.markerPoint(r2, r1, r0)
            java.lang.String r0 = "network_probe_ended"
            r3.markerPoint(r2, r1, r0)
        L_0x00a2:
            java.lang.Object r0 = r7.A02
            X.OWR r0 = (X.OWR) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = r0.A01
            r3 = 1021649468(0x3ce5223c, float:0.027970426)
            int r2 = r0.A00
            if (r5 == 0) goto L_0x00b3
            java.lang.String r1 = r5.A01
            if (r1 != 0) goto L_0x00b5
        L_0x00b3:
            java.lang.String r1 = "MISSING_ERROR_CODE"
        L_0x00b5:
            java.lang.String r0 = "error_code"
            r4.markerAnnotate(r3, r2, r0, r1)
            X.Nk3 r0 = X.C69363Nk3.A09
            if (r5 == r0) goto L_0x00c6
            X.Nk3 r0 = X.C69363Nk3.A06
            if (r5 == r0) goto L_0x00c6
            X.Nk3 r0 = X.C69363Nk3.A05
            if (r5 != r0) goto L_0x010a
        L_0x00c6:
            r0 = 2
        L_0x00c7:
            r4.markerEnd(r3, r2, r0)
            return
        L_0x00cb:
            X.OVu r8 = (X.C70999OVu) r8
            java.lang.Object r4 = r7.A03
            X.ObS r4 = (X.C71087ObS) r4
            if (r8 != 0) goto L_0x010f
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            X.Nk3 r0 = X.C69363Nk3.A0G
            X.OVu r3 = new X.OVu
            r3.<init>(r0, r1)
            java.lang.Boolean r2 = r3.A01
            boolean r0 = X.0qQ.A0K(r2, r1)
            if (r0 == 0) goto L_0x010c
            X.Nk3 r1 = r3.A00
            if (r1 == 0) goto L_0x00ee
            X.Nk3 r0 = X.C69363Nk3.A0A
            if (r1 != r0) goto L_0x010c
        L_0x00ee:
            X.Nk3 r0 = X.C69363Nk3.A07
        L_0x00f0:
            X.OVu r1 = new X.OVu
            r1.<init>(r0, r2)
            r4.A05(r1)
            java.lang.Object r0 = r7.A02
            X.OVw r0 = (X.C71000OVw) r0
            java.lang.String r1 = "MISSING_RESULT"
        L_0x00fe:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = r0.A01
            r3 = 1021652080(0x3ce52c70, float:0.027975291)
            int r2 = r0.A00
            java.lang.String r0 = "error_code"
            r4.markerAnnotate(r3, r2, r0, r1)
        L_0x010a:
            r0 = 3
            goto L_0x00c7
        L_0x010c:
            X.Nk3 r0 = r3.A00
            goto L_0x00f0
        L_0x010f:
            java.lang.Object r3 = r7.A04
            X.OYu r3 = (X.C71019OYu) r3
            java.lang.Boolean r2 = r8.A01
            r0 = 0
            boolean r0 = X.AnonymousClass7TF.A1Y(r2, r0)
            if (r0 == 0) goto L_0x014c
            X.Nk3 r5 = r8.A00
            if (r5 == 0) goto L_0x0124
            X.Nk3 r0 = X.C69363Nk3.A0A
            if (r5 != r0) goto L_0x014c
        L_0x0124:
            X.Nk3 r1 = X.C69363Nk3.A07
        L_0x0126:
            X.OVu r0 = new X.OVu
            r0.<init>(r1, r2)
            r4.A05(r0)
            X.Nk3 r0 = X.C69363Nk3.A0A
            X.OML r3 = r3.A01
            if (r5 != r0) goto L_0x0150
            int r2 = r7.A01
            r1 = 178986062(0xaab1c4e, float:1.6477348E-32)
            com.facebook.quicklog.QuickPerformanceLogger r0 = r3.A00
            r3 = 2
            r0.markerEnd(r1, r2, r3)
            java.lang.Object r0 = r7.A02
            X.OVw r0 = (X.C71000OVw) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r0.A01
            r1 = 1021652080(0x3ce52c70, float:0.027975291)
            int r0 = r0.A00
            goto L_0x0050
        L_0x014c:
            X.Nk3 r5 = r8.A00
            r1 = r5
            goto L_0x0126
        L_0x0150:
            int r6 = r7.A01
            r1 = 0
            if (r5 == 0) goto L_0x01a7
            java.lang.Number r0 = r5.A00
            if (r0 == 0) goto L_0x01a7
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0161:
            r4 = 178986062(0xaab1c4e, float:1.6477348E-32)
            com.facebook.quicklog.QuickPerformanceLogger r3 = r3.A00
            int r2 = X.DbX.A02(r0)
            java.lang.String r0 = "errorCode"
            r3.markerAnnotate(r4, r6, r0, r2)
            r0 = 3
            r3.markerEnd(r4, r6, r0)
            X.Nk3 r0 = X.C69363Nk3.A0E
            if (r5 != r0) goto L_0x0197
            java.lang.Object r0 = r7.A02
            X.OVw r0 = (X.C71000OVw) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = r0.A01
            r3 = 1021652080(0x3ce52c70, float:0.027975291)
            int r2 = r0.A00
            java.lang.String r0 = "network_probe_started"
            r4.markerPoint(r3, r2, r0)
            boolean r0 = X.C69692NqE.A00()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = "network_probe_succeeded"
            r4.markerPoint(r3, r2, r0)
        L_0x0192:
            java.lang.String r0 = "network_probe_ended"
            r4.markerPoint(r3, r2, r0)
        L_0x0197:
            java.lang.Object r0 = r7.A02
            X.OVw r0 = (X.C71000OVw) r0
            if (r5 == 0) goto L_0x00fe
            java.lang.String r1 = r5.A01
            goto L_0x00fe
        L_0x01a1:
            java.lang.String r0 = "network_probe_failed"
            r4.markerPoint(r3, r2, r0)
            goto L_0x0192
        L_0x01a7:
            r0 = r1
            goto L_0x0161
        L_0x01a9:
            java.lang.String r0 = "network_probe_failed"
            goto L_0x009a
        L_0x01ad:
            r1 = r2
            goto L_0x0073
        L_0x01b0:
            X.Nk3 r0 = X.C69363Nk3.A0G
            java.lang.Number r0 = r0.A00
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71529OmQ.run(java.lang.Object):void");
    }
}
