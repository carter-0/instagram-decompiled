package X;

import java.util.List;

/* renamed from: X.HuT  reason: case insensitive filesystem */
public abstract class C56200HuT {
    public static final void A01(C286575Wy r23, List list, List list2, C62320sa r26, C62320sa r27, C62320sa r28, 0sL r29, 0sL r30, int i) {
        int i2;
        List list3 = list;
        List list4 = list2;
        boolean A1U = AnonymousClass7TF.A1U(0, list3, list4);
        C62320sa r25 = r27;
        C62320sa r21 = r28;
        0sL r15 = r29;
        0sL r8 = r30;
        C62320sa r2 = r26;
        C62320sa r1 = r25;
        C51974G9v.A1S(r2, r15, r1, r8, r21);
        C286575Wy r11 = r23;
        r11.ExV(2015728240);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, list3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, list4);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, r2);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r11, r15);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r11, r1);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r11, r8);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r11, r21);
        }
        if ((599187 & i2) != 599186 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-492590576, "com.instagram.aistudio.editor.AiKnowledgeScreen (AiKnowledgeScreen.kt:44)");
            }
            0lg A0j = C51969G9p.A0j(r11);
            int size = list4.size();
            0Tu A0J = DbS.A0J(A0j, 0);
            boolean A1T = AnonymousClass7TF.A1T(size, DbS.A04(A0J, A0j, 36605550999049479L));
            int size2 = list3.size();
            0qQ.A0B(A0j, 0);
            boolean A1T2 = AnonymousClass7TF.A1T(size2, DbS.A04(A0J, A0j, 36605550999115016L));
            boolean A1T3 = C51968G9o.A1T(r11, list4, C51968G9o.A1T(r11, list3, C51966G9m.A1V(r11, A1T2, C51967G9n.A1W(r11, 1117425235, A1T)), AnonymousClass7TF.A1S(i2 & 896, 256)) | AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED), C51974G9v.A1W(i2)) | C51974G9v.A1T(i2) | C51973G9u.A1M(i2, 3670016);
            Object ECw = r11.ECw();
            if (A1T3 || ECw == AnonymousClass5XT.A00) {
                C62320sa r16 = r26;
                List list5 = list4;
                List list6 = list3;
                ECw = new C58826IyB(r15, r16, list5, list6, r8, r25, r21, A1U ? 1 : 0, A1T, A1T2);
                r11.FLL(ECw);
            }
            C51965G9l.A1X(r11, false);
            AnonymousClass6HY.A08(r11, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-639654303);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59205JAj(i3, A1U ? 1 : 0, r21, list4, list3, r25, r26, r15, r8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r18, int r19, int r20, boolean r21, boolean r22, boolean r23) {
        /*
            r2 = r23
            r3 = r22
            r4 = r21
            r0 = -1682637487(0xffffffff9bb4fd51, float:-2.9942204E-22)
            r11 = r18
            r11.ExV(r0)
            r10 = r20 & 1
            r5 = r19
            if (r10 == 0) goto L_0x010d
            r0 = r19 | 6
        L_0x0016:
            r9 = r20 & 2
            if (r9 == 0) goto L_0x0102
            r0 = r0 | 48
        L_0x001c:
            r7 = r20 & 4
            if (r7 == 0) goto L_0x00f7
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0022:
            r6 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r6 != r1) goto L_0x0049
            boolean r1 = r11.Bwn()
            if (r1 == 0) goto L_0x0049
            r11.Evl()
        L_0x0031:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x0048
            X.J7V r0 = new X.J7V
            r18 = r0
            r19 = r5
            r21 = r4
            r22 = r3
            r23 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            r1.A06 = r0
        L_0x0048:
            return
        L_0x0049:
            r8 = 1
            if (r10 == 0) goto L_0x004d
            r4 = 1
        L_0x004d:
            if (r9 == 0) goto L_0x0050
            r3 = 1
        L_0x0050:
            if (r7 == 0) goto L_0x0053
            r2 = 1
        L_0x0053:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0061
            r6 = -1701620250(0xffffffff9a9355e6, float:-6.093655E-23)
            java.lang.String r1 = "com.instagram.aistudio.editor.AddBanner (AiKnowledgeScreen.kt:119)"
            X.0fL.A01(r6, r1)
        L_0x0061:
            r1 = -1463402188(0xffffffffa8c64134, float:-2.2010693E-14)
            java.lang.Object r1 = X.C51967G9n.A0m(r11, r1)
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            java.lang.Object r6 = X.C51974G9v.A0Z(r11, r1, r7, r8)
            X.5Oz r6 = (X.C284945Oz) r6
            X.5Wx r9 = X.C51965G9l.A0G(r11)
            if (r4 != 0) goto L_0x00df
            if (r3 != 0) goto L_0x00d5
            r1 = 1879304335(0x7003e88f, float:1.6329473E29)
            r11.ExS(r1)
            r1 = 2131952767(0x7f13047f, float:1.9541986E38)
        L_0x0081:
            java.lang.String r13 = X.C288035bG.A00(r11, r1)
            X.C286565Wx.A0I(r9)
        L_0x0088:
            boolean r1 = X.C51966G9m.A1X(r13)
            if (r1 == 0) goto L_0x00c7
            boolean r1 = X.C51971G9r.A1W(r6)
            if (r1 == 0) goto L_0x00c7
            r14 = 0
            r1 = 2131239007(0x7f08205f, float:1.8094309E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r1 = -1463379640(0xffffffffa8c69948, float:-2.2048891E-14)
            java.lang.Object r1 = X.C51967G9n.A0m(r11, r1)
            if (r1 != r7) goto L_0x00ad
            X.MMA r1 = new X.MMA
            r1.<init>(r6, r8)
            r11.FLL(r1)
        L_0x00ad:
            X.0sa r1 = (X.C62320sa) r1
            X.C286565Wx.A0I(r9)
            r7 = 196608(0x30000, float:2.75506E-40)
            r6 = 57344(0xe000, float:8.0356E-41)
            int r17 = r0 << 6
            r17 = r17 & r6
            r17 = r17 | r7
            r18 = 10
            r15 = r14
            r19 = r2
            r16 = r1
            X.HXG.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00c7:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0031
            r0 = -1683956455(0xffffffff9ba0dd19, float:-2.661266E-22)
            X.0fL.A00(r0)
            goto L_0x0031
        L_0x00d5:
            r1 = 1879433884(0x7005e29c, float:1.6574184E29)
            r11.ExS(r1)
            r1 = 2131952766(0x7f13047e, float:1.9541984E38)
            goto L_0x0081
        L_0x00df:
            if (r3 != 0) goto L_0x00eb
            r1 = 1879547871(0x70079fdf, float:1.67895E29)
            r11.ExS(r1)
            r1 = 2131952775(0x7f130487, float:1.9542002E38)
            goto L_0x0081
        L_0x00eb:
            r1 = 1879641675(0x70090e4b, float:1.696669E29)
            r11.ExS(r1)
            X.C286565Wx.A0I(r9)
            java.lang.String r13 = ""
            goto L_0x0088
        L_0x00f7:
            r1 = r5 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0022
            int r1 = X.G9t.A0a(r11, r2)
            r0 = r0 | r1
            goto L_0x0022
        L_0x0102:
            r1 = r19 & 48
            if (r1 != 0) goto L_0x001c
            int r1 = X.G9t.A0Z(r11, r3)
            r0 = r0 | r1
            goto L_0x001c
        L_0x010d:
            r0 = r19 & 6
            if (r0 != 0) goto L_0x0119
            int r0 = X.G9t.A0Y(r11, r4)
            r0 = r0 | r19
            goto L_0x0016
        L_0x0119:
            r0 = r5
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56200HuT.A00(X.5Wy, int, int, boolean, boolean, boolean):void");
    }
}
