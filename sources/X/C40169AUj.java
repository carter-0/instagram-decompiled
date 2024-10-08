package X;

/* renamed from: X.AUj  reason: case insensitive filesystem */
public final class C40169AUj implements B17 {
    public volatile ASJ A00;
    public volatile boolean A01;
    public final /* synthetic */ A97 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        if (r3 == r9) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DZ8(X.C363848kR r19) {
        /*
            r18 = this;
            r1 = 0
            r0 = r19
            X.0qQ.A0B(r0, r1)
            r4 = r18
            X.A97 r14 = r4.A02
            X.ASJ r1 = r4.A00
            if (r1 != 0) goto L_0x002c
            monitor-enter(r4)
            X.ASJ r1 = r4.A00     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x002b
            boolean r1 = r4.A01     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002b
            X.ADH r3 = new X.ADH     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            X.7sl r2 = r14.A02     // Catch:{ all -> 0x0028 }
            X.ASJ r1 = new X.ASJ     // Catch:{ all -> 0x0028 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0028 }
            r4.A00 = r1     // Catch:{ all -> 0x0028 }
            X.ASJ r13 = r4.A00     // Catch:{ all -> 0x0028 }
            goto L_0x002f
        L_0x0028:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x002b:
            monitor-exit(r4)
        L_0x002c:
            X.ASJ r13 = r4.A00
            goto L_0x0030
        L_0x002f:
            monitor-exit(r4)
        L_0x0030:
            if (r13 == 0) goto L_0x008d
            byte[] r15 = r0.A09
            X.A5z[] r8 = r0.A0B
            r1 = 0
            if (r15 == 0) goto L_0x0096
            java.lang.Object r12 = r13.get()
            X.ADH r12 = (X.ADH) r12
            int r1 = r0.A01
            r16 = r1
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            boolean r11 = r0.A08
            int r10 = r0.A02
            int r9 = r0.A00
            float[] r6 = r0.A0A
            android.util.Pair r5 = r0.A04
            java.lang.Float r1 = r0.A05
            if (r1 == 0) goto L_0x0094
            float r4 = r1.floatValue()
        L_0x005a:
            java.lang.Long r1 = r0.A07
            if (r1 == 0) goto L_0x0091
            long r2 = r1.longValue()
        L_0x0062:
            java.lang.Long r0 = r0.A06
            if (r0 == 0) goto L_0x008e
            long r0 = r0.longValue()
        L_0x006a:
            r12.A0A = r15
            r15 = r16
            r12.A03 = r15
            r12.A07 = r7
            r12.A09 = r11
            r12.A04 = r10
            r12.A02 = r9
            r12.A0B = r6
            r12.A08 = r5
            r12.A00 = r4
            r12.A06 = r2
            r12.A05 = r0
        L_0x0082:
            X.A3U r0 = r14.A03
            X.81b r0 = r0.A00
            X.7lC r0 = r0.A04
            if (r0 == 0) goto L_0x008d
            r0.EMW(r13)
        L_0x008d:
            return
        L_0x008e:
            r0 = 0
            goto L_0x006a
        L_0x0091:
            r2 = 0
            goto L_0x0062
        L_0x0094:
            r4 = 0
            goto L_0x005a
        L_0x0096:
            if (r8 == 0) goto L_0x008d
            int r9 = r8.length
            X.7sh[] r15 = r14.A01
            r4 = 0
            if (r15 == 0) goto L_0x00b7
            int r3 = r15.length
            if (r3 != r9) goto L_0x00b7
        L_0x00a1:
            r7 = 0
        L_0x00a2:
            if (r7 >= r9) goto L_0x00c8
            r3 = r8[r7]
            r6 = r15[r7]
            java.nio.ByteBuffer r5 = r3.A02
            int r4 = r3.A00
            int r3 = r3.A01
            r6.A02 = r5
            r6.A00 = r4
            r6.A01 = r3
            int r7 = r7 + 1
            goto L_0x00a2
        L_0x00b7:
            X.7sh[] r15 = new X.C344957sh[r9]
        L_0x00b9:
            if (r4 >= r9) goto L_0x00c5
            X.7sh r3 = new X.7sh
            r3.<init>()
            r15[r4] = r3
            int r4 = r4 + 1
            goto L_0x00b9
        L_0x00c5:
            r14.A01 = r15
            goto L_0x00a1
        L_0x00c8:
            java.lang.Object r12 = r13.get()
            X.ADH r12 = (X.ADH) r12
            int r3 = r0.A01
            r17 = r3
            long r5 = r0.A03
            boolean r3 = r0.A08
            r16 = r3
            int r11 = r0.A02
            int r10 = r0.A00
            float[] r9 = r0.A0A
            android.util.Pair r8 = r0.A04
            java.lang.Float r3 = r0.A05
            if (r3 == 0) goto L_0x011a
            float r7 = r3.floatValue()
        L_0x00e8:
            java.lang.Long r3 = r0.A07
            if (r3 == 0) goto L_0x0117
            long r3 = r3.longValue()
        L_0x00f0:
            java.lang.Long r0 = r0.A06
            if (r0 == 0) goto L_0x00f8
            long r1 = r0.longValue()
        L_0x00f8:
            X.ADH.A00(r12)
            r12.A0C = r15
            r0 = r17
            r12.A03 = r0
            r12.A07 = r5
            r0 = r16
            r12.A09 = r0
            r12.A04 = r11
            r12.A02 = r10
            r12.A0B = r9
            r12.A08 = r8
            r12.A00 = r7
            r12.A06 = r3
            r12.A05 = r1
            goto L_0x0082
        L_0x0117:
            r3 = 0
            goto L_0x00f0
        L_0x011a:
            r7 = 0
            goto L_0x00e8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40169AUj.DZ8(X.8kR):void");
    }

    public C40169AUj(A97 a97) {
        this.A02 = a97;
    }
}
