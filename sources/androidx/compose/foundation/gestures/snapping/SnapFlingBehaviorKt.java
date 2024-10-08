package androidx.compose.foundation.gestures.snapping;

public abstract class SnapFlingBehaviorKt {
    /* JADX WARNING: type inference failed for: r13v1, types: [X.Iko, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass5b9 r14, X.C287955b5 r15, X.AnonymousClass6H1 r16, X.AnonymousClass4D7 r17, X.0sP r18, float r19, float r20) {
        /*
            r4 = r17
            r11 = r15
            r3 = r19
            boolean r0 = r4 instanceof X.C58056Iko
            if (r0 == 0) goto L_0x00a4
            r13 = r4
            X.Iko r13 = (X.C58056Iko) r13
            int r2 = r13.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a4
            int r2 = r2 - r1
            r13.A02 = r2
        L_0x0017:
            java.lang.Object r1 = r13.A05
            X.1Hj r4 = X.1Hj.A02
            int r0 = r13.A02
            r10 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r10) goto L_0x00ab
            float r2 = r13.A01
            float r3 = r13.A00
            java.lang.Object r8 = r13.A04
            X.0rh r8 = (X.0rh) r8
            java.lang.Object r11 = r13.A03
            X.5b5 r11 = (X.C287955b5) r11
            X.0eS.A00(r1)
        L_0x0031:
            java.lang.Object r0 = r11.A00()
            float r5 = X.AnonymousClass7TE.A04(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            r5 = 0
        L_0x003f:
            float r0 = r8.A00
            float r3 = r3 - r0
            java.lang.Float r1 = X.C51965G9l.A0q(r3)
            r0 = 29
            X.5b5 r0 = X.GQU.A01(r11, r4, r5, r0)
            X.Hjv r4 = new X.Hjv
            r4.<init>(r0, r1)
            return r4
        L_0x0052:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
        L_0x005a:
            r5 = r2
            goto L_0x003f
        L_0x005c:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            goto L_0x005a
        L_0x0061:
            X.0eS.A00(r1)
            X.0rh r8 = new X.0rh
            r8.<init>()
            java.lang.Object r0 = r15.A00()
            float r2 = X.AnonymousClass7TE.A04(r0)
            java.lang.Float r12 = X.C51965G9l.A0q(r3)
            java.lang.Object r0 = r15.A00()
            float r1 = X.AnonymousClass7TE.A04(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r15 = r0 ^ 1
            X.J6Z r5 = new X.J6Z
            r6 = r16
            r7 = r18
            r9 = r20
            r5.<init>((X.AnonymousClass6H1) r6, (X.0sP) r7, (X.0rh) r8, (float) r9, (int) r10)
            r13.A03 = r11
            r13.A04 = r8
            r13.A00 = r3
            r13.A01 = r2
            r13.A02 = r10
            r10 = r14
            r14 = r5
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A02(r10, r11, r12, r13, r14, r15)
            if (r0 != r4) goto L_0x0031
            return r4
        L_0x00a4:
            X.Iko r13 = new X.Iko
            r13.<init>(r4)
            goto L_0x0017
        L_0x00ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A00(X.5b9, X.5b5, X.6H1, X.4D7, X.0sP, float, float):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il3, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C287955b5 r11, X.AnonymousClass6HR r12, X.AnonymousClass6H1 r13, X.AnonymousClass4D7 r14, X.0sP r15, float r16) {
        /*
            r9 = r16
            r10 = 0
            boolean r0 = r14 instanceof X.C58071Il3
            if (r0 == 0) goto L_0x006d
            r4 = r14
            X.Il3 r4 = (X.C58071Il3) r4
            int r0 = r4.A05
            if (r0 != r10) goto L_0x006d
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0019:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A01
            r2 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r2) goto L_0x0073
            float r9 = r4.A00
            java.lang.Object r8 = r4.A03
            X.0rh r8 = (X.0rh) r8
            java.lang.Object r11 = r4.A02
            X.5b5 r11 = (X.C287955b5) r11
            X.0eS.A00(r1)
        L_0x0031:
            float r0 = r8.A00
            float r9 = r9 - r0
            java.lang.Float r1 = X.C51965G9l.A0q(r9)
            X.Hjv r0 = new X.Hjv
            r0.<init>(r11, r1)
            return r0
        L_0x003e:
            X.0eS.A00(r1)
            X.0rh r8 = new X.0rh
            r8.<init>()
            java.lang.Object r0 = r11.A00()
            float r1 = X.AnonymousClass7TE.A04(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r0 = r0 ^ 1
            X.J6Z r5 = new X.J6Z
            r6 = r13
            r7 = r15
            r5.<init>((X.AnonymousClass6H1) r6, (X.0sP) r7, (X.0rh) r8, (float) r9, (int) r10)
            r4.A02 = r11
            r4.A03 = r8
            r4.A00 = r9
            r4.A01 = r2
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A04(r11, r12, r4, r5, r0)
            if (r0 != r3) goto L_0x0031
            return r3
        L_0x006d:
            X.Il3 r4 = new X.Il3
            r4.<init>(r14)
            goto L_0x0019
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A01(X.5b5, X.6HR, X.6H1, X.4D7, X.0sP, float):java.lang.Object");
    }
}
