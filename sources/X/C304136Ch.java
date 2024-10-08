package X;

/* renamed from: X.6Ch  reason: invalid class name and case insensitive filesystem */
public abstract class C304136Ch {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r3 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if ((r37 & 8) != 0) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r30, androidx.compose.ui.Modifier r31, X.AnonymousClass5Z4 r32, java.lang.String r33, double r34, int r36, int r37) {
        /*
            r4 = r32
            r5 = r31
            r0 = 1295585651(0x4d391173, float:1.94058032E8)
            r15 = r30
            r15.ExV(r0)
            r2 = r37 & 1
            r7 = 4
            r0 = r34
            r6 = r36
            if (r2 == 0) goto L_0x01a7
            r9 = r36 | 6
        L_0x0017:
            r2 = r37 & 2
            r13 = r33
            if (r2 == 0) goto L_0x0196
            r9 = r9 | 48
        L_0x001f:
            r8 = r37 & 4
            if (r8 == 0) goto L_0x0185
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0025:
            r2 = r6 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0038
            r2 = r37 & 8
            if (r2 != 0) goto L_0x0035
            boolean r3 = r15.AGu(r4)
            r2 = 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0037
        L_0x0035:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0037:
            r9 = r9 | r2
        L_0x0038:
            r3 = r9 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r3 != r2) goto L_0x0061
            boolean r2 = r15.Bwn()
            if (r2 == 0) goto L_0x0061
            r15.Evl()
        L_0x0047:
            X.5Xd r3 = r15.ASQ()
            if (r3 == 0) goto L_0x0060
            X.6Ci r2 = new X.6Ci
            r30 = r2
            r31 = r5
            r32 = r4
            r33 = r13
            r34 = r0
            r36 = r6
            r30.<init>(r31, r32, r33, r34, r36, r37)
            r3.A06 = r2
        L_0x0060:
            return
        L_0x0061:
            r15.Ewr()
            r2 = r36 & 1
            if (r2 == 0) goto L_0x0175
            boolean r2 = r15.Aw3()
            if (r2 != 0) goto L_0x0175
            r15.Evl()
            r2 = r37 & 8
            if (r2 == 0) goto L_0x0077
        L_0x0075:
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0077:
            r15.ASM()
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0088
            r3 = 1096602025(0x415cd1a9, float:13.801187)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostTimestamp (PostTimestamp.kt:24)"
            X.0fL.A01(r3, r2)
        L_0x0088:
            X.4bM r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            r11 = r15
            X.5Wx r11 = (X.C286565Wx) r11
            X.5RM r2 = X.C286565Wx.A04(r11)
            java.lang.Object r12 = X.C286615Xc.A01(r3, r2)
            android.content.Context r12 = (android.content.Context) r12
            r2 = -714209403(0xffffffffd56e0785, float:-1.6357254E13)
            r15.ExS(r2)
            java.lang.Object r8 = r15.ECw()
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            r18 = 0
            if (r8 != r10) goto L_0x00ba
            java.lang.String r3 = ""
            X.5Or r2 = X.C284885Or.A00
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r2, r8)
            X.0eM r8 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r8.<init>(r2, r3)
            r11.A0Q(r8)
        L_0x00ba:
            X.5Oz r8 = (X.C284945Oz) r8
            r3 = 0
            X.C286565Wx.A0L(r11, r3)
            r2 = -714207296(0xffffffffd56e0fc0, float:-1.63594633E13)
            r15.ExS(r2)
            if (r33 != 0) goto L_0x0172
            r2 = -714206211(0xffffffffd56e13fd, float:-1.6360601E13)
            r15.ExS(r2)
            r2 = r9 & 14
            r14 = 0
            if (r2 != r7) goto L_0x00d4
            r14 = 1
        L_0x00d4:
            java.lang.Object r2 = r15.ECw()
            if (r14 != 0) goto L_0x00dc
            if (r2 != r10) goto L_0x00e3
        L_0x00dc:
            java.lang.String r2 = X.1G0.A04(r12, r0)
            r15.FLL(r2)
        L_0x00e3:
            X.C286565Wx.A0L(r11, r3)
        L_0x00e6:
            X.C286565Wx.A0L(r11, r3)
            r8.Epw(r2)
            r2 = -714200255(0xffffffffd56e2b41, float:-1.63668463E13)
            r15.ExS(r2)
            r2 = r9 & 14
            r14 = 0
            if (r2 != r7) goto L_0x00f8
            r14 = 1
        L_0x00f8:
            java.lang.Object r7 = r15.ECw()
            if (r14 != 0) goto L_0x0100
            if (r7 != r10) goto L_0x0107
        L_0x0100:
            java.lang.String r7 = X.1G0.A05(r12, r0, r3)
            r15.FLL(r7)
        L_0x0107:
            java.lang.String r7 = (java.lang.String) r7
            X.C286565Wx.A0L(r11, r3)
            java.lang.Object r2 = r8.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r8 = -714195085(0xffffffffd56e3f73, float:-1.63722675E13)
            r15.ExS(r8)
            boolean r12 = r15.AGu(r7)
            java.lang.Object r8 = r15.ECw()
            if (r12 != 0) goto L_0x0124
            if (r8 != r10) goto L_0x012d
        L_0x0124:
            r10 = 3
            X.9Mk r8 = new X.9Mk
            r8.<init>(r7, r10)
            r15.FLL(r8)
        L_0x012d:
            X.0sP r8 = (X.0sP) r8
            X.C286565Wx.A0L(r11, r3)
            androidx.compose.ui.Modifier r16 = X.AnonymousClass5R5.A00(r5, r8, r3)
            X.5Yw r7 = X.AnonymousClass5aQ.A00(r15)
            long r7 = r7.A0t
            r32 = 0
            r10 = 57344(0xe000, float:8.0356E-41)
            int r28 = r9 << 3
            r28 = r28 & r10
            r29 = 16376(0x3ff8, float:2.2948E-41)
            r19 = r18
            r20 = r18
            r22 = r18
            r23 = r3
            r24 = r3
            r25 = r3
            r26 = r3
            r27 = r3
            r30 = r7
            r34 = r32
            r36 = r3
            r17 = r4
            r21 = r2
            X.AnonymousClass5ZZ.A03(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0047
            r2 = -1004839713(0xffffffffc41b5cdf, float:-621.4511)
            X.0fL.A00(r2)
            goto L_0x0047
        L_0x0172:
            r2 = r13
            goto L_0x00e6
        L_0x0175:
            if (r8 == 0) goto L_0x0179
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x0179:
            r2 = r37 & 8
            if (r2 == 0) goto L_0x0077
            X.5ZE r2 = X.AnonymousClass5aQ.A01(r15)
            X.5Z4 r4 = r2.A00
            goto L_0x0075
        L_0x0185:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0025
            boolean r3 = r15.AGu(r5)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0193
            r2 = 256(0x100, float:3.59E-43)
        L_0x0193:
            r9 = r9 | r2
            goto L_0x0025
        L_0x0196:
            r2 = r36 & 48
            if (r2 != 0) goto L_0x001f
            boolean r3 = r15.AGu(r13)
            r2 = 16
            if (r3 == 0) goto L_0x01a4
            r2 = 32
        L_0x01a4:
            r9 = r9 | r2
            goto L_0x001f
        L_0x01a7:
            r2 = r36 & 6
            if (r2 != 0) goto L_0x01b7
            boolean r2 = r15.AGq(r0)
            r9 = 2
            if (r2 == 0) goto L_0x01b3
            r9 = 4
        L_0x01b3:
            r9 = r9 | r36
            goto L_0x0017
        L_0x01b7:
            r9 = r6
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304136Ch.A00(X.5Wy, androidx.compose.ui.Modifier, X.5Z4, java.lang.String, double, int, int):void");
    }
}
