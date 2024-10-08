package X;

@Deprecated
public abstract class RhX {
    /* JADX WARNING: type inference failed for: r17v0, types: [com.facebook.proxygen.RequestStatsObserver, java.lang.Object, com.facebook.proxygen.TraceEventObserver] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|(5:14|15|16|72|71)(1:17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        r1.append(r0);
        r0 = r13.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if (r0 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        r0 = X.RhW.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        r0 = X.JTO.A0u(X.AnonymousClass7TF.A0l(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0091 A[LOOP:1: B:11:0x0091->B:71:0x0091, LOOP_START, SYNTHETIC, Splitter:B:11:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.2ZL A00(X.AnonymousClass1QX r21, X.C8772R8x r22) {
        /*
            r3 = 0
        L_0x0001:
            r9 = 1
            int r3 = r3 + 1
            r2 = 3
            r4 = r21
            X.1QU r8 = r4.A03     // Catch:{ RCa -> 0x00f8 }
            X.1CE r1 = r8.A09     // Catch:{ RCa -> 0x00f8 }
            X.1CE r0 = X.1CE.A02     // Catch:{ RCa -> 0x00f8 }
            if (r1 != r0) goto L_0x001d
            if (r3 <= r9) goto L_0x001d
            X.1QS r5 = r4.A02     // Catch:{ RCa -> 0x00f8 }
            java.lang.String r1 = "X-Tigon-Is-Retry"
            r5.A00(r1)     // Catch:{ RCa -> 0x00f8 }
            java.lang.String r0 = "True"
            r5.A01(r1, r0)     // Catch:{ RCa -> 0x00f8 }
        L_0x001d:
            X.1QS r5 = r4.A02     // Catch:{ RCa -> 0x00f8 }
            X.Pxe.A1G()     // Catch:{ RCa -> 0x00f8 }
            java.net.URI r6 = r5.A09     // Catch:{ RCa -> 0x00f8 }
            java.lang.String r1 = r6.getHost()     // Catch:{ RCa -> 0x00f8 }
            java.lang.String r0 = "Host can not be null!"
            X.17k.A07(r1, r0)     // Catch:{ RCa -> 0x00f8 }
            boolean r0 = X.SRB.A0m     // Catch:{ RCa -> 0x00f8 }
            com.facebook.proxygen.NativeReadBuffer r16 = new com.facebook.proxygen.NativeReadBuffer     // Catch:{ RCa -> 0x00f8 }
            r16.<init>()     // Catch:{ RCa -> 0x00f8 }
            r16.init()     // Catch:{ RCa -> 0x00f8 }
            com.facebook.proxygen.RequestStatsObserver r17 = new com.facebook.proxygen.RequestStatsObserver     // Catch:{ RCa -> 0x00f8 }
            r17.<init>()     // Catch:{ RCa -> 0x00f8 }
            com.facebook.proxygen.TraceEventObserver[] r1 = new com.facebook.proxygen.TraceEventObserver[]{r17}     // Catch:{ RCa -> 0x00f8 }
            int r0 = X.SRB.A0V     // Catch:{ RCa -> 0x00f8 }
            X.Sou r13 = new X.Sou     // Catch:{ RCa -> 0x00f8 }
            r13.<init>(r0)     // Catch:{ RCa -> 0x00f8 }
            com.facebook.proxygen.TraceEventContext r7 = new com.facebook.proxygen.TraceEventContext     // Catch:{ RCa -> 0x00f8 }
            r7.<init>(r1, r13)     // Catch:{ RCa -> 0x00f8 }
            r10 = r22
            X.SRB r1 = r10.A00     // Catch:{ RCa -> 0x00f8 }
            X.1x6 r12 = r1.A0B     // Catch:{ RCa -> 0x00f8 }
            java.lang.Integer r0 = r8.A03     // Catch:{ RCa -> 0x00f8 }
            X.RvL r11 = new X.RvL     // Catch:{ RCa -> 0x00f8 }
            r11.<init>(r12, r13, r0)     // Catch:{ RCa -> 0x00f8 }
            X.S28 r0 = new X.S28     // Catch:{ RCa -> 0x00f8 }
            r0.<init>(r8, r11)     // Catch:{ RCa -> 0x00f8 }
            X.1C5 r15 = r1.A0A     // Catch:{ RCa -> 0x00f8 }
            X.1C6 r14 = r1.A09     // Catch:{ RCa -> 0x00f8 }
            X.Son r13 = new X.Son     // Catch:{ RCa -> 0x00f8 }
            r18 = r5
            r19 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ RCa -> 0x00f8 }
            com.facebook.proxygen.HTTPRequestHandler r12 = new com.facebook.proxygen.HTTPRequestHandler     // Catch:{ RCa -> 0x00f8 }
            r12.<init>()     // Catch:{ RCa -> 0x00f8 }
            com.facebook.proxygen.JniHandler r11 = new com.facebook.proxygen.JniHandler     // Catch:{ RCa -> 0x00f8 }
            r11.<init>(r12, r13)     // Catch:{ RCa -> 0x00f8 }
            X.T6H r0 = new X.T6H     // Catch:{ IOException -> 0x00f6 }
            r0.<init>(r9, r12, r10)     // Catch:{ IOException -> 0x00f6 }
            r4.A01(r0)     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r0 = r8.A0D     // Catch:{ IOException -> 0x00f6 }
            r17 = r16
            r18 = r7
            r19 = r5
            r20 = r0
            r14 = r1
            r15 = r12
            r16 = r11
            r14.A02(r15, r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x00f6 }
            java.lang.Object r7 = r13.A09     // Catch:{ IOException -> 0x00f6 }
            monitor-enter(r7)     // Catch:{ IOException -> 0x00f6 }
        L_0x0091:
            java.lang.Integer r1 = r13.A0B     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x00a4 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x00a4 }
            if (r0 >= 0) goto L_0x00a2
            r0 = 60000(0xea60, double:2.9644E-319)
            r7.wait(r0)     // Catch:{ InterruptedException -> 0x0091 }
            goto L_0x0091
        L_0x00a2:
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a7
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            goto L_0x00cd
        L_0x00a7:
            X.RCa r0 = r13.A01     // Catch:{ IOException -> 0x00f6 }
            if (r0 != 0) goto L_0x00cd
            X.2ZL r7 = r13.A00     // Catch:{ IOException -> 0x00f6 }
            if (r7 == 0) goto L_0x00d2
            java.lang.String r0 = r7.A03     // Catch:{ IOException -> 0x00f6 }
            if (r0 != 0) goto L_0x00da
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r0 = "null response status line received: "
        L_0x00ba:
            r1.append(r0)     // Catch:{ IOException -> 0x00f6 }
            java.lang.Integer r0 = r13.A0B     // Catch:{ IOException -> 0x00f6 }
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = X.RhW.A00(r0)     // Catch:{ IOException -> 0x00f6 }
        L_0x00c5:
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ IOException -> 0x00f6 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x00f6 }
        L_0x00cd:
            throw r0     // Catch:{ IOException -> 0x00f6 }
        L_0x00ce:
            java.lang.String r0 = "null"
            goto L_0x00c5
        L_0x00d2:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r0 = "null response received at: "
            goto L_0x00ba
        L_0x00da:
            X.1HW r1 = r5.A05     // Catch:{ IOException -> 0x00f6 }
            if (r1 == 0) goto L_0x00e7
            java.util.Map r0 = r13.A03     // Catch:{ IOException -> 0x00f6 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ IOException -> 0x00f6 }
            r1.FJR(r6, r0)     // Catch:{ IOException -> 0x00f6 }
        L_0x00e7:
            X.0I2 r0 = X.0KC.A01     // Catch:{ IOException -> 0x00f6 }
            int r1 = r7.A02     // Catch:{ RCa -> 0x00f8 }
            r0 = 408(0x198, float:5.72E-43)
            if (r1 != r0) goto L_0x00f5
            boolean r0 = r5.A0C     // Catch:{ RCa -> 0x00f8 }
            if (r0 == 0) goto L_0x00f5
            if (r3 < r2) goto L_0x0001
        L_0x00f5:
            return r7
        L_0x00f6:
            r0 = move-exception
            throw r0     // Catch:{ RCa -> 0x00f8 }
        L_0x00f8:
            r1 = move-exception
            boolean r0 = X.C11410SSi.A05(r1)
            if (r0 == 0) goto L_0x0109
            X.1QS r0 = r4.A02
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0109
            if (r3 >= r2) goto L_0x0109
            goto L_0x0001
        L_0x0109:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RhX.A00(X.1QX, X.R8x):X.2ZL");
    }
}
