package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HvV  reason: case insensitive filesystem */
public abstract class C56261HvV {
    public static final void A01(C286575Wy r13, C62320sa r14, 0sP r15, 0sL r16, int i, long j, boolean z) {
        A00((C56838IEj) null, r13, (Modifier) null, (HL4) null, r14, r15, r16, i, 209, j, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r3 == false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C56838IEj r21, X.C286575Wy r22, androidx.compose.ui.Modifier r23, X.HL4 r24, X.C62320sa r25, X.0sP r26, X.0sL r27, int r28, int r29, long r30, boolean r32, boolean r33) {
        /*
            r17 = r21
            r1 = r30
            r18 = r24
            r5 = r33
            r20 = r32
            r21 = r25
            r6 = r23
            r11 = 1
            r24 = r26
            r0 = r24
            X.0qQ.A0B(r0, r11)
            r0 = 765810788(0x2da55864, float:1.8797582E-11)
            r10 = r22
            r10.ExV(r0)
            r8 = r29
            r16 = r29 & 1
            r9 = r28
            if (r16 == 0) goto L_0x0216
            r7 = r28 | 6
        L_0x0028:
            r0 = r29 & 2
            if (r0 == 0) goto L_0x0209
            r7 = r7 | 48
        L_0x002e:
            r15 = r29 & 4
            if (r15 == 0) goto L_0x01fc
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r14 = r29 & 8
            if (r14 == 0) goto L_0x01ef
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r13 = r29 & 16
            if (r13 == 0) goto L_0x01e2
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0040:
            r12 = r29 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r12 != 0) goto L_0x0052
            r0 = r28 & r0
            if (r0 != 0) goto L_0x0053
            boolean r0 = r10.AGt(r1)
            int r0 = X.C51969G9p.A03(r0)
        L_0x0052:
            r7 = r7 | r0
        L_0x0053:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r28 & r0
            if (r0 != 0) goto L_0x006a
            r0 = r29 & 64
            if (r0 != 0) goto L_0x0067
            r0 = r17
            boolean r3 = r10.AGu(r0)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r3 != 0) goto L_0x0069
        L_0x0067:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x0069:
            r7 = r7 | r0
        L_0x006a:
            r3 = r8 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 != 0) goto L_0x0078
            r0 = r28 & r0
            if (r0 != 0) goto L_0x0079
            int r0 = X.G9t.A0f(r10, r5)
        L_0x0078:
            r7 = r7 | r0
        L_0x0079:
            r4 = r8 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r26 = r27
            if (r4 != 0) goto L_0x008b
            r0 = r28 & r0
            if (r0 != 0) goto L_0x008c
            r0 = r26
            int r0 = X.G9t.A0M(r10, r0)
        L_0x008b:
            r7 = r7 | r0
        L_0x008c:
            r4 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r4 & r7
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r0) goto L_0x00bd
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x00bd
            r10.Evl()
        L_0x009e:
            X.5Xd r0 = r10.ASQ()
            if (r0 == 0) goto L_0x00bc
            X.JBZ r3 = new X.JBZ
            r10 = r9
            r11 = r8
            r12 = r1
            r14 = r20
            r15 = r5
            r4 = r17
            r5 = r6
            r6 = r18
            r7 = r21
            r8 = r24
            r9 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            r0.A06 = r3
        L_0x00bc:
            return
        L_0x00bd:
            r10.Ewr()
            r0 = r28 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = 0
            if (r0 == 0) goto L_0x01bc
            boolean r0 = r10.Aw3()
            if (r0 != 0) goto L_0x01bc
            r10.Evl()
            r0 = r29 & 64
            if (r0 == 0) goto L_0x00d7
            r7 = r7 & r4
        L_0x00d7:
            boolean r0 = X.C51967G9n.A1S(r10)
            if (r0 == 0) goto L_0x00e5
            r3 = -1241431703(0xffffffffb6014169, float:-1.9260572E-6)
            java.lang.String r0 = "com.instagram.compose.igds.components.contextmenu.IgdsContextMenu (IgdsContextMenu.kt:37)"
            X.0fL.A01(r3, r0)
        L_0x00e5:
            r0 = 130383023(0x7c57caf, float:2.9714548E-34)
            java.lang.Object r12 = X.C51967G9n.A0m(r10, r0)
            java.lang.Object r14 = X.AnonymousClass5XT.A00
            if (r12 != r14) goto L_0x00fc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            X.GeI r12 = new X.GeI
            r12.<init>(r0)
            r10.FLL(r12)
        L_0x00fc:
            X.GeI r12 = (X.C52882GeI) r12
            r13 = r10
            X.5Wx r13 = (X.C286565Wx) r13
            r0 = r20
            java.lang.Boolean r0 = X.C51967G9n.A0f(r13, r0)
            r12.A00(r0)
            X.5Oz r0 = r12.A00
            boolean r0 = X.C51972G9s.A1Y(r0)
            if (r0 != 0) goto L_0x011a
            X.5Oz r0 = r12.A01
            boolean r0 = X.C51972G9s.A1Y(r0)
            if (r0 == 0) goto L_0x01ae
        L_0x011a:
            r0 = 130388856(0x7c59378, float:2.972794E-34)
            java.lang.Object r3 = X.C51967G9n.A0m(r10, r0)
            if (r3 != r14) goto L_0x012e
            long r3 = X.C285605Ry.A01
            X.5Ry r0 = new X.5Ry
            r0.<init>(r3)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.G9t.A0o(r10, r0)
        L_0x012e:
            r0 = r19
            X.C286565Wx.A0L(r13, r0)
            X.4cd r4 = X.C51968G9o.A0Y(r10)
            r0 = 130394694(0x7c5aa46, float:2.9741343E-34)
            java.lang.Object r15 = X.C51967G9n.A0m(r10, r0)
            if (r15 != r14) goto L_0x014a
            r0 = 9
            X.J6u r15 = new X.J6u
            r15.<init>(r3, r0)
            r10.FLL(r15)
        L_0x014a:
            X.0sL r14 = X.C51965G9l.A10(r13, r15)
            X.IH7 r16 = new X.IH7
            r0 = r16
            r0.<init>(r4, r14, r1)
            X.5RD r4 = X.C51966G9m.A0a(r19)
            int r15 = X.C287425a7.A00(r10)
            X.5RM r0 = X.C286565Wx.A04(r13)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r10, r6)
            X.C51973G9u.A0y(r10, r13)
            X.C51971G9r.A12(r10, r4, r0)
            X.0sL r4 = X.C287485aD.A02
            boolean r0 = r13.A0K
            if (r0 != 0) goto L_0x0177
            boolean r0 = X.C51972G9s.A1Q(r10, r15)
            if (r0 != 0) goto L_0x017a
        L_0x0177:
            X.C51971G9r.A13(r10, r4, r15)
        L_0x017a:
            X.C51965G9l.A18(r10, r14)
            X.HrS r4 = new X.HrS
            r4.<init>(r5, r11)
            r11 = 9897699(0x9706e3, float:1.386963E-38)
            r23 = 2
            X.J9J r0 = new X.J9J
            r22 = r0
            r25 = r3
            r27 = r12
            r28 = r17
            r29 = r18
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            X.5PJ r14 = X.AnonymousClass5PI.A01(r10, r0, r11)
            int r0 = r7 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r11 = r16
            r12 = r4
            r13 = r21
            r15 = r0
            r16 = r19
            X.I5L.A01(r10, r11, r12, r13, r14, r15, r16)
            r10.ASN()
        L_0x01ae:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x009e
            r0 = 1041029001(0x3e0cd789, float:0.13754095)
            X.0fL.A00(r0)
            goto L_0x009e
        L_0x01bc:
            if (r16 == 0) goto L_0x01c0
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
        L_0x01c0:
            if (r15 == 0) goto L_0x01c4
            r21 = 0
        L_0x01c4:
            if (r14 == 0) goto L_0x01c8
            r20 = 0
        L_0x01c8:
            if (r13 == 0) goto L_0x01cc
            X.HL4 r18 = X.HL4.A02
        L_0x01cc:
            if (r12 == 0) goto L_0x01d3
            r0 = 0
            long r1 = X.C54759HRr.A00(r0, r0)
        L_0x01d3:
            r0 = r29 & 64
            if (r0 == 0) goto L_0x01dc
            X.IEj r17 = X.I28.A00(r10)
            r7 = r7 & r4
        L_0x01dc:
            boolean r5 = X.C51966G9m.A1R(r3, r5)
            goto L_0x00d7
        L_0x01e2:
            r0 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0040
            r0 = r18
            int r0 = X.G9t.A0S(r10, r0)
            r7 = r7 | r0
            goto L_0x0040
        L_0x01ef:
            r0 = r9 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003a
            r0 = r20
            int r0 = X.G9t.A0b(r10, r0)
            r7 = r7 | r0
            goto L_0x003a
        L_0x01fc:
            r0 = r9 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0034
            r0 = r21
            int r0 = X.G9t.A0G(r10, r0)
            r7 = r7 | r0
            goto L_0x0034
        L_0x0209:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x002e
            r0 = r24
            int r0 = X.G9t.A0F(r10, r0)
            r7 = r7 | r0
            goto L_0x002e
        L_0x0216:
            r0 = r28 & 6
            if (r0 != 0) goto L_0x0222
            int r7 = X.G9t.A0O(r10, r6)
            r7 = r7 | r28
            goto L_0x0028
        L_0x0222:
            r7 = r9
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56261HvV.A00(X.IEj, X.5Wy, androidx.compose.ui.Modifier, X.HL4, X.0sa, X.0sP, X.0sL, int, int, long, boolean, boolean):void");
    }
}
