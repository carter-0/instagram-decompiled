package X;

public abstract class HYM {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x019d, code lost:
        if (((float) java.lang.Math.sqrt((double) (((float) java.lang.Math.pow((double) (r13.x - r12.x), 2.0d)) + ((float) java.lang.Math.pow((double) ((r13.y / 0.5625f) - (r12.y / 0.5625f)), 2.0d))))) >= ((X.GNY) r6.getValue()).A00) goto L_0x019f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r19, int r20) {
        /*
            r0 = 463433162(0x1b9f6dca, float:2.6375293E-22)
            r3 = r19
            r3.ExV(r0)
            r14 = r20
            if (r20 != 0) goto L_0x0021
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x0021
            r3.Evl()
        L_0x0015:
            X.5Xd r1 = r3.ASQ()
            if (r1 == 0) goto L_0x0020
            r0 = 25
            X.JG9.A01(r1, r14, r0)
        L_0x0020:
            return
        L_0x0021:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x002f
            r1 = -1783665903(0xffffffff95af6b11, float:-7.085086E-26)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.common.ui.MocapScanAnimation (MocapScanAnimation.kt:53)"
            X.0fL.A01(r1, r0)
        L_0x002f:
            r2 = 0
            X.GRI r7 = X.GRH.A02(r3)
            r9 = 0
            r10 = 1120403456(0x42c80000, float:100.0)
            X.JNL r1 = X.C52518GVv.A02
            r5 = 0
            r0 = 20000(0x4e20, float:2.8026E-41)
            X.GQC r1 = X.GQC.A01(r1, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.GRJ r6 = new X.GRJ
            r6.<init>(r1, r0)
            r11 = 28728(0x7038, float:4.0257E-41)
            r8 = r3
            X.GRG r10 = X.GRH.A01(r6, r7, r8, r9, r10, r11)
            r0 = -1213201383(0xffffffffb7b00419, float:-2.0982743E-5)
            java.lang.Object r6 = X.C51967G9n.A0m(r3, r0)
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x006b
            r0 = 1056964608(0x3f000000, float:0.5)
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r0, r0)
            r1 = 1073741824(0x40000000, float:2.0)
            X.GNY r0 = new X.GNY
            r0.<init>((android.graphics.PointF) r6, (float) r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = X.G9t.A0o(r3, r0)
        L_0x006b:
            X.5Oz r6 = (X.C284945Oz) r6
            X.5Wx r7 = X.C51965G9l.A0H(r3, r2)
            r0 = -1213197238(0xffffffffb7b0144a, float:-2.0990283E-5)
            java.lang.Object r0 = X.C51967G9n.A0m(r3, r0)
            if (r0 != r4) goto L_0x0082
            java.lang.Float r0 = X.C51967G9n.A0h()
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.G9t.A0o(r3, r0)
        L_0x0082:
            X.5Oz r9 = X.C51965G9l.A0J(r7, r0, r2)
            X.0gF r8 = X.C60340gF.A00
            r0 = -1213194703(0xffffffffb7b01e31, float:-2.0994894E-5)
            java.lang.Object r1 = X.C51967G9n.A0m(r3, r0)
            if (r1 != r4) goto L_0x009b
            r0 = 23
            X.MHN r1 = new X.MHN
            r1.<init>((java.lang.Object) r9, (java.lang.Object) r6, (X.AnonymousClass4D7) r5, (int) r0)
            r3.FLL(r1)
        L_0x009b:
            X.C51968G9o.A1E(r3, r7, r1, r8)
            r1 = 30
            r11 = 53
            r0 = -1213164856(0xffffffffb7b092c8, float:-2.1049185E-5)
            java.lang.Object r0 = X.C51967G9n.A0m(r3, r0)
            r17 = 1
            if (r0 != r4) goto L_0x0136
            X.2HY r0 = new X.2HY
            r0.<init>(r2, r1)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
        L_0x00ba:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00f1
            r0 = r13
            X.0sh r0 = (X.0sh) r0
            int r12 = r0.A00()
            X.2HY r0 = new X.2HY
            r0.<init>(r2, r11)
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x00d4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ed
            r0 = r4
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass7TF.A1I(r1, r0, r5)
            goto L_0x00d4
        L_0x00ed:
            X.018.A16(r5, r8)
            goto L_0x00ba
        L_0x00f1:
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r11 = r8.iterator()
        L_0x00f9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r1 = r11.next()
            X.0eP r1 = (X.0eP) r1
            int r0 = X.C51970G9q.A0B(r1)
            int r1 = X.C51969G9p.A0A(r1)
            int r0 = r0 + 1
            float r8 = (float) r0
            r0 = 1107296256(0x42000000, float:32.0)
            float r8 = r8 / r0
            int r0 = r1 + 1
            float r1 = (float) r0
            r0 = 1113325568(0x425c0000, float:55.0)
            float r1 = r1 / r0
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r8, r1)
            r1 = 100
            X.2SP r0 = X.2SP.A01
            int r1 = r0.A06(r2, r1)
            X.HkZ r0 = new X.HkZ
            r0.<init>(r4, r1)
            r5.add(r0)
            goto L_0x00f9
        L_0x012f:
            X.62P r0 = X.AnonymousClass62Q.A00(r5)
            r3.FLL(r0)
        L_0x0136:
            java.util.List r0 = (java.util.List) r0
            X.C286565Wx.A0L(r7, r2)
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r16 = r0.iterator()
        L_0x0143:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r7 = r16.next()
            r4 = r7
            X.HkZ r4 = (X.C55614HkZ) r4
            int r0 = r4.A00
            float r1 = (float) r0
            X.5Oz r0 = r10.A08
            float r0 = X.C51972G9s.A02(r0)
            float r1 = X.AnonymousClass7TE.A00(r1, r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x019f
            android.graphics.PointF r13 = r4.A01
            java.lang.Object r0 = r6.getValue()
            X.GNY r0 = (X.GNY) r0
            java.lang.Object r12 = r0.A01
            android.graphics.PointF r12 = (android.graphics.PointF) r12
            r15 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r13.x
            float r0 = r12.x
            float r1 = r1 - r0
            double r0 = (double) r1
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r4)
            float r11 = (float) r0
            float r1 = r13.y
            float r1 = r1 / r15
            float r0 = r12.y
            float r0 = r0 / r15
            float r1 = r1 - r0
            double r0 = (double) r1
            double r0 = java.lang.Math.pow(r0, r4)
            float r4 = (float) r0
            float r11 = r11 + r4
            double r0 = (double) r11
            double r0 = java.lang.Math.sqrt(r0)
            float r4 = (float) r0
            java.lang.Object r0 = r6.getValue()
            X.GNY r0 = (X.GNY) r0
            float r0 = r0.A00
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r8.get(r1)
            if (r0 != 0) goto L_0x01b1
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r8.put(r1, r0)
        L_0x01b1:
            java.util.List r0 = (java.util.List) r0
            r0.add(r7)
            goto L_0x0143
        L_0x01b7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            java.lang.Object r20 = r8.get(r0)
            if (r20 != 0) goto L_0x01c3
            X.0sn r20 = X.0sn.A00
        L_0x01c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r19 = r8.get(r0)
            if (r19 != 0) goto L_0x01cf
            X.0sn r19 = X.0sn.A00
        L_0x01cf:
            r16 = 32
            X.IxG r15 = new X.IxG
            r17 = r6
            r18 = r10
            r15.<init>(r16, r17, r18, r19, r20)
            androidx.compose.ui.Modifier r1 = X.C51968G9o.A0O()
            float r0 = X.C51971G9r.A02(r9)
            androidx.compose.ui.Modifier r5 = X.HRF.A00(r1, r0)
            long r0 = X.AnonymousClass5RW.A01
            r4 = 1056964608(0x3f000000, float:0.5)
            long r0 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r4)
            androidx.compose.ui.Modifier r0 = X.C51966G9m.A0X(r5, r0)
            X.C289565do.A00(r3, r0, r15, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0015
            r0 = -1621310291(0xffffffff9f5cc4ad, float:-4.67495E-20)
            X.0fL.A00(r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HYM.A00(X.5Wy, int):void");
    }
}
