package androidx.compose.runtime;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C62320sa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {148, 152, 174}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ C62320sa A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(AnonymousClass4D7 r2, C62320sa r3) {
        super(2, r2);
        this.A07 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(r4, this.A07);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.A06 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.4D7, androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b8 A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011f A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126 A[Catch:{ all -> 0x017d }] */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r26
            X.1Hj r7 = X.1Hj.A02
            r8 = r25
            int r2 = r8.A00
            r24 = 3
            r23 = 2
            r12 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r12) goto L_0x002d
            r0 = r23
            if (r2 != r0) goto L_0x002d
            java.lang.Object r11 = r8.A05
            java.lang.Object r5 = r8.A04
            X.5Ps r5 = (X.C285105Ps) r5
            java.lang.Object r9 = r8.A03
            X.3jw r9 = (X.C249533jw) r9
            java.lang.Object r6 = r8.A02
            X.0sP r6 = (X.0sP) r6
            java.lang.Object r4 = r8.A01
            X.0vq r4 = (X.0vq) r4
            java.lang.Object r3 = r8.A06
            X.02o r3 = (X.02o) r3
            goto L_0x00ba
        L_0x002d:
            java.lang.Object r11 = r8.A05
            java.lang.Object r5 = r8.A04
            X.5Ps r5 = (X.C285105Ps) r5
            java.lang.Object r9 = r8.A03
            X.3jw r9 = (X.C249533jw) r9
            java.lang.Object r6 = r8.A02
            X.0sP r6 = (X.0sP) r6
            java.lang.Object r4 = r8.A01
            X.0vq r4 = (X.0vq) r4
            java.lang.Object r3 = r8.A06
            X.02o r3 = (X.02o) r3
            goto L_0x009f
        L_0x0044:
            X.0eS.A00(r1)
            java.lang.Object r3 = r8.A06
            X.02o r3 = (X.02o) r3
            r0 = 6
            X.0vq r4 = new X.0vq
            r4.<init>(r0)
            r0 = 36
            X.9L6 r6 = new X.9L6
            r6.<init>(r4, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            X.1HR r9 = new X.1HR
            r9.<init>(r0)
            X.9LZ r1 = new X.9LZ
            r0 = r24
            r1.<init>(r9, r0)
            X.5Pr r5 = X.AnonymousClass5PH.A01(r1)
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass5P3.A00()     // Catch:{ all -> 0x017d }
            androidx.compose.runtime.snapshots.Snapshot r10 = r0.A03(r6)     // Catch:{ all -> 0x017d }
            X.0sa r0 = r8.A07     // Catch:{ all -> 0x017d }
            X.5P5 r2 = X.AnonymousClass5P3.A05     // Catch:{ all -> 0x0178 }
            java.lang.Object r1 = r2.A00()     // Catch:{ all -> 0x0178 }
            androidx.compose.runtime.snapshots.Snapshot r1 = (androidx.compose.runtime.snapshots.Snapshot) r1     // Catch:{ all -> 0x0178 }
            r2.A01(r10)     // Catch:{ all -> 0x0178 }
            java.lang.Object r11 = r0.invoke()     // Catch:{ all -> 0x0173 }
            r2.A01(r1)     // Catch:{ all -> 0x0178 }
            r10.A0H()     // Catch:{ all -> 0x017d }
            r8.A06 = r3     // Catch:{ all -> 0x017d }
            r8.A01 = r4     // Catch:{ all -> 0x017d }
            r8.A02 = r6     // Catch:{ all -> 0x017d }
            r8.A03 = r9     // Catch:{ all -> 0x017d }
            r8.A04 = r5     // Catch:{ all -> 0x017d }
            r8.A05 = r11     // Catch:{ all -> 0x017d }
            r8.A00 = r12     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r3.emit(r11, r8)     // Catch:{ all -> 0x017d }
            if (r0 != r7) goto L_0x00a2
            return r7
        L_0x009f:
            X.0eS.A00(r1)     // Catch:{ all -> 0x017d }
        L_0x00a2:
            r8.A06 = r3     // Catch:{ all -> 0x017d }
            r8.A01 = r4     // Catch:{ all -> 0x017d }
            r8.A02 = r6     // Catch:{ all -> 0x017d }
            r8.A03 = r9     // Catch:{ all -> 0x017d }
            r8.A04 = r5     // Catch:{ all -> 0x017d }
            r8.A05 = r11     // Catch:{ all -> 0x017d }
            r0 = r23
            r8.A00 = r0     // Catch:{ all -> 0x017d }
            java.lang.Object r1 = r9.E6v(r8)     // Catch:{ all -> 0x017d }
            if (r1 != r7) goto L_0x00bd
            goto L_0x0167
        L_0x00ba:
            X.0eS.A00(r1)     // Catch:{ all -> 0x017d }
        L_0x00bd:
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x017d }
        L_0x00bf:
            java.lang.Object[] r0 = r4.A03     // Catch:{ all -> 0x017d }
            r22 = r0
            long[] r15 = r4.A02     // Catch:{ all -> 0x017d }
            int r0 = r15.length     // Catch:{ all -> 0x017d }
            int r14 = r0 + -2
            if (r14 < 0) goto L_0x0110
            r13 = 0
        L_0x00cb:
            r20 = r15[r13]     // Catch:{ all -> 0x017d }
            r18 = -1
            long r18 = r18 ^ r20
            r0 = 7
            long r18 = r18 << r0
            long r18 = r18 & r20
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r18 = r18 & r16
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x010b
            int r0 = r13 - r14
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r12 = 8
            int r10 = 8 - r0
            r2 = 0
        L_0x00ec:
            if (r2 >= r10) goto L_0x0109
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r18 & r20
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            int r0 = r13 << 3
            int r0 = r0 + r2
            r0 = r22[r0]     // Catch:{ all -> 0x017d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0104
            goto L_0x0122
        L_0x0104:
            long r20 = r20 >> r12
            int r2 = r2 + 1
            goto L_0x00ec
        L_0x0109:
            if (r10 != r12) goto L_0x0110
        L_0x010b:
            if (r13 == r14) goto L_0x0110
            int r13 = r13 + 1
            goto L_0x00cb
        L_0x0110:
            r2 = 0
        L_0x0111:
            java.lang.Object r1 = r9.FIE()     // Catch:{ all -> 0x017d }
            boolean r0 = r1 instanceof X.AnonymousClass1Ws     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x011a
            r1 = 0
        L_0x011a:
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x017d }
            if (r1 != 0) goto L_0x011f
            goto L_0x0124
        L_0x011f:
            if (r2 != 0) goto L_0x0122
            goto L_0x00bf
        L_0x0122:
            r2 = 1
            goto L_0x0111
        L_0x0124:
            if (r2 == 0) goto L_0x00a2
            r4.A05()     // Catch:{ all -> 0x017d }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass5P3.A00()     // Catch:{ all -> 0x017d }
            androidx.compose.runtime.snapshots.Snapshot r12 = r0.A03(r6)     // Catch:{ all -> 0x017d }
            X.0sa r0 = r8.A07     // Catch:{ all -> 0x017d }
            X.5P5 r10 = X.AnonymousClass5P3.A05     // Catch:{ all -> 0x016e }
            java.lang.Object r2 = r10.A00()     // Catch:{ all -> 0x016e }
            androidx.compose.runtime.snapshots.Snapshot r2 = (androidx.compose.runtime.snapshots.Snapshot) r2     // Catch:{ all -> 0x016e }
            r10.A01(r12)     // Catch:{ all -> 0x016e }
            java.lang.Object r1 = r0.invoke()     // Catch:{ all -> 0x0169 }
            r10.A01(r2)     // Catch:{ all -> 0x016e }
            r12.A0H()     // Catch:{ all -> 0x017d }
            boolean r0 = X.0qQ.A0K(r1, r11)     // Catch:{ all -> 0x017d }
            if (r0 != 0) goto L_0x00a2
            r8.A06 = r3     // Catch:{ all -> 0x017d }
            r8.A01 = r4     // Catch:{ all -> 0x017d }
            r8.A02 = r6     // Catch:{ all -> 0x017d }
            r8.A03 = r9     // Catch:{ all -> 0x017d }
            r8.A04 = r5     // Catch:{ all -> 0x017d }
            r8.A05 = r1     // Catch:{ all -> 0x017d }
            r0 = r24
            r8.A00 = r0     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r3.emit(r1, r8)     // Catch:{ all -> 0x017d }
            if (r0 == r7) goto L_0x0168
            r11 = r1
            goto L_0x00a2
        L_0x0167:
            return r7
        L_0x0168:
            return r7
        L_0x0169:
            r0 = move-exception
            r10.A01(r2)     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            r12.A0H()     // Catch:{ all -> 0x017d }
            goto L_0x017c
        L_0x0173:
            r0 = move-exception
            r2.A01(r1)     // Catch:{ all -> 0x0178 }
            throw r0     // Catch:{ all -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            r10.A0H()     // Catch:{ all -> 0x017d }
        L_0x017c:
            throw r0     // Catch:{ all -> 0x017d }
        L_0x017d:
            r0 = move-exception
            r5.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
