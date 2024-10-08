package X;

/* renamed from: X.3HI  reason: invalid class name */
public final class AnonymousClass3HI extends 0ng {
    public final /* synthetic */ C239053Eo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3HI(C239053Eo r4) {
        super(554, 2, false, false);
        this.A00 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Object, X.2ZD] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e5, code lost:
        r9.A06.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.A03(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = new java.lang.IllegalStateException(X.002.A0R("ResponseBody not found when trying to read new buffer of data. Another concurrent request might be accessing it.", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.3Eo r3 = r0.A00
            X.1Lt r5 = r3.A0D
            com.instagram.common.api.base.CacheBehaviorLogger r2 = r5.A01
            X.1QS r6 = r3.A09
            java.lang.String r0 = "attempted_cache"
            r2.markerPoint(r6, r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r3.A0C
            r15 = 0
            r14 = 1
            boolean r0 = r1.compareAndSet(r15, r14)
            if (r0 == 0) goto L_0x0165
            int r0 = r1.get()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "set_read_mode"
            r2.markerPoint(r6, r0, r1)
            java.lang.String r1 = "source"
            java.lang.String r0 = "cache"
            r2.markerAnnotate(r6, r1, r0)
            r0 = 2
            r2.markerEnd(r6, r0)
            X.1Qe r2 = r3.A08
            java.lang.String r7 = r3.A0B
            X.1QU r4 = r3.A0A
            long r0 = r3.A00
            java.net.URI r10 = r6.A09     // Catch:{ IOException -> 0x0134 }
            java.lang.String r9 = r10.getPath()     // Catch:{ IOException -> 0x0134 }
            java.lang.String r8 = "require a valid url"
            X.17k.A07(r9, r8)     // Catch:{ IOException -> 0x0134 }
            X.1JQ r13 = X.1JQ.A05     // Catch:{ IOException -> 0x0134 }
            java.lang.String r9 = r10.getPath()     // Catch:{ IOException -> 0x0134 }
            int r8 = r6.hashCode()     // Catch:{ IOException -> 0x0134 }
            X.3EQ r11 = new X.3EQ     // Catch:{ IOException -> 0x0134 }
            r11.<init>(r7)     // Catch:{ IOException -> 0x0134 }
            r11.A05 = r9     // Catch:{ IOException -> 0x0134 }
            r11.A00 = r8     // Catch:{ IOException -> 0x0134 }
            X.1Fe r12 = r4.A00()     // Catch:{ IOException -> 0x0134 }
            X.1JI r9 = r13.A00     // Catch:{ IOException -> 0x0134 }
            X.1J0 r8 = r13.A01     // Catch:{ IOException -> 0x0134 }
            X.3Ei r12 = r11.A01(r12, r9, r8, r14)     // Catch:{ IOException -> 0x0134 }
            java.util.Map r9 = r13.A02     // Catch:{ IOException -> 0x0134 }
            boolean r8 = r9.containsKey(r7)     // Catch:{ IOException -> 0x0134 }
            if (r8 != 0) goto L_0x011a
            r9.put(r7, r11)     // Catch:{ IOException -> 0x0134 }
            java.util.List r8 = r12.A03     // Catch:{ IOException -> 0x0134 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ IOException -> 0x0134 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ IOException -> 0x0134 }
            r11.<init>(r8)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r8 = "X-IG-ANDROID-FROM-DISK-READ-START_TIME"
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0134 }
            X.1Fn r0 = new X.1Fn     // Catch:{ IOException -> 0x0134 }
            r0.<init>(r8, r1)     // Catch:{ IOException -> 0x0134 }
            r11.add(r0)     // Catch:{ IOException -> 0x0134 }
            int r9 = r12.A01     // Catch:{ IOException -> 0x0134 }
            java.lang.String r8 = r12.A02     // Catch:{ IOException -> 0x0134 }
            int r1 = r12.A00     // Catch:{ IOException -> 0x0134 }
            X.2ZD r0 = new X.2ZD     // Catch:{ IOException -> 0x0134 }
            r0.<init>()     // Catch:{ IOException -> 0x0134 }
            r0.A01 = r9     // Catch:{ IOException -> 0x0134 }
            r0.A02 = r8     // Catch:{ IOException -> 0x0134 }
            r0.A00 = r1     // Catch:{ IOException -> 0x0134 }
            r0.A03 = r11     // Catch:{ IOException -> 0x0134 }
            r2.A00(r0, r6)     // Catch:{ IOException -> 0x0134 }
            r0 = 4096(0x1000, float:5.74E-42)
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ IOException -> 0x0134 }
        L_0x00a3:
            X.1JQ r0 = X.1JQ.A05     // Catch:{ IOException -> 0x0134 }
            java.lang.String r1 = r10.getPath()     // Catch:{ IOException -> 0x0134 }
            java.util.Map r8 = r0.A02     // Catch:{ IOException -> 0x0134 }
            java.lang.Object r9 = r8.get(r7)     // Catch:{ IOException -> 0x0134 }
            X.3EQ r9 = (X.AnonymousClass3EQ) r9     // Catch:{ IOException -> 0x0134 }
            if (r9 == 0) goto L_0x010e
            X.1JI r1 = r0.A00     // Catch:{ IOException -> 0x012f }
            X.2jb r0 = r9.A04     // Catch:{ IOException -> 0x0107 }
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = r9.A0A     // Catch:{ IOException -> 0x0107 }
            X.2ic r1 = r1.AX8(r0)     // Catch:{ IOException -> 0x0107 }
            java.lang.Object r0 = r1.A00     // Catch:{ IOException -> 0x0107 }
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r1 = r1.A00()     // Catch:{ IOException -> 0x0107 }
            X.2jb r1 = (X.C227602jb) r1     // Catch:{ IOException -> 0x0107 }
            r9.A04 = r1     // Catch:{ IOException -> 0x0107 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0107 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0107 }
            r9.A06 = r0     // Catch:{ IOException -> 0x0107 }
        L_0x00d2:
            java.util.zip.GZIPInputStream r1 = r9.A06     // Catch:{ IOException -> 0x0107 }
            java.lang.String r0 = "mGZIPInputStream should be initialized above"
            X.17k.A07(r1, r0)     // Catch:{ IOException -> 0x0107 }
            java.util.zip.GZIPInputStream r1 = r9.A06     // Catch:{ IOException -> 0x0107 }
            byte[] r0 = r11.array()     // Catch:{ IOException -> 0x0107 }
            int r0 = r1.read(r0)     // Catch:{ IOException -> 0x0107 }
            if (r0 > 0) goto L_0x00eb
            java.util.zip.GZIPInputStream r0 = r9.A06     // Catch:{ IOException -> 0x0107 }
            r0.close()     // Catch:{ IOException -> 0x0107 }
            goto L_0x00f8
        L_0x00eb:
            r11.limit(r0)     // Catch:{ IOException -> 0x0107 }
            r11.rewind()     // Catch:{ IOException -> 0x0107 }
            r2.A05(r6, r11)     // Catch:{ IOException -> 0x0134 }
            r11.clear()     // Catch:{ IOException -> 0x0134 }
            goto L_0x00a3
        L_0x00f8:
            r8.remove(r7)     // Catch:{ IOException -> 0x012f }
            r2.A03(r6)     // Catch:{ IOException -> 0x0134 }
            goto L_0x0138
        L_0x00ff:
            java.lang.String r1 = "Http Response Body file stream not available"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0107 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0107 }
            throw r0     // Catch:{ IOException -> 0x0107 }
        L_0x0107:
            r1 = move-exception
            java.util.zip.GZIPInputStream r0 = r9.A06     // Catch:{ IOException -> 0x012f }
            com.google.common.io.Closeables.A01(r0)     // Catch:{ IOException -> 0x012f }
            throw r1     // Catch:{ IOException -> 0x012f }
        L_0x010e:
            java.lang.String r0 = "ResponseBody not found when trying to read new buffer of data. Another concurrent request might be accessing it."
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ IOException -> 0x0134 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0134 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0134 }
            goto L_0x0133
        L_0x011a:
            java.lang.Object r1 = r9.get(r7)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = "Attempted to read a response that is already being read.  Failed entry: %s. Current Entry reading: %s."
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r11, r1)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = "HttpStore_ConcurentReading"
            X.0wb.A03(r0, r1)     // Catch:{ IOException -> 0x0134 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0134 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0134 }
            goto L_0x0133
        L_0x012f:
            r0 = move-exception
            r8.remove(r7)     // Catch:{ IOException -> 0x0134 }
        L_0x0133:
            throw r0     // Catch:{ IOException -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            r2.A04(r6, r0)
        L_0x0138:
            X.3EQ r2 = r3.A03
            X.1J0 r12 = r5.A05
            if (r12 == 0) goto L_0x0165
            if (r2 == 0) goto L_0x0165
            java.lang.String r13 = r4.A04
            r13.getClass()
            X.1Fe r1 = r4.A00()
            X.1Fe r0 = X.1Fe.A02
            if (r1 != r0) goto L_0x0174
            r16 = 0
        L_0x014f:
            r14 = 0
            X.1JQ r0 = X.1JQ.A05
            X.1JI r1 = r0.A00
            java.lang.String r0 = r2.A0C
            long r17 = r1.B22(r0)
            java.lang.String r0 = r2.A0A
            long r0 = r1.B22(r0)
            long r17 = r17 + r0
            r12.A02(r13, r14, r15, r16, r17)
        L_0x0165:
            X.1JQ r2 = X.1JQ.A05
            java.lang.String r0 = r3.A0B
            X.3EQ r1 = new X.3EQ
            r1.<init>(r0)
            X.1JI r0 = r2.A00
            r1.A03(r0)
            return
        L_0x0174:
            X.1Fe r1 = r4.A00()
            X.1Fe r0 = X.1Fe.A03
            r16 = -1
            if (r1 != r0) goto L_0x014f
            r16 = 1
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HI.run():void");
    }
}
