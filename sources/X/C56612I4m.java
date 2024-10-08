package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.I4m  reason: case insensitive filesystem */
public abstract class C56612I4m {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.Ixu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.Ixu} */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x00dc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r25, X.C61060Jvy r26, X.C62320sa r27, X.C62320sa r28, X.0sL r29, int r30) {
        /*
            r4 = 0
            r8 = r26
            X.0qQ.A0B(r8, r4)
            r3 = 1
            r13 = r27
            r7 = r28
            r6 = r29
            X.DbZ.A0t(r3, r13, r6, r7)
            r0 = 626002639(0x25500acf, float:1.8044786E-16)
            r9 = r25
            r9.ExV(r0)
            r5 = r30
            r0 = r30 & 6
            if (r0 != 0) goto L_0x011c
            int r12 = X.C41848B3p.A01(r9, r8)
            r12 = r12 | r30
        L_0x0024:
            r0 = r30 & 48
            if (r0 != 0) goto L_0x002d
            int r0 = X.G9t.A0F(r9, r13)
            r12 = r12 | r0
        L_0x002d:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0036
            int r0 = X.G9t.A0G(r9, r6)
            r12 = r12 | r0
        L_0x0036:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003f
            int r0 = X.G9t.A0H(r9, r7)
            r12 = r12 | r0
        L_0x003f:
            r1 = r12 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0061
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x0061
            r9.Evl()
        L_0x004e:
            X.5Xd r0 = r9.ASQ()
            if (r0 == 0) goto L_0x0060
            X.JG7 r9 = new X.JG7
            r11 = r7
            r12 = r6
            r14 = r5
            r15 = r3
            r10 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A06 = r9
        L_0x0060:
            return
        L_0x0061:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x006f
            r1 = -360660215(0xffffffffea80c309, float:-7.783177E25)
            java.lang.String r0 = "com.instagram.aistudio.editor.AiCreationTopicPickerScreen (AiCreationTopicPickerScreen.kt:42)"
            X.0fL.A01(r1, r0)
        L_0x006f:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r8.A01
            java.util.Iterator r15 = X.C51966G9m.A1H(r0)
            r14 = 0
        L_0x007e:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r2 = r15.next()
            int r1 = r14 + 1
            if (r14 >= 0) goto L_0x0094
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0094:
            int r0 = r14 % 2
            X.C51970G9q.A1Q(r2, r11, r10, r0)
            r14 = r1
            goto L_0x007e
        L_0x009b:
            boolean r2 = r8.A04
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r15 = 0
            androidx.compose.ui.Modifier r14 = X.C51966G9m.A0T(r0)
            long r0 = X.C51966G9m.A0A(r9)
            androidx.compose.ui.Modifier r0 = X.C51966G9m.A0X(r14, r0)
            androidx.compose.ui.Modifier r21 = X.C287195Zj.A04(r0)
            X.5Zr r20 = X.C287215Zl.A00
            r0 = -1193719296(0xffffffffb8d94a00, float:-1.036115E-4)
            boolean r0 = X.C51967G9n.A1Z(r9, r8, r0)
            boolean r1 = X.C51966G9m.A1V(r9, r2, r0)
            boolean r0 = X.C51973G9u.A1H(r12)
            r1 = r1 | r0
            boolean r0 = X.C51973G9u.A1I(r12)
            boolean r0 = X.C51968G9o.A1T(r9, r11, r1, r0)
            boolean r1 = X.C51973G9u.A1J(r12)
            boolean r1 = X.C51968G9o.A1T(r9, r10, r0, r1)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x00dc
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x00f4
        L_0x00dc:
            X.Ixu r0 = new X.Ixu
            r22 = r0
            r23 = r4
            r24 = r8
            r25 = r13
            r26 = r6
            r27 = r11
            r29 = r10
            r30 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r9.FLL(r0)
        L_0x00f4:
            X.0sP r0 = (X.0sP) r0
            X.C51965G9l.A1X(r9, r4)
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 222(0xde, float:3.11E-43)
            r16 = r15
            r17 = r15
            r18 = r15
            r26 = r4
            r19 = r9
            r22 = r0
            r25 = r4
            X.AnonymousClass6HY.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004e
            r0 = -1646534038(0xffffffff9ddbe26a, float:-5.8202924E-21)
            X.0fL.A00(r0)
            goto L_0x004e
        L_0x011c:
            r12 = r5
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56612I4m.A03(X.5Wy, X.Jvy, X.0sa, X.0sa, X.0sL, int):void");
    }

    public static final void A00(C286575Wy r8, int i) {
        r8.ExV(-1923444909);
        if (i != 0 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1842306539, "com.instagram.aistudio.editor.CreatorCardShimmer (AiCreationTopicPickerScreen.kt:217)");
            }
            C285245Qk r6 = Modifier.A00;
            FillElement fillElement = C287205Zk.A02;
            Modifier Ezh = r6.Ezh(fillElement);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r8, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r8);
            C286565Wx r3 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r8, Ezh);
            C51973G9u.A0y(r8, r3);
            C51971G9r.A12(r8, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r1, A00);
            }
            C51965G9l.A18(r8, A01);
            C56666I6v.A05(r8, G9w.A0H(C51967G9n.A0D(C287205Zk.A08(r6, 400.0f), 12.0f)).Ezh(fillElement));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(546205635);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 2);
        }
    }

    public static final void A01(C286575Wy r9, int i) {
        r9.ExV(-431909886);
        if (i != 0 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-211700563, "com.instagram.aistudio.editor.TemplateCardsColumnPlaceholder (AiCreationTopicPickerScreen.kt:186)");
            }
            int i2 = 0;
            do {
                C285245Qk r8 = Modifier.A00;
                Modifier A09 = C287195Zj.A09(C56169Hty.A00(r9, C51967G9n.A0D(C51966G9m.A0V(C287205Zk.A08(r8, 200.0f)), 12.0f), true), 8.0f, 12.0f);
                AnonymousClass5RD A0N = G9w.A0N(r9);
                int A00 = C287425a7.A00(r9);
                C286565Wx r3 = (C286565Wx) r9;
                AnonymousClass5RM A04 = C286565Wx.A04(r3);
                Modifier A01 = C287435a8.A01(r9, A09);
                C51973G9u.A0y(r9, r3);
                C51971G9r.A12(r9, A0N, A04);
                0sL r1 = C287485aD.A02;
                if (r3.A0K || !C51972G9s.A1Q(r9, A00)) {
                    C51971G9r.A13(r9, r1, A00);
                }
                C51965G9l.A18(r9, A01);
                AnonymousClass6G3.A03(r9, C51976G9y.A0C(r9, r8, 120.0f), 1zC.A01(r9, (ImageUrl) null, 6));
                r9.ASN();
                i2++;
            } while (i2 < 3);
            if (0fL.A02()) {
                0fL.A00(199654932);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 3);
        }
    }

    public static final void A02(C286575Wy r10, int i) {
        r10.ExV(1198046736);
        if (i != 0 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1695456444, "com.instagram.aistudio.editor.TemplateCardsColumnShimmer (AiCreationTopicPickerScreen.kt:172)");
            }
            int i2 = 0;
            do {
                C285245Qk r9 = Modifier.A00;
                FillElement fillElement = C287205Zk.A02;
                Modifier Ezh = r9.Ezh(fillElement);
                AnonymousClass5RD A0Z = C51969G9p.A0Z(r10, 0);
                int A00 = C287425a7.A00(r10);
                C286565Wx r7 = (C286565Wx) r10;
                AnonymousClass5RM A04 = C286565Wx.A04(r7);
                Modifier A01 = C287435a8.A01(r10, Ezh);
                C51973G9u.A0y(r10, r7);
                C51971G9r.A12(r10, A0Z, A04);
                0sL r1 = C287485aD.A02;
                if (r7.A0K || !C51972G9s.A1Q(r10, A00)) {
                    C51971G9r.A13(r10, r1, A00);
                }
                C51965G9l.A18(r10, A01);
                C56666I6v.A05(r10, G9w.A0H(C51967G9n.A0D(C287205Zk.A08(r9, 200.0f), 12.0f)).Ezh(fillElement));
                r10.ASN();
                i2++;
            } while (i2 < 3);
            if (0fL.A02()) {
                0fL.A00(-1016044981);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 4);
        }
    }
}
