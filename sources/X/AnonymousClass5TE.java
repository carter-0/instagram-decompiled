package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5TE  reason: invalid class name */
public final class AnonymousClass5TE {
    public C285105Ps A00;
    public AnonymousClass5TF A01;
    public boolean A02;
    public boolean A03;
    public long A04 = -1;
    public final C285045Pl A05 = new C285045Pl(new AnonymousClass5TF[16]);
    public final AtomicReference A06 = new AtomicReference((Object) null);
    public final 0sP A07;
    public final 0sL A08 = new AnonymousClass9LZ(this, 5);
    public final 0sP A09 = new AnonymousClass9L6(this, 41);

    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0512, code lost:
        if (r0 != false) goto L_0x0514;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass5TE r51) {
        /*
            r0 = r51
            X.5Pl r0 = r0.A05
            r29 = r0
            monitor-enter(r29)
            r0 = r51
            boolean r0 = r0.A03     // Catch:{ all -> 0x055d }
            monitor-exit(r29)
            r30 = 0
            if (r0 == 0) goto L_0x0011
            return r30
        L_0x0011:
            r28 = 0
        L_0x0013:
            r0 = r51
            java.util.concurrent.atomic.AtomicReference r5 = r0.A06
            java.lang.Object r4 = r5.get()
            r6 = 0
            if (r4 == 0) goto L_0x055c
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L_0x0521
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r31 = r0
        L_0x0027:
            boolean r0 = X.1FH.A00(r4, r6, r5)
            if (r0 == 0) goto L_0x0013
            if (r31 == 0) goto L_0x055c
            monitor-enter(r29)
            r0 = r29
            int r0 = r0.A00     // Catch:{ all -> 0x055d }
            r33 = r0
            if (r0 <= 0) goto L_0x051e
            r0 = r29
            java.lang.Object[] r0 = r0.A02     // Catch:{ all -> 0x055d }
            r34 = r0
            r32 = 0
        L_0x0040:
            r3 = r34[r32]     // Catch:{ all -> 0x055d }
            X.5TF r3 = (X.AnonymousClass5TF) r3     // Catch:{ all -> 0x055d }
            X.5Wr r0 = r3.A08     // Catch:{ all -> 0x055d }
            r50 = r0
            java.util.HashMap r0 = r3.A0A     // Catch:{ all -> 0x055d }
            r49 = r0
            X.5Wr r2 = r3.A09     // Catch:{ all -> 0x055d }
            X.0vq r5 = r3.A05     // Catch:{ all -> 0x055d }
            r0 = r31
            boolean r0 = r0 instanceof X.C285135Pw     // Catch:{ all -> 0x055d }
            java.lang.String r42 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"
            r24 = 255(0xff, double:1.26E-321)
            r6 = 7
            r18 = -1
            r4 = 2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r0 == 0) goto L_0x0284
            r0 = r31
            X.5Pw r0 = (X.C285135Pw) r0     // Catch:{ all -> 0x055d }
            X.01p r1 = r0.A00     // Catch:{ all -> 0x055d }
            java.lang.Object[] r0 = r1.A03     // Catch:{ all -> 0x055d }
            r48 = r0
            long[] r0 = r1.A02     // Catch:{ all -> 0x055d }
            r47 = r0
            int r11 = r0.length     // Catch:{ all -> 0x055d }
            int r11 = r11 - r4
            r35 = 0
            if (r11 < 0) goto L_0x0470
            r10 = 0
        L_0x0078:
            r22 = r47[r10]     // Catch:{ all -> 0x055d }
            long r0 = r22 ^ r18
            long r0 = r0 << r6
            long r6 = r22 & r0
            long r6 = r6 & r16
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x027d
            int r0 = r10 - r11
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r46 = 8 - r0
            r12 = 0
        L_0x008e:
            r0 = r46
            if (r12 >= r0) goto L_0x0279
            long r6 = r22 & r24
            r20 = 128(0x80, double:6.32E-322)
            int r0 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x0271
            int r0 = r10 << 3
            int r0 = r0 + r12
            r8 = r48[r0]     // Catch:{ all -> 0x055d }
            boolean r0 = r8 instanceof X.AnonymousClass5Ow     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x00b0
            r0 = r8
            X.5Ow r0 = (X.AnonymousClass5Ow) r0     // Catch:{ all -> 0x055d }
            X.4dV r0 = r0.A00     // Catch:{ all -> 0x055d }
            int r0 = r0.get()     // Catch:{ all -> 0x055d }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0271
        L_0x00b0:
            r0 = r50
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x055d }
            boolean r1 = r0.A04(r8)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0218
            java.lang.Object r1 = r0.A03(r8)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0218
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x0197
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r0 = r1.A03     // Catch:{ all -> 0x055d }
            r45 = r0
            long[] r0 = r1.A02     // Catch:{ all -> 0x055d }
            r41 = r0
            int r0 = r0.length     // Catch:{ all -> 0x055d }
            int r9 = r0 + -2
            if (r9 < 0) goto L_0x0218
            r7 = 0
        L_0x00d4:
            r43 = r41[r7]     // Catch:{ all -> 0x055d }
            long r0 = r43 ^ r18
            r40 = 7
            long r0 = r0 << r40
            long r13 = r43 & r0
            long r13 = r13 & r16
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0191
            int r0 = r7 - r9
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r39 = 8 - r0
            r13 = 0
        L_0x00ed:
            r0 = r39
            if (r13 >= r0) goto L_0x018d
            long r14 = r43 & r24
            int r0 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x0185
            int r0 = r7 << 3
            int r0 = r0 + r13
            r6 = r45[r0]     // Catch:{ all -> 0x055d }
            X.5TY r6 = (X.AnonymousClass5TY) r6     // Catch:{ all -> 0x055d }
            r0 = r42
            X.0qQ.A0C(r6, r0)     // Catch:{ all -> 0x055d }
            r0 = r49
            java.lang.Object r4 = r0.get(r6)     // Catch:{ all -> 0x055d }
            r0 = r6
            X.5TX r0 = (X.AnonymousClass5TX) r0     // Catch:{ all -> 0x055d }
            X.5Os r1 = r0.A01     // Catch:{ all -> 0x055d }
            if (r1 != 0) goto L_0x0117
            X.5Or r1 = X.C284885Or.A00     // Catch:{ all -> 0x055d }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x055d }
        L_0x0117:
            X.5TZ r0 = r6.AuM()     // Catch:{ all -> 0x055d }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x055d }
            boolean r0 = r1.ASs(r0, r4)     // Catch:{ all -> 0x055d }
            if (r0 != 0) goto L_0x017d
            X.0vr r0 = r2.A00     // Catch:{ all -> 0x055d }
            java.lang.Object r1 = r0.A03(r6)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0185
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x0179
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r0 = r1.A03     // Catch:{ all -> 0x055d }
            r38 = r0
            long[] r14 = r1.A02     // Catch:{ all -> 0x055d }
            int r6 = r14.length     // Catch:{ all -> 0x055d }
            r0 = 2
            int r6 = r6 - r0
            if (r6 < 0) goto L_0x0185
            r4 = 0
        L_0x013d:
            r36 = r14[r4]     // Catch:{ all -> 0x055d }
            long r0 = r36 ^ r18
            long r0 = r0 << r40
            long r26 = r36 & r0
            long r26 = r26 & r16
            int r0 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0174
            int r0 = r4 - r6
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r1 = 8 - r0
            r15 = 0
        L_0x0154:
            if (r15 >= r1) goto L_0x0170
            long r26 = r36 & r24
            int r0 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x0169
            int r0 = r4 << 3
            int r0 = r0 + r15
            r0 = r38[r0]     // Catch:{ all -> 0x055d }
            r5.A09(r0)     // Catch:{ all -> 0x055d }
            r0 = 8
            r35 = 1
            goto L_0x016b
        L_0x0169:
            r0 = 8
        L_0x016b:
            long r36 = r36 >> r0
            int r15 = r15 + 1
            goto L_0x0154
        L_0x0170:
            r0 = 8
            if (r1 != r0) goto L_0x0185
        L_0x0174:
            if (r4 == r6) goto L_0x0185
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0179:
            r5.A09(r1)     // Catch:{ all -> 0x055d }
            goto L_0x0183
        L_0x017d:
            X.5Pl r0 = r3.A07     // Catch:{ all -> 0x055d }
            r0.A09(r6)     // Catch:{ all -> 0x055d }
            goto L_0x0185
        L_0x0183:
            r35 = 1
        L_0x0185:
            r0 = 8
            long r43 = r43 >> r0
            int r13 = r13 + 1
            goto L_0x00ed
        L_0x018d:
            r1 = 8
            if (r0 != r1) goto L_0x0218
        L_0x0191:
            if (r7 == r9) goto L_0x0218
            int r7 = r7 + 1
            goto L_0x00d4
        L_0x0197:
            X.5TY r1 = (X.AnonymousClass5TY) r1     // Catch:{ all -> 0x055d }
            r0 = r49
            java.lang.Object r6 = r0.get(r1)     // Catch:{ all -> 0x055d }
            r0 = r1
            X.5TX r0 = (X.AnonymousClass5TX) r0     // Catch:{ all -> 0x055d }
            X.5Os r4 = r0.A01     // Catch:{ all -> 0x055d }
            if (r4 != 0) goto L_0x01ad
            X.5Or r4 = X.C284885Or.A00     // Catch:{ all -> 0x055d }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r4, r0)     // Catch:{ all -> 0x055d }
        L_0x01ad:
            X.5TZ r0 = r1.AuM()     // Catch:{ all -> 0x055d }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x055d }
            boolean r0 = r4.ASs(r0, r6)     // Catch:{ all -> 0x055d }
            if (r0 != 0) goto L_0x0213
            X.0vr r0 = r2.A00     // Catch:{ all -> 0x055d }
            java.lang.Object r1 = r0.A03(r1)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0218
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x020d
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r13 = r1.A03     // Catch:{ all -> 0x055d }
            long[] r9 = r1.A02     // Catch:{ all -> 0x055d }
            int r7 = r9.length     // Catch:{ all -> 0x055d }
            r0 = 2
            int r7 = r7 - r0
            if (r7 < 0) goto L_0x0218
            r6 = 0
        L_0x01d1:
            r26 = r9[r6]     // Catch:{ all -> 0x055d }
            long r14 = r26 ^ r18
            r0 = 7
            long r14 = r14 << r0
            long r14 = r14 & r26
            long r14 = r14 & r16
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0208
            int r0 = r6 - r7
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r4 = 8 - r0
            r1 = 0
        L_0x01e8:
            if (r1 >= r4) goto L_0x0204
            long r14 = r26 & r24
            int r0 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x01fd
            int r0 = r6 << 3
            int r0 = r0 + r1
            r0 = r13[r0]     // Catch:{ all -> 0x055d }
            r5.A09(r0)     // Catch:{ all -> 0x055d }
            r0 = 8
            r35 = 1
            goto L_0x01ff
        L_0x01fd:
            r0 = 8
        L_0x01ff:
            long r26 = r26 >> r0
            int r1 = r1 + 1
            goto L_0x01e8
        L_0x0204:
            r0 = 8
            if (r4 != r0) goto L_0x0218
        L_0x0208:
            if (r6 == r7) goto L_0x0218
            int r6 = r6 + 1
            goto L_0x01d1
        L_0x020d:
            r5.A09(r1)     // Catch:{ all -> 0x055d }
            r35 = 1
            goto L_0x0218
        L_0x0213:
            X.5Pl r0 = r3.A07     // Catch:{ all -> 0x055d }
            r0.A09(r1)     // Catch:{ all -> 0x055d }
        L_0x0218:
            X.0vr r0 = r2.A00     // Catch:{ all -> 0x055d }
            java.lang.Object r1 = r0.A03(r8)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0271
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x026c
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r9 = r1.A03     // Catch:{ all -> 0x055d }
            long[] r8 = r1.A02     // Catch:{ all -> 0x055d }
            int r7 = r8.length     // Catch:{ all -> 0x055d }
            r0 = 2
            int r7 = r7 - r0
            if (r7 < 0) goto L_0x0271
            r6 = 0
        L_0x0230:
            r26 = r8[r6]     // Catch:{ all -> 0x055d }
            long r13 = r26 ^ r18
            r0 = 7
            long r13 = r13 << r0
            long r13 = r13 & r26
            long r13 = r13 & r16
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0267
            int r0 = r6 - r7
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r4 = 8 - r0
            r1 = 0
        L_0x0247:
            if (r1 >= r4) goto L_0x0263
            long r13 = r26 & r24
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x025c
            int r0 = r6 << 3
            int r0 = r0 + r1
            r0 = r9[r0]     // Catch:{ all -> 0x055d }
            r5.A09(r0)     // Catch:{ all -> 0x055d }
            r0 = 8
            r35 = 1
            goto L_0x025e
        L_0x025c:
            r0 = 8
        L_0x025e:
            long r26 = r26 >> r0
            int r1 = r1 + 1
            goto L_0x0247
        L_0x0263:
            r0 = 8
            if (r4 != r0) goto L_0x0271
        L_0x0267:
            if (r6 == r7) goto L_0x0271
            int r6 = r6 + 1
            goto L_0x0230
        L_0x026c:
            r5.A09(r1)     // Catch:{ all -> 0x055d }
            r35 = 1
        L_0x0271:
            r0 = 8
            long r22 = r22 >> r0
            int r12 = r12 + 1
            goto L_0x008e
        L_0x0279:
            r1 = 8
            if (r0 != r1) goto L_0x0470
        L_0x027d:
            if (r10 == r11) goto L_0x0470
            int r10 = r10 + 1
            r6 = 7
            goto L_0x0078
        L_0x0284:
            java.util.Iterator r41 = r31.iterator()     // Catch:{ all -> 0x055d }
            r35 = 0
        L_0x028a:
            boolean r0 = r41.hasNext()     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x0470
            java.lang.Object r9 = r41.next()     // Catch:{ all -> 0x055d }
            boolean r0 = r9 instanceof X.AnonymousClass5Ow     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x02a5
            r0 = r9
            X.5Ow r0 = (X.AnonymousClass5Ow) r0     // Catch:{ all -> 0x055d }
            X.4dV r0 = r0.A00     // Catch:{ all -> 0x055d }
            int r0 = r0.get()     // Catch:{ all -> 0x055d }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x028a
        L_0x02a5:
            r0 = r50
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x055d }
            boolean r1 = r0.A04(r9)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0413
            java.lang.Object r1 = r0.A03(r9)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0413
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x038e
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r0 = r1.A03     // Catch:{ all -> 0x055d }
            r40 = r0
            long[] r12 = r1.A02     // Catch:{ all -> 0x055d }
            int r11 = r12.length     // Catch:{ all -> 0x055d }
            r39 = 2
            int r11 = r11 - r39
            if (r11 < 0) goto L_0x0413
            r10 = 0
        L_0x02c9:
            r37 = r12[r10]     // Catch:{ all -> 0x055d }
            long r6 = r37 ^ r18
            r36 = 7
            long r6 = r6 << r36
            long r6 = r6 & r37
            long r6 = r6 & r16
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0388
            int r0 = r10 - r11
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r8 = 8 - r0
            r7 = 0
        L_0x02e2:
            if (r7 >= r8) goto L_0x0384
            r0 = 255(0xff, double:1.26E-321)
            long r13 = r37 & r0
            r26 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r0 >= 0) goto L_0x037c
            int r0 = r10 << 3
            int r0 = r0 + r7
            r4 = r40[r0]     // Catch:{ all -> 0x055d }
            X.5TY r4 = (X.AnonymousClass5TY) r4     // Catch:{ all -> 0x055d }
            r0 = r42
            X.0qQ.A0C(r4, r0)     // Catch:{ all -> 0x055d }
            r0 = r49
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x055d }
            r0 = r4
            X.5TX r0 = (X.AnonymousClass5TX) r0     // Catch:{ all -> 0x055d }
            X.5Os r1 = r0.A01     // Catch:{ all -> 0x055d }
            if (r1 != 0) goto L_0x030e
            X.5Or r1 = X.C284885Or.A00     // Catch:{ all -> 0x055d }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x055d }
        L_0x030e:
            X.5TZ r0 = r4.AuM()     // Catch:{ all -> 0x055d }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x055d }
            boolean r0 = r1.ASs(r0, r6)     // Catch:{ all -> 0x055d }
            if (r0 != 0) goto L_0x0374
            X.0vr r0 = r2.A00     // Catch:{ all -> 0x055d }
            java.lang.Object r1 = r0.A03(r4)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x037c
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x0370
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r14 = r1.A03     // Catch:{ all -> 0x055d }
            long[] r13 = r1.A02     // Catch:{ all -> 0x055d }
            int r6 = r13.length     // Catch:{ all -> 0x055d }
            int r6 = r6 - r39
            if (r6 < 0) goto L_0x037c
            r4 = 0
        L_0x0332:
            r24 = r13[r4]     // Catch:{ all -> 0x055d }
            long r0 = r24 ^ r18
            long r0 = r0 << r36
            long r20 = r24 & r0
            long r20 = r20 & r16
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x036b
            int r0 = r4 - r6
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r1 = 8 - r0
            r15 = 0
        L_0x0349:
            if (r15 >= r1) goto L_0x0367
            r22 = 255(0xff, double:1.26E-321)
            long r20 = r24 & r22
            int r0 = (r20 > r26 ? 1 : (r20 == r26 ? 0 : -1))
            if (r0 >= 0) goto L_0x0360
            int r0 = r4 << 3
            int r0 = r0 + r15
            r0 = r14[r0]     // Catch:{ all -> 0x055d }
            r5.A09(r0)     // Catch:{ all -> 0x055d }
            r0 = 8
            r35 = 1
            goto L_0x0362
        L_0x0360:
            r0 = 8
        L_0x0362:
            long r24 = r24 >> r0
            int r15 = r15 + 1
            goto L_0x0349
        L_0x0367:
            r0 = 8
            if (r1 != r0) goto L_0x037c
        L_0x036b:
            if (r4 == r6) goto L_0x037c
            int r4 = r4 + 1
            goto L_0x0332
        L_0x0370:
            r5.A09(r1)     // Catch:{ all -> 0x055d }
            goto L_0x037a
        L_0x0374:
            X.5Pl r0 = r3.A07     // Catch:{ all -> 0x055d }
            r0.A09(r4)     // Catch:{ all -> 0x055d }
            goto L_0x037c
        L_0x037a:
            r35 = 1
        L_0x037c:
            r0 = 8
            long r37 = r37 >> r0
            int r7 = r7 + 1
            goto L_0x02e2
        L_0x0384:
            r0 = 8
            if (r8 != r0) goto L_0x0413
        L_0x0388:
            if (r10 == r11) goto L_0x0413
            int r10 = r10 + 1
            goto L_0x02c9
        L_0x038e:
            X.5TY r1 = (X.AnonymousClass5TY) r1     // Catch:{ all -> 0x055d }
            r0 = r49
            java.lang.Object r6 = r0.get(r1)     // Catch:{ all -> 0x055d }
            r0 = r1
            X.5TX r0 = (X.AnonymousClass5TX) r0     // Catch:{ all -> 0x055d }
            X.5Os r4 = r0.A01     // Catch:{ all -> 0x055d }
            if (r4 != 0) goto L_0x03a4
            X.5Or r4 = X.C284885Or.A00     // Catch:{ all -> 0x055d }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r4, r0)     // Catch:{ all -> 0x055d }
        L_0x03a4:
            X.5TZ r0 = r1.AuM()     // Catch:{ all -> 0x055d }
            java.lang.Object r0 = r0.A04     // Catch:{ all -> 0x055d }
            boolean r0 = r4.ASs(r0, r6)     // Catch:{ all -> 0x055d }
            if (r0 != 0) goto L_0x040e
            X.0vr r0 = r2.A00     // Catch:{ all -> 0x055d }
            java.lang.Object r1 = r0.A03(r1)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x0413
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x0408
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r8 = r1.A03     // Catch:{ all -> 0x055d }
            long[] r7 = r1.A02     // Catch:{ all -> 0x055d }
            int r6 = r7.length     // Catch:{ all -> 0x055d }
            r0 = 2
            int r6 = r6 - r0
            if (r6 < 0) goto L_0x0413
            r4 = 0
        L_0x03c8:
            r20 = r7[r4]     // Catch:{ all -> 0x055d }
            long r10 = r20 ^ r18
            r0 = 7
            long r10 = r10 << r0
            long r10 = r10 & r20
            long r10 = r10 & r16
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0403
            int r0 = r4 - r6
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r1 = 8 - r0
            r10 = 0
        L_0x03df:
            if (r10 >= r1) goto L_0x03ff
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r20 & r11
            r11 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x03f8
            int r0 = r4 << 3
            int r0 = r0 + r10
            r0 = r8[r0]     // Catch:{ all -> 0x055d }
            r5.A09(r0)     // Catch:{ all -> 0x055d }
            r0 = 8
            r35 = 1
            goto L_0x03fa
        L_0x03f8:
            r0 = 8
        L_0x03fa:
            long r20 = r20 >> r0
            int r10 = r10 + 1
            goto L_0x03df
        L_0x03ff:
            r0 = 8
            if (r1 != r0) goto L_0x0413
        L_0x0403:
            if (r4 == r6) goto L_0x0413
            int r4 = r4 + 1
            goto L_0x03c8
        L_0x0408:
            r5.A09(r1)     // Catch:{ all -> 0x055d }
            r35 = 1
            goto L_0x0413
        L_0x040e:
            X.5Pl r0 = r3.A07     // Catch:{ all -> 0x055d }
            r0.A09(r1)     // Catch:{ all -> 0x055d }
        L_0x0413:
            X.0vr r0 = r2.A00     // Catch:{ all -> 0x055d }
            java.lang.Object r1 = r0.A03(r9)     // Catch:{ all -> 0x055d }
            if (r1 == 0) goto L_0x028a
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x0469
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x055d }
            java.lang.Object[] r8 = r1.A03     // Catch:{ all -> 0x055d }
            long[] r7 = r1.A02     // Catch:{ all -> 0x055d }
            int r6 = r7.length     // Catch:{ all -> 0x055d }
            r0 = 2
            int r6 = r6 - r0
            if (r6 < 0) goto L_0x028a
            r4 = 0
        L_0x042b:
            r14 = r7[r4]     // Catch:{ all -> 0x055d }
            long r9 = r14 ^ r18
            r0 = 7
            long r9 = r9 << r0
            long r9 = r9 & r14
            long r9 = r9 & r16
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0464
            int r0 = r4 - r6
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r1 = 8 - r0
            r9 = 0
        L_0x0441:
            if (r9 >= r1) goto L_0x0460
            r10 = 255(0xff, double:1.26E-321)
            long r12 = r14 & r10
            r10 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x045a
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r8[r0]     // Catch:{ all -> 0x055d }
            r5.A09(r0)     // Catch:{ all -> 0x055d }
            r0 = 8
            r35 = 1
            goto L_0x045c
        L_0x045a:
            r0 = 8
        L_0x045c:
            long r14 = r14 >> r0
            int r9 = r9 + 1
            goto L_0x0441
        L_0x0460:
            r0 = 8
            if (r1 != r0) goto L_0x028a
        L_0x0464:
            if (r4 == r6) goto L_0x028a
            int r4 = r4 + 1
            goto L_0x042b
        L_0x0469:
            r5.A09(r1)     // Catch:{ all -> 0x055d }
            r35 = 1
            goto L_0x028a
        L_0x0470:
            X.5Pl r12 = r3.A07     // Catch:{ all -> 0x055d }
            int r11 = r12.A00     // Catch:{ all -> 0x055d }
            if (r11 == 0) goto L_0x050c
            if (r11 <= 0) goto L_0x0509
            java.lang.Object[] r0 = r12.A02     // Catch:{ all -> 0x055d }
            r27 = r0
            r13 = 0
        L_0x047d:
            r10 = r27[r13]     // Catch:{ all -> 0x055d }
            X.5TY r10 = (X.AnonymousClass5TY) r10     // Catch:{ all -> 0x055d }
            X.0vr r9 = r3.A04     // Catch:{ all -> 0x055d }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass5P3.A00()     // Catch:{ all -> 0x055d }
            int r8 = r0.A01()     // Catch:{ all -> 0x055d }
            X.0vr r0 = r2.A00     // Catch:{ all -> 0x055d }
            java.lang.Object r4 = r0.A03(r10)     // Catch:{ all -> 0x055d }
            if (r4 == 0) goto L_0x0505
            boolean r0 = r4 instanceof X.0vq     // Catch:{ all -> 0x055d }
            if (r0 == 0) goto L_0x04f1
            X.0vq r4 = (X.0vq) r4     // Catch:{ all -> 0x055d }
            java.lang.Object[] r0 = r4.A03     // Catch:{ all -> 0x055d }
            r26 = r0
            long[] r14 = r4.A02     // Catch:{ all -> 0x055d }
            int r0 = r14.length     // Catch:{ all -> 0x055d }
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x0505
            r6 = 0
        L_0x04a5:
            r24 = r14[r6]     // Catch:{ all -> 0x055d }
            long r4 = r18 ^ r24
            r0 = 7
            long r4 = r4 << r0
            long r4 = r4 & r24
            long r4 = r4 & r16
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x04ec
            int r0 = r6 - r7
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r5 = 8 - r0
            r15 = 0
        L_0x04bc:
            if (r15 >= r5) goto L_0x04e8
            r0 = 255(0xff, double:1.26E-321)
            long r22 = r24 & r0
            r20 = 128(0x80, double:6.32E-322)
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x04e1
            int r0 = r6 << 3
            int r0 = r0 + r15
            r4 = r26[r0]     // Catch:{ all -> 0x055d }
            java.lang.Object r1 = r9.A03(r4)     // Catch:{ all -> 0x055d }
            X.0vu r1 = (X.0vu) r1     // Catch:{ all -> 0x055d }
            if (r1 != 0) goto L_0x04de
            r0 = 6
            X.0vu r1 = new X.0vu     // Catch:{ all -> 0x055d }
            r1.<init>(r0)     // Catch:{ all -> 0x055d }
            r9.A09(r4, r1)     // Catch:{ all -> 0x055d }
        L_0x04de:
            X.AnonymousClass5TF.A00(r1, r3, r10, r4, r8)     // Catch:{ all -> 0x055d }
        L_0x04e1:
            r0 = 8
            long r24 = r24 >> r0
            int r15 = r15 + 1
            goto L_0x04bc
        L_0x04e8:
            r0 = 8
            if (r5 != r0) goto L_0x0505
        L_0x04ec:
            if (r6 == r7) goto L_0x0505
            int r6 = r6 + 1
            goto L_0x04a5
        L_0x04f1:
            java.lang.Object r1 = r9.A03(r4)     // Catch:{ all -> 0x055d }
            X.0vu r1 = (X.0vu) r1     // Catch:{ all -> 0x055d }
            if (r1 != 0) goto L_0x0502
            r0 = 6
            X.0vu r1 = new X.0vu     // Catch:{ all -> 0x055d }
            r1.<init>(r0)     // Catch:{ all -> 0x055d }
            r9.A09(r4, r1)     // Catch:{ all -> 0x055d }
        L_0x0502:
            X.AnonymousClass5TF.A00(r1, r3, r10, r4, r8)     // Catch:{ all -> 0x055d }
        L_0x0505:
            int r13 = r13 + 1
            if (r13 < r11) goto L_0x047d
        L_0x0509:
            r12.A01()     // Catch:{ all -> 0x055d }
        L_0x050c:
            if (r35 != 0) goto L_0x0514
            r0 = r28
            r28 = 0
            if (r0 == 0) goto L_0x0516
        L_0x0514:
            r28 = 1
        L_0x0516:
            int r32 = r32 + 1
            r1 = r32
            r0 = r33
            if (r1 < r0) goto L_0x0040
        L_0x051e:
            monitor-exit(r29)
            goto L_0x0013
        L_0x0521:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L_0x0552
            r3 = r4
            java.util.List r3 = (java.util.List) r3
            r0 = r30
            java.lang.Object r31 = r3.get(r0)
            r0 = r31
            java.util.Set r0 = (java.util.Set) r0
            r31 = r0
            int r0 = r3.size()
            r2 = 1
            r1 = 2
            if (r0 != r1) goto L_0x0542
            java.lang.Object r6 = r3.get(r2)
            goto L_0x0027
        L_0x0542:
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x0027
            int r0 = r3.size()
            java.util.List r6 = r3.subList(r2, r0)
            goto L_0x0027
        L_0x0552:
            java.lang.String r0 = "Unexpected notification"
            X.AnonymousClass5XN.A04(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x055c:
            return r28
        L_0x055d:
            r0 = move-exception
            monitor-exit(r29)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TE.A00(X.5TE):boolean");
    }

    public final void A01() {
        C285045Pl r5 = this.A05;
        synchronized (r5) {
            int i = r5.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r5.A02;
                do {
                    AnonymousClass5TF r1 = (AnonymousClass5TF) objArr[i2];
                    r1.A09.A00.A08();
                    r1.A04.A08();
                    r1.A08.A00.A08();
                    r1.A0A.clear();
                    i2++;
                } while (i2 < i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Object r27, X.C62320sa r28, X.0sP r29) {
        /*
            r26 = this;
            r10 = r26
            X.5Pl r5 = r10.A05
            monitor-enter(r5)
            int r4 = r5.A00     // Catch:{ all -> 0x015a }
            r3 = 1
            r6 = r29
            if (r4 <= 0) goto L_0x001c
            java.lang.Object[] r2 = r5.A02     // Catch:{ all -> 0x015a }
            r1 = 0
        L_0x000f:
            r9 = r2[r1]     // Catch:{ all -> 0x015a }
            r0 = r9
            X.5TF r0 = (X.AnonymousClass5TF) r0     // Catch:{ all -> 0x015a }
            X.0sP r0 = r0.A0B     // Catch:{ all -> 0x015a }
            if (r0 == r6) goto L_0x001d
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x000f
        L_0x001c:
            r9 = 0
        L_0x001d:
            X.5TF r9 = (X.AnonymousClass5TF) r9     // Catch:{ all -> 0x015a }
            if (r9 != 0) goto L_0x0031
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            X.0qQ.A0C(r6, r0)     // Catch:{ all -> 0x015a }
            X.0u4.A05(r6, r3)     // Catch:{ all -> 0x015a }
            X.5TF r9 = new X.5TF     // Catch:{ all -> 0x015a }
            r9.<init>(r6)     // Catch:{ all -> 0x015a }
            r5.A09(r9)     // Catch:{ all -> 0x015a }
        L_0x0031:
            monitor-exit(r5)
            boolean r8 = r10.A02
            X.5TF r7 = r10.A01
            long r1 = r10.A04
            r3 = -1
            r6 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r3 = r5.getId()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "), currentThread={id="
            r3.append(r0)
            long r0 = r5.getId()
            r3.append(r0)
            java.lang.String r0 = ", name="
            r3.append(r0)
            java.lang.String r0 = r5.getName()
            r3.append(r0)
            java.lang.String r0 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            X.C18086VlG.A00(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0081:
            r10.A02 = r6     // Catch:{ all -> 0x0152 }
            r10.A01 = r9     // Catch:{ all -> 0x0152 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0152 }
            long r3 = r0.getId()     // Catch:{ all -> 0x0152 }
            r10.A04 = r3     // Catch:{ all -> 0x0152 }
            X.0sP r5 = r10.A09     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = r9.A03     // Catch:{ all -> 0x0152 }
            r25 = r0
            X.0vu r0 = r9.A02     // Catch:{ all -> 0x0152 }
            r24 = r0
            int r0 = r9.A00     // Catch:{ all -> 0x0152 }
            r23 = r0
            r3 = r27
            r9.A03 = r3     // Catch:{ all -> 0x0152 }
            X.0vr r0 = r9.A04     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = r0.A03(r3)     // Catch:{ all -> 0x0152 }
            X.0vu r0 = (X.0vu) r0     // Catch:{ all -> 0x0152 }
            r9.A02 = r0     // Catch:{ all -> 0x0152 }
            int r3 = r9.A00     // Catch:{ all -> 0x0152 }
            r0 = -1
            if (r3 != r0) goto L_0x00ba
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass5P3.A00()     // Catch:{ all -> 0x0152 }
            int r0 = r0.A01()     // Catch:{ all -> 0x0152 }
            r9.A00 = r0     // Catch:{ all -> 0x0152 }
        L_0x00ba:
            X.5X2 r0 = r9.A06     // Catch:{ all -> 0x0152 }
            X.5Pl r4 = X.AnonymousClass5XF.A00()     // Catch:{ all -> 0x0152 }
            r4.A09(r0)     // Catch:{ all -> 0x0149 }
            r0 = r28
            X.AnonymousClass5PH.A04(r0, r5)     // Catch:{ all -> 0x0149 }
            int r0 = r4.A00     // Catch:{ all -> 0x0152 }
            int r0 = r0 + -1
            r4.A00(r0)     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = r9.A03     // Catch:{ all -> 0x0152 }
            r22 = r0
            X.0qQ.A0A(r22)     // Catch:{ all -> 0x0152 }
            int r0 = r9.A00     // Catch:{ all -> 0x0152 }
            r21 = r0
            X.0vu r14 = r9.A02     // Catch:{ all -> 0x0152 }
            if (r14 == 0) goto L_0x0136
            long[] r13 = r14.A03     // Catch:{ all -> 0x0152 }
            int r0 = r13.length     // Catch:{ all -> 0x0152 }
            int r12 = r0 + -2
            if (r12 < 0) goto L_0x0136
            r11 = 0
        L_0x00e6:
            r19 = r13[r11]     // Catch:{ all -> 0x0152 }
            r5 = -1
            long r5 = r5 ^ r19
            r0 = 7
            long r5 = r5 << r0
            long r5 = r5 & r19
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r3
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0131
            int r0 = r11 - r12
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L_0x0105:
            if (r4 >= r5) goto L_0x012f
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r19
            r15 = 128(0x80, double:6.32E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x012a
            int r3 = r11 << 3
            int r3 = r3 + r4
            java.lang.Object[] r0 = r14.A04     // Catch:{ all -> 0x0152 }
            r16 = r0[r3]     // Catch:{ all -> 0x0152 }
            int[] r0 = r14.A02     // Catch:{ all -> 0x0152 }
            r15 = r0[r3]     // Catch:{ all -> 0x0152 }
            r0 = r21
            if (r15 == r0) goto L_0x012a
            r15 = r22
            r0 = r16
            X.AnonymousClass5TF.A01(r9, r15, r0)     // Catch:{ all -> 0x0152 }
            r14.A05(r3)     // Catch:{ all -> 0x0152 }
        L_0x012a:
            long r19 = r19 >> r6
            int r4 = r4 + 1
            goto L_0x0105
        L_0x012f:
            if (r5 != r6) goto L_0x0136
        L_0x0131:
            if (r11 == r12) goto L_0x0136
            int r11 = r11 + 1
            goto L_0x00e6
        L_0x0136:
            r0 = r25
            r9.A03 = r0     // Catch:{ all -> 0x0152 }
            r0 = r24
            r9.A02 = r0     // Catch:{ all -> 0x0152 }
            r0 = r23
            r9.A00 = r0     // Catch:{ all -> 0x0152 }
            r10.A01 = r7
            r10.A02 = r8
            r10.A04 = r1
            return
        L_0x0149:
            r3 = move-exception
            int r0 = r4.A00     // Catch:{ all -> 0x0152 }
            int r0 = r0 + -1
            r4.A00(r0)     // Catch:{ all -> 0x0152 }
            throw r3     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r0 = move-exception
            r10.A01 = r7
            r10.A02 = r8
            r10.A04 = r1
            throw r0
        L_0x015a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TE.A02(java.lang.Object, X.0sa, X.0sP):void");
    }

    public AnonymousClass5TE(0sP r3) {
        this.A07 = r3;
    }
}
