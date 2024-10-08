package X;

/* renamed from: X.5T2  reason: invalid class name */
public final class AnonymousClass5T2 {
    public boolean A00;
    public final AnonymousClass5T3 A01;
    public final AnonymousClass5T6 A02 = new AnonymousClass5T6();
    public final AnonymousClass5T7 A03 = new AnonymousClass5T7();
    public final AnonymousClass5R6 A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, X.01j] */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.Object, X.01j] */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0139, code lost:
        if (r8.A0B == false) goto L_0x013b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.GQK r48, X.C268134cp r49, boolean r50) {
        /*
            r47 = this;
            r6 = r47
            boolean r0 = r6.A00
            r23 = 0
            if (r0 == 0) goto L_0x000a
            r10 = 0
            return r10
        L_0x000a:
            r22 = 1
            r0 = r22
            r6.A00 = r0     // Catch:{ all -> 0x02ab }
            X.5T6 r0 = r6.A02     // Catch:{ all -> 0x02ab }
            r45 = r0
            r46 = r48
            r0 = r46
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x02ab }
            r44 = r0
            int r0 = r44.size()     // Catch:{ all -> 0x02ab }
            X.01c r12 = new X.01c     // Catch:{ all -> 0x02ab }
            r12.<init>(r0)     // Catch:{ all -> 0x02ab }
            int r17 = r44.size()     // Catch:{ all -> 0x02ab }
            r8 = 0
        L_0x002a:
            r0 = r17
            if (r8 >= r0) goto L_0x00be
            r0 = r44
            java.lang.Object r7 = r0.get(r8)     // Catch:{ all -> 0x02ab }
            X.GQJ r7 = (X.GQJ) r7     // Catch:{ all -> 0x02ab }
            r0 = r45
            X.01c r11 = r0.A00     // Catch:{ all -> 0x02ab }
            long r0 = r7.A02     // Catch:{ all -> 0x02ab }
            java.lang.Object r1 = r11.A05(r0)     // Catch:{ all -> 0x02ab }
            X.XDu r1 = (X.C21081XDu) r1     // Catch:{ all -> 0x02ab }
            if (r1 != 0) goto L_0x008b
            long r9 = r7.A07     // Catch:{ all -> 0x02ab }
            long r4 = r7.A04     // Catch:{ all -> 0x02ab }
            r16 = 0
        L_0x004a:
            long r2 = r7.A02     // Catch:{ all -> 0x02ab }
            long r0 = r7.A07     // Catch:{ all -> 0x02ab }
            r42 = r0
            long r0 = r7.A04     // Catch:{ all -> 0x02ab }
            r24 = r0
            boolean r14 = r7.A0A     // Catch:{ all -> 0x02ab }
            float r0 = r7.A00     // Catch:{ all -> 0x02ab }
            r21 = r0
            int r0 = r7.A01     // Catch:{ all -> 0x02ab }
            r20 = r0
            java.util.List r13 = r7.A08     // Catch:{ all -> 0x02ab }
            long r0 = r7.A06     // Catch:{ all -> 0x02ab }
            r18 = r0
            long r0 = r7.A03     // Catch:{ all -> 0x02ab }
            X.GPU r15 = new X.GPU     // Catch:{ all -> 0x02ab }
            r31 = r24
            r33 = r9
            r35 = r4
            r37 = r18
            r39 = r14
            r40 = r16
            r41 = r23
            r24 = r15
            r25 = r21
            r26 = r20
            r27 = r2
            r29 = r42
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r39, r40, r41)     // Catch:{ all -> 0x02ab }
            r15.A02 = r13     // Catch:{ all -> 0x02ab }
            r15.A00 = r0     // Catch:{ all -> 0x02ab }
            r12.A09(r2, r15)     // Catch:{ all -> 0x02ab }
            goto L_0x009a
        L_0x008b:
            long r9 = r1.A01     // Catch:{ all -> 0x02ab }
            boolean r0 = r1.A02     // Catch:{ all -> 0x02ab }
            r16 = r0
            long r0 = r1.A00     // Catch:{ all -> 0x02ab }
            r2 = r49
            long r4 = r2.EKS(r0)     // Catch:{ all -> 0x02ab }
            goto L_0x004a
        L_0x009a:
            if (r14 == 0) goto L_0x00b5
            long r2 = r7.A02     // Catch:{ all -> 0x02ab }
            long r4 = r7.A07     // Catch:{ all -> 0x02ab }
            long r0 = r7.A05     // Catch:{ all -> 0x02ab }
            boolean r9 = r7.A0A     // Catch:{ all -> 0x02ab }
            X.XDu r7 = new X.XDu     // Catch:{ all -> 0x02ab }
            r24 = r7
            r25 = r4
            r27 = r0
            r29 = r9
            r24.<init>(r25, r27, r29)     // Catch:{ all -> 0x02ab }
            r11.A09(r2, r7)     // Catch:{ all -> 0x02ab }
            goto L_0x00ba
        L_0x00b5:
            long r0 = r7.A02     // Catch:{ all -> 0x02ab }
            r11.A08(r0)     // Catch:{ all -> 0x02ab }
        L_0x00ba:
            int r8 = r8 + 1
            goto L_0x002a
        L_0x00be:
            X.GPV r5 = new X.GPV     // Catch:{ all -> 0x02ab }
            r0 = r46
            r5.<init>(r12, r0)     // Catch:{ all -> 0x02ab }
            X.01c r7 = r5.A01     // Catch:{ all -> 0x02ab }
            int r3 = r7.A00()     // Catch:{ all -> 0x02ab }
            r2 = 0
        L_0x00cc:
            if (r2 >= r3) goto L_0x00e2
            java.lang.Object r1 = r7.A04(r2)     // Catch:{ all -> 0x02ab }
            X.GPU r1 = (X.GPU) r1     // Catch:{ all -> 0x02ab }
            boolean r0 = r1.A0B     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x00df
            boolean r0 = r1.A0C     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x00df
            int r2 = r2 + 1
            goto L_0x00cc
        L_0x00df:
            r21 = 0
            goto L_0x00e4
        L_0x00e2:
            r21 = 1
        L_0x00e4:
            int r20 = r7.A00()     // Catch:{ all -> 0x02ab }
            r4 = 0
        L_0x00e9:
            r0 = r20
            if (r4 >= r0) goto L_0x025a
            java.lang.Object r8 = r7.A04(r4)     // Catch:{ all -> 0x02ab }
            X.GPU r8 = (X.GPU) r8     // Catch:{ all -> 0x02ab }
            if (r21 != 0) goto L_0x00ff
            boolean r0 = r8.A0C     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x0256
            boolean r0 = r8.A0B     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x00ff
            goto L_0x0256
        L_0x00ff:
            int r1 = r8.A04     // Catch:{ all -> 0x02ab }
            r14 = 0
            r0 = r22
            if (r1 != r0) goto L_0x0107
            r14 = 1
        L_0x0107:
            X.5R6 r3 = r6.A04     // Catch:{ all -> 0x02ab }
            long r0 = r8.A06     // Catch:{ all -> 0x02ab }
            X.5T7 r2 = r6.A03     // Catch:{ all -> 0x02ab }
            r25 = r2
            X.5RP r9 = r3.A0W     // Catch:{ all -> 0x02ab }
            X.4cg r3 = r9.A04     // Catch:{ all -> 0x02ab }
            X.5S3 r2 = X.C268054cg.A0L     // Catch:{ all -> 0x02ab }
            long r12 = r3.A0V(r0)     // Catch:{ all -> 0x02ab }
            X.4cg r0 = r9.A04     // Catch:{ all -> 0x02ab }
            X.5S6 r11 = X.C268054cg.A0M     // Catch:{ all -> 0x02ab }
            r9 = r0
            r10 = r25
            r15 = r22
            r9.A0n(r10, r11, r12, r14, r15)     // Catch:{ all -> 0x02ab }
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x02ab }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0256
            X.5T3 r1 = r6.A01     // Catch:{ all -> 0x02ab }
            long r2 = r8.A05     // Catch:{ all -> 0x02ab }
            boolean r0 = r8.A0C     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x013b
            boolean r0 = r8.A0B     // Catch:{ all -> 0x02ab }
            r18 = 1
            if (r0 != 0) goto L_0x013d
        L_0x013b:
            r18 = 0
        L_0x013d:
            X.5T4 r10 = r1.A01     // Catch:{ all -> 0x02ab }
            r24 = r10
            X.0wd r9 = r1.A00     // Catch:{ all -> 0x02ab }
            r0 = r23
            r9.A01 = r0     // Catch:{ all -> 0x02ab }
            long[] r12 = r9.A03     // Catch:{ all -> 0x02ab }
            long[] r0 = X.01o.A00     // Catch:{ all -> 0x02ab }
            if (r12 == r0) goto L_0x016e
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            int r11 = r12.length     // Catch:{ all -> 0x02ab }
            r8 = r23
            java.util.Arrays.fill(r12, r8, r11, r0)     // Catch:{ all -> 0x02ab }
            long[] r8 = r9.A03     // Catch:{ all -> 0x02ab }
            int r0 = r9.A00     // Catch:{ all -> 0x02ab }
            int r15 = r0 >> 3
            r0 = r0 & 7
            int r0 = r0 << 3
            r13 = r8[r15]     // Catch:{ all -> 0x02ab }
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 << r0
            r0 = -1
            long r0 = r0 ^ r11
            long r13 = r13 & r0
            long r13 = r13 | r11
            r8[r15] = r13     // Catch:{ all -> 0x02ab }
        L_0x016e:
            java.lang.Object[] r8 = r9.A04     // Catch:{ all -> 0x02ab }
            int r1 = r9.A00     // Catch:{ all -> 0x02ab }
            r0 = r23
            X.0Yw.A0U(r8, r0, r1)     // Catch:{ all -> 0x02ab }
            X.0wd.A01(r9)     // Catch:{ all -> 0x02ab }
            int r11 = r25.size()     // Catch:{ all -> 0x02ab }
            r8 = 0
            r17 = 1
        L_0x0181:
            if (r8 >= r11) goto L_0x0200
            r0 = r25
            java.lang.Object r15 = r0.get(r8)     // Catch:{ all -> 0x02ab }
            X.4cD r15 = (X.C267794cD) r15     // Catch:{ all -> 0x02ab }
            r16 = 0
            if (r17 == 0) goto L_0x01d4
            X.5Pl r0 = r10.A00     // Catch:{ all -> 0x02ab }
            int r14 = r0.A00     // Catch:{ all -> 0x02ab }
            if (r14 <= 0) goto L_0x01a9
            java.lang.Object[] r13 = r0.A02     // Catch:{ all -> 0x02ab }
            r1 = 0
        L_0x0198:
            r12 = r13[r1]     // Catch:{ all -> 0x02ab }
            r0 = r12
            X.5T5 r0 = (X.AnonymousClass5T5) r0     // Catch:{ all -> 0x02ab }
            X.4cD r0 = r0.A06     // Catch:{ all -> 0x02ab }
            boolean r0 = X.0qQ.A0K(r0, r15)     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x01ab
            int r1 = r1 + 1
            if (r1 < r14) goto L_0x0198
        L_0x01a9:
            r12 = r16
        L_0x01ab:
            X.5T5 r12 = (X.AnonymousClass5T5) r12     // Catch:{ all -> 0x02ab }
            if (r12 == 0) goto L_0x01d2
            r0 = r22
            r12.A02 = r0     // Catch:{ all -> 0x02ab }
            X.Pzi r0 = r12.A07     // Catch:{ all -> 0x02ab }
            r0.A00(r2)     // Catch:{ all -> 0x02ab }
            java.lang.Object r1 = r9.A03(r2)     // Catch:{ all -> 0x02ab }
            if (r1 != 0) goto L_0x01cc
            r0 = 16
            X.0vt r1 = new X.0vt     // Catch:{ all -> 0x02ab }
            r1.<init>()     // Catch:{ all -> 0x02ab }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ab }
            r1.A01 = r0     // Catch:{ all -> 0x02ab }
            r9.A04(r2, r1)     // Catch:{ all -> 0x02ab }
        L_0x01cc:
            X.0vt r1 = (X.0vt) r1     // Catch:{ all -> 0x02ab }
            r1.A00(r12)     // Catch:{ all -> 0x02ab }
            goto L_0x01fc
        L_0x01d2:
            r17 = 0
        L_0x01d4:
            X.5T5 r12 = new X.5T5     // Catch:{ all -> 0x02ab }
            r12.<init>(r15)     // Catch:{ all -> 0x02ab }
            X.Pzi r0 = r12.A07     // Catch:{ all -> 0x02ab }
            r0.A00(r2)     // Catch:{ all -> 0x02ab }
            java.lang.Object r1 = r9.A03(r2)     // Catch:{ all -> 0x02ab }
            if (r1 != 0) goto L_0x01f2
            r0 = 16
            X.0vt r1 = new X.0vt     // Catch:{ all -> 0x02ab }
            r1.<init>()     // Catch:{ all -> 0x02ab }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x02ab }
            r1.A01 = r0     // Catch:{ all -> 0x02ab }
            r9.A04(r2, r1)     // Catch:{ all -> 0x02ab }
        L_0x01f2:
            X.0vt r1 = (X.0vt) r1     // Catch:{ all -> 0x02ab }
            r1.A00(r12)     // Catch:{ all -> 0x02ab }
            X.5Pl r0 = r10.A00     // Catch:{ all -> 0x02ab }
            r0.A09(r12)     // Catch:{ all -> 0x02ab }
        L_0x01fc:
            r10 = r12
            int r8 = r8 + 1
            goto L_0x0181
        L_0x0200:
            if (r18 == 0) goto L_0x0253
            long[] r15 = r9.A02     // Catch:{ all -> 0x02ab }
            java.lang.Object[] r14 = r9.A04     // Catch:{ all -> 0x02ab }
            long[] r13 = r9.A03     // Catch:{ all -> 0x02ab }
            int r0 = r13.length     // Catch:{ all -> 0x02ab }
            int r12 = r0 + -2
            if (r12 < 0) goto L_0x0253
            r11 = 0
        L_0x020e:
            r18 = r13[r11]     // Catch:{ all -> 0x02ab }
            r8 = -1
            long r8 = r8 ^ r18
            r0 = 7
            long r8 = r8 << r0
            long r8 = r8 & r18
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x024e
            int r0 = r11 - r12
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r10 = 8
            int r9 = 8 - r0
            r8 = 0
        L_0x022d:
            if (r8 >= r9) goto L_0x024c
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r18
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0247
            int r2 = r11 << 3
            int r2 = r2 + r8
            r0 = r15[r2]     // Catch:{ all -> 0x02ab }
            r3 = r14[r2]     // Catch:{ all -> 0x02ab }
            X.0vt r3 = (X.0vt) r3     // Catch:{ all -> 0x02ab }
            r2 = r24
            r2.A02(r3, r0)     // Catch:{ all -> 0x02ab }
        L_0x0247:
            long r18 = r18 >> r10
            int r8 = r8 + 1
            goto L_0x022d
        L_0x024c:
            if (r9 != r10) goto L_0x0253
        L_0x024e:
            if (r11 == r12) goto L_0x0253
            int r11 = r11 + 1
            goto L_0x020e
        L_0x0253:
            r25.clear()     // Catch:{ all -> 0x02ab }
        L_0x0256:
            int r4 = r4 + 1
            goto L_0x00e9
        L_0x025a:
            X.5T3 r0 = r6.A01     // Catch:{ all -> 0x02ab }
            X.5T4 r2 = r0.A01     // Catch:{ all -> 0x02ab }
            r2.A01()     // Catch:{ all -> 0x02ab }
            X.4ch r1 = r0.A02     // Catch:{ all -> 0x02ab }
            r3 = r50
            boolean r0 = r2.A04(r7, r5, r1, r3)     // Catch:{ all -> 0x02ab }
            r10 = 0
            if (r0 == 0) goto L_0x0279
            boolean r1 = r2.A05(r7, r5, r1, r3)     // Catch:{ all -> 0x02ab }
            boolean r0 = r2.A06(r5)     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x0278
            if (r1 == 0) goto L_0x0279
        L_0x0278:
            r10 = 1
        L_0x0279:
            boolean r0 = r5.A00     // Catch:{ all -> 0x02ab }
            if (r0 != 0) goto L_0x02a4
            int r9 = r7.A00()     // Catch:{ all -> 0x02ab }
            r8 = 0
        L_0x0282:
            if (r8 >= r9) goto L_0x02a4
            java.lang.Object r5 = r7.A04(r8)     // Catch:{ all -> 0x02ab }
            X.GPU r5 = (X.GPU) r5     // Catch:{ all -> 0x02ab }
            long r2 = r5.A07     // Catch:{ all -> 0x02ab }
            long r0 = r5.A06     // Catch:{ all -> 0x02ab }
            long r3 = X.C289295dM.A06(r0, r2)     // Catch:{ all -> 0x02ab }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x029f
            boolean r0 = r5.A02()     // Catch:{ all -> 0x02ab }
            if (r0 == 0) goto L_0x029f
            goto L_0x02a2
        L_0x029f:
            int r8 = r8 + 1
            goto L_0x0282
        L_0x02a2:
            r0 = 2
            goto L_0x02a5
        L_0x02a4:
            r0 = 0
        L_0x02a5:
            r10 = r10 | r0
            r0 = r23
            r6.A00 = r0
            return r10
        L_0x02ab:
            r1 = move-exception
            r0 = r23
            r6.A00 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5T2.A00(X.GQK, X.4cp, boolean):int");
    }

    public AnonymousClass5T2(AnonymousClass5R6 r3) {
        this.A04 = r3;
        this.A01 = new AnonymousClass5T3(r3.A0W.A06);
    }
}
