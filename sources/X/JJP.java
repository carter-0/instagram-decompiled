package X;

import androidx.compose.ui.Modifier;

public final class JJP extends 0Yg implements 0sK {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JJP(int i) {
        super(3);
        this.A00 = i;
    }

    public static Modifier A00(Modifier modifier, 0sP r2, int i) {
        return C287435a8.A02(modifier, r2, new JJP(i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            r4 = this;
            int r1 = r4.A00
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            r0 = 359872873(0x15733969, float:4.9118748E-26)
            boolean r0 = X.C51967G9n.A1U(r2, r0)
            switch(r1) {
                case 0: goto L_0x0048;
                case 1: goto L_0x007d;
                case 2: goto L_0x00af;
                case 3: goto L_0x00e2;
                default: goto L_0x0010;
            }
        L_0x0010:
            if (r0 == 0) goto L_0x001a
            r1 = 1273814839(0x4becdf37, float:3.1047278E7)
            java.lang.String r0 = "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)"
            X.0fL.A01(r1, r0)
        L_0x001a:
            X.HpJ r0 = X.I4O.A0N
            X.I4O r1 = r0.A00(r2)
            boolean r0 = r2.AGu(r1)
            java.lang.Object r3 = r2.ECw()
            if (r0 != 0) goto L_0x002e
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x0038
        L_0x002e:
            X.IF2 r0 = r1.A05
            X.IGF r3 = new X.IGF
            r3.<init>(r0)
            r2.FLL(r3)
        L_0x0038:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0044
            r0 = 653220951(0x26ef5c57, float:1.6608985E-15)
        L_0x0041:
            X.0fL.A00(r0)
        L_0x0044:
            X.C51965G9l.A1V(r2)
            return r3
        L_0x0048:
            if (r0 == 0) goto L_0x0052
            r1 = 1399078604(0x53643ecc, float:9.803061E11)
            java.lang.String r0 = "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)"
            X.0fL.A01(r1, r0)
        L_0x0052:
            X.HpJ r0 = X.I4O.A0N
            X.I4O r1 = r0.A00(r2)
            boolean r0 = r2.AGu(r1)
            java.lang.Object r3 = r2.ECw()
            if (r0 != 0) goto L_0x0066
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x0070
        L_0x0066:
            X.IF2 r0 = r1.A02
            X.IGF r3 = new X.IGF
            r3.<init>(r0)
            r2.FLL(r3)
        L_0x0070:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0044
            r0 = 949487301(0x389806c5, float:7.249186E-5)
            X.0fL.A00(r0)
            goto L_0x0044
        L_0x007d:
            if (r0 == 0) goto L_0x0087
            r1 = -1738464330(0xffffffff986123b6, float:-2.9098598E-24)
            java.lang.String r0 = "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)"
            X.0fL.A01(r1, r0)
        L_0x0087:
            X.HpJ r0 = X.I4O.A0N
            X.I4O r1 = r0.A00(r2)
            boolean r0 = r2.AGu(r1)
            java.lang.Object r3 = r2.ECw()
            if (r0 != 0) goto L_0x009b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x00a5
        L_0x009b:
            X.IF2 r0 = r1.A03
            X.IGF r3 = new X.IGF
            r3.<init>(r0)
            r2.FLL(r3)
        L_0x00a5:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0044
            r0 = -261188494(0xfffffffff06e9472, float:-2.9534757E29)
            goto L_0x0041
        L_0x00af:
            if (r0 == 0) goto L_0x00b9
            r1 = 244208807(0xe8e54a7, float:3.508722E-30)
            java.lang.String r0 = "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)"
            X.0fL.A01(r1, r0)
        L_0x00b9:
            X.HpJ r0 = X.I4O.A0N
            X.I4O r1 = r0.A00(r2)
            boolean r0 = r2.AGu(r1)
            java.lang.Object r3 = r2.ECw()
            if (r0 != 0) goto L_0x00cd
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x00d7
        L_0x00cd:
            androidx.compose.foundation.layout.WindowInsets r0 = r1.A0B
            X.IGF r3 = new X.IGF
            r3.<init>(r0)
            r2.FLL(r3)
        L_0x00d7:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0044
            r0 = 181853505(0xad6dd41, float:2.0690677E-32)
            goto L_0x0041
        L_0x00e2:
            if (r0 == 0) goto L_0x00ec
            r1 = -853991930(0xffffffffcd191e06, float:-1.60555104E8)
            java.lang.String r0 = "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)"
            X.0fL.A01(r1, r0)
        L_0x00ec:
            X.HpJ r0 = X.I4O.A0N
            X.I4O r1 = r0.A00(r2)
            boolean r0 = r2.AGu(r1)
            java.lang.Object r3 = r2.ECw()
            if (r0 != 0) goto L_0x0100
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x010a
        L_0x0100:
            X.IF2 r0 = r1.A04
            X.IGF r3 = new X.IGF
            r3.<init>(r0)
            r2.FLL(r3)
        L_0x010a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0044
            r0 = -421909615(0xffffffffe6da2b91, float:-5.1513978E23)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JJP.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
