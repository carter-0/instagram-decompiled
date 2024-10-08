package X;

import java.util.List;

public abstract class I5T {
    public static final C291605ha A00 = new C292235ic(C287215Zl.A05);
    public static final C291605ha A01 = new C291595hZ(C287215Zl.A02);

    public static final long A00(C56155Hti hti, List list, 0sK r40, 0sK r41, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        01J r6;
        List list2 = list;
        if (!list2.isEmpty()) {
            int i11 = i;
            01J r62 = null;
            C56155Hti hti2 = hti;
            int i12 = i4;
            int i13 = i5;
            C56155Hti hti3 = hti2;
            C55989Hqv hqv = new C55989Hqv(hti3, i12, i13, i2, i3, AnonymousClass5SF.A04(0, i11, 0, Integer.MAX_VALUE));
            Object A0O = 00k.A0O(list2, 0);
            0sK r14 = r40;
            0sK r13 = r41;
            if (A0O != null) {
                i6 = C51975G9x.A06(A0O, 0, r13, i11);
                i7 = C51975G9x.A06(A0O, 0, r14, i6);
            } else {
                i6 = 0;
                i7 = 0;
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean A1W = C51970G9q.A1W(list2.size(), 1);
            long A002 = 01J.A00(i11, Integer.MAX_VALUE);
            if (A0O != null) {
                r62 = new 01J(01J.A00(i9, i8));
            }
            if (hqv.A00(r62, 0, 0, 0, 0, A002, A1W, false).A00) {
                hti2.A04.intValue();
            } else {
                int size = list2.size();
                int i17 = i11;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    i10 = i18;
                    if (i18 >= size) {
                        break;
                    }
                    i17 -= i9;
                    i10 = i18 + 1;
                    i14 = Math.max(i14, i8);
                    Object A0O2 = 00k.A0O(list2, i10);
                    if (A0O2 != null) {
                        Integer valueOf = Integer.valueOf(i10);
                        i8 = C51975G9x.A06(A0O2, valueOf, r13, i11);
                        i9 = C51975G9x.A06(A0O2, valueOf, r14, i8) + i2;
                    } else {
                        i8 = 0;
                        i9 = 0;
                    }
                    boolean A1T = AnonymousClass7TF.A1T(i18 + 2, list2.size());
                    int i20 = i10 - i19;
                    long A003 = 01J.A00(i17, Integer.MAX_VALUE);
                    if (A0O2 == null) {
                        r6 = null;
                    } else {
                        r6 = new 01J(01J.A00(i9, i8));
                    }
                    C56503HzZ A004 = hqv.A00(r6, i20, i16, i15, i14, A003, A1T, false);
                    if (A004.A01) {
                        i15 += i14 + i3;
                        i9 -= i2;
                        i16++;
                        if (A004.A00) {
                            break;
                        }
                        i17 = i11;
                        i19 = i10;
                        i14 = 0;
                    }
                    i18 = i10;
                }
                return 01J.A00(i15 - i3, i10);
            }
        }
        return C51971G9r.A0J();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: X.IEw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: X.IEw} */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01cb, code lost:
        if ((r5 & 384) == 256) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0101, code lost:
        if ((r14 & 6) == 4) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0116, code lost:
        if ((r14 & 48) == 32) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012b, code lost:
        if ((r14 & 384) == 256) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0150, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018f, code lost:
        if (r4 == X.AnonymousClass5XT.A00) goto L_0x0191;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C287295Zu r25, X.C287325Zx r26, X.C56498HzU r27, X.C286575Wy r28, androidx.compose.ui.Modifier r29, X.0sK r30, int r31, int r32, int r33, int r34) {
        /*
            r15 = r27
            r9 = r31
            r18 = r25
            r6 = r26
            r10 = r29
            r0 = 437853230(0x1a191c2e, float:3.1662422E-23)
            r11 = r28
            r11.ExV(r0)
            r25 = r34
            r14 = r34 & 1
            r8 = r33
            if (r14 == 0) goto L_0x0258
            r7 = r33 | 6
        L_0x001c:
            r13 = r34 & 2
            if (r13 == 0) goto L_0x024b
            r7 = r7 | 48
        L_0x0022:
            r12 = r34 & 4
            if (r12 == 0) goto L_0x0240
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r5 = r34 & 8
            if (r5 == 0) goto L_0x0235
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r4 = r34 & 16
            r1 = r32
            if (r4 == 0) goto L_0x022a
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r3 = r34 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r3 != 0) goto L_0x0044
            r0 = r33 & r0
            if (r0 != 0) goto L_0x0045
            int r0 = X.G9t.A0T(r11, r15)
        L_0x0044:
            r7 = r7 | r0
        L_0x0045:
            r2 = r34 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            r21 = r30
            if (r2 != 0) goto L_0x0057
            r0 = r33 & r0
            if (r0 != 0) goto L_0x0058
            r0 = r21
            int r0 = X.G9t.A0K(r11, r0)
        L_0x0057:
            r7 = r7 | r0
        L_0x0058:
            r0 = 599187(0x92493, float:8.3964E-40)
            r2 = r7 & r0
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r0) goto L_0x008b
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x008b
            r11.Evl()
            r17 = r1
        L_0x006d:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x008a
            X.JAF r0 = new X.JAF
            r23 = r17
            r24 = r8
            r19 = r15
            r20 = r10
            r22 = r9
            r16 = r0
            r17 = r18
            r18 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.A06 = r0
        L_0x008a:
            return
        L_0x008b:
            if (r14 == 0) goto L_0x008f
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
        L_0x008f:
            if (r13 == 0) goto L_0x0093
            X.5Zu r18 = X.C287275Zs.A01
        L_0x0093:
            if (r12 == 0) goto L_0x0097
            X.5Zx r6 = X.C287275Zs.A07
        L_0x0097:
            r17 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == 0) goto L_0x009f
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x009f:
            if (r4 != 0) goto L_0x00a3
            r17 = r1
        L_0x00a3:
            if (r3 == 0) goto L_0x00a7
            X.HzU r15 = X.C56498HzU.A01
        L_0x00a7:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b5
            r1 = -1222701162(0xffffffffb71f0f96, float:-9.480767E-6)
            java.lang.String r0 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:92)"
            X.0fL.A01(r1, r0)
        L_0x00b5:
            r0 = 458752(0x70000, float:6.42848E-40)
            r5 = r7 & r0
            r4 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = X.AnonymousClass7TF.A1S(r5, r4)
            java.lang.Object r3 = r11.ECw()
            if (r0 != 0) goto L_0x00c9
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x00d3
        L_0x00c9:
            java.lang.Integer r0 = r15.A00
            X.Hti r3 = new X.Hti
            r3.<init>(r0)
            r11.FLL(r3)
        L_0x00d3:
            X.Hti r3 = (X.C56155Hti) r3
            int r0 = r7 >> 3
            int r14 = X.C51971G9r.A04(r0)
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 | r0
            r2 = 256(0x100, float:3.59E-43)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00ee
            r1 = -1295429818(0xffffffffb2c94f46, float:-2.3435529E-8)
            java.lang.String r0 = "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)"
            X.0fL.A01(r1, r0)
        L_0x00ee:
            r0 = r14 & 14
            r0 = r0 ^ 6
            r1 = 4
            r13 = 0
            if (r0 <= r1) goto L_0x00fe
            r0 = r18
            boolean r0 = r11.AGu(r0)
            if (r0 != 0) goto L_0x0103
        L_0x00fe:
            r0 = r14 & 6
            r12 = 0
            if (r0 != r1) goto L_0x0104
        L_0x0103:
            r12 = 1
        L_0x0104:
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L_0x0112
            boolean r0 = r11.AGu(r6)
            if (r0 != 0) goto L_0x0118
        L_0x0112:
            r0 = r14 & 48
            r16 = 0
            if (r0 != r1) goto L_0x011a
        L_0x0118:
            r16 = 1
        L_0x011a:
            r12 = r12 | r16
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            if (r0 <= r2) goto L_0x0128
            boolean r0 = r11.AGs(r9)
            if (r0 != 0) goto L_0x012d
        L_0x0128:
            r0 = r14 & 384(0x180, float:5.38E-43)
            r1 = 0
            if (r0 != r2) goto L_0x012e
        L_0x012d:
            r1 = 1
        L_0x012e:
            r12 = r12 | r1
            r0 = r14 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto L_0x013f
            r0 = r17
            boolean r0 = r11.AGs(r0)
            if (r0 != 0) goto L_0x0143
        L_0x013f:
            r0 = r14 & 3072(0xc00, float:4.305E-42)
            if (r0 != r1) goto L_0x0144
        L_0x0143:
            r13 = 1
        L_0x0144:
            boolean r1 = X.C51968G9o.A1U(r11, r3, r12, r13)
            java.lang.Object r0 = r11.ECw()
            if (r1 != 0) goto L_0x0152
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0170
        L_0x0152:
            float r31 = r18.By0()
            X.5ha r29 = A00
            float r32 = r6.By0()
            X.IEw r0 = new X.IEw
            r26 = r0
            r27 = r18
            r28 = r6
            r30 = r3
            r33 = r9
            r34 = r17
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            r11.FLL(r0)
        L_0x0170:
            X.IEw r0 = (X.C56849IEw) r0
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x017e
            r1 = 429246587(0x1995c87b, float:1.5487212E-23)
            X.0fL.A00(r1)
        L_0x017e:
            boolean r3 = X.AnonymousClass7TF.A1S(r5, r4)
            boolean r1 = X.C51973G9u.A1K(r7)
            r1 = r1 | r3
            java.lang.Object r4 = r11.ECw()
            if (r1 != 0) goto L_0x0191
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r4 != r1) goto L_0x01aa
        L_0x0191:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r12 = -139531073(0xfffffffff7aeecbf, float:-7.0957925E33)
            r5 = 3
            X.JFw r3 = new X.JFw
            r1 = r21
            r3.<init>(r1, r5)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r3, r12)
            r4.add(r1)
            r11.FLL(r4)
        L_0x01aa:
            int r1 = r7 << 3
            r5 = r1 & 112(0x70, float:1.57E-43)
            r1 = 13
            X.JFw r3 = new X.JFw
            r3.<init>(r4, r1)
            r1 = -1953651383(0xffffffff8b8da549, float:-5.455992E-32)
            X.5PJ r3 = X.AnonymousClass5PI.A03(r3, r1)
            r1 = r5 & 896(0x380, float:1.256E-42)
            r1 = r1 ^ 384(0x180, float:5.38E-43)
            if (r1 <= r2) goto L_0x01c8
            boolean r1 = r11.AGu(r0)
            if (r1 != 0) goto L_0x01cd
        L_0x01c8:
            r4 = r5 & 384(0x180, float:5.38E-43)
            r1 = 0
            if (r4 != r2) goto L_0x01ce
        L_0x01cd:
            r1 = 1
        L_0x01ce:
            java.lang.Object r12 = r11.ECw()
            if (r1 != 0) goto L_0x01d8
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r12 != r1) goto L_0x01e0
        L_0x01d8:
            X.IGT r12 = new X.IGT
            r12.<init>(r0)
            r11.FLL(r12)
        L_0x01e0:
            r0 = r5 & 112(0x70, float:1.57E-43)
            int r5 = X.C287425a7.A00(r11)
            r7 = r11
            X.5Wx r7 = (X.C286565Wx) r7
            X.5RM r13 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r11, r10)
            X.0sa r1 = X.C287485aD.A00
            int r0 = r0 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r2 = r0 | 6
            X.C51973G9u.A0z(r11, r7, r1)
            X.C51971G9r.A12(r11, r12, r13)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x020b
            boolean r0 = X.C51972G9s.A1Q(r11, r5)
            if (r0 != 0) goto L_0x020e
        L_0x020b:
            X.C51971G9r.A13(r11, r1, r5)
        L_0x020e:
            X.C51965G9l.A18(r11, r4)
            int r0 = r2 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r11, r0)
            boolean r0 = X.C51967G9n.A1R(r11)
            if (r0 == 0) goto L_0x006d
            r0 = 1133512704(0x43900800, float:288.0625)
            X.0fL.A00(r0)
            goto L_0x006d
        L_0x022a:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0036
            int r0 = X.G9t.A09(r11, r1)
            r7 = r7 | r0
            goto L_0x0036
        L_0x0235:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x002e
            int r0 = X.G9t.A08(r11, r9)
            r7 = r7 | r0
            goto L_0x002e
        L_0x0240:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0028
            int r0 = X.G9t.A0Q(r11, r6)
            r7 = r7 | r0
            goto L_0x0028
        L_0x024b:
            r0 = r33 & 48
            if (r0 != 0) goto L_0x0022
            r0 = r18
            int r0 = X.G9t.A0P(r11, r0)
            r7 = r7 | r0
            goto L_0x0022
        L_0x0258:
            r0 = r33 & 6
            if (r0 != 0) goto L_0x0264
            int r7 = X.G9t.A0O(r11, r10)
            r7 = r7 | r33
            goto L_0x001c
        L_0x0264:
            r7 = r8
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5T.A02(X.5Zu, X.5Zx, X.HzU, X.5Wy, androidx.compose.ui.Modifier, X.0sK, int, int, int, int):void");
    }

    public static final long A01(C268074ci r2, 0sP r3, long j) {
        int A0H;
        int A0G;
        C289085cz A002 = C289075cy.A00(r2);
        if (A002 == null || A002.A00 == 0.0f) {
            C289075cy.A00(r2);
            C267974cY Cnz = r2.Cnz(j);
            r3.invoke(Cnz);
            A0H = Cnz.A0H();
            A0G = Cnz.A0G();
        } else {
            A0H = r2.CoR(Integer.MAX_VALUE);
            A0G = r2.CoO(A0H);
        }
        return 01J.A00(A0H, A0G);
    }
}
