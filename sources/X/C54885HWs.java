package X;

/* renamed from: X.HWs  reason: case insensitive filesystem */
public abstract class C54885HWs {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass5ZP r16, X.C286575Wy r17, androidx.compose.ui.Modifier r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, int r25, int r26) {
        /*
            r4 = r16
            r10 = r18
            r5 = 0
            r9 = r20
            r0 = r19
            X.AnonymousClass7TF.A1H(r0, r9)
            r0 = -1719400921(0xffffffff99840627, float:-1.3650965E-23)
            r11 = r17
            r11.ExV(r0)
            r6 = r26
            r0 = r26 & 1
            r7 = r25
            if (r0 == 0) goto L_0x0150
            r0 = r25 | 6
        L_0x001e:
            r1 = r26 & 2
            if (r1 == 0) goto L_0x0145
            r0 = r0 | 48
        L_0x0024:
            r1 = r26 & 4
            r25 = r21
            if (r1 == 0) goto L_0x0138
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r1 = r26 & 8
            r20 = r22
            if (r1 == 0) goto L_0x012b
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r1 = r26 & 16
            r15 = r23
            if (r1 == 0) goto L_0x011e
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003c:
            r1 = r26 & 32
            r8 = r24
            if (r1 == 0) goto L_0x0113
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x0044:
            r0 = r0 | r1
        L_0x0045:
            r12 = r26 & 64
            if (r12 == 0) goto L_0x0108
            r1 = 1572864(0x180000, float:2.204052E-39)
        L_0x004b:
            r0 = r0 | r1
        L_0x004c:
            r3 = r6 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00fd
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0052:
            r0 = r0 | r1
        L_0x0053:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r0 & r1
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r1) goto L_0x0083
            boolean r1 = r11.Bwn()
            if (r1 == 0) goto L_0x0083
            r11.Evl()
        L_0x0066:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x0082
            X.JB2 r0 = new X.JB2
            r16 = r8
            r17 = r7
            r18 = r6
            r12 = r9
            r13 = r25
            r14 = r20
            r8 = r0
            r9 = r4
            r11 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.A06 = r0
        L_0x0082:
            return
        L_0x0083:
            if (r12 == 0) goto L_0x0087
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
        L_0x0087:
            if (r3 == 0) goto L_0x0090
            r1 = 1090519040(0x41000000, float:8.0)
            X.5ZS r4 = new X.5ZS
            r4.<init>(r1)
        L_0x0090:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x009e
            r2 = -1839679347(0xffffffff9258b88d, float:-6.838506E-28)
            java.lang.String r1 = "com.instagram.comments.mvvm.view.compose.RoundedGif (RoundedGif.kt:29)"
            X.0fL.A01(r2, r1)
        L_0x009e:
            float r14 = (float) r8
            float r13 = (float) r15
            float r21 = r14 / r13
            r1 = -89392339(0xfffffffffaabfb2d, float:-4.464886E35)
            boolean r2 = X.C51974G9v.A1Y(r11, r1, r0)
            boolean r1 = X.C51973G9u.A1I(r0)
            r2 = r2 | r1
            java.lang.Object r3 = r11.ECw()
            if (r2 != 0) goto L_0x00b8
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r3 != r1) goto L_0x00c2
        L_0x00b8:
            com.instagram.model.mediasize.GifUrlImpl r3 = new com.instagram.model.mediasize.GifUrlImpl
            r1 = r25
            r3.<init>(r9, r1, r14, r13)
            r11.FLL(r3)
        L_0x00c2:
            com.instagram.model.mediasize.GifUrlImpl r3 = (com.instagram.model.mediasize.GifUrlImpl) r3
            X.C51965G9l.A1X(r11, r5)
            X.5ZQ r1 = new X.5ZQ
            r1.<init>(r4, r4, r4, r4)
            androidx.compose.ui.Modifier r12 = X.AnonymousClass6FZ.A01(r10, r1)
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r11)
            long r1 = r1.A0c
            androidx.compose.ui.Modifier r1 = X.C51966G9m.A0X(r12, r1)
            androidx.compose.ui.Modifier r17 = X.C287205Zk.A0G(r1, r14, r13)
            r23 = r0 & 14
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r23 = r23 | r0
            r24 = 32
            r16 = r11
            r18 = r3
            r22 = r5
            X.HXW.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0066
            r0 = -1400602030(0xffffffffac848252, float:-3.766134E-12)
            X.0fL.A00(r0)
            goto L_0x0066
        L_0x00fd:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r7
            if (r1 != 0) goto L_0x0053
            int r1 = X.G9t.A0V(r11, r4)
            goto L_0x0052
        L_0x0108:
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r7
            if (r1 != 0) goto L_0x004c
            int r1 = X.G9t.A0U(r11, r10)
            goto L_0x004b
        L_0x0113:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r7
            if (r1 != 0) goto L_0x0045
            int r1 = X.G9t.A0A(r11, r8)
            goto L_0x0044
        L_0x011e:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r7
            if (r1 != 0) goto L_0x003c
            int r1 = X.G9t.A09(r11, r15)
            r0 = r0 | r1
            goto L_0x003c
        L_0x012b:
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0034
            r1 = r20
            int r1 = X.G9t.A0R(r11, r1)
            r0 = r0 | r1
            goto L_0x0034
        L_0x0138:
            r1 = r7 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x002c
            r1 = r25
            int r1 = X.G9t.A0Q(r11, r1)
            r0 = r0 | r1
            goto L_0x002c
        L_0x0145:
            r1 = r25 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0024
            int r1 = X.G9t.A0P(r11, r9)
            r0 = r0 | r1
            goto L_0x0024
        L_0x0150:
            r0 = r25 & 14
            if (r0 != 0) goto L_0x015e
            r0 = r19
            int r0 = X.G9t.A0O(r11, r0)
            r0 = r0 | r25
            goto L_0x001e
        L_0x015e:
            r0 = r7
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54885HWs.A00(X.5ZP, X.5Wy, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int):void");
    }
}
