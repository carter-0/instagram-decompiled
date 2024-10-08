package X;

import android.net.Uri;

public final /* synthetic */ class WMM implements C266054Xj {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ WMM(String str, Uri uri) {
        this.A00 = uri;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        if (r8 != null) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r3 = r25
            android.net.Uri r1 = r0.A00
            java.lang.String r2 = r0.A01
            X.4P8 r3 = (X.AnonymousClass4P8) r3
            X.4Ss r0 = X.C265144Ss.$redex_init_class
            X.5fK r0 = r3.A07
            if (r0 == 0) goto L_0x0144
            X.5fJ r7 = r3.A06
            if (r7 == 0) goto L_0x0144
            java.lang.String r12 = r1.toString()
            X.4OI r1 = r3.A00
            X.3uU r1 = r1.A0K
            java.lang.String r13 = r1.A0G
            android.util.LruCache r1 = X.2AC.A08
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x005e }
            r11.<init>(r2)     // Catch:{ JSONException -> 0x005e }
            int r1 = r11.length()     // Catch:{ JSONException -> 0x005e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ JSONException -> 0x005e }
            r9.<init>(r1)     // Catch:{ JSONException -> 0x005e }
            r10 = 0
            r8 = 0
        L_0x0030:
            int r1 = r11.length()     // Catch:{ JSONException -> 0x005e }
            if (r8 >= r1) goto L_0x0051
            org.json.JSONArray r2 = r11.getJSONArray(r8)     // Catch:{ NumberFormatException -> 0x004e }
            long r3 = r2.getLong(r10)     // Catch:{ NumberFormatException -> 0x004e }
            r1 = 1
            long r5 = r2.getLong(r1)     // Catch:{ NumberFormatException -> 0x004e }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r5
            X.VQz r5 = new X.VQz     // Catch:{ NumberFormatException -> 0x004e }
            r5.<init>(r3, r1)     // Catch:{ NumberFormatException -> 0x004e }
            r9.add(r5)     // Catch:{ NumberFormatException -> 0x004e }
        L_0x004e:
            int r8 = r8 + 1
            goto L_0x0030
        L_0x0051:
            int r1 = r9.size()     // Catch:{ JSONException -> 0x005e }
            X.VQz[] r1 = new X.C17320VQz[r1]     // Catch:{ JSONException -> 0x005e }
            java.lang.Object[] r6 = r9.toArray(r1)     // Catch:{ JSONException -> 0x005e }
            X.VQz[] r6 = (X.C17320VQz[]) r6     // Catch:{ JSONException -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            r1 = 0
            if (r6 == 0) goto L_0x00d4
            int r2 = r6.length
            if (r2 == 0) goto L_0x00d4
            r2 = 0
            r2 = r6[r2]
            long r4 = r2.A01
            monitor-enter(r7)
            java.util.PriorityQueue r10 = r7.A00     // Catch:{ all -> 0x00ae }
            java.util.Iterator r11 = r10.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0071:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x008c
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x00ae }
            X.VsG r2 = (X.C18466VsG) r2     // Catch:{ all -> 0x00ae }
            X.2AC r8 = r2.A01     // Catch:{ all -> 0x00ae }
            X.VQz[] r3 = r8.A07     // Catch:{ all -> 0x00ae }
            int r2 = r2.A00     // Catch:{ all -> 0x00ae }
            r2 = r3[r2]     // Catch:{ all -> 0x00ae }
            long r2 = r2.A01     // Catch:{ all -> 0x00ae }
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0071
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            monitor-exit(r7)
            if (r8 != 0) goto L_0x00b3
            monitor-enter(r7)
            java.util.Iterator r3 = r10.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0095:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x00ae }
            X.VsG r2 = (X.C18466VsG) r2     // Catch:{ all -> 0x00ae }
            X.2AC r8 = r2.A01     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = r8.A04     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x0095
            boolean r2 = r8.equals(r12)     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x0095
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            monitor-exit(r7)
        L_0x00b3:
            java.lang.String r16 = "SUCCESS"
            android.util.LruCache r2 = X.2AC.A08
            java.lang.Object r14 = r2.get(r12)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L_0x0133
            if (r8 == 0) goto L_0x0131
            java.lang.String r14 = r8.A02
        L_0x00c3:
            java.lang.String r1 = r8.A01
        L_0x00c5:
            long r19 = java.lang.System.currentTimeMillis()
            r17 = 0
            X.2AC r11 = new X.2AC
            r18 = r6
            r15 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r11
        L_0x00d4:
            java.lang.String r2 = r0.A03
            if (r2 == 0) goto L_0x0144
            long r5 = r1.A00
            long r2 = r0.A02
            long r5 = r5 - r2
            int r4 = (int) r5
            X.28b r5 = r0.A04
            r7 = 0
            r9 = 0
            java.lang.String r2 = r1.A04
            android.net.Uri r6 = android.net.Uri.parse(r2)
            java.lang.String r8 = r1.A05
            r11 = r9
            boolean r11 = r5.CPs(r6, r7, r8, r9, r11)
            X.VQz[] r10 = r1.A07
            int r9 = r10.length
            long[] r8 = new long[r9]
            r7 = 0
        L_0x00f6:
            if (r7 >= r9) goto L_0x0136
            com.facebook.exoplayer.monitor.VpsEventCallback r12 = r0.A05
            long r5 = r0.A01
            r2 = 1
            long r2 = r2 + r5
            r0.A01 = r2
            java.lang.String r13 = r0.A03
            int r3 = r0.A00
            java.lang.String r2 = r1.A01
            X.UU9 r14 = new X.UU9
            r16 = r13
            r17 = r2
            r18 = r7
            r19 = r4
            r20 = r3
            r21 = r5
            r23 = r11
            r15 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23)
            r12.callback(r14)
            X.5fJ r3 = r0.A07
            X.VsG r2 = new X.VsG
            r2.<init>(r1, r7, r11)
            r3.A01(r2)
            r2 = r10[r7]
            long r2 = r2.A01
            r8[r7] = r2
            int r7 = r7 + 1
            goto L_0x00f6
        L_0x0131:
            r14 = r1
            goto L_0x00c5
        L_0x0133:
            if (r8 == 0) goto L_0x00c5
            goto L_0x00c3
        L_0x0136:
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0144
            X.VLn r1 = new X.VLn
            r1.<init>(r8)
            X.4Of r0 = r0.A06
            r0.DNz(r1)
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WMM.accept(java.lang.Object):void");
    }
}
