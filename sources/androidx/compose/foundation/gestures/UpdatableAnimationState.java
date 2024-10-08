package androidx.compose.foundation.gestures;

import X.AnonymousClass5b9;
import X.C287715ae;
import X.C287765aj;
import X.C3026164i;

public final class UpdatableAnimationState {
    public static final C287715ae A05;
    public float A00;
    public long A01 = Long.MIN_VALUE;
    public C287715ae A02 = A05;
    public boolean A03;
    public final C3026164i A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5ae] */
    static {
        ? obj = new Object();
        obj.A00 = 0.0f;
        A05 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.Ikr, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (X.AnonymousClass7TF.A1Q((r9 > 0.0f ? 1 : (r9 == 0.0f ? 0 : -1))) == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A[SYNTHETIC, Splitter:B:25:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9 A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r13, X.C62320sa r14, X.0sP r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C58059Ikr
            if (r0 == 0) goto L_0x002e
            r7 = r13
            X.Ikr r7 = (X.C58059Ikr) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r7.A01 = r2
        L_0x0012:
            java.lang.Object r10 = r7.A05
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A01
            r11 = 0
            r2 = -9223372036854775808
            r8 = 2
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 == r1) goto L_0x0039
            if (r0 != r8) goto L_0x0034
            java.lang.Object r14 = r7.A03
            X.0sa r14 = (X.C62320sa) r14
            java.lang.Object r4 = r7.A02
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x00c3
        L_0x002e:
            X.Ikr r7 = new X.Ikr
            r7.<init>(r12, r13)
            goto L_0x0012
        L_0x0034:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0039:
            float r9 = r7.A00
            java.lang.Object r14 = r7.A04
            X.0sa r14 = (X.C62320sa) r14
            java.lang.Object r15 = r7.A03
            java.lang.Object r4 = r7.A02
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x008f
        L_0x0046:
            X.0eS.A00(r10)
            boolean r0 = r12.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00de
            X.4Cc r4 = r7.getContext()
            X.5PW r0 = X.AnonymousClass5PV.A00
            X.4Cb r0 = r4.get(r0)
            X.5PV r0 = (X.AnonymousClass5PV) r0
            if (r0 == 0) goto L_0x0065
            float r9 = r0.BpW()
        L_0x0061:
            r12.A03 = r1
            r4 = r12
            goto L_0x0068
        L_0x0065:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0061
        L_0x0068:
            float r0 = r4.A00     // Catch:{ all -> 0x00d4 }
            float r10 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00d4 }
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            if (r0 != 0) goto L_0x009f
            X.Iwv r0 = new X.Iwv     // Catch:{ all -> 0x00d4 }
            r0.<init>(r15, r4, r9, r1)     // Catch:{ all -> 0x00d4 }
            r7.A02 = r4     // Catch:{ all -> 0x00d4 }
            r7.A03 = r15     // Catch:{ all -> 0x00d4 }
            r7.A04 = r14     // Catch:{ all -> 0x00d4 }
            r7.A00 = r9     // Catch:{ all -> 0x00d4 }
            r7.A01 = r1     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = X.C3026564t.A01(r7, r0)     // Catch:{ all -> 0x00d4 }
            if (r0 != r6) goto L_0x0092
            goto L_0x009e
        L_0x008f:
            X.0eS.A00(r10)     // Catch:{ all -> 0x00d4 }
        L_0x0092:
            r14.invoke()     // Catch:{ all -> 0x00d4 }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x0068
            goto L_0x009f
        L_0x009e:
            return r6
        L_0x009f:
            float r0 = r4.A00     // Catch:{ all -> 0x00d4 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00d4 }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            r1 = 0
        L_0x00aa:
            if (r1 != 0) goto L_0x00c9
            r0 = 18
            X.J6U r1 = new X.J6U     // Catch:{ all -> 0x00d4 }
            r1.<init>(r0, r15, r4)     // Catch:{ all -> 0x00d4 }
            r7.A02 = r4     // Catch:{ all -> 0x00d4 }
            r7.A03 = r14     // Catch:{ all -> 0x00d4 }
            r0 = 0
            r7.A04 = r0     // Catch:{ all -> 0x00d4 }
            r7.A01 = r8     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = X.C3026564t.A01(r7, r1)     // Catch:{ all -> 0x00d4 }
            if (r0 != r6) goto L_0x00c6
            return r6
        L_0x00c3:
            X.0eS.A00(r10)     // Catch:{ all -> 0x00d4 }
        L_0x00c6:
            r14.invoke()     // Catch:{ all -> 0x00d4 }
        L_0x00c9:
            r4.A01 = r2
            X.5ae r0 = A05
            r4.A02 = r0
            r4.A03 = r5
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00d4:
            r1 = move-exception
            r4.A01 = r2
            X.5ae r0 = A05
            r4.A02 = r0
            r4.A03 = r5
            throw r1
        L_0x00de:
            java.lang.String r0 = "animateToZero called while previous animation is running"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.A00(X.4D7, X.0sa, X.0sP):java.lang.Object");
    }

    public UpdatableAnimationState(AnonymousClass5b9 r3) {
        this.A04 = r3.FMw(C287765aj.A02);
    }
}
