package com.meta.compose.material.bottomsheet;

import X.00k;
import X.0Yt;
import X.0sP;
import X.1Hj;
import X.AnonymousClass4D7;
import X.AnonymousClass5PZ;
import X.AnonymousClass5b9;
import X.AnonymousClass7TE;
import X.C229632nm;
import X.C270284gU;
import X.C284895Os;
import X.C284945Oz;
import X.C289465dd;
import X.C51965G9l;
import X.C51969G9p;
import X.C51970G9q;
import X.C51971G9r;
import X.C51976G9y;
import X.C55543HjP;
import X.C55666HlP;
import X.C56158Htm;
import X.C56835IEg;
import X.C58686Ivv;
import X.C60340gF;
import X.C62320sa;
import X.JNP;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

public final class AnchoredDraggableState {
    public final AnonymousClass5b9 A00;
    public final JNP A01 = new C56835IEg(this);
    public final AnonymousClass5PZ A02;
    public final AnonymousClass5PZ A03;
    public final C284945Oz A04;
    public final C284945Oz A05;
    public final C284945Oz A06;
    public final C270284gU A07;
    public final C270284gU A08;
    public final C55543HjP A09;
    public final C55666HlP A0A = new C55666HlP();
    public final 0sP A0B;
    public final C270284gU A0C;
    public final C62320sa A0D;
    public final 0sP A0E;

    public static C56158Htm A01(AnchoredDraggableState anchoredDraggableState) {
        return (C56158Htm) anchoredDraggableState.A04.getValue();
    }

    public final float A03() {
        AnonymousClass5PZ r1 = this.A03;
        if (!Float.isNaN(r1.B6X())) {
            return r1.B6X();
        }
        throw AnonymousClass7TE.A0z("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final float A04(float f) {
        float f2;
        float f3;
        float A002 = C51976G9y.A00(this.A03) + f;
        C284945Oz r2 = this.A04;
        Float A082 = 00k.A08(((C56158Htm) r2.getValue()).A00.values());
        if (A082 != null) {
            f2 = A082.floatValue();
        } else {
            f2 = Float.NaN;
        }
        Float A072 = 00k.A07(((C56158Htm) r2.getValue()).A00.values());
        if (A072 != null) {
            f3 = A072.floatValue();
        } else {
            f3 = Float.NaN;
        }
        return C229632nm.A02(A002, f2, f3);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C54609HKs r19, java.lang.Object r20, X.AnonymousClass4D7 r21, X.0sJ r22) {
        /*
            r18 = this;
            r8 = r20
            r4 = 32
            r5 = r21
            boolean r0 = X.C66139MDr.A01(r4, r5)
            r9 = r18
            if (r0 == 0) goto L_0x002f
            r3 = r5
            X.MDr r3 = (X.C66139MDr) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001c:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            r11 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 != r1) goto L_0x009c
            java.lang.Object r4 = r3.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r4 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r4
            goto L_0x0035
        L_0x002f:
            X.MDr r3 = new X.MDr
            r3.<init>(r9, r5, r4)
            goto L_0x001c
        L_0x0035:
            X.0eS.A00(r5)     // Catch:{ all -> 0x006c }
            goto L_0x00a5
        L_0x0039:
            X.0eS.A00(r5)
            X.Htm r0 = A01(r9)
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x00a1
            X.HlP r14 = r9.A0A     // Catch:{ all -> 0x0069 }
            r12 = 4
            X.MEN r7 = new X.MEN     // Catch:{ all -> 0x0069 }
            r10 = r22
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0069 }
            r3.A01 = r9     // Catch:{ all -> 0x0069 }
            r3.A00 = r1     // Catch:{ all -> 0x0069 }
            r17 = 15
            X.JVZ r12 = new X.JVZ     // Catch:{ all -> 0x0069 }
            r13 = r19
            r15 = r7
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = X.19E.A00(r3, r12)     // Catch:{ all -> 0x0069 }
            if (r0 == r2) goto L_0x00d5
            goto L_0x00a4
        L_0x0069:
            r5 = move-exception
            r4 = r9
            goto L_0x006d
        L_0x006c:
            r5 = move-exception
        L_0x006d:
            X.5Oz r0 = r4.A06
            r0.Epw(r11)
            X.5Oz r3 = r4.A04
            java.lang.Object r1 = r3.getValue()
            X.Htm r1 = (X.C56158Htm) r1
            X.5PZ r2 = r4.A03
            float r0 = r2.B6X()
            java.lang.Object r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x00a0
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00a0
            X.0sP r0 = r4.A0B
            boolean r0 = X.C51971G9r.A1a(r1, r0)
            if (r0 == 0) goto L_0x00a0
            X.5Oz r0 = r4.A05
            r0.Epw(r1)
            throw r5
        L_0x009c:
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0x()
        L_0x00a0:
            throw r5
        L_0x00a1:
            X.5Oz r0 = r9.A05
            goto L_0x00d0
        L_0x00a4:
            r4 = r9
        L_0x00a5:
            X.5Oz r0 = r4.A06
            r0.Epw(r11)
            X.5Oz r3 = r4.A04
            java.lang.Object r2 = r3.getValue()
            X.Htm r2 = (X.C56158Htm) r2
            X.5PZ r1 = r4.A03
            float r0 = r1.B6X()
            java.lang.Object r8 = r2.A01(r0)
            if (r8 == 0) goto L_0x00d3
            float r0 = A00(r1, r3, r8)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00d3
            X.0sP r0 = r4.A0B
            boolean r0 = X.C51971G9r.A1a(r8, r0)
            if (r0 == 0) goto L_0x00d3
            X.5Oz r0 = r4.A05
        L_0x00d0:
            r0.Epw(r8)
        L_0x00d3:
            X.0gF r2 = X.C60340gF.A00
        L_0x00d5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableState.A05(X.HKs, java.lang.Object, X.4D7, X.0sJ):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(X.C54609HKs r14, X.AnonymousClass4D7 r15, X.0sK r16) {
        /*
            r13 = this;
            r3 = 31
            boolean r0 = X.C66139MDr.A01(r3, r15)
            if (r0 == 0) goto L_0x0028
            r4 = r15
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x00ad
            java.lang.Object r4 = r4.A01
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r4 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r4
            goto L_0x002e
        L_0x0028:
            X.MDr r4 = new X.MDr
            r4.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x002e:
            X.0eS.A00(r3)     // Catch:{ all -> 0x0082 }
            goto L_0x0053
        L_0x0032:
            X.0eS.A00(r3)
            X.HlP r9 = r13.A0A     // Catch:{ all -> 0x007f }
            r11 = 0
            r0 = 7
            X.GPB r10 = new X.GPB     // Catch:{ all -> 0x007f }
            r3 = r16
            r10.<init>(r13, r3, r11, r0)     // Catch:{ all -> 0x007f }
            r4.A01 = r13     // Catch:{ all -> 0x007f }
            r4.A00 = r1     // Catch:{ all -> 0x007f }
            r12 = 15
            X.JVZ r7 = new X.JVZ     // Catch:{ all -> 0x007f }
            r8 = r14
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = X.19E.A00(r4, r7)     // Catch:{ all -> 0x007f }
            if (r0 == r2) goto L_0x007e
            r4 = r13
        L_0x0053:
            X.5Oz r3 = r4.A04
            java.lang.Object r1 = r3.getValue()
            X.Htm r1 = (X.C56158Htm) r1
            X.5PZ r2 = r4.A03
            float r0 = r2.B6X()
            java.lang.Object r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x007c
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x007c
            X.0sP r0 = r4.A0B
            boolean r0 = X.C51971G9r.A1a(r1, r0)
            if (r0 == 0) goto L_0x007c
            X.5Oz r0 = r4.A05
            r0.Epw(r1)
        L_0x007c:
            X.0gF r2 = X.C60340gF.A00
        L_0x007e:
            return r2
        L_0x007f:
            r5 = move-exception
            r4 = r13
            goto L_0x0083
        L_0x0082:
            r5 = move-exception
        L_0x0083:
            X.5Oz r3 = r4.A04
            java.lang.Object r1 = r3.getValue()
            X.Htm r1 = (X.C56158Htm) r1
            X.5PZ r2 = r4.A03
            float r0 = r2.B6X()
            java.lang.Object r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x00b1
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00b1
            X.0sP r0 = r4.A0B
            boolean r0 = X.C51971G9r.A1a(r1, r0)
            if (r0 == 0) goto L_0x00b1
            X.5Oz r0 = r4.A05
            r0.Epw(r1)
            throw r5
        L_0x00ad:
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0x()
        L_0x00b1:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableState.A06(X.HKs, X.4D7, X.0sK):java.lang.Object");
    }

    public final Object A07(AnonymousClass4D7 r4, float f) {
        Object A002;
        Object value = this.A05.getValue();
        Object A022 = A02(this, value, A03(), f);
        if (C51971G9r.A1a(A022, this.A0B)) {
            A002 = AnchoredDraggableKt.A00(this, A022, r4, f);
        } else {
            A002 = AnchoredDraggableKt.A00(this, value, r4, f);
        }
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public AnchoredDraggableState(AnonymousClass5b9 r4, Object obj, C62320sa r6, 0sP r7, 0sP r8) {
        this.A0E = r7;
        this.A0D = r6;
        this.A00 = r4;
        this.A0B = r8;
        this.A05 = C51970G9q.A0S(obj);
        this.A08 = C51965G9l.A0I((C284895Os) null, C58686Ivv.A00(this, 33));
        this.A07 = C51965G9l.A0I((C284895Os) null, C58686Ivv.A00(this, 31));
        this.A03 = new ParcelableSnapshotMutableFloatState(Float.NaN);
        this.A0C = C51965G9l.A0I(C289465dd.A00(), C58686Ivv.A00(this, 32));
        this.A02 = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A06 = C51969G9p.A0S((Object) null);
        this.A04 = C51969G9p.A0S(new C56158Htm(0Yt.A0E()));
        this.A09 = new C55543HjP(this);
    }

    public static float A00(AnonymousClass5PZ r1, C284945Oz r2, Object obj) {
        return Math.abs(r1.B6X() - ((C56158Htm) r2.getValue()).A00(obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[PHI: r2 
      PHI: (r2v1 java.lang.Object) = (r2v2 java.lang.Object), (r2v3 java.lang.Object) binds: [B:19:0x008f, B:22:0x0094] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.meta.compose.material.bottomsheet.AnchoredDraggableState r6, java.lang.Object r7, float r8, float r9) {
        /*
            X.Htm r5 = A01(r6)
            float r3 = r5.A00(r7)
            X.0sa r0 = r6.A0D
            java.lang.Object r0 = r0.invoke()
            float r4 = X.AnonymousClass7TE.A04(r0)
            r2 = 1
            r1 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x002d
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            java.lang.Object r7 = r5.A02(r8, r2)
        L_0x002a:
            X.0qQ.A0A(r7)
        L_0x002d:
            return r7
        L_0x002e:
            float r0 = -r4
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            java.lang.Object r7 = r5.A02(r8, r1)
            goto L_0x002a
        L_0x0038:
            java.lang.Object r2 = r5.A02(r8, r2)
            X.0qQ.A0A(r2)
            float r0 = r5.A00(r2)
            float r0 = X.AnonymousClass7TE.A00(r0, r3)
            X.0sP r1 = r6.A0E
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r0 = java.lang.Math.abs(r0)
            float r3 = r3 + r0
            float r1 = java.lang.Math.abs(r3)
            goto L_0x008d
        L_0x005f:
            java.lang.Object r2 = r5.A02(r8, r1)
            X.0qQ.A0A(r2)
            float r0 = r5.A00(r2)
            float r0 = X.AnonymousClass7TE.A00(r3, r0)
            X.0sP r1 = r6.A0E
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r0 = java.lang.Math.abs(r0)
            float r1 = X.AnonymousClass7TE.A00(r3, r0)
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            float r8 = java.lang.Math.abs(r8)
        L_0x008d:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            return r7
        L_0x0092:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            return r7
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableState.A02(com.meta.compose.material.bottomsheet.AnchoredDraggableState, java.lang.Object, float, float):java.lang.Object");
    }
}
