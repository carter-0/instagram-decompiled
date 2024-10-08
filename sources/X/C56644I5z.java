package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.I5z  reason: case insensitive filesystem */
public abstract class C56644I5z {
    public static final void A03(C286575Wy r5, C53046Ghe ghe, int i) {
        int i2;
        0qQ.A0B(ghe, 0);
        r5.ExV(-1048609212);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r5, ghe) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-306096200, "com.instagram.wonderwall.ui.compose.screens.AggregatedWallFeedScreen (AggregatedWallFeedScreen.kt:56)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r5, ghe.A04, 0);
            C53359Gmj gmj = (C53359Gmj) ((C61071Jw9) A02.getValue()).A04;
            List list = (List) ((C61071Jw9) A02.getValue()).A00;
            if (gmj.A05 && list.isEmpty()) {
                r5.ExS(-1457887155);
                C56356Hx7.A01(r5, 0);
            } else if (gmj.A02 && list.isEmpty()) {
                r5.ExS(-1457799580);
                A00(r5, 0);
            } else if (!gmj.A03 || !list.isEmpty()) {
                r5.ExS(-1457648734);
                A04(r5, ghe, i2 & 14);
            } else {
                r5.ExS(-1457703325);
                A01(r5, 0);
            }
            if (C51970G9q.A1a(r5, false)) {
                0fL.A00(-2032892118);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, ghe, i, 12);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: X.IxZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: X.IxZ} */
    /* JADX WARNING: type inference failed for: r23v1, types: [X.JLF, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0168, code lost:
        if (r6 == X.AnonymousClass5XT.A00) goto L_0x016a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C286575Wy r36, X.C53046Ghe r37, int r38) {
        /*
            r2 = 0
            r5 = r37
            X.0qQ.A0B(r5, r2)
            r1 = 325017972(0x135f6174, float:2.8194605E-27)
            r0 = r36
            r0.ExV(r1)
            r14 = r38
            r1 = r38 & 6
            r19 = 4
            r8 = 2
            if (r1 != 0) goto L_0x01f8
            int r9 = X.G9t.A0O(r0, r5)
            r9 = r9 | r38
        L_0x001d:
            r1 = r9 & 3
            if (r1 != r8) goto L_0x0036
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0036
            r0.Evl()
        L_0x002a:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0035
            r0 = 13
            X.JGE.A01(r1, r5, r14, r0)
        L_0x0035:
            return
        L_0x0036:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0044
            r3 = -1890381088(0xffffffff8f5312e0, float:-1.04067384E-29)
            java.lang.String r1 = "com.instagram.wonderwall.ui.compose.screens.AggregatedWallFeedStaggeredGrid (AggregatedWallFeedScreen.kt:77)"
            X.0fL.A01(r3, r1)
        L_0x0044:
            X.0Ud r1 = r5.A04
            r18 = 0
            X.4gU r17 = X.AnonymousClass6FW.A02(r0, r1, r2)
            java.lang.Object r1 = r17.getValue()
            X.Jw9 r1 = (X.C61071Jw9) r1
            java.lang.Object r7 = r1.A04
            X.Gmj r7 = (X.C53359Gmj) r7
            java.lang.Object r1 = r17.getValue()
            X.Jw9 r1 = (X.C61071Jw9) r1
            java.lang.Object r1 = r1.A00
            r27 = r1
            r1 = -716116204(0xffffffffd550ef14, float:-1.43578282E13)
            boolean r1 = X.C51967G9n.A1Y(r0, r7, r1)
            java.lang.Object r4 = r0.ECw()
            if (r1 != 0) goto L_0x0071
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r4 != r1) goto L_0x0077
        L_0x0071:
            boolean r1 = r7.A06
            java.lang.Boolean r4 = X.C51967G9n.A0e(r0, r1)
        L_0x0077:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            X.5Wx r1 = X.C51965G9l.A0H(r0, r2)
            r6 = -716111464(0xffffffffd5510198, float:-1.43627985E13)
            r0.ExS(r6)
            r16 = r9 & 14
            r9 = r16
            r6 = r19
            boolean r6 = X.AnonymousClass7TF.A1S(r9, r6)
            java.lang.Object r9 = r0.ECw()
            if (r6 != 0) goto L_0x009b
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r9 != r6) goto L_0x00a0
        L_0x009b:
            r6 = 6
            X.IwD r9 = X.C58704IwD.A00(r0, r5, r6)
        L_0x00a0:
            X.0sa r22 = X.C51965G9l.A0y(r1, r9, r2)
            r23 = 0
            r24 = 3072(0xc00, float:4.305E-42)
            r25 = 52
            r20 = r18
            r21 = r0
            r26 = r3
            X.GQw r12 = X.C52382GQh.A00(r20, r21, r22, r23, r24, r25, r26)
            androidx.compose.ui.Modifier r11 = X.C51968G9o.A0O()
            r31 = 1
            androidx.compose.ui.Modifier r10 = X.C52383GQi.A00(r11, r12)
            X.5RD r9 = X.C51966G9m.A0a(r2)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r6 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r0, r10)
            X.C51973G9u.A0y(r0, r1)
            X.C51971G9r.A12(r0, r9, r6)
            X.0sL r9 = X.C287485aD.A02
            boolean r6 = r1.A0K
            if (r6 != 0) goto L_0x00e0
            boolean r6 = X.C51972G9s.A1Q(r0, r13)
            if (r6 != 0) goto L_0x00e3
        L_0x00e0:
            X.C51971G9r.A13(r0, r9, r13)
        L_0x00e3:
            X.C51965G9l.A18(r0, r10)
            X.5dj r13 = X.C289515dj.A00
            r6 = -478659689(0xffffffffe3783b97, float:-4.5790864E21)
            r0.ExS(r6)
            r9 = 6
            if (r3 != 0) goto L_0x00fd
            X.4gU r6 = r12.A06
            float r10 = X.C51971G9r.A03(r6)
            float r6 = r12.A01
            float r10 = r10 / r6
            X.I60.A00(r13, r0, r10, r9, r2)
        L_0x00fd:
            X.C286565Wx.A0L(r1, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r13 = X.HR2.A00(r0)
            X.IFQ r23 = new X.IFQ
            r23.<init>()
            r10 = 1094713344(0x41400000, float:12.0)
            java.lang.Object r6 = r17.getValue()
            X.Jw9 r6 = (X.C61071Jw9) r6
            boolean r6 = r6.A02
            if (r6 == 0) goto L_0x0116
            r10 = 0
        L_0x0116:
            X.6Fc r20 = X.C287275Zs.A01(r10)
            java.lang.Object r6 = r17.getValue()
            X.Jw9 r6 = (X.C61071Jw9) r6
            boolean r10 = r6.A02
            r6 = 1090519040(0x41000000, float:8.0)
            if (r10 == 0) goto L_0x0127
            r6 = 0
        L_0x0127:
            X.6Fj r15 = new X.6Fj
            r15.<init>(r6, r6, r6, r6)
            r6 = -478638477(0xffffffffe3788e73, float:-4.585057E21)
            boolean r6 = X.C51967G9n.A1Y(r0, r12, r6)
            java.lang.Object r10 = r0.ECw()
            if (r6 != 0) goto L_0x013d
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r10 != r6) goto L_0x0144
        L_0x013d:
            X.J6g r10 = X.C59098J6g.A01(r12, r8)
            r0.FLL(r10)
        L_0x0144:
            androidx.compose.ui.Modifier r25 = X.C51973G9u.A0D(r1, r11, r10)
            r8 = -478634369(0xffffffffe3789e7f, float:-4.5862134E21)
            r6 = r17
            boolean r8 = X.G9t.A1W(r0, r6, r8, r3)
            boolean r6 = X.C51972G9s.A1I(r16)
            r8 = r8 | r6
            r6 = r27
            boolean r6 = r0.AGu(r6)
            boolean r8 = X.C51968G9o.A1T(r0, r7, r8, r6)
            java.lang.Object r6 = r0.ECw()
            if (r8 != 0) goto L_0x016a
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r6 != r8) goto L_0x017e
        L_0x016a:
            X.IxZ r6 = new X.IxZ
            r32 = r6
            r33 = r19
            r34 = r27
            r35 = r17
            r36 = r7
            r38 = r3
            r32.<init>(r33, r34, r35, r36, r37, r38)
            r0.FLL(r6)
        L_0x017e:
            X.0sP r26 = X.C51965G9l.A0z(r1, r6)
            r7 = 100859904(0x6030000, float:2.4638362E-35)
            X.5Tp r6 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A0M
            r28 = 8
            int r28 = r28 << r9
            r28 = r28 | r7
            r29 = 144(0x90, float:2.02E-43)
            r27 = 1094713344(0x41400000, float:12.0)
            r30 = r2
            r19 = r18
            r21 = r15
            r22 = r13
            r24 = r0
            X.C56165Htu.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = 5
            r6 = -478583296(0xffffffffe3796600, float:-4.6005891E21)
            boolean r8 = X.C51967G9n.A1W(r0, r6, r3)
            boolean r6 = X.C51970G9q.A1V(r16)
            r8 = r8 | r6
            java.lang.Object r7 = r0.ECw()
            if (r8 != 0) goto L_0x01b4
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r7 != r6) goto L_0x01ba
        L_0x01b4:
            r6 = 45
            X.GA1 r7 = X.GA1.A00(r0, r5, r6, r3)
        L_0x01ba:
            X.0sa r8 = X.C51965G9l.A0y(r1, r7, r2)
            r10 = 56
            r6 = r13
            r7 = r0
            r11 = r2
            X.C52381GQg.A04(r6, r7, r8, r9, r10, r11)
            r2 = -478579374(0xffffffffe3797552, float:-4.601693E21)
            boolean r2 = X.C51967G9n.A1W(r0, r2, r3)
            boolean r2 = X.C51966G9m.A1U(r0, r13, r2)
            java.lang.Object r6 = r0.ECw()
            if (r2 != 0) goto L_0x01db
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r6 != r2) goto L_0x01e7
        L_0x01db:
            r7 = 18
            X.MGB r6 = new X.MGB
            r2 = r18
            r6.<init>(r13, r2, r7, r3)
            r0.FLL(r6)
        L_0x01e7:
            X.C51968G9o.A1E(r0, r1, r6, r4)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x002a
            r1 = 2068750963(0x7b4ea273, float:1.072908E36)
            X.0fL.A00(r1)
            goto L_0x002a
        L_0x01f8:
            r9 = r14
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56644I5z.A04(X.5Wy, X.Ghe, int):void");
    }

    public static final void A00(C286575Wy r6, int i) {
        r6.ExV(164344021);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1632249534, "com.instagram.wonderwall.ui.compose.screens.AggregatedWallEmptyState (AggregatedWallFeedScreen.kt:242)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(C51966G9m.A0U(r5), 20.0f);
            AnonymousClass5RD A0N = G9w.A0N(r6);
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, A07);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A0N, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            C51975G9x.A12(r6, r5, R.drawable.ig_illustrations_illo_boards);
            G9w.A15(r6, r5, 24.0f);
            C51975G9x.A11(r6, 2131976747);
            G9w.A15(r6, r5, 8.0f);
            if (C51967G9n.A1R(r6)) {
                0fL.A00(-267661381);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 19);
        }
    }

    public static final void A01(C286575Wy r6, int i) {
        r6.ExV(417352479);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-298131780, "com.instagram.wonderwall.ui.compose.screens.AggregatedWallErrorScreen (AggregatedWallFeedScreen.kt:218)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(C51966G9m.A0U(r5), 32.0f);
            AnonymousClass5RD A0N = G9w.A0N(r6);
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, A07);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A0N, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            C51975G9x.A12(r6, r5, R.drawable.ig_illustrations_illo_warning_refresh);
            G9w.A15(r6, r5, 24.0f);
            C51975G9x.A11(r6, 2131976749);
            G9w.A15(r6, r5, 8.0f);
            C51975G9x.A14(r6, C51966G9m.A0g(r6), C304346Dc.A00(r6, 2131976748));
            if (C51967G9n.A1R(r6)) {
                0fL.A00(43104563);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 20);
        }
    }

    public static final void A02(C286575Wy r27, C61063Jw1 jw1, C53046Ghe ghe, int i) {
        int i2;
        float f;
        Object valueOf;
        Float[] fArr;
        C286575Wy r8 = r27;
        r8.ExV(-1148380724);
        int i3 = i;
        C61063Jw1 jw12 = jw1;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, jw12) | i;
        } else {
            i2 = i3;
        }
        C53046Ghe ghe2 = ghe;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r8, ghe2);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(837026630, "com.instagram.wonderwall.ui.compose.screens.WallTimelineRow (AggregatedWallFeedScreen.kt:168)");
            }
            User user = (User) jw12.A02;
            C285245Qk A0K = C51965G9l.A0K(r8, -1514227343);
            Modifier A0T = C51966G9m.A0T(A0K);
            Modifier modifier = A0T;
            List list = (List) jw12.A03;
            Object A0J = 00k.A0J(list);
            if (A0J != null) {
                boolean A1Z = C51965G9l.A1Z(r8, A0J, C51973G9u.A1O(r8, -1169138680, i2));
                Object ECw = r8.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = C51970G9q.A0v(r8, ghe2, A0J, 46);
                }
                C51968G9o.A1N(r8);
                modifier = A0T.Ezh(C52638GaC.A01(r8, A0K, (C62320sa) ECw));
            }
            C286565Wx r3 = (C286565Wx) r8;
            C286565Wx.A0L(r3, false);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r8, 0);
            int A00 = C287425a7.A00(r8);
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r8, modifier);
            C62320sa r9 = C287485aD.A00;
            C51973G9u.A0z(r8, r3, r9);
            0sL r1 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r8, A0Z, A04, r1);
            0sL r0 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r0, A00);
            }
            0sL A1K = C51966G9m.A1K(r8, A01);
            C286575Wy r24 = r8;
            GS8.A05(r24, 1zC.A00(r8, user.Bh3()), GS7.A04, user.getUsername(), C304346Dc.A01(r8, AnonymousClass7TF.A1b(jw12.A01), 2131952530), 0, 63468);
            Modifier A09 = C287195Zj.A09(A0T, 0.0f, 16.0f);
            AnonymousClass5RD A0Z2 = C51966G9m.A0Z(false);
            int A002 = C287425a7.A00(r8);
            AnonymousClass5RM A042 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r8, A09);
            C51973G9u.A0z(r8, r3, r9);
            C287595aO.A00(r8, A0Z2, r1);
            if (C51965G9l.A1Y(r8, r3, A042, A0w) || !C51972G9s.A1Q(r8, A002)) {
                C51971G9r.A13(r8, r0, A002);
            }
            C287595aO.A00(r8, A012, A1K);
            Iterator A17 = C51968G9o.A17(r8, list, -676020519);
            int i4 = 0;
            while (A17.hasNext()) {
                Object next = A17.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                WallPostItem wallPostItem = (WallPostItem) next;
                float f2 = -4.0f;
                if (i4 == C51966G9m.A06(list)) {
                    f2 = 6.0f;
                }
                Float valueOf2 = Float.valueOf(f2);
                if (list.size() > 1) {
                    f = valueOf2.floatValue();
                } else {
                    f = 0.0f;
                }
                boolean A1X = C51974G9v.A1X(r8, -2105464005, i2);
                Object ECw2 = r8.ECw();
                if (A1X || ECw2 == AnonymousClass5XT.A00) {
                    int size = list.size();
                    if (size != 1) {
                        if (size != 2) {
                            fArr = new Float[]{Float.valueOf(-20.0f), Float.valueOf(0.0f), Float.valueOf(20.0f)};
                        } else {
                            fArr = new Float[]{Float.valueOf(-10.0f), Float.valueOf(10.0f)};
                        }
                        ECw2 = 0sr.A1P(fArr);
                    } else {
                        ECw2 = AnonymousClass7TE.A1I(Float.valueOf(0.0f));
                    }
                    r8.FLL(ECw2);
                }
                List list2 = (List) ECw2;
                C286565Wx.A0L(r3, false);
                Modifier A003 = HRH.A00(C287205Zk.A0D(A0K, 165.0f), f);
                if (i4 < list2.size()) {
                    valueOf = list2.get(i4);
                } else {
                    valueOf = Float.valueOf(0.0f);
                }
                I5C.A00(r8, C56164Htt.A00(A003, AnonymousClass7TE.A04(valueOf), 0.0f), wallPostItem, ghe2, (String) null, ((i2 << 6) & 7168) | 1794432, 0, false, false, false);
                i4 = i5;
            }
            if (C51973G9u.A1R(r8, r3)) {
                0fL.A00(-853146032);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, jw12, ghe2, i3, 21);
        }
    }
}
