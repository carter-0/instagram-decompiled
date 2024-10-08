package X;

/* renamed from: X.5AO  reason: invalid class name */
public final class AnonymousClass5AO extends 1P0 {
    public final 0lg A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ C271494iw A03;

    public AnonymousClass5AO(0lg r1, C271494iw r2, String str, String str2) {
        this.A03 = r2;
        this.A02 = str;
        this.A00 = r1;
        this.A01 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0161, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0180, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        r0 = -853113922;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0186, code lost:
        r0 = 867246409;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:41:0x014a, B:55:0x0168] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r30) {
        /*
            r29 = this;
            r1 = r30
            r0 = 127955381(0x7a071b5, float:2.4140955E-34)
            int r11 = X.AnonymousClass0fD.A03(r0)
            X.5AM r1 = (X.AnonymousClass5AM) r1
            r0 = -989194284(0xffffffffc50a17d4, float:-2209.4893)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.5Ad r0 = r1.A00
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r4 = X.AnonymousClass00P.createAndThrow()
            throw r4
        L_0x0020:
            X.5Aa r0 = r0.A00
            if (r0 != 0) goto L_0x0038
            java.lang.String r1 = "IgZeroTokenFetcher"
            java.lang.String r0 = "Got campaign API response with an empty normal token"
            X.0KC.A0C(r1, r0)
            r0 = 1097643103(0x416cb45f, float:14.794036)
        L_0x002e:
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 549330914(0x20be1fe2, float:3.220835E-19)
            X.AnonymousClass0fD.A0A(r0, r11)
            return
        L_0x0038:
            r8 = r29
            X.4iw r6 = r8.A03
            java.lang.String r1 = "is_e2e_testing"
            java.lang.String r2 = java.lang.System.getProperty(r1)
            java.lang.String r1 = "true"
            boolean r1 = r1.equals(r2)
            r9 = 0
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = "fb.e2e.ZERO_TTL_OVERRIDE"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 == 0) goto L_0x005b
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
        L_0x005b:
            java.lang.String r15 = r0.A05
            java.lang.String r14 = r0.A03
            java.lang.String r13 = r0.A04
            java.util.List r1 = r0.A09
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x006c:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0095
            java.lang.Object r1 = r4.next()
            X.5AZ r1 = (X.AnonymousClass5AZ) r1
            X.5AY r1 = (X.AnonymousClass5AY) r1     // Catch:{ 1R2 -> 0x0087 }
            java.lang.String r3 = r1.A00     // Catch:{ 1R2 -> 0x0087 }
            java.lang.String r2 = r1.A01     // Catch:{ 1R2 -> 0x0087 }
            X.1R4 r1 = new X.1R4     // Catch:{ 1R2 -> 0x0087 }
            r1.<init>(r3, r2)     // Catch:{ 1R2 -> 0x0087 }
            r10.add(r1)     // Catch:{ 1R2 -> 0x0087 }
            goto L_0x006c
        L_0x0087:
            r3 = move-exception
            java.lang.String r2 = "IgZeroTokenFetcher"
            java.lang.String r1 = "Invalid zero rating rewrite rule"
            X.0wb.A03(r2, r1)
            java.lang.String r1 = "Invalid rewrite rule"
            X.0KC.A0G(r2, r1, r3)
            goto L_0x006c
        L_0x0095:
            java.util.List r21 = java.util.Collections.emptyList()
            java.util.List r1 = r0.A08
            java.util.HashSet r3 = X.C281945Ae.A02(r1)
            X.0xa r2 = r6.A02
            java.lang.String r1 = "zero_overridden_features"
            r5 = 0
            java.util.Set r2 = r2.getStringSet(r1, r5)
            if (r2 == 0) goto L_0x00b0
            X.Avd r1 = new X.Avd
            r1.<init>(r6, r3, r2)
            r3 = r1
        L_0x00b0:
            java.util.Set r22 = java.util.Collections.unmodifiableSet(r3)
            if (r9 != 0) goto L_0x00f4
            int r4 = r0.A00
        L_0x00b8:
            long r27 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r0.A02
            int r25 = java.lang.Integer.parseInt(r1)
            java.util.List r1 = r0.A07
            java.util.HashSet r1 = X.C281945Ae.A02(r1)
            java.util.Set r23 = java.util.Collections.unmodifiableSet(r1)
            int r12 = r0.A01
            java.util.List r0 = r0.A06
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x00d9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r16.next()
            X.UNn r0 = (X.C15070UNn) r0
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A02
            int r1 = r0.A00
            X.VjG r0 = new X.VjG
            r0.<init>(r3, r2, r1)
            r9.add(r0)
            goto L_0x00d9
        L_0x00f4:
            int r4 = r9.intValue()
            goto L_0x00b8
        L_0x00f9:
            X.1R6 r0 = new X.1R6
            r0.<init>(r9)
            java.lang.String r19 = ""
            X.1R7 r1 = new X.1R7
            r20 = r10
            r24 = r4
            r26 = r12
            r17 = r13
            r18 = r5
            r16 = r14
            r13 = r1
            r14 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 0
            r6.A00 = r3     // Catch:{ all -> 0x0164 }
            X.0lg r4 = r8.A00     // Catch:{ all -> 0x0164 }
            X.3kW r0 = X.AnonymousClass1Qz.A00(r4)     // Catch:{ all -> 0x0164 }
            r0.FM1(r1)     // Catch:{ all -> 0x0164 }
            java.lang.String r9 = r1.A06     // Catch:{ all -> 0x0164 }
            if (r9 != 0) goto L_0x0125
            r9 = r19
        L_0x0125:
            int r10 = r1.A00     // Catch:{ all -> 0x0164 }
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x0164 }
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r4)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = "ig_zero_token_fetch_success"
            X.0kJ r0 = r2.A00     // Catch:{ all -> 0x0164 }
            X.0Aj r2 = r2.A00(r0, r1)     // Catch:{ all -> 0x0164 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "carrier_id"
            r2.A8k(r0, r1)     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "carrier_name"
            r2.AAJ(r0, r9)     // Catch:{ all -> 0x0164 }
            r2.Cgf()     // Catch:{ all -> 0x0164 }
            java.lang.Object r2 = r6.A03
            monitor-enter(r2)
            java.lang.Integer r1 = r6.A01     // Catch:{ all -> 0x0161 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0161 }
            r6.A01 = r0     // Catch:{ all -> 0x0161 }
            monitor-exit(r2)     // Catch:{ all -> 0x0161 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x015c
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r8.A01
            r6.A00(r4, r1, r0, r3)
        L_0x015c:
            r0 = -2125129546(0xffffffff815518b6, float:-3.913965E-38)
            goto L_0x002e
        L_0x0161:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0161 }
            goto L_0x0186
        L_0x0164:
            r4 = move-exception
            java.lang.Object r2 = r6.A03
            monitor-enter(r2)
            java.lang.Integer r1 = r6.A01     // Catch:{ all -> 0x0180 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0180 }
            r6.A01 = r0     // Catch:{ all -> 0x0180 }
            monitor-exit(r2)     // Catch:{ all -> 0x0180 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x017c
            java.lang.String r2 = r8.A02
            java.lang.String r1 = r8.A01
            X.0lg r0 = r8.A00
            r6.A00(r0, r2, r1, r3)
        L_0x017c:
            r0 = -1762050632(0xffffffff96f93db8, float:-4.026707E-25)
            goto L_0x0189
        L_0x0180:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0180 }
            r0 = -853113922(0xffffffffcd2683be, float:-1.74603232E8)
            goto L_0x0189
        L_0x0186:
            r0 = 867246409(0x33b12149, float:8.248259E-8)
        L_0x0189:
            X.AnonymousClass0fD.A0A(r0, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AO.onSuccessInBackground(java.lang.Object):void");
    }

    public final void onFail(C268654dm r7) {
        Integer num;
        int A032 = AnonymousClass0fD.A03(95291059);
        if (r7 instanceof C268674do) {
            ((AnonymousClass1XT) ((C268674do) r7).A00).getErrorMessage();
        } else {
            Throwable A012 = r7.A01();
            if (A012 != null) {
                A012.toString();
            }
        }
        C271494iw r5 = this.A03;
        synchronized (r5.A03) {
            try {
                num = r5.A01;
                r5.A01 = AnonymousClass05K.A00;
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0A(1958052864, A032);
                    throw th;
                }
            }
        }
        if (num == AnonymousClass05K.A0C) {
            r5.A00 = 0;
        } else {
            int i = r5.A00;
            if (i < 1) {
                r5.A00 = i + 1;
            } else {
                r5.A00 = 0;
                AnonymousClass0fD.A0A(699997629, A032);
            }
        }
        r5.A00(this.A00, this.A02, this.A01, false);
        AnonymousClass0fD.A0A(699997629, A032);
    }
}
