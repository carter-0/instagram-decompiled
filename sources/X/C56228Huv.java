package X;

/* renamed from: X.Huv  reason: case insensitive filesystem */
public abstract class C56228Huv {
    public static final void A01(C286575Wy r13, C270284gU r14, C53472Gp4 gp4, I4B i4b, C62320sa r17, C62320sa r18, 0sP r19, 0sP r20, 0sP r21, float f, int i, boolean z) {
        int i2;
        C53472Gp4 gp42 = gp4;
        I4B i4b2 = i4b;
        C62320sa r7 = r17;
        AnonymousClass7TG.A1T(i4b2, r7, gp4);
        C270284gU r4 = r14;
        C62320sa r8 = r18;
        0sP r9 = r19;
        C51974G9v.A1N(r14, r8, r9);
        0sP r10 = r20;
        0sP r11 = r21;
        AnonymousClass7TF.A1G(r10, 8, r11);
        C286575Wy r15 = r13;
        r13.ExV(1918225579);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, i4b2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r7);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r15, gp42);
        }
        float f2 = f;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A02(r15, f2);
        }
        boolean z2 = z;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0c(r15, z2);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r15, r4);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r15, r8);
        }
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0L(r15, r9);
        }
        if ((100663296 & i) == 0) {
            i2 |= G9t.A0M(r15, r10);
        }
        if ((805306368 & i) == 0) {
            i2 |= G9t.A0N(r15, r11);
        }
        if ((306783379 & i2) != 306783378 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(247403054, "com.instagram.barcelona.feed.mediaviewer.ui.ImageMediaBox (ImageMediaBox.kt:35)");
            }
            r15.AJO(AnonymousClass6DE.A00);
            boolean A1Y = C51967G9n.A1Y(r15, (Object) null, -1379095384) | C51973G9u.A1I(i2);
            Object ECw = r15.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = C59103J6l.A00(r15, gp42, (Object) null, 39);
            }
            C51965G9l.A1V(r15);
            int i4 = i2 >> 9;
            I4B i4b3 = i4b2;
            C62320sa r182 = r7;
            C62320sa r192 = r8;
            0sP r202 = (0sP) ECw;
            0sP r212 = r9;
            0sP r22 = r10;
            C54824HUf.A00(r15, C51968G9o.A0O(), i4b3, r182, r192, r202, r212, r22, AnonymousClass5PI.A01(r15, new J7W(r4, gp42, r11, f2, z2), -1966172828), C51973G9u.A03(14155776 | (i2 & 14) | (i2 & 112), i4 & 7168, i4));
            if (0fL.A02()) {
                0fL.A00(-3875057);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBP(r4, gp42, i4b2, r7, r8, r9, r10, r11, f2, i3, z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r16, X.C270284gU r17, X.JV7 r18, com.instagram.common.typedurl.ImageUrl r19, java.lang.String r20, java.lang.String r21, X.C62320sa r22, X.0sP r23, float r24, int r25, int r26) {
        /*
            r0 = r22
            r8 = 0
            r4 = r20
            X.0qQ.A0B(r4, r8)
            r1 = 1286332857(0x4cabe1b9, float:9.0115528E7)
            r15 = r16
            r15.ExV(r1)
            r1 = r26
            r3 = r26 & 1
            r2 = r25
            if (r3 == 0) goto L_0x0126
            r6 = r25 | 6
        L_0x001a:
            r5 = r26 & 2
            r3 = r24
            if (r5 == 0) goto L_0x011b
            r6 = r6 | 48
        L_0x0022:
            r5 = r26 & 4
            r10 = r19
            if (r5 == 0) goto L_0x0110
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r5 = r26 & 8
            r9 = r21
            if (r5 == 0) goto L_0x0105
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r5 = r26 & 16
            r11 = r18
            if (r5 == 0) goto L_0x00fa
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r7 = r26 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            r12 = r17
            if (r7 != 0) goto L_0x004a
            r5 = r25 & r5
            if (r5 != 0) goto L_0x004b
            int r5 = X.G9t.A0T(r15, r12)
        L_0x004a:
            r6 = r6 | r5
        L_0x004b:
            r13 = r26 & 64
            r7 = 1572864(0x180000, float:2.204052E-39)
            r5 = r23
            if (r13 != 0) goto L_0x005b
            r7 = r25 & r7
            if (r7 != 0) goto L_0x005c
            int r7 = X.G9t.A0K(r15, r5)
        L_0x005b:
            r6 = r6 | r7
        L_0x005c:
            r13 = r1 & 128(0x80, float:1.794E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x006a
            r7 = r7 & r25
            if (r7 != 0) goto L_0x006b
            int r7 = X.G9t.A0L(r15, r0)
        L_0x006a:
            r6 = r6 | r7
        L_0x006b:
            r14 = 4793491(0x492493, float:6.717112E-39)
            r14 = r14 & r6
            r7 = 4793490(0x492492, float:6.71711E-39)
            if (r14 != r7) goto L_0x009b
            boolean r7 = r15.Bwn()
            if (r7 == 0) goto L_0x009b
            r15.Evl()
        L_0x007d:
            X.5Xd r7 = r15.ASQ()
            if (r7 == 0) goto L_0x009a
            X.JAv r6 = new X.JAv
            r13 = r11
            r14 = r10
            r15 = r4
            r16 = r9
            r17 = r0
            r18 = r5
            r19 = r3
            r20 = r2
            r21 = r1
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r7.A06 = r6
        L_0x009a:
            return
        L_0x009b:
            if (r13 == 0) goto L_0x009f
            X.IpG r0 = X.C58273IpG.A00
        L_0x009f:
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x00ad
            r13 = -694739731(0xffffffffd6971ced, float:-8.3075246E13)
            java.lang.String r7 = "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerImage (ImageMediaBox.kt:72)"
            X.0fL.A01(r13, r7)
        L_0x00ad:
            java.lang.String r7 = "viewer"
            java.lang.String r18 = X.002.A0R(r7, r4)
            X.5b7 r13 = X.AnonymousClass6DA.A01
            X.5b7 r14 = X.AnonymousClass6DA.A00
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            r19 = 0
            androidx.compose.ui.Modifier r16 = X.C54739HQw.A00(r7, r3, r8)
            r8 = -909184669(0xffffffffc9cef163, float:-1695276.4)
            r26 = 1
            X.JH9 r7 = new X.JH9
            r22 = r10
            r24 = r11
            r25 = r9
            r20 = r7
            r21 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.5PJ r21 = X.AnonymousClass5PI.A01(r15, r7, r8)
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r6 & 14
            r23 = r23 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r7
            r23 = r23 | r6
            r22 = 0
            r24 = 24
            r20 = r0
            r17 = r4
            X.AnonymousClass6DA.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x007d
            r6 = 992971231(0x3b2f89df, float:0.0026785058)
            X.0fL.A00(r6)
            goto L_0x007d
        L_0x00fa:
            r5 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x003a
            int r5 = X.G9t.A0S(r15, r11)
            r6 = r6 | r5
            goto L_0x003a
        L_0x0105:
            r5 = r2 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0032
            int r5 = X.G9t.A0R(r15, r9)
            r6 = r6 | r5
            goto L_0x0032
        L_0x0110:
            r5 = r2 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x002a
            int r5 = X.G9t.A0Q(r15, r10)
            r6 = r6 | r5
            goto L_0x002a
        L_0x011b:
            r5 = r25 & 48
            if (r5 != 0) goto L_0x0022
            int r5 = X.G9t.A00(r15, r3)
            r6 = r6 | r5
            goto L_0x0022
        L_0x0126:
            r3 = r25 & 6
            if (r3 != 0) goto L_0x0132
            int r6 = X.G9t.A0O(r15, r4)
            r6 = r6 | r25
            goto L_0x001a
        L_0x0132:
            r6 = r2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56228Huv.A00(X.5Wy, X.4gU, X.JV7, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, X.0sa, X.0sP, float, int, int):void");
    }
}
