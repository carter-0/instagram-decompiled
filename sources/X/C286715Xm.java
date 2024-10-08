package X;

/* renamed from: X.5Xm  reason: invalid class name and case insensitive filesystem */
public abstract class C286715Xm {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.5RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.5RL} */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.5Pf] */
    /* JADX WARNING: type inference failed for: r5v8, types: [X.5Pf] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r0 == false) goto L_0x0057;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r10, X.C286705Xl r11, X.0sL r12, int r13) {
        /*
            r0 = -1350970552(0xffffffffaf79d348, float:-2.272148E-10)
            r10.ExV(r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0014
            r1 = 197892311(0xbcb98d7, float:7.8422724E-32)
            java.lang.String r0 = "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)"
            X.0fL.A01(r1, r0)
        L_0x0014:
            r4 = r10
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r5 = X.C286565Wx.A04(r4)
            java.lang.Object r2 = X.AnonymousClass5XN.A02
            r1 = 201(0xc9, float:2.82E-43)
            r3 = 0
            r0 = 0
            X.C286565Wx.A0K(r4, r2, r0, r1, r3)
            java.lang.Object r1 = r4.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0129
            r1 = 0
        L_0x0031:
            X.4bL r8 = r11.A01
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            X.0qQ.A0C(r8, r0)
            X.5Xb r2 = r8.A01(r11, r1)
            boolean r0 = X.0qQ.A0K(r2, r1)
            r7 = 1
            r9 = r0 ^ 1
            if (r9 == 0) goto L_0x0048
            r4.FLL(r2)
        L_0x0048:
            boolean r0 = r4.A0K
            r6 = 0
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x0057
            boolean r0 = r5.containsKey(r8)
            if (r0 != 0) goto L_0x0073
        L_0x0057:
            X.5RL r5 = (X.AnonymousClass5RL) r5
            X.5Ph r1 = r5.A00
            int r0 = r8.hashCode()
            X.5Pv r0 = r1.A0C(r8, r2, r0, r3)
            if (r0 == 0) goto L_0x0073
            X.5Ph r2 = r0.A00
            int r1 = r5.size()
            int r0 = r0.A01
            int r1 = r1 + r0
            X.5RL r5 = new X.5RL
            r5.<init>(r2, r1)
        L_0x0073:
            r4.A0Q = r7
        L_0x0075:
            X.5X0 r7 = r4.A0X
            boolean r0 = r4.A0N
            r7.A00(r0)
            r4.A0N = r6
            r4.A0A = r5
            r1 = 202(0xca, float:2.83E-43)
            java.lang.Object r0 = X.AnonymousClass5XN.A00
            X.C286565Wx.A0K(r4, r0, r5, r1, r3)
            int r0 = r13 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.invoke(r10, r0)
            r2 = 0
            X.C286565Wx.A0L(r4, r3)
            X.C286565Wx.A0L(r4, r3)
            int[] r1 = r7.A01
            int r0 = r7.A00
            int r0 = r0 + -1
            r7.A00 = r0
            r0 = r1[r0]
            if (r0 == 0) goto L_0x00a6
            r2 = 1
        L_0x00a6:
            r4.A0N = r2
            r0 = 0
            r4.A0A = r0
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b7
            r0 = -533006925(0xffffffffe03af5b3, float:-5.3887483E19)
            X.0fL.A00(r0)
        L_0x00b7:
            X.5Xd r2 = r10.ASQ()
            if (r2 == 0) goto L_0x00c5
            r1 = 6
            X.JGL r0 = new X.JGL
            r0.<init>((int) r13, (int) r1, (java.lang.Object) r11, (java.lang.Object) r12)
            r2.A06 = r0
        L_0x00c5:
            return
        L_0x00c6:
            X.5X3 r1 = r4.A0B
            int r0 = r1.A01
            java.lang.Object r6 = r1.A05(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            X.0qQ.A0C(r6, r0)
            X.5RM r6 = (X.AnonymousClass5RM) r6
            boolean r0 = r4.Bwn()
            if (r0 == 0) goto L_0x00dd
            if (r9 == 0) goto L_0x0127
        L_0x00dd:
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r5.containsKey(r8)
            if (r0 != 0) goto L_0x0127
        L_0x00e7:
            X.5RL r5 = (X.AnonymousClass5RL) r5
            X.5Ph r1 = r5.A00
            int r0 = r8.hashCode()
            X.5Pv r0 = r1.A0C(r8, r2, r0, r3)
            if (r0 == 0) goto L_0x0103
            X.5Ph r2 = r0.A00
            int r1 = r5.size()
            int r0 = r0.A01
            int r1 = r1 + r0
            X.5RL r5 = new X.5RL
            r5.<init>(r2, r1)
        L_0x0103:
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x010a
            if (r6 != r5) goto L_0x010a
            r7 = 0
        L_0x010a:
            r6 = r7
            if (r7 == 0) goto L_0x0075
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0075
            X.5zI r2 = r4.A0I
            if (r2 != 0) goto L_0x011c
            X.5zI r2 = new X.5zI
            r2.<init>()
            r4.A0I = r2
        L_0x011c:
            X.5X3 r0 = r4.A0B
            int r1 = r0.A01
            android.util.SparseArray r0 = r2.A00
            r0.put(r1, r5)
            goto L_0x0075
        L_0x0127:
            r5 = r6
            goto L_0x0103
        L_0x0129:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            X.0qQ.A0C(r1, r0)
            X.5Xb r1 = (X.C286605Xb) r1
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286715Xm.A00(X.5Wy, X.5Xl, X.0sL, int):void");
    }

    public static final void A01(C286575Wy r10, 0sL r11, C286705Xl[] r12, int i) {
        AnonymousClass5RM A05;
        r10.ExV(-1390796515);
        if (0fL.A02()) {
            0fL.A01(1906640588, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        C286565Wx r4 = (C286565Wx) r10;
        AnonymousClass5RM A04 = C286565Wx.A04(r4);
        C286565Wx.A0K(r4, AnonymousClass5XN.A02, (Object) null, 201, 0);
        boolean z = true;
        boolean z2 = false;
        if (r4.A0K) {
            A05 = C286565Wx.A05(r4, A04, C286615Xc.A00(A04, AnonymousClass5RL.A00, r12));
            r4.A0Q = true;
        } else {
            AnonymousClass5X3 r1 = r4.A0B;
            Object A06 = r1.A06(r1.A01, 0);
            0qQ.A0C(A06, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            AnonymousClass5RM r2 = (AnonymousClass5RM) A06;
            AnonymousClass5X3 r13 = r4.A0B;
            Object A062 = r13.A06(r13.A01, 1);
            0qQ.A0C(A062, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            AnonymousClass5RM r6 = (AnonymousClass5RM) A062;
            AnonymousClass5RL A00 = C286615Xc.A00(A04, r6, r12);
            if (!r4.Bwn() || r4.A0O || !0qQ.A0K(r6, A00)) {
                A05 = C286565Wx.A05(r4, A04, A00);
                if (!r4.A0O && 0qQ.A0K(A05, r2)) {
                    z = false;
                }
                z2 = z;
                if (z && !r4.A0K) {
                    C301455zI r22 = r4.A0I;
                    if (r22 == null) {
                        r22 = new C301455zI();
                        r4.A0I = r22;
                    }
                    r22.A00.put(r4.A0B.A01, A05);
                }
            } else {
                r4.A03 += r4.A0B.A01();
                A05 = r2;
            }
        }
        AnonymousClass5X0 r7 = r4.A0X;
        r7.A00(r4.A0N ? 1 : 0);
        r4.A0N = z2;
        r4.A0A = A05;
        C286565Wx.A0K(r4, AnonymousClass5XN.A00, A05, 202, 0);
        r11.invoke(r10, Integer.valueOf((i >> 3) & 14));
        boolean z3 = false;
        C286565Wx.A0L(r4, false);
        C286565Wx.A0L(r4, false);
        int[] iArr = r7.A01;
        int i2 = r7.A00 - 1;
        r7.A00 = i2;
        if (iArr[i2] != 0) {
            z3 = true;
        }
        r4.A0N = z3;
        r4.A0A = null;
        if (0fL.A02()) {
            0fL.A00(-682356657);
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(i, 5, (Object) r12, (Object) r11);
        }
    }
}
