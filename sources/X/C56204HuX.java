package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.HuX  reason: case insensitive filesystem */
public abstract class C56204HuX {
    public static final void A00(C286575Wy r31, C59964JcX jcX, LRW lrw, 0sL r34, 0sK r35, int i) {
        int i2;
        C59964JcX jcX2 = jcX;
        LRW lrw2 = lrw;
        boolean A1U = AnonymousClass7TF.A1U(0, jcX2, lrw2);
        0sK r33 = r35;
        int A03 = DbW.A03(2, r33, r34);
        C286575Wy r0 = r31;
        r0.ExV(-122789806);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r0, jcX2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r0, lrw2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r0, r33);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r0, r34);
        }
        if ((i2 & 1171) != 1170 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-797253229, "com.instagram.aistudio.home.view.section.AiHomeContinueChattingSection (AiHomeContinueChattingSection.kt:52)");
            }
            LazyListState A00 = C305066Gi.A00(r0, 0, 0, 0, A03);
            AnonymousClass6F1 A002 = C304696Ev.A00(A00, r0);
            C285245Qk r5 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A003 = C287425a7.A00(r0);
            C286565Wx r2 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r0, r5);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r0, r2, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Z, A04, r13);
            0sL r12 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r12, A003);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            AnonymousClass5RD A0W = C51968G9o.A0W(r0);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r0, r5);
            C51973G9u.A0z(r0, r2, r14);
            C287595aO.A00(r0, A0W, r13);
            if (C51965G9l.A1Y(r0, r2, A042, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r12, A004);
            }
            C287595aO.A00(r0, A012, A1K);
            AnonymousClass6FX r11 = AnonymousClass6FX.A00;
            C53299Gll gll = (C53299Gll) jcX2.A02;
            String str = gll.A03;
            long A0H = C51966G9m.A0H(r0);
            C286575Wy r22 = r0;
            AnonymousClass5ZZ.A0Q(r22, r11.A00(C287195Zj.A09(r5, 16.0f, 14.0f)), C51966G9m.A0e(r0), str, A0H);
            r0.ExS(1660648501);
            if (gll.A06) {
                HT4.A00(r0, lrw2, str, (i2 >> 3) & 14);
                String A005 = C288035bG.A00(r0, 2131952627);
                long A0N = C51966G9m.A0N(r0);
                AnonymousClass5Z4 A0S = C51965G9l.A0S(r0);
                Modifier A0I = G9w.A0I(r5, 16.0f);
                boolean A1a = G9t.A1a(r0, jcX2, lrw2, C51974G9v.A1a(r0, 1660659900, i2));
                Object ECw = r0.ECw();
                if (A1a || ECw == AnonymousClass5XT.A00) {
                    ECw = C58696Iw5.A00(r0, lrw2, r34, jcX2, 32);
                }
                AnonymousClass5ZZ.A0Q(r0, C287635aW.A05(A0I, (C287625aV) null, (String) null, C51965G9l.A0y(r2, ECw, false), A1U), A0S, A005, A0N);
            }
            C286565Wx.A0L(r2, false);
            r0.ASN();
            Modifier A0B = C287195Zj.A0B(r5, 0.0f, 0.0f, 0.0f, 12.0f);
            C304756Fc A013 = C287275Zs.A01(12.0f);
            C304826Fj r8 = new C304826Fj(12.0f, 0.0f, 12.0f, 0.0f);
            boolean A1I = C51973G9u.A1I(i2) | C51973G9u.A1S(r0, jcX2, lrw2, -1148011290);
            Object ECw2 = r0.ECw();
            if (A1I || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C58751Iwy(47, lrw2, jcX2, r33);
                r0.FLL(ECw2);
            }
            C304826Fj r23 = r8;
            LazyListState lazyListState = A00;
            AnonymousClass6HY.A00(A002, A013, r23, lazyListState, r0, (C287245Zp) null, A0B, C51965G9l.A0z(r2, ECw2), 12607878, 40, false, A1U);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-553117835);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(jcX2, r33, lrw2, r34, i3, 2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: X.Iw7} */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        if (r9 == X.AnonymousClass5XT.A00) goto L_0x00cf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r28, X.C53325GmB r29, X.C53299Gll r30, X.LRW r31, X.0sK r32, int r33, int r34) {
        /*
            r1 = -801643751(0xffffffffd037e319, float:-1.23404544E10)
            r0 = r28
            r0.ExV(r1)
            r5 = r34
            r1 = r34 & 6
            r2 = r29
            if (r1 != 0) goto L_0x01e1
            int r4 = X.C41848B3p.A01(r0, r2)
            r4 = r4 | r34
        L_0x0016:
            r1 = r34 & 48
            r6 = r30
            if (r1 != 0) goto L_0x0021
            int r1 = X.G9t.A0F(r0, r6)
            r4 = r4 | r1
        L_0x0021:
            r1 = r5 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            r29 = r33
            if (r1 != 0) goto L_0x0030
            r1 = r29
            int r1 = X.G9t.A07(r0, r1)
            r4 = r4 | r1
        L_0x0030:
            r1 = r5 & 3072(0xc00, float:4.305E-42)
            r34 = r31
            if (r1 != 0) goto L_0x003d
            r1 = r34
            int r1 = X.G9t.A0H(r0, r1)
            r4 = r4 | r1
        L_0x003d:
            r3 = r5 & 24576(0x6000, float:3.4438E-41)
            r1 = 16384(0x4000, float:2.2959E-41)
            r33 = r32
            if (r3 != 0) goto L_0x004c
            r3 = r33
            int r3 = X.G9t.A0I(r0, r3)
            r4 = r4 | r3
        L_0x004c:
            r7 = r4 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r3) goto L_0x0074
            boolean r3 = r0.Bwn()
            if (r3 == 0) goto L_0x0074
            r0.Evl()
        L_0x005b:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0073
            r14 = 5
            X.JG8 r0 = new X.JG8
            r7 = r0
            r8 = r33
            r9 = r6
            r10 = r2
            r11 = r34
            r12 = r5
            r13 = r29
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r1.A06 = r0
        L_0x0073:
            return
        L_0x0074:
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0082
            r7 = -1057689848(0xffffffffc0f4ef08, float:-7.6541786)
            java.lang.String r3 = "com.instagram.aistudio.home.view.section.ContinueChattingCard (AiHomeContinueChattingSection.kt:99)"
            X.0fL.A01(r7, r3)
        L_0x0082:
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            r3 = 1125711872(0x43190000, float:153.0)
            androidx.compose.ui.Modifier r7 = X.C287205Zk.A0D(r10, r3)
            r3 = 1126432768(0x43240000, float:164.0)
            androidx.compose.ui.Modifier r15 = X.C287205Zk.A08(r7, r3)
            r17 = 1094713344(0x41400000, float:12.0)
            X.5ZQ r16 = X.AnonymousClass5ZN.A00()
            r13 = 0
            r7 = 0
            r3 = 0
            boolean r22 = X.C51975G9x.A1M(r17)
            long r18 = X.AnonymousClass5RV.A00
            r20 = r18
            androidx.compose.ui.Modifier r9 = X.C56169Hty.A01(r15, r16, r17, r18, r20, r22)
            androidx.compose.ui.Modifier r11 = X.C51976G9y.A0B(r0, r9)
            r9 = -1050874052(0xffffffffc15cef3c, float:-13.808407)
            r0.ExS(r9)
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r4
            r12 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r9, r1)
            boolean r9 = X.C51966G9m.A1U(r0, r2, r1)
            r1 = r4 & 896(0x380, float:1.256E-42)
            if (r1 == r8) goto L_0x00c1
            r12 = 0
        L_0x00c1:
            boolean r1 = X.C51968G9o.A1T(r0, r6, r9, r12)
            java.lang.Object r9 = r0.ECw()
            if (r1 != 0) goto L_0x00cf
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r9 != r1) goto L_0x00e3
        L_0x00cf:
            r20 = 8
            X.Iw7 r9 = new X.Iw7
            r18 = r9
            r19 = r29
            r21 = r2
            r22 = r33
            r23 = r6
            r18.<init>((int) r19, (int) r20, (java.lang.Object) r21, (java.lang.Object) r22, (java.lang.Object) r23)
            r0.FLL(r9)
        L_0x00e3:
            X.0sa r9 = (X.C62320sa) r9
            X.5Wx r1 = X.C51965G9l.A0H(r0, r13)
            r8 = 1
            androidx.compose.ui.Modifier r8 = X.C287635aW.A05(r11, r7, r7, r9, r8)
            X.5RD r11 = X.C51966G9m.A0a(r13)
            int r15 = X.C287425a7.A00(r0)
            X.5RM r7 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r0, r8)
            X.0sa r9 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r1, r9)
            X.0sL r8 = X.C287485aD.A03
            X.0sL r12 = X.C51969G9p.A0w(r0, r11, r7, r8)
            X.0sL r7 = X.C287485aD.A02
            boolean r11 = r1.A0K
            if (r11 != 0) goto L_0x0115
            boolean r11 = X.C51972G9s.A1Q(r0, r15)
            if (r11 != 0) goto L_0x0118
        L_0x0115:
            X.C51971G9r.A13(r0, r7, r15)
        L_0x0118:
            X.0sL r11 = X.C51966G9m.A1K(r0, r14)
            java.lang.String r14 = r2.A06
            r19 = r14
            X.Kp1 r15 = r2.A00
            java.lang.String r24 = r15.A01()
            java.lang.String r14 = r2.A05
            r25 = r14
            java.lang.String r14 = r6.A03
            r18 = r14
            int r14 = r6.A00
            java.lang.Integer r22 = java.lang.Integer.valueOf(r14)
            com.instagram.api.schemas.IGAIAgentType r20 = r15.A00()
            java.lang.String r28 = r15.A02()
            X.Kiw r14 = r6.A01
            r16 = 196608(0x30000, float:2.75506E-40)
            int r15 = r4 >> 9
            r30 = r15 & 14
            r30 = r30 | r16
            int r4 = r4 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r30 = r30 | r4
            java.lang.String r26 = "home"
            r23 = r19
            r27 = r18
            r31 = r13
            r32 = r13
            r18 = r0
            r19 = r34
            r21 = r14
            X.HT3.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r13 = 1105461248(0x41e40000, float:28.5)
            r4 = r17
            androidx.compose.ui.Modifier r13 = X.C287195Zj.A0B(r10, r13, r4, r13, r3)
            X.5Zr r4 = X.C287215Zl.A00
            X.5RD r15 = X.C51970G9q.A0Z(r0, r4)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r4 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r13 = X.C287435a8.A01(r0, r13)
            X.C51973G9u.A0z(r0, r1, r9)
            X.C287595aO.A00(r0, r15, r8)
            boolean r4 = X.C51965G9l.A1Y(r0, r1, r4, r12)
            if (r4 != 0) goto L_0x018b
            boolean r4 = X.C51972G9s.A1Q(r0, r14)
            if (r4 != 0) goto L_0x018e
        L_0x018b:
            X.C51971G9r.A13(r0, r7, r14)
        L_0x018e:
            X.C287595aO.A00(r0, r13, r11)
            androidx.compose.ui.Modifier r7 = X.C51966G9m.A0W(r10)
            r4 = 1119879168(0x42c00000, float:96.0)
            androidx.compose.ui.Modifier r7 = X.C287205Zk.A0C(r7, r4)
            java.lang.String r4 = r2.A03
            X.2DN r4 = X.C51975G9x.A0W(r0, r4)
            X.AnonymousClass6G3.A03(r0, r7, r4)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A06(r10)
            long r15 = X.C51966G9m.A0H(r0)
            X.5Z4 r13 = X.C51966G9m.A0h(r0)
            r11 = r0
            r14 = r25
            X.AnonymousClass5ZZ.A0T(r11, r12, r13, r14, r15)
            java.lang.String r7 = r2.A04
            r4 = -668989759(0xffffffffd82006c1, float:-7.0380347E14)
            r0.ExS(r4)
            if (r7 == 0) goto L_0x01d3
            r4 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.Modifier r9 = X.C287195Zj.A0B(r10, r3, r4, r3, r3)
            long r12 = X.C51966G9m.A0M(r0)
            X.5Z4 r10 = X.C51966G9m.A0b(r0)
            r8 = r0
            r11 = r7
            X.AnonymousClass5ZZ.A0T(r8, r9, r10, r11, r12)
        L_0x01d3:
            boolean r1 = X.C51973G9u.A1R(r0, r1)
            if (r1 == 0) goto L_0x005b
            r1 = -1071100568(0xffffffffc0284d68, float:-2.6297245)
            X.0fL.A00(r1)
            goto L_0x005b
        L_0x01e1:
            r4 = r5
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56204HuX.A01(X.5Wy, X.GmB, X.Gll, X.LRW, X.0sK, int, int):void");
    }
}
