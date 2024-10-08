package X;

public abstract class HXW {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: X.6tR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.6tR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: X.J6Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: X.J6Z} */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        if (r6 == r5) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0119, code lost:
        r28 = new X.J6Z((java.lang.Object) r29, (java.lang.Object) r7, (java.lang.Object) r31, r14, 3);
        r3.FLL(r28);
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0129, code lost:
        r8 = r8.Ezh(X.C51973G9u.A0E(r4, r9, r6));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r29, androidx.compose.ui.Modifier r30, com.instagram.model.mediasize.GifUrlImpl r31, java.lang.String r32, java.lang.String r33, float r34, int r35, int r36, int r37) {
        /*
            r13 = r35
            r12 = r30
            r1 = 0
            r15 = r32
            r0 = r31
            boolean r11 = X.AnonymousClass7TF.A1U(r1, r15, r0)
            r0 = 1746192880(0x6814c9f0, float:2.8105413E24)
            r3 = r29
            r3.ExV(r0)
            r27 = r37
            r0 = r37 & 1
            r2 = r36
            if (r0 == 0) goto L_0x01e2
            r0 = r36 | 6
        L_0x001f:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x01d5
            r0 = r0 | 48
        L_0x0025:
            r4 = r37 & 4
            r14 = r34
            if (r4 == 0) goto L_0x01ca
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002d:
            r4 = r37 & 8
            r34 = r33
            if (r4 == 0) goto L_0x01bd
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r7 = r37 & 16
            if (r7 == 0) goto L_0x01af
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r6 = r37 & 32
            if (r6 == 0) goto L_0x01a3
            r4 = 196608(0x30000, float:2.75506E-40)
        L_0x0041:
            r0 = r0 | r4
        L_0x0042:
            r5 = 374491(0x5b6db, float:5.24774E-40)
            r5 = r5 & r0
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r4) goto L_0x0072
            boolean r4 = r3.Bwn()
            if (r4 == 0) goto L_0x0072
            r3.Evl()
        L_0x0054:
            X.5Xd r1 = r3.ASQ()
            if (r1 == 0) goto L_0x0071
            X.J9g r0 = new X.J9g
            r19 = r0
            r20 = r12
            r21 = r31
            r22 = r15
            r23 = r34
            r24 = r14
            r25 = r13
            r26 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r1.A06 = r0
        L_0x0071:
            return
        L_0x0072:
            if (r7 == 0) goto L_0x0076
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
        L_0x0076:
            if (r6 == 0) goto L_0x007b
            r13 = 2147483647(0x7fffffff, float:NaN)
        L_0x007b:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0089
            r5 = 1049080054(0x3e87b0f6, float:0.26502198)
            java.lang.String r4 = "com.instagram.compose.ui.gif.GifImage (GifImage.kt:33)"
            X.0fL.A01(r5, r4)
        L_0x0089:
            r4 = 434061972(0x19df4294, float:2.308455E-23)
            java.lang.Object r7 = X.C51967G9n.A0m(r3, r4)
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r7 != r5) goto L_0x009c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = X.G9t.A0o(r3, r4)
        L_0x009c:
            X.5Oz r7 = (X.C284945Oz) r7
            X.5Wx r4 = X.C51965G9l.A0H(r3, r1)
            r6 = 434063476(0x19df4874, float:2.3086923E-23)
            java.lang.Object r6 = X.C51967G9n.A0m(r3, r6)
            if (r6 != r5) goto L_0x00b3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = X.G9t.A0o(r3, r6)
        L_0x00b3:
            X.5Oz r29 = X.C51965G9l.A0J(r4, r6, r1)
            android.content.Context r18 = X.C51970G9q.A0N(r3)
            com.instagram.common.session.UserSession r19 = X.C51970G9q.A0f(r3)
            X.5Yw r6 = X.AnonymousClass5aQ.A00(r3)
            long r8 = r6.A0f
            int r25 = X.C285595Rx.A00(r8)
            long r8 = X.C51965G9l.A0A(r3)
            int r26 = X.C285595Rx.A00(r8)
            r6 = 434073151(0x19df6e3f, float:2.3102188E-23)
            r3.ExS(r6)
            int r6 = X.C51971G9r.A0B(r7)
            if (r6 != r11) goto L_0x0153
            r6 = 0
            r16 = 0
        L_0x00e0:
            X.C286565Wx.A0L(r4, r1)
            if (r6 == 0) goto L_0x00e8
            r6.A0A(r13)
        L_0x00e8:
            X.2DO r18 = X.C287995bC.A00(r6, r3)
            X.5bM r19 = X.C288075bK.A00
            r6 = 434109394(0x19dffbd2, float:2.3159369E-23)
            r3.ExS(r6)
            androidx.compose.ui.Modifier r8 = X.C54739HQw.A00(r12, r14, r1)
            int r6 = X.C51971G9r.A0B(r7)
            if (r6 != r11) goto L_0x0131
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            r6 = -497830810(0xffffffffe253b466, float:-9.763155E20)
            boolean r11 = X.C51974G9v.A1Y(r3, r6, r0)
            r10 = r0 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r10 != r6) goto L_0x010f
            r16 = 1
        L_0x010f:
            r11 = r11 | r16
            java.lang.Object r6 = r3.ECw()
            if (r11 != 0) goto L_0x0119
            if (r6 != r5) goto L_0x0129
        L_0x0119:
            r33 = 3
            X.J6Z r6 = new X.J6Z
            r28 = r6
            r30 = r7
            r32 = r14
            r28.<init>((java.lang.Object) r29, (java.lang.Object) r30, (java.lang.Object) r31, (float) r32, (int) r33)
            r3.FLL(r6)
        L_0x0129:
            androidx.compose.ui.Modifier r5 = X.C51973G9u.A0E(r4, r9, r6)
            androidx.compose.ui.Modifier r8 = r8.Ezh(r5)
        L_0x0131:
            X.C286565Wx.A0L(r4, r1)
            int r0 = r0 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 24584(0x6008, float:3.445E-41)
            r16 = r3
            r17 = r8
            r20 = r34
            r21 = r0
            X.AnonymousClass6G3.A0A(r16, r17, r18, r19, r20, r21)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0054
            r0 = -1966141435(0xffffffff8acf1005, float:-1.9939401E-32)
            X.0fL.A00(r0)
            goto L_0x0054
        L_0x0153:
            int r9 = X.C51971G9r.A0B(r7)
            int r8 = X.C51971G9r.A0B(r29)
            r6 = 434074817(0x19df74c1, float:2.3104816E-23)
            boolean r9 = X.C51967G9n.A1V(r3, r6, r9)
            boolean r6 = r3.AGs(r8)
            r9 = r9 | r6
            boolean r6 = X.C51973G9u.A1H(r0)
            r9 = r9 | r6
            java.lang.Object r6 = r3.ECw()
            if (r9 != 0) goto L_0x017d
            if (r6 == r5) goto L_0x017d
            r16 = 0
        L_0x0176:
            X.6tR r6 = (X.C321016tR) r6
            X.C286565Wx.A0L(r4, r1)
            goto L_0x00e0
        L_0x017d:
            float r10 = X.C69826Nsn.A00(r31)
            int r9 = X.C51971G9r.A0B(r7)
            int r8 = X.C51971G9r.A0B(r29)
            r6 = -1
            X.6tX r20 = X.C321066tW.A00(r10, r9, r8, r6)
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            r24 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            X.6tR r6 = new X.6tR
            r23 = r15
            r17 = r6
            r21 = r31
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3.FLL(r6)
            goto L_0x0176
        L_0x01a3:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r36
            if (r4 != 0) goto L_0x0042
            int r4 = X.G9t.A0A(r3, r13)
            goto L_0x0041
        L_0x01af:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r36
            if (r4 != 0) goto L_0x003b
            int r4 = X.G9t.A0S(r3, r12)
            r0 = r0 | r4
            goto L_0x003b
        L_0x01bd:
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0035
            r4 = r34
            int r4 = X.G9t.A0R(r3, r4)
            r0 = r0 | r4
            goto L_0x0035
        L_0x01ca:
            r4 = r2 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x002d
            int r4 = X.G9t.A01(r3, r14)
            r0 = r0 | r4
            goto L_0x002d
        L_0x01d5:
            r4 = r36 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0025
            r4 = r31
            int r4 = X.G9t.A0P(r3, r4)
            r0 = r0 | r4
            goto L_0x0025
        L_0x01e2:
            r0 = r36 & 14
            if (r0 != 0) goto L_0x01ee
            int r0 = X.G9t.A0O(r3, r15)
            r0 = r0 | r36
            goto L_0x001f
        L_0x01ee:
            r0 = r2
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HXW.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.model.mediasize.GifUrlImpl, java.lang.String, java.lang.String, float, int, int, int):void");
    }
}
