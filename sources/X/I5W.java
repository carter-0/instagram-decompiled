package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public abstract class I5W {
    public static final 0sP A00 = J2W.A00;
    public static final 0sP A01 = C58989J2a.A00;
    public static final 0sP A02 = C58990J2b.A00;
    public static final 0sP A03 = C58991J2c.A00;

    public static final void A01(C286575Wy r26, Modifier modifier, C61082JwK jwK, 0sP r29, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r10 = r26;
        r10.ExV(452163729);
        int i4 = i2;
        int i5 = i;
        C61082JwK jwK2 = jwK;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r10, jwK2) | i;
        } else {
            i3 = i5;
        }
        0sP r3 = r29;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r10, r3);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r10, modifier2);
        }
        if ((i3 & 147) != 146 || !r10.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-958639634, "com.instagram.creator.agent.settings.audience.AccountCell (SelectAccountsFragment.kt:229)");
            }
            C61073JwB jwB = (C61073JwB) jwK2.A00;
            AnonymousClass2DN A002 = 1zC.A00(r10, (ImageUrl) jwB.A00);
            String str = jwB.A01;
            String str2 = jwB.A03;
            boolean A1Z = C51965G9l.A1Z(r10, jwB, C51973G9u.A1O(r10, 1601241392, i3));
            Object ECw = r10.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = C58689Ivy.A00(r10, r3, jwB, 27);
            }
            C51965G9l.A1X(r10, false);
            GS8.A01(r10, modifier2, A002, (GS7) null, str, str2, (String) null, (C62320sa) ECw, (0sP) null, AnonymousClass5PI.A01(r10, new C59361JGn(11, r3, jwK2, jwB), 125724242), i3 & 896, 196608, 24552, false, false, false, false);
            if (0fL.A02()) {
                0fL.A00(-2004331427);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 29, modifier2, jwK2, r3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.Ixk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.Ixk} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0117, code lost:
        if (r1 == r11) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0119, code lost:
        r20 = new X.C58799Ixk(6, r15, r29, r3, r12, r26, r6);
        r10.FLL(r20);
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        X.AnonymousClass6HY.A03(r0, (androidx.compose.foundation.lazy.LazyListState) null, r10, (androidx.compose.ui.Modifier) null, X.C51965G9l.A0z(r13, r1), 384, 251, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        if (X.0fL.A02() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014a, code lost:
        X.0fL.A00(-1255844459);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r21, X.C53400GnX r22, X.C52369GPq r23, X.C62320sa r24, X.C62320sa r25, X.0sP r26, X.0sP r27, int r28, int r29) {
        /*
            r6 = r25
            r0 = 690772674(0x292c5ac2, float:3.8270392E-14)
            r10 = r21
            r10.ExV(r0)
            r19 = r29
            r0 = r29 & 1
            r29 = r22
            r7 = r28
            if (r0 == 0) goto L_0x0180
            r14 = r28 | 6
        L_0x0016:
            r0 = r19 & 2
            r9 = r23
            if (r0 == 0) goto L_0x0175
            r14 = r14 | 48
        L_0x001e:
            r0 = r19 & 4
            r28 = r26
            if (r0 == 0) goto L_0x0168
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r0 = r19 & 8
            r1 = 2048(0x800, float:2.87E-42)
            r8 = r24
            if (r0 == 0) goto L_0x015d
            r14 = r14 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r0 = r19 & 16
            r15 = r27
            if (r0 == 0) goto L_0x0152
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r3 = r19 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r3 != 0) goto L_0x0045
            r0 = r0 & r7
            if (r0 != 0) goto L_0x0046
            int r0 = X.G9t.A0J(r10, r6)
        L_0x0045:
            r14 = r14 | r0
        L_0x0046:
            r0 = 74899(0x12493, float:1.04956E-40)
            r2 = r14 & r0
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r0) goto L_0x0075
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x0075
            r10.Evl()
        L_0x0059:
            X.5Xd r1 = r10.ASQ()
            if (r1 == 0) goto L_0x0074
            r20 = 9
            X.JAg r0 = new X.JAg
            r16 = r6
            r17 = r9
            r18 = r7
            r13 = r8
            r14 = r29
            r11 = r0
            r12 = r28
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.A06 = r0
        L_0x0074:
            return
        L_0x0075:
            if (r3 == 0) goto L_0x0079
            X.Iqk r6 = X.C58365Iqk.A00
        L_0x0079:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0087
            r2 = -1965114036(0xffffffff8adebd4c, float:-2.1449028E-32)
            java.lang.String r0 = "com.instagram.creator.agent.settings.audience.Layout (SelectAccountsFragment.kt:152)"
            X.0fL.A01(r2, r0)
        L_0x0087:
            X.0gF r3 = X.C60340gF.A00
            r0 = -1386386571(0xffffffffad5d6b75, float:-1.2586256E-11)
            boolean r0 = X.C51967G9n.A1Z(r10, r9, r0)
            java.lang.Object r2 = r10.ECw()
            r5 = 0
            if (r0 != 0) goto L_0x009b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x00a1
        L_0x009b:
            r0 = 14
            X.MFz r2 = X.G9w.A0n(r10, r9, r0)
        L_0x00a1:
            X.0sL r2 = (X.0sL) r2
            X.5Wx r13 = X.C51965G9l.A0G(r10)
            X.C286645Xf.A04(r10, r3, r2)
            r0 = -1386384100(0xffffffffad5d751c, float:-1.2588399E-11)
            java.lang.Object r12 = X.C51967G9n.A0m(r10, r0)
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r12 != r11) goto L_0x00bb
            java.lang.String r0 = ""
            androidx.compose.runtime.ParcelableSnapshotMutableState r12 = X.G9t.A0o(r10, r0)
        L_0x00bb:
            r4 = 0
            X.C286565Wx.A0L(r13, r4)
            X.5aS r3 = new X.5aS
            r3.<init>()
            r0 = -1386379512(0xffffffffad5d8708, float:-1.25923785E-11)
            boolean r2 = X.C51967G9n.A1Y(r10, r3, r0)
            r0 = r14 & 7168(0x1c00, float:1.0045E-41)
            r16 = 0
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            r2 = r2 | r0
            java.lang.Object r0 = r10.ECw()
            if (r2 != 0) goto L_0x00dc
            if (r0 != r11) goto L_0x00e6
        L_0x00dc:
            r1 = 14
            X.ImQ r0 = new X.ImQ
            r0.<init>(r8, r3, r5, r1)
            r10.FLL(r0)
        L_0x00e6:
            X.C51968G9o.A1E(r10, r13, r0, r3)
            r2 = 1103101952(0x41c00000, float:24.0)
            r1 = 0
            X.6Fj r0 = new X.6Fj
            r0.<init>(r1, r1, r1, r2)
            r1 = -1386371141(0xffffffffad5da7bb, float:-1.2599639E-11)
            boolean r1 = X.C51974G9v.A1Z(r10, r1, r14)
            boolean r2 = X.C51965G9l.A1Z(r10, r3, r1)
            boolean r1 = X.C51973G9u.A1G(r14)
            r2 = r2 | r1
            boolean r1 = X.C51974G9v.A1W(r14)
            r2 = r2 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r1
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r1) goto L_0x010f
            r16 = 1
        L_0x010f:
            r2 = r2 | r16
            java.lang.Object r1 = r10.ECw()
            if (r2 != 0) goto L_0x0119
            if (r1 != r11) goto L_0x012f
        L_0x0119:
            r21 = 6
            X.Ixk r1 = new X.Ixk
            r22 = r15
            r23 = r29
            r24 = r3
            r25 = r12
            r27 = r6
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r10.FLL(r1)
        L_0x012f:
            X.0sP r24 = X.C51965G9l.A0z(r13, r1)
            r25 = 384(0x180, float:5.38E-43)
            r26 = 251(0xfb, float:3.52E-43)
            r20 = r0
            r21 = r5
            r22 = r10
            r23 = r5
            r27 = r4
            X.AnonymousClass6HY.A03(r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0059
            r0 = -1255844459(0xffffffffb5255595, float:-6.159183E-7)
            X.0fL.A00(r0)
            goto L_0x0059
        L_0x0152:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0038
            int r0 = X.G9t.A0I(r10, r15)
            r14 = r14 | r0
            goto L_0x0038
        L_0x015d:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0030
            int r0 = X.G9t.A0H(r10, r8)
            r14 = r14 | r0
            goto L_0x0030
        L_0x0168:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0026
            r0 = r28
            int r0 = X.G9t.A0G(r10, r0)
            r14 = r14 | r0
            goto L_0x0026
        L_0x0175:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x001e
            int r0 = X.G9t.A0F(r10, r9)
            r14 = r14 | r0
            goto L_0x001e
        L_0x0180:
            r0 = r28 & 6
            if (r0 != 0) goto L_0x018e
            r0 = r29
            int r14 = X.G9t.A0O(r10, r0)
            r14 = r14 | r28
            goto L_0x0016
        L_0x018e:
            r14 = r7
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5W.A02(X.5Wy, X.GnX, X.GPq, X.0sa, X.0sa, X.0sP, X.0sP, int, int):void");
    }

    public static final void A00(C286575Wy r14, int i) {
        r14.ExV(-1593723520);
        if (i != 0 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-560310966, "com.instagram.creator.agent.settings.audience.LoadingShimmer (SelectAccountsFragment.kt:247)");
            }
            AnonymousClass5aQ.A02(r14);
            AnonymousClass5ZQ r2 = AnonymousClass5ZM.A02;
            C285245Qk r5 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(r5, 12.0f, 8.0f);
            AnonymousClass5RD A0W = C51968G9o.A0W(r14);
            int A002 = C287425a7.A00(r14);
            C286565Wx r13 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r13);
            Modifier A012 = C287435a8.A01(r14, A09);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r14, r13, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r14, A0W, A04, r11);
            0sL r9 = C287485aD.A02;
            if (r13.A0K || !C51972G9s.A1Q(r14, A002)) {
                C51971G9r.A13(r14, r9, A002);
            }
            0sL A1K = C51966G9m.A1K(r14, A012);
            C287675aa.A02(r14, C287195Zj.A07(C56666I6v.A00(r14, C51971G9r.A0Q(r5, 56.0f)), 4.0f), 0);
            Modifier A0B = C287195Zj.A0B(r5, 8.0f, 0.0f, 0.0f, 0.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A003 = C287425a7.A00(r14);
            AnonymousClass5RM A042 = C286565Wx.A04(r13);
            Modifier A013 = C287435a8.A01(r14, A0B);
            C51973G9u.A0z(r14, r13, r12);
            C287595aO.A00(r14, A0Z, r11);
            if (C51965G9l.A1Y(r14, r13, A042, A0w) || !C51972G9s.A1Q(r14, A003)) {
                C51971G9r.A13(r14, r9, A003);
            }
            C287595aO.A00(r14, A013, A1K);
            C56666I6v.A07(r14, C287205Zk.A07(C287205Zk.A08(C287195Zj.A0B(r5, 0.0f, 0.0f, 0.0f, 4.0f), 18.0f), 0.5f), r2);
            C56666I6v.A07(r14, C287205Zk.A07(C287205Zk.A08(r5, 14.0f), 0.3f), r2);
            if (C51971G9r.A1R(r14)) {
                0fL.A00(908219290);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 34);
        }
    }
}
