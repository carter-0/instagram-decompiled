package X;

/* renamed from: X.8da  reason: invalid class name and case insensitive filesystem */
public abstract class C359848da {
    public volatile C359898df A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.9g5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.8dZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.9g5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.9g5} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0208, code lost:
        if (r17 > (r3 + r9.toMillis(r12.A01))) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f8, code lost:
        if (r16 > (r3 + r6.toMillis(r9.A01))) goto L_0x00fa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x00c4=Splitter:B:46:0x00c4, B:101:0x01d4=Splitter:B:101:0x01d4, B:14:0x004a=Splitter:B:14:0x004a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r27) {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r1 instanceof X.C359838dZ
            r3 = r27
            if (r0 == 0) goto L_0x002a
            r2 = r1
            X.8dZ r2 = (X.C359838dZ) r2
            java.lang.String r0 = "IgBloksDataEmitter_onFetch"
            X.1Kg.A02(r0)
            long r6 = r2.A00
            r4 = -1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            X.0JR r0 = r2.A01
            long r6 = r0.now()
        L_0x001e:
            r2.A00 = r6
            r0 = 3
            r16 = 0
            r11 = 1
            r13 = 0
            if (r3 != r0) goto L_0x013b
            r13 = 1
            goto L_0x013b
        L_0x002a:
            r2 = r1
            X.9g5 r2 = (X.AnonymousClass9g5) r2
            java.lang.String r0 = "IgBloksActionDataEmitter_onFetch"
            X.1Kg.A02(r0)
            long r6 = r2.A00
            r4 = -1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            X.0JR r0 = r2.A01
            long r6 = r0.now()
        L_0x0040:
            r2.A00 = r6
            r0 = 3
            r21 = 0
            r15 = 1
            r14 = 0
            if (r3 != r0) goto L_0x004a
            r14 = 1
        L_0x004a:
            X.A7R r8 = r2.A02     // Catch:{ all -> 0x0262 }
            X.0lg r6 = r8.A02     // Catch:{ all -> 0x0262 }
            if (r6 != 0) goto L_0x005d
            java.lang.String r0 = r8.A03     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x005d
            X.9j6 r3 = X.C385539j6.A00     // Catch:{ all -> 0x0262 }
        L_0x0056:
            java.util.concurrent.atomic.AtomicReference r0 = r2.A05     // Catch:{ all -> 0x0262 }
            r0.set(r3)     // Catch:{ all -> 0x0262 }
            goto L_0x014c
        L_0x005d:
            if (r6 == 0) goto L_0x0252
            java.lang.String r5 = r8.A03     // Catch:{ all -> 0x0262 }
            if (r5 == 0) goto L_0x0252
            java.util.HashMap r4 = r8.A05     // Catch:{ all -> 0x0262 }
            r10 = 0
            r22 = 0
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x0262 }
            r0 = 18315359752831296(0x4111b900004140, double:1.899014775660611E-307)
            boolean r0 = X.1AW.A06(r3, r0)     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0087
            X.8ey r7 = X.C359988do.A03(r10, r6, r5, r4)     // Catch:{ all -> 0x0262 }
        L_0x0079:
            X.8db r6 = r2.A03     // Catch:{ all -> 0x0262 }
            r5 = 0
            if (r6 == 0) goto L_0x00fa
            java.lang.String r11 = r2.A04     // Catch:{ all -> 0x0262 }
            r11.getClass()     // Catch:{ all -> 0x0262 }
            X.8dT r3 = r6.A02     // Catch:{ all -> 0x0262 }
            monitor-enter(r3)     // Catch:{ all -> 0x0262 }
            goto L_0x0098
        L_0x0087:
            r16 = r10
            r17 = r6
            r18 = r5
            r19 = r10
            r20 = r4
            r24 = r21
            X.8ey r7 = X.C359988do.A01(r16, r17, r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x0262 }
            goto L_0x0079
        L_0x0098:
            X.01e r4 = r6.A00     // Catch:{ all -> 0x024b }
            java.lang.Object r9 = r4.A02(r11)     // Catch:{ all -> 0x024b }
            X.8f2 r9 = (X.C360718f2) r9     // Catch:{ all -> 0x024b }
            if (r9 != 0) goto L_0x00a4
            monitor-exit(r3)     // Catch:{ all -> 0x0262 }
            goto L_0x00fa
        L_0x00a4:
            long r0 = r9.A02     // Catch:{ all -> 0x024b }
            X.0JR r6 = r6.A01     // Catch:{ all -> 0x024b }
            long r16 = r6.now()     // Catch:{ all -> 0x024b }
            long r12 = r9.A00     // Catch:{ all -> 0x024b }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x024b }
            long r12 = r6.toMillis(r12)     // Catch:{ all -> 0x024b }
            long r0 = r0 + r12
            int r12 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x00c0
            X.8ff r0 = r9.A03     // Catch:{ all -> 0x024b }
            boolean r0 = r0 instanceof X.C379799Vi     // Catch:{ all -> 0x024b }
            if (r0 == 0) goto L_0x00c0
            goto L_0x00c4
        L_0x00c0:
            r4.A03(r11)     // Catch:{ all -> 0x024b }
            r9 = r10
        L_0x00c4:
            monitor-exit(r3)     // Catch:{ all -> 0x0262 }
            r10 = r9
            if (r9 == 0) goto L_0x00fa
            X.8ff r3 = r9.A03     // Catch:{ all -> 0x0262 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0262 }
            java.lang.Class<X.9Vi> r0 = X.C379799Vi.class
            if (r1 != r0) goto L_0x00d6
            X.9Vi r3 = (X.C379799Vi) r3     // Catch:{ all -> 0x0262 }
            X.Di0 r5 = r3.A00     // Catch:{ all -> 0x0262 }
        L_0x00d6:
            if (r5 == 0) goto L_0x00fa
            X.0JR r0 = r2.A01     // Catch:{ all -> 0x0262 }
            long r16 = r0.now()     // Catch:{ all -> 0x0262 }
            long r3 = r9.A02     // Catch:{ all -> 0x0262 }
            long r0 = r9.A00     // Catch:{ all -> 0x0262 }
            long r0 = r6.toMillis(r0)     // Catch:{ all -> 0x0262 }
            long r11 = r3 + r0
            int r0 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x00ee
            r21 = 1
        L_0x00ee:
            long r0 = r9.A01     // Catch:{ all -> 0x0262 }
            long r0 = r6.toMillis(r0)     // Catch:{ all -> 0x0262 }
            long r3 = r3 + r0
            int r1 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x00fb
        L_0x00fa:
            r0 = 1
        L_0x00fb:
            r9 = 2
            if (r0 == 0) goto L_0x0110
            java.util.concurrent.atomic.AtomicReference r0 = r2.A06     // Catch:{ all -> 0x0262 }
            r0.set(r7)     // Catch:{ all -> 0x0262 }
            X.9iG r0 = new X.9iG     // Catch:{ all -> 0x0262 }
            r0.<init>(r2, r7, r14)     // Catch:{ all -> 0x0262 }
            r7.A00(r0)     // Catch:{ all -> 0x0262 }
            r0 = 726(0x2d6, float:1.017E-42)
            X.1ES.A05(r7, r0, r9, r15, r15)     // Catch:{ all -> 0x0262 }
        L_0x0110:
            if (r10 == 0) goto L_0x024e
            if (r5 == 0) goto L_0x024e
            if (r21 == 0) goto L_0x024e
            long r3 = r8.A00     // Catch:{ all -> 0x0262 }
            long r0 = r2.A00     // Catch:{ all -> 0x0262 }
            long r6 = r10.A02     // Catch:{ all -> 0x0262 }
            X.8fg r8 = new X.8fg     // Catch:{ all -> 0x0262 }
            r17 = r22
            r19 = r22
            r21 = r15
            r10 = r8
            r11 = r0
            r13 = r6
            r15 = r3
            r10.<init>(r11, r13, r15, r17, r19, r21)     // Catch:{ all -> 0x0262 }
            X.8fh r1 = new X.8fh     // Catch:{ all -> 0x0262 }
            r1.<init>(r8, r9)     // Catch:{ all -> 0x0262 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0262 }
            X.9j5 r3 = new X.9j5     // Catch:{ all -> 0x0262 }
            r3.<init>(r5, r1, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0056
        L_0x013b:
            X.8dY r6 = r2.A02     // Catch:{ all -> 0x0262 }
            X.0lg r5 = r6.A04     // Catch:{ all -> 0x0262 }
            if (r5 != 0) goto L_0x0151
            java.lang.String r0 = r6.A05     // Catch:{ all -> 0x0262 }
            if (r0 != 0) goto L_0x0151
            X.9j6 r3 = X.C385539j6.A00     // Catch:{ all -> 0x0262 }
        L_0x0147:
            java.util.concurrent.atomic.AtomicReference r0 = r2.A05     // Catch:{ all -> 0x0262 }
            r0.set(r3)     // Catch:{ all -> 0x0262 }
        L_0x014c:
            r2.A01(r3)     // Catch:{ all -> 0x0262 }
            goto L_0x024e
        L_0x0151:
            if (r5 == 0) goto L_0x025a
            java.lang.String r4 = r6.A05     // Catch:{ all -> 0x0262 }
            if (r4 == 0) goto L_0x025a
            boolean r0 = r6.A01     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x018b
            java.util.HashMap r10 = r6.A07     // Catch:{ all -> 0x0262 }
            java.lang.String r9 = r2.A04     // Catch:{ all -> 0x0262 }
            long r0 = r6.A02     // Catch:{ all -> 0x0262 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            boolean r7 = r6.A00     // Catch:{ all -> 0x0262 }
            X.0qQ.A0B(r4, r11)     // Catch:{ all -> 0x0262 }
            r14 = 0
            r17 = r14
            r18 = r5
            r19 = r4
            r20 = r9
            r21 = r10
            r22 = r3
            r23 = r0
            r25 = r7
            X.8ey r10 = X.C359988do.A01(r17, r18, r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0262 }
        L_0x017e:
            X.8db r0 = r2.A03     // Catch:{ all -> 0x0262 }
            r5 = 0
            if (r0 == 0) goto L_0x020a
            java.lang.String r15 = r2.A04     // Catch:{ all -> 0x0262 }
            if (r15 == 0) goto L_0x020a
            X.8dT r3 = r0.A02     // Catch:{ all -> 0x0262 }
            monitor-enter(r3)     // Catch:{ all -> 0x0262 }
            goto L_0x01a8
        L_0x018b:
            java.util.HashMap r1 = r6.A07     // Catch:{ all -> 0x0262 }
            r17 = 0
            boolean r0 = r6.A00     // Catch:{ all -> 0x0262 }
            r23 = 0
            X.0qQ.A0B(r4, r11)     // Catch:{ all -> 0x0262 }
            r14 = 0
            r20 = r14
            r18 = r5
            r19 = r4
            r21 = r1
            r22 = r3
            r25 = r0
            X.8ey r10 = X.C359988do.A01(r17, r18, r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0262 }
            goto L_0x017e
        L_0x01a8:
            X.01e r4 = r0.A00     // Catch:{ all -> 0x024b }
            java.lang.Object r12 = r4.A02(r15)     // Catch:{ all -> 0x024b }
            X.8f2 r12 = (X.C360718f2) r12     // Catch:{ all -> 0x024b }
            if (r12 != 0) goto L_0x01b4
            monitor-exit(r3)     // Catch:{ all -> 0x0262 }
            goto L_0x020a
        L_0x01b4:
            long r7 = r12.A02     // Catch:{ all -> 0x024b }
            X.0JR r0 = r0.A01     // Catch:{ all -> 0x024b }
            long r17 = r0.now()     // Catch:{ all -> 0x024b }
            long r0 = r12.A00     // Catch:{ all -> 0x024b }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x024b }
            long r0 = r9.toMillis(r0)     // Catch:{ all -> 0x024b }
            long r7 = r7 + r0
            int r0 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x01d0
            X.8ff r0 = r12.A03     // Catch:{ all -> 0x024b }
            boolean r0 = r0 instanceof X.C361088fe     // Catch:{ all -> 0x024b }
            if (r0 == 0) goto L_0x01d0
            goto L_0x01d4
        L_0x01d0:
            r4.A03(r15)     // Catch:{ all -> 0x024b }
            r12 = r14
        L_0x01d4:
            monitor-exit(r3)     // Catch:{ all -> 0x0262 }
            r14 = r12
            if (r12 == 0) goto L_0x020a
            X.8ff r3 = r12.A03     // Catch:{ all -> 0x0262 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0262 }
            java.lang.Class<X.8fe> r0 = X.C361088fe.class
            if (r1 != r0) goto L_0x01e6
            X.8fe r3 = (X.C361088fe) r3     // Catch:{ all -> 0x0262 }
            X.68u r5 = r3.A00     // Catch:{ all -> 0x0262 }
        L_0x01e6:
            if (r5 == 0) goto L_0x020a
            X.0JR r0 = r2.A01     // Catch:{ all -> 0x0262 }
            long r17 = r0.now()     // Catch:{ all -> 0x0262 }
            long r3 = r12.A02     // Catch:{ all -> 0x0262 }
            long r0 = r12.A00     // Catch:{ all -> 0x0262 }
            long r0 = r9.toMillis(r0)     // Catch:{ all -> 0x0262 }
            long r7 = r3 + r0
            int r0 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x01fe
            r16 = 1
        L_0x01fe:
            long r0 = r12.A01     // Catch:{ all -> 0x0262 }
            long r0 = r9.toMillis(r0)     // Catch:{ all -> 0x0262 }
            long r3 = r3 + r0
            int r1 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x020b
        L_0x020a:
            r0 = 1
        L_0x020b:
            r3 = 2
            if (r0 == 0) goto L_0x0226
            java.util.concurrent.atomic.AtomicReference r0 = r2.A06     // Catch:{ all -> 0x0262 }
            r0.set(r10)     // Catch:{ all -> 0x0262 }
            X.8f4 r0 = new X.8f4     // Catch:{ all -> 0x0262 }
            r0.<init>(r2, r10, r13)     // Catch:{ all -> 0x0262 }
            r10.A00(r0)     // Catch:{ all -> 0x0262 }
            r1 = 726(0x2d6, float:1.017E-42)
            r0 = 2
            if (r13 == 0) goto L_0x0223
            r1 = 727(0x2d7, float:1.019E-42)
            r0 = 4
        L_0x0223:
            X.1ES.A05(r10, r1, r0, r11, r11)     // Catch:{ all -> 0x0262 }
        L_0x0226:
            if (r14 == 0) goto L_0x024e
            if (r5 == 0) goto L_0x024e
            if (r16 == 0) goto L_0x024e
            long r6 = r6.A02     // Catch:{ all -> 0x0262 }
            long r9 = r2.A00     // Catch:{ all -> 0x0262 }
            long r0 = r14.A02     // Catch:{ all -> 0x0262 }
            r15 = 0
            X.8fg r8 = new X.8fg     // Catch:{ all -> 0x0262 }
            r17 = r15
            r19 = r11
            r11 = r0
            r13 = r6
            r8.<init>(r9, r11, r13, r15, r17, r19)     // Catch:{ all -> 0x0262 }
            X.8fh r0 = new X.8fh     // Catch:{ all -> 0x0262 }
            r0.<init>(r8, r3)     // Catch:{ all -> 0x0262 }
            X.8fi r3 = new X.8fi     // Catch:{ all -> 0x0262 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0147
        L_0x024b:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0262 }
            goto L_0x0261
        L_0x024e:
            X.1Kg.A01()
            return
        L_0x0252:
            java.lang.String r0 = "IG Bloks data request task is not available"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0262 }
            r1.<init>(r0)     // Catch:{ all -> 0x0262 }
            goto L_0x0261
        L_0x025a:
            java.lang.String r0 = "IG Bloks data request task is not available"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0262 }
            r1.<init>(r0)     // Catch:{ all -> 0x0262 }
        L_0x0261:
            throw r1     // Catch:{ all -> 0x0262 }
        L_0x0262:
            r0 = move-exception
            X.1Kg.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359848da.A00(int):void");
    }

    public final void A01(Object obj) {
        C359898df r3 = this.A00;
        1Kg.A02("Emitter_emitResult");
        try {
            C359888de r1 = r3.A02;
            if (r1.CYP()) {
                C359898df.A02(r3, obj);
            } else {
                r1.E3G(new C361138fj(r3, obj), "Emitter_emitResult");
            }
        } finally {
            1Kg.A01();
        }
    }
}
