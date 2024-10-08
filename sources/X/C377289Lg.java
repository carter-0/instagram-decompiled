package X;

/* renamed from: X.9Lg  reason: invalid class name and case insensitive filesystem */
public final class C377289Lg extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377289Lg(Object obj, long j, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        r7.A06 = r8;
        r4.A03(r6, r5, new X.C227512jS(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00d4, code lost:
        X.AnonymousClass6QC.A04(r1, r2, r3, r4, r5, r6, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r17 = this;
            r9 = r17
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0059;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00f0;
                case 5: goto L_0x00fb;
                case 6: goto L_0x010f;
                case 7: goto L_0x015c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r9.A02
            X.2j8 r0 = (X.AnonymousClass2j8) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            android.content.Context r6 = r0.A00
            X.2jM r4 = X.C227462jM.A00(r6, r5)
            long r1 = r9.A01
            X.45O r0 = X.AnonymousClass45O.A06
            r3 = 2131441872(0x7f0b38d0, float:1.8505768E38)
            java.lang.Class r0 = r0.A01
            X.2jR r7 = new X.2jR
            r7.<init>(r0, r3)
            r0 = 1
            r7.A05 = r0
            r7.A00 = r0
            r7.A02 = r1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316224821727352(0x81056a00151078, double:3.0298650387356456E-306)
            boolean r8 = X.182.A06(r2, r5, r0)
        L_0x0033:
            r7.A06 = r8
            X.2jS r0 = new X.2jS
            r0.<init>(r7)
            r4.A03(r6, r5, r0)
        L_0x003d:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0040:
            java.lang.Object r0 = r9.A02
            X.6L8 r0 = (X.AnonymousClass6L8) r0
            com.facebook.quicklog.QuickPerformanceLogger r1 = r0.A01
            X.9Un r0 = r0.A00
            int r5 = r0.hashCode()
            long r6 = r9.A01
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            X.0sm r2 = X.0Yt.A0E()
            r4 = 51511298(0x3120002, float:4.2905553E-37)
            r8 = 4
            goto L_0x00d4
        L_0x0059:
            java.lang.Object r2 = r9.A02
            X.6L8 r2 = (X.AnonymousClass6L8) r2
            com.facebook.quicklog.QuickPerformanceLogger r4 = r2.A01
            X.9Un r3 = r2.A00
            int r8 = r3.hashCode()
            long r9 = r9.A01
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r1 = r3.A05
            java.lang.String r0 = X.AnonymousClass9NF.A01()
            r5.put(r0, r1)
            java.lang.String r1 = r3.A02
            r0 = 1170(0x492, float:1.64E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.put(r0, r1)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "placement"
            r5.put(r0, r1)
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "template_name"
            r5.put(r0, r1)
            java.lang.String r1 = r3.A03
            r0 = 1561(0x619, float:2.187E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.put(r0, r1)
            int r0 = r3.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1220(0x4c4, float:1.71E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.put(r0, r1)
            X.9Up r0 = r2.A02
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "custom_logging_info"
            r5.put(r0, r1)
            r7 = 51511298(0x3120002, float:4.2905553E-37)
            X.AnonymousClass6QC.A03(r4, r5, r6, r7, r8, r9)
            goto L_0x003d
        L_0x00bc:
            java.lang.Object r0 = r9.A02
            X.6L8 r0 = (X.AnonymousClass6L8) r0
            com.facebook.quicklog.QuickPerformanceLogger r1 = r0.A01
            X.9Un r0 = r0.A00
            int r5 = r0.hashCode()
            long r6 = r9.A01
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            X.0sm r2 = X.0Yt.A0E()
            r4 = 51511298(0x3120002, float:4.2905553E-37)
            r8 = 2
        L_0x00d4:
            X.AnonymousClass6QC.A04(r1, r2, r3, r4, r5, r6, r8)
            goto L_0x003d
        L_0x00d9:
            java.lang.Object r1 = r9.A02
            X.3ka r1 = (X.C249923ka) r1
            long r3 = r9.A01
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0 = 3890(0xf32, float:5.451E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r0 = r1.A07
            X.1QS r1 = r1.A08
            r0.markerPoint(r1, r2, r3, r5)
            goto L_0x003d
        L_0x00f0:
            java.lang.Object r2 = r9.A02
            X.3kZ r2 = (X.C249913kZ) r2
            long r0 = r9.A01
            X.C377289Lg.super.onFirstByteFlushed(r0)
            goto L_0x003d
        L_0x00fb:
            java.lang.Object r2 = r9.A02
            X.2nM r2 = (X.C229422nM) r2
            X.9c7 r0 = X.ACQ.A00()
            r2.A00 = r0
            long r0 = r9.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            goto L_0x003d
        L_0x010f:
            java.lang.Object r8 = r9.A02
            X.2nM r8 = (X.C229422nM) r8
            X.9c7 r7 = X.ACQ.A00()
            X.9c7 r6 = r8.A00
            java.lang.Long r10 = r8.A01
            if (r6 == 0) goto L_0x003d
            if (r7 == 0) goto L_0x003d
            if (r10 == 0) goto L_0x003d
            long r4 = r7.A01
            long r0 = r6.A01
            long r4 = r4 - r0
            long r2 = r7.A02
            long r0 = r6.A02
            long r2 = r2 - r0
            long r0 = r7.A03
            long r6 = r6.A03
            long r0 = r0 - r6
            X.02m r11 = r8.A02
            long r14 = r9.A01
            long r6 = r10.longValue()
            r12 = 725683882(0x2b410eaa, float:6.8587724E-13)
            r11.A0g(r12, r6)
            java.lang.String r6 = "cpu_time"
            r11.markerAnnotate(r12, r6, r4)
            java.lang.String r4 = "timeslices_count"
            r11.markerAnnotate(r12, r4, r0)
            java.lang.String r0 = "waiting_time"
            r11.markerAnnotate(r12, r0, r2)
            java.lang.String r1 = r8.A03
            java.lang.String r0 = "context"
            r11.markerAnnotate(r12, r0, r1)
            r13 = 2
            java.util.concurrent.TimeUnit r16 = java.util.concurrent.TimeUnit.MILLISECONDS
            r11.markerEnd(r12, r13, r14, r16)
            goto L_0x003d
        L_0x015c:
            java.lang.Object r0 = r9.A02
            X.2j8 r0 = (X.AnonymousClass2j8) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            android.content.Context r6 = r0.A00
            X.2jM r4 = X.C227462jM.A00(r6, r5)
            long r2 = r9.A01
            X.45O r0 = X.AnonymousClass45O.A04
            r1 = 2131428556(0x7f0b04cc, float:1.847876E38)
            java.lang.Class r0 = r0.A01
            X.2jR r7 = new X.2jR
            r7.<init>(r0, r1)
            r8 = 1
            r7.A05 = r8
            r7.A00 = r8
            r7.A02 = r2
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315309994151043(0x810495001c0c83, double:3.029286498092673E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0033
            r0 = 36316224821727352(0x81056a00151078, double:3.0298650387356456E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0033
            r8 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377289Lg.invoke():java.lang.Object");
    }
}
