package X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: X.Sfm  reason: case insensitive filesystem */
public final class C11751Sfm implements YA4 {
    public final int A00;
    public final SparseArray A01 = Pxe.A0L();
    public final SparseIntArray A02 = new SparseIntArray();
    public final ST7 A03 = new ST7(new byte[5]);
    public final /* synthetic */ C22106XvW A04;

    public final void CMT(C21505XdL xdL, YBZ ybz, SR8 sr8) {
    }

    public C11751Sfm(C22106XvW xvW, int i) {
        this.A04 = xvW;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [X.YA4, java.lang.Object, X.Sfk] */
    /* JADX WARNING: type inference failed for: r2v21, types: [X.YA4, java.lang.Object, X.Sfk] */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01dd, code lost:
        r2 = new X.C11741Sfc(r31.A02, r31.A00());
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0072 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AJP(X.C11389SRd r40) {
        /*
            r39 = this;
            r11 = r40
            int r0 = r11.A05()
            r13 = 2
            if (r0 != r13) goto L_0x02f5
            r14 = r39
            X.XvW r10 = r14.A04
            r9 = 0
            r8 = 1
            java.util.List r0 = r10.A0E
            java.lang.Object r30 = r0.get(r9)
            r0 = r30
            X.XdL r0 = (X.C21505XdL) r0
            r30 = r0
            int r0 = r11.A05()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02f5
            r11.A0P(r8)
            int r29 = r11.A08()
            r7 = 3
            r11.A0P(r7)
            X.ST7 r6 = r14.A03
            byte[] r0 = r6.A03
            r11.A0R(r0, r9, r13)
            r6.A09(r9)
            r6.A0A(r7)
            r28 = 13
            r0 = r28
            int r0 = r6.A06(r0)
            r10.A01 = r0
            byte[] r0 = r6.A03
            r11.A0R(r0, r9, r13)
            r6.A09(r9)
            r5 = 4
            r6.A0A(r5)
            r27 = 12
            r0 = r27
            int r0 = r6.A06(r0)
            r11.A0P(r0)
            r26 = 8192(0x2000, float:1.14794E-41)
            r25 = 21
            android.util.SparseArray r0 = r14.A01
            r38 = r0
            r38.clear()
            android.util.SparseIntArray r0 = r14.A02
            r37 = r0
            r37.clear()
            int r24 = X.Pxe.A06(r11)
        L_0x0072:
            if (r24 <= 0) goto L_0x02a8
            r23 = 5
            byte[] r1 = r6.A03
            r0 = r23
            r11.A0R(r1, r9, r0)
            r6.A09(r9)
            r0 = 8
            int r4 = r6.A06(r0)
            r0 = r28
            int r3 = X.ST7.A00(r6, r7, r0)
            r0 = r27
            int r22 = X.ST7.A00(r6, r5, r0)
            int r0 = r11.A01
            r21 = r0
            int r12 = r0 + r22
            r32 = 0
            r16 = r32
            r35 = -1
            r36 = 0
        L_0x00a0:
            int r0 = r11.A01
            if (r0 >= r12) goto L_0x0156
            int r2 = r11.A05()
            int r0 = r11.A05()
            int r1 = r11.A01
            int r1 = r1 + r0
            if (r1 > r12) goto L_0x0156
            r15 = 89
            r0 = r23
            if (r2 != r0) goto L_0x00e0
            long r19 = r11.A0C()
            r17 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            r17 = 1161904947(0x45414333, double:5.74057318E-315)
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0150
            r17 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0102
            r17 = 1212503619(0x48455643, double:5.990563836E-315)
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00d9
            r35 = 36
        L_0x00d9:
            int r0 = r11.A01
            int r1 = r1 - r0
            r11.A0P(r1)
            goto L_0x00a0
        L_0x00e0:
            r0 = 106(0x6a, float:1.49E-43)
            if (r2 == r0) goto L_0x0153
            r0 = 122(0x7a, float:1.71E-43)
            if (r2 == r0) goto L_0x0150
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 != r0) goto L_0x0105
            int r2 = r11.A05()
            r0 = r25
            if (r2 == r0) goto L_0x0102
            r0 = 14
            if (r2 != r0) goto L_0x00fb
            r35 = 136(0x88, float:1.9E-43)
            goto L_0x00d9
        L_0x00fb:
            r0 = 33
            if (r2 != r0) goto L_0x00d9
            r35 = 139(0x8b, float:1.95E-43)
            goto L_0x00d9
        L_0x0102:
            r35 = 172(0xac, float:2.41E-43)
            goto L_0x00d9
        L_0x0105:
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 != r0) goto L_0x010c
            r35 = 138(0x8a, float:1.93E-43)
            goto L_0x00d9
        L_0x010c:
            r0 = 10
            if (r2 != r0) goto L_0x011f
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            java.lang.String r0 = r11.A0I(r0, r7)
            java.lang.String r32 = r0.trim()
            int r36 = r11.A05()
            goto L_0x00d9
        L_0x011f:
            if (r2 != r15) goto L_0x0149
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
        L_0x0125:
            int r0 = r11.A01
            if (r0 >= r1) goto L_0x0146
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            java.lang.String r0 = r11.A0I(r0, r7)
            java.lang.String r15 = r0.trim()
            r11.A05()
            byte[] r0 = new byte[r5]
            r11.A0R(r0, r9, r5)
            X.Rqm r2 = new X.Rqm
            r2.<init>(r0, r15)
            r0 = r16
            r0.add(r2)
            goto L_0x0125
        L_0x0146:
            r35 = 89
            goto L_0x00d9
        L_0x0149:
            r0 = 111(0x6f, float:1.56E-43)
            if (r2 != r0) goto L_0x00d9
            r35 = 257(0x101, float:3.6E-43)
            goto L_0x00d9
        L_0x0150:
            r35 = 135(0x87, float:1.89E-43)
            goto L_0x00d9
        L_0x0153:
            r35 = 129(0x81, float:1.81E-43)
            goto L_0x00d9
        L_0x0156:
            r11.A0O(r12)
            byte[] r1 = r11.A02
            r0 = r21
            byte[] r34 = java.util.Arrays.copyOfRange(r1, r0, r12)
            X.S2a r0 = new X.S2a
            r31 = r0
            r33 = r16
            r31.<init>(r32, r33, r34, r35, r36)
            r1 = 6
            if (r4 == r1) goto L_0x0171
            r1 = r23
            if (r4 != r1) goto L_0x0173
        L_0x0171:
            int r4 = r0.A01
        L_0x0173:
            int r1 = r22 + 5
            int r24 = r24 - r1
            android.util.SparseBooleanArray r1 = r10.A09
            boolean r1 = r1.get(r3)
            if (r1 != 0) goto L_0x0072
            X.TZd r12 = r10.A0D
            X.Sfn r12 = (X.C11752Sfn) r12
            if (r4 == r13) goto L_0x0284
            if (r4 == r7) goto L_0x0278
            if (r4 == r5) goto L_0x0278
            r1 = r25
            if (r4 == r1) goto L_0x0260
            r2 = 27
            r1 = 0
            if (r4 == r2) goto L_0x0251
            r2 = 36
            if (r4 == r2) goto L_0x0242
            r2 = 45
            if (r4 == r2) goto L_0x023c
            r2 = 89
            if (r4 == r2) goto L_0x0234
            r2 = 172(0xac, float:2.41E-43)
            if (r4 == r2) goto L_0x0228
            r2 = 257(0x101, float:3.6E-43)
            if (r4 == r2) goto L_0x020e
            r2 = 138(0x8a, float:1.93E-43)
            if (r4 == r2) goto L_0x01ff
            r2 = 139(0x8b, float:1.95E-43)
            if (r4 == r2) goto L_0x01f6
            switch(r4) {
                case 15: goto L_0x01ea;
                case 16: goto L_0x0293;
                case 17: goto L_0x0266;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            switch(r4) {
                case 128: goto L_0x0284;
                case 129: goto L_0x01dd;
                case 130: goto L_0x01b7;
                default: goto L_0x01b4;
            }
        L_0x01b4:
            switch(r4) {
                case 134: goto L_0x01c3;
                case 135: goto L_0x01dd;
                case 136: goto L_0x01ff;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            r0 = r37
            r0.put(r3, r3)
            r0 = r38
            r0.put(r3, r1)
            goto L_0x0072
        L_0x01c3:
            java.lang.String r1 = "application/x-scte35"
            X.Sfk r2 = new X.Sfk
            r2.<init>()
            X.SOW r0 = X.SOW.A00()
            r0.A01(r1)
            X.SJM r0 = X.Pxe.A0O(r0)
            r2.A00 = r0
            X.Xvn r1 = new X.Xvn
            r1.<init>(r2)
            goto L_0x01b7
        L_0x01dd:
            java.lang.String r1 = r0.A02
            int r0 = r0.A00()
            X.Sfc r2 = new X.Sfc
            r2.<init>(r1, r0)
            goto L_0x02a1
        L_0x01ea:
            java.lang.String r2 = r0.A02
            int r1 = r0.A00()
            X.Sfg r0 = new X.Sfg
            r0.<init>(r2, r1, r9)
            goto L_0x0271
        L_0x01f6:
            java.lang.String r4 = r0.A02
            int r1 = r0.A00()
            r0 = 5408(0x1520, float:7.578E-42)
            goto L_0x0207
        L_0x01ff:
            java.lang.String r4 = r0.A02
            int r1 = r0.A00()
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x0207:
            X.Sfi r2 = new X.Sfi
            r2.<init>(r4, r1, r0)
            goto L_0x02a1
        L_0x020e:
            java.lang.String r1 = "application/vnd.dvb.ait"
            X.Sfk r2 = new X.Sfk
            r2.<init>()
            X.SOW r0 = X.SOW.A00()
            r0.A01(r1)
            X.SJM r0 = X.Pxe.A0O(r0)
            r2.A00 = r0
            X.Xvn r1 = new X.Xvn
            r1.<init>(r2)
            goto L_0x01b7
        L_0x0228:
            java.lang.String r1 = r0.A02
            int r0 = r0.A00()
            X.Sfd r2 = new X.Sfd
            r2.<init>(r1, r0)
            goto L_0x02a1
        L_0x0234:
            java.util.List r0 = r0.A03
            X.SfX r2 = new X.SfX
            r2.<init>(r0)
            goto L_0x02a1
        L_0x023c:
            X.Sfa r0 = new X.Sfa
            r0.<init>()
            goto L_0x0271
        L_0x0242:
            java.util.List r1 = X.C11752Sfn.A00(r12, r0)
            X.S0x r0 = new X.S0x
            r0.<init>(r1)
            X.Sff r2 = new X.Sff
            r2.<init>(r0)
            goto L_0x02a1
        L_0x0251:
            java.util.List r0 = X.C11752Sfn.A00(r12, r0)
            X.S0x r1 = new X.S0x
            r1.<init>(r0)
            X.SfZ r0 = new X.SfZ
            r0.<init>(r1)
            goto L_0x0271
        L_0x0260:
            X.SfY r0 = new X.SfY
            r0.<init>()
            goto L_0x0271
        L_0x0266:
            java.lang.String r2 = r0.A02
            int r1 = r0.A00()
            X.Sfb r0 = new X.Sfb
            r0.<init>(r2, r1)
        L_0x0271:
            X.Xvo r1 = new X.Xvo
            r1.<init>(r0)
            goto L_0x01b7
        L_0x0278:
            java.lang.String r1 = r0.A02
            int r0 = r0.A00()
            X.Sfe r2 = new X.Sfe
            r2.<init>(r1, r0)
            goto L_0x02a1
        L_0x0284:
            java.util.List r1 = X.C11752Sfn.A00(r12, r0)
            X.S46 r0 = new X.S46
            r0.<init>(r1)
            X.Sfj r2 = new X.Sfj
            r2.<init>(r0)
            goto L_0x02a1
        L_0x0293:
            java.util.List r1 = X.C11752Sfn.A00(r12, r0)
            X.S46 r0 = new X.S46
            r0.<init>(r1)
            X.Sfh r2 = new X.Sfh
            r2.<init>(r0)
        L_0x02a1:
            X.Xvo r1 = new X.Xvo
            r1.<init>(r2)
            goto L_0x01b7
        L_0x02a8:
            int r6 = r37.size()
            r5 = 0
        L_0x02ad:
            if (r5 >= r6) goto L_0x02e5
            r0 = r37
            int r11 = r0.keyAt(r5)
            int r7 = r0.valueAt(r5)
            android.util.SparseBooleanArray r0 = r10.A09
            r0.put(r11, r8)
            android.util.SparseBooleanArray r0 = r10.A0A
            r0.put(r7, r8)
            r0 = r38
            java.lang.Object r4 = r0.valueAt(r5)
            X.YAN r4 = (X.YAN) r4
            if (r4 == 0) goto L_0x02e2
            X.YBZ r3 = r10.A03
            X.SR8 r2 = new X.SR8
            r1 = r29
            r0 = r26
            r2.<init>(r1, r11, r0)
            r0 = r30
            r4.CMT(r0, r3, r2)
            android.util.SparseArray r0 = r10.A08
            r0.put(r7, r4)
        L_0x02e2:
            int r5 = r5 + 1
            goto L_0x02ad
        L_0x02e5:
            android.util.SparseArray r1 = r10.A08
            int r0 = r14.A00
            r1.remove(r0)
            r10.A02 = r9
            X.YBZ r0 = r10.A03
            r0.ASU()
            r10.A06 = r8
        L_0x02f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11751Sfm.AJP(X.SRd):void");
    }
}
