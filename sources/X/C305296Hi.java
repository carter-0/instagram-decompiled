package X;

/* renamed from: X.6Hi  reason: invalid class name and case insensitive filesystem */
public abstract class C305296Hi {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if ((r17 & 48) == 32) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if ((r3 & 384) == 256) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if ((r3 & 3072) == 2048) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if ((r3 & 24576) == 16384) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier A00(X.AnonymousClass6Gj r11, X.AnonymousClass6H6 r12, X.C305286Hh r13, X.C286575Wy r14, androidx.compose.ui.Modifier r15, X.AnonymousClass5Q8 r16, int r17, boolean r18, boolean r19) {
        /*
            r3 = r17
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0010
            r1 = 1334364862(0x4f88cabe, float:4.5899766E9)
            java.lang.String r0 = "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)"
            X.0fL.A01(r1, r0)
        L_0x0010:
            if (r19 != 0) goto L_0x002b
            r0 = -1890658823(0xffffffff8f4ed5f9, float:-1.0197794E-29)
            r14.ExS(r0)
        L_0x0018:
            X.5Wx r14 = (X.C286565Wx) r14
            r0 = 0
            X.C286565Wx.A0L(r14, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x002a
            r0 = -1240488402(0xffffffffb60fa62e, float:-2.140539E-6)
            X.0fL.A00(r0)
        L_0x002a:
            return r15
        L_0x002b:
            r0 = -1890632411(0xffffffff8f4f3d25, float:-1.0217664E-29)
            r14.ExS(r0)
            r0 = r17 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r5 = 0
            r8 = r13
            if (r0 <= r1) goto L_0x0041
            boolean r0 = r14.AGu(r13)
            if (r0 != 0) goto L_0x0046
        L_0x0041:
            r0 = r17 & 48
            r4 = 0
            if (r0 != r1) goto L_0x0047
        L_0x0046:
            r4 = 1
        L_0x0047:
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            r7 = r12
            if (r0 <= r2) goto L_0x0056
            boolean r0 = r14.AGu(r12)
            if (r0 != 0) goto L_0x005b
        L_0x0056:
            r1 = r3 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            r4 = r4 | r0
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r2 = 2048(0x800, float:2.87E-42)
            r10 = r18
            if (r0 <= r2) goto L_0x006d
            boolean r0 = r14.AGv(r10)
            if (r0 != 0) goto L_0x0072
        L_0x006d:
            r1 = r3 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r2) goto L_0x0073
        L_0x0072:
            r0 = 1
        L_0x0073:
            r4 = r4 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r17
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r2 = 16384(0x4000, float:2.2959E-41)
            r9 = r16
            if (r0 <= r2) goto L_0x0087
            boolean r0 = r14.AGu(r9)
            if (r0 != 0) goto L_0x008c
        L_0x0087:
            r1 = r3 & 24576(0x6000, float:3.4438E-41)
            r0 = 0
            if (r1 != r2) goto L_0x008d
        L_0x008c:
            r0 = 1
        L_0x008d:
            r4 = r4 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r17
            r2 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 ^ r2
            r1 = 131072(0x20000, float:1.83671E-40)
            r6 = r11
            if (r0 <= r1) goto L_0x00a0
            boolean r0 = r14.AGu(r11)
            if (r0 != 0) goto L_0x00a4
        L_0x00a0:
            r3 = r17 & r2
            if (r3 != r1) goto L_0x00a5
        L_0x00a4:
            r5 = 1
        L_0x00a5:
            r4 = r4 | r5
            java.lang.Object r5 = r14.ECw()
            if (r4 != 0) goto L_0x00b0
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r5 != r0) goto L_0x00b8
        L_0x00b0:
            X.6Hj r5 = new X.6Hj
            r5.<init>(r6, r7, r8, r9, r10)
            r14.FLL(r5)
        L_0x00b8:
            X.6Hj r5 = (X.C305306Hj) r5
            androidx.compose.ui.Modifier r15 = r15.Ezh(r5)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305296Hi.A00(X.6Gj, X.6H6, X.6Hh, X.5Wy, androidx.compose.ui.Modifier, X.5Q8, int, boolean, boolean):androidx.compose.ui.Modifier");
    }
}
