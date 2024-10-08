package X;

public abstract class HVA {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.Inx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: X.Inx} */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r1 == X.AnonymousClass5XT.A00) goto L_0x0094;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r21, androidx.compose.ui.Modifier r22, com.instagram.api.schemas.LineType r23, java.lang.String r24, int r25, int r26, long r27, boolean r29) {
        /*
            r4 = r22
            r5 = 0
            r8 = r23
            r13 = r24
            boolean r12 = X.AnonymousClass7TF.A1U(r5, r13, r8)
            r0 = -1738308412(0xffffffff986384c4, float:-2.9406092E-24)
            r9 = r21
            r9.ExV(r0)
            r16 = r26
            r0 = r26 & 1
            r7 = r25
            if (r0 == 0) goto L_0x0107
            r0 = r25 | 6
        L_0x001d:
            r1 = r26 & 2
            if (r1 == 0) goto L_0x00fc
            r0 = r0 | 48
        L_0x0023:
            r1 = r26 & 4
            r6 = r29
            if (r1 == 0) goto L_0x00f1
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002b:
            r1 = r26 & 8
            r14 = r27
            if (r1 == 0) goto L_0x00e6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0033:
            r3 = r26 & 16
            if (r3 == 0) goto L_0x00db
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0039:
            r2 = r0 & 9363(0x2493, float:1.312E-41)
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r1) goto L_0x0060
            boolean r1 = r9.Bwn()
            if (r1 == 0) goto L_0x0060
            r9.Evl()
        L_0x0048:
            X.5Xd r0 = r9.ASQ()
            if (r0 == 0) goto L_0x005f
            X.JA4 r11 = new X.JA4
            r20 = r6
            r18 = r14
            r17 = r5
            r15 = r7
            r14 = r13
            r13 = r4
            r12 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20)
            r0.A06 = r11
        L_0x005f:
            return
        L_0x0060:
            if (r3 == 0) goto L_0x0064
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
        L_0x0064:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0072
            r2 = 666817524(0x27bed3f4, float:5.2965394E-15)
            java.lang.String r1 = "com.instagram.barcelona.feed.post.ui.TransparencyLabelFeedText (TransparencyLabelFeedText.kt:30)"
            X.0fL.A01(r2, r1)
        L_0x0072:
            java.lang.Object r11 = X.C51966G9m.A16(r9)
            java.lang.Object r10 = X.C51965G9l.A0r(r9)
            long r22 = X.C51966G9m.A0M(r9)
            r3 = 0
            r1 = 1846917214(0x6e15b85e, float:1.1584038E28)
            boolean r1 = X.C51973G9u.A1Q(r9, r1, r0)
            boolean r2 = X.G9t.A1a(r9, r11, r10, r1)
            java.lang.Object r1 = r9.ECw()
            if (r2 != 0) goto L_0x0094
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x00a6
        L_0x0094:
            X.Inx r1 = new X.Inx
            r24 = r1
            r25 = r14
            r27 = r11
            r28 = r10
            r29 = r12
            r24.<init>(r25, r27, r28, r29)
            r9.FLL(r1)
        L_0x00a6:
            X.0sa r1 = (X.C62320sa) r1
            X.C51965G9l.A1X(r9, r5)
            androidx.compose.ui.Modifier r2 = X.C287635aW.A05(r4, r3, r3, r1, r12)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r1 = X.C304236Cr.A00(r8, r1)
            androidx.compose.ui.Modifier r10 = X.C304246Cs.A00(r2, r1, r6, r12)
            r3 = 1094713344(0x41400000, float:12.0)
            r2 = 1098907648(0x41800000, float:16.0)
            r1 = 0
            androidx.compose.ui.Modifier r18 = X.C287195Zj.A0A(r10, r3, r1, r2)
            r20 = r0 & 14
            r21 = 32760(0x7ff8, float:4.5907E-41)
            r19 = r13
            r17 = r9
            X.AnonymousClass5ZZ.A0c(r17, r18, r19, r20, r21, r22)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0048
            r0 = 1474713565(0x57e657dd, float:5.06530089E14)
            X.0fL.A00(r0)
            goto L_0x0048
        L_0x00db:
            r1 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0039
            int r1 = X.G9t.A0S(r9, r4)
            r0 = r0 | r1
            goto L_0x0039
        L_0x00e6:
            r1 = r7 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0033
            int r1 = X.G9t.A0E(r9, r14)
            r0 = r0 | r1
            goto L_0x0033
        L_0x00f1:
            r1 = r7 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x002b
            int r1 = X.G9t.A0a(r9, r6)
            r0 = r0 | r1
            goto L_0x002b
        L_0x00fc:
            r1 = r25 & 48
            if (r1 != 0) goto L_0x0023
            int r1 = X.G9t.A0P(r9, r8)
            r0 = r0 | r1
            goto L_0x0023
        L_0x0107:
            r0 = r25 & 6
            if (r0 != 0) goto L_0x0113
            int r0 = X.G9t.A0O(r9, r13)
            r0 = r0 | r25
            goto L_0x001d
        L_0x0113:
            r0 = r7
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HVA.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, java.lang.String, int, int, long, boolean):void");
    }
}
