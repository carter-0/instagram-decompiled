package X;

/* renamed from: X.6ti  reason: invalid class name and case insensitive filesystem */
public final class C321186ti implements C321196tj {
    public final /* synthetic */ C320986tO A00;
    public final /* synthetic */ C331897Sw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.6u1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.Wpb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.Wpb} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Runnable] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if (r1 != false) goto L_0x0036;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9D(X.1JG r19) {
        /*
            r18 = this;
            r3 = 0
            r5 = r19
            X.0qQ.A0B(r5, r3)
            r0 = r18
            X.7Sw r6 = r0.A01
            java.lang.String r8 = r0.A02
            X.6tO r2 = r0.A00
            boolean r10 = r0.A04
            boolean r11 = r0.A03
            boolean r12 = r0.A05
            X.7Sw r0 = X.C331897Sw.A0A
            monitor-enter(r6)
            X.7Sz r0 = r6.A03     // Catch:{ URISyntaxException -> 0x0092 }
            java.lang.String r9 = r0.A00(r8)     // Catch:{ URISyntaxException -> 0x0092 }
            X.7T3 r0 = r6.A02     // Catch:{ URISyntaxException -> 0x0092 }
            java.lang.Object r13 = r0.get(r9)     // Catch:{ URISyntaxException -> 0x0092 }
            X.6tz r13 = (X.C321356tz) r13     // Catch:{ URISyntaxException -> 0x0092 }
            java.util.concurrent.ConcurrentHashMap r4 = r6.A05     // Catch:{ URISyntaxException -> 0x0092 }
            java.lang.Object r0 = r4.get(r9)     // Catch:{ URISyntaxException -> 0x0092 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ URISyntaxException -> 0x0092 }
            if (r0 == 0) goto L_0x0036
            boolean r1 = r0.isEmpty()     // Catch:{ URISyntaxException -> 0x0092 }
            r0 = 0
            if (r1 == 0) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            r1 = r0 ^ 1
            java.lang.Object r0 = r4.get(r9)     // Catch:{ URISyntaxException -> 0x0092 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ URISyntaxException -> 0x0092 }
            if (r0 != 0) goto L_0x0049
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ URISyntaxException -> 0x0092 }
            r0.<init>()     // Catch:{ URISyntaxException -> 0x0092 }
            r4.put(r9, r0)     // Catch:{ URISyntaxException -> 0x0092 }
        L_0x0049:
            r0.add(r2)     // Catch:{ URISyntaxException -> 0x0092 }
            if (r13 == 0) goto L_0x0080
            java.lang.String r0 = "retimedavatar.webp"
            boolean r0 = X.00l.A0d(r8, r0, r3)     // Catch:{ URISyntaxException -> 0x0092 }
            if (r0 != 0) goto L_0x0080
            X.735 r0 = r13.A00     // Catch:{ URISyntaxException -> 0x0092 }
            if (r10 == 0) goto L_0x005d
            boolean r0 = r0 instanceof X.WXT     // Catch:{ URISyntaxException -> 0x0092 }
            goto L_0x005f
        L_0x005d:
            boolean r0 = r0 instanceof X.AnonymousClass734     // Catch:{ URISyntaxException -> 0x0092 }
        L_0x005f:
            if (r0 == 0) goto L_0x0080
            boolean r0 = X.C331897Sw.A04(r6, r9)     // Catch:{ URISyntaxException -> 0x0092 }
            if (r0 != 0) goto L_0x007c
            boolean r0 = r2.EsB()     // Catch:{ URISyntaxException -> 0x0092 }
            if (r0 == 0) goto L_0x007c
            java.util.concurrent.ExecutorService r0 = r6.A07     // Catch:{ URISyntaxException -> 0x0092 }
            X.Wpb r4 = new X.Wpb     // Catch:{ URISyntaxException -> 0x0092 }
            r12 = r4
            r14 = r6
            r15 = r9
            r16 = r8
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ URISyntaxException -> 0x0092 }
            goto L_0x008e
        L_0x007c:
            X.C331897Sw.A02(r13, r6, r8, r9)     // Catch:{ URISyntaxException -> 0x0092 }
            goto L_0x009e
        L_0x0080:
            if (r1 != 0) goto L_0x009e
            X.6u0 r7 = new X.6u0     // Catch:{ URISyntaxException -> 0x0092 }
            r7.<init>(r6, r9, r8)     // Catch:{ URISyntaxException -> 0x0092 }
            java.util.concurrent.ExecutorService r0 = r6.A07     // Catch:{ URISyntaxException -> 0x0092 }
            X.6u1 r4 = new X.6u1     // Catch:{ URISyntaxException -> 0x0092 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ URISyntaxException -> 0x0092 }
        L_0x008e:
            r0.execute(r4)     // Catch:{ URISyntaxException -> 0x0092 }
            goto L_0x009e
        L_0x0092:
            r2 = move-exception
            java.lang.String r1 = "GifCache"
            java.lang.String r0 = "Got a gif url that is not valid URL: "
            java.lang.String r0 = X.002.A0R(r0, r8)     // Catch:{ all -> 0x00a0 }
            X.0wb.A06(r1, r0, r2)     // Catch:{ all -> 0x00a0 }
        L_0x009e:
            monitor-exit(r6)
            return
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321186ti.D9D(X.1JG):void");
    }

    public C321186ti(C320986tO r1, C331897Sw r2, String str, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z3;
    }
}
