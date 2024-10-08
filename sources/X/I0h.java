package X;

import java.util.ArrayList;
import java.util.List;

public final class I0h {
    public C286025Tq A00;
    public final C284945Oz A01 = C51970G9q.A0S((Object) null);
    public final AnonymousClass6HD A02;
    public final C286025Tq A03;

    public I0h(C286025Tq r9) {
        AnonymousClass5ZB r2;
        this.A03 = r9;
        C303876Bd A0b = C51969G9p.A0b();
        A0b.A05(r9);
        List A022 = r9.A02(r9.length());
        int size = A022.size();
        for (int i = 0; i < size; i++) {
            C3022062b r3 = (C3022062b) A022.get(i);
            C56545I0z A002 = ((C305016Gc) r3.A02).A00();
            if (!(A002 == null || (r2 = A002.A03) == null)) {
                A0b.A06(r2, r3.A01, r3.A00);
            }
        }
        this.A00 = A0b.A02();
        this.A02 = new AnonymousClass6HD();
    }

    public static final void A00(I0h i0h, C286575Wy r6, 0sP r7, Object[] objArr, int i) {
        int i2;
        r6.ExV(-2083052099);
        if ((i & 48) == 0) {
            i2 = G9t.A0F(r6, r7) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r6, i0h);
        }
        r6.ExC(-416717687, Integer.valueOf(r4));
        for (Object AGw : objArr) {
            int i3 = 0;
            if (r6.AGw(AGw)) {
                i3 = 4;
            }
            i2 |= i3;
        }
        C51965G9l.A1V(r6);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if ((i2 & 147) != 146 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2125521740, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:237)");
            }
            ArrayList A0v = DbS.A0v(2);
            A0v.add(r7);
            0tw.A00(objArr, A0v);
            Object[] array = A0v.toArray(new Object[A0v.size()]);
            boolean A1L = C51972G9s.A1L(i2) | r6.AGw(i0h);
            Object ECw = r6.ECw();
            if (A1L || ECw == AnonymousClass5XT.A00) {
                ECw = J6U.A00(r6, r7, i0h, 39);
            }
            C286645Xf.A06(r6, (0sP) ECw, array);
            if (0fL.A02()) {
                0fL.A00(1112634649);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(i0h, r7, objArr, i, 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.Ixb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.Ixb} */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        if (r11 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C286575Wy r27, int r28) {
        /*
            r26 = this;
            r0 = 1154651354(0x44d294da, float:1684.6516)
            r9 = r27
            r9.ExV(r0)
            r8 = r28
            r0 = r28 & 6
            r1 = 2
            r10 = r26
            if (r0 != 0) goto L_0x01e8
            int r18 = X.C41848B3p.A01(r9, r10)
            r18 = r18 | r28
        L_0x0017:
            r0 = r18 & 3
            if (r0 != r1) goto L_0x002f
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x002f
            r9.Evl()
        L_0x0024:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x002e
            r0 = 7
            X.JGC.A01(r1, r10, r8, r0)
        L_0x002e:
            return
        L_0x002f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x003d
            r1 = 1850622673(0x6e4e42d1, float:1.5958672E28)
            java.lang.String r0 = "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:152)"
            X.0fL.A01(r1, r0)
        L_0x003d:
            X.4bM r0 = X.AnonymousClass5YA.A0C
            java.lang.Object r7 = r9.AJO(r0)
            X.5Tq r1 = r10.A00
            int r0 = r1.length()
            r6 = 0
            java.util.List r17 = r1.A02(r0)
            int r16 = r17.size()
            r5 = 0
        L_0x0053:
            r0 = r16
            if (r5 >= r0) goto L_0x01da
            r0 = r17
            java.lang.Object r4 = r0.get(r5)
            X.62b r4 = (X.C3022062b) r4
            r1 = 35
            X.Ivr r0 = new X.Ivr
            r0.<init>(r10, r1)
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00bc
            X.5Oz r0 = r10.A01
            java.lang.Object r13 = r0.getValue()
            X.62f r13 = (X.C3022462f) r13
            if (r13 == 0) goto L_0x00bc
            int r1 = r4.A01
            int r12 = r4.A00
            X.60e r11 = r13.A07(r1, r12)
            X.5VN r3 = r13.A05(r1)
            int r0 = r12 + -1
            X.5VN r2 = r13.A05(r0)
            X.62d r0 = r13.A03
            int r1 = r0.A06(r1)
            int r0 = r0.A06(r12)
            if (r1 != r0) goto L_0x01d7
            float r1 = r2.A01
            float r0 = r3.A01
            float r1 = java.lang.Math.min(r1, r0)
        L_0x00a0:
            float r0 = r3.A03
            long r0 = X.C289325dP.A00(r1, r0)
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r0 = r0 ^ r2
            r11.A00(r0)
            X.IG2 r1 = new X.IG2
            r1.<init>(r11)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r11 = X.AnonymousClass6FZ.A01(r0, r1)
            if (r11 != 0) goto L_0x00be
        L_0x00bc:
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
        L_0x00be:
            java.lang.Object r0 = r9.ECw()
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            java.lang.Object r2 = X.C51972G9s.A0l(r9, r0, r12)
            X.5aT r2 = (X.C287605aT) r2
            int r3 = r4.A01
            int r0 = r4.A00
            X.IFY r1 = new X.IFY
            r1.<init>(r10, r3, r0)
            X.IGZ r0 = new X.IGZ
            r0.<init>(r1)
            androidx.compose.ui.Modifier r0 = r11.Ezh(r0)
            r13 = 0
            r15 = 1
            androidx.compose.ui.Modifier r3 = X.C288265bd.A00(r2, r0, r15)
            X.5Wj r1 = X.C286415Wg.A01
            androidx.compose.ui.input.pointer.PointerHoverIconModifierElement r0 = new androidx.compose.ui.input.pointer.PointerHoverIconModifierElement
            r0.<init>(r1)
            androidx.compose.ui.Modifier r3 = r3.Ezh(r0)
            boolean r1 = r9.AGw(r10)
            boolean r0 = r9.AGu(r4)
            boolean r1 = X.C51968G9o.A1T(r9, r7, r1, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x0101
            if (r0 != r12) goto L_0x0106
        L_0x0101:
            r0 = 3
            X.Iw5 r0 = X.C58696Iw5.A00(r9, r4, r7, r10, r0)
        L_0x0106:
            X.0sa r0 = (X.C62320sa) r0
            androidx.compose.ui.Modifier r0 = X.C287635aW.A03(r13, r2, r3, r0)
            X.C287675aa.A02(r9, r0, r6)
            r1 = 6
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x011e
            r3 = 1505426751(0x59bafd3f, float:6.5790991E15)
            java.lang.String r0 = "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)"
            X.0fL.A01(r3, r0)
        L_0x011e:
            java.lang.Object r0 = r9.ECw()
            java.lang.Object r11 = X.C51974G9v.A0Z(r9, r0, r12, r6)
            X.5Oz r11 = (X.C284945Oz) r11
            r3 = 4
            java.lang.Object r0 = r9.ECw()
            if (r0 != r12) goto L_0x0137
            X.MH2 r0 = new X.MH2
            r0.<init>((java.lang.Object) r2, (java.lang.Object) r11, (X.AnonymousClass4D7) r13, (int) r3)
            r9.FLL(r0)
        L_0x0137:
            X.0sL r0 = (X.0sL) r0
            X.C286645Xf.A04(r9, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0148
            r0 = 67574477(0x4071acd, float:1.588148E-36)
            X.0fL.A00(r0)
        L_0x0148:
            X.5Oz r14 = X.C54737HQu.A00(r2, r9, r1)
            X.5Oz r13 = X.C54738HQv.A00(r2, r9, r1)
            java.lang.Object r19 = r11.getValue()
            java.lang.Object r20 = r14.getValue()
            java.lang.Object r21 = r13.getValue()
            java.lang.Object r0 = r4.A02
            X.6Gc r0 = (X.C305016Gc) r0
            X.I0z r0 = r0.A00()
            if (r0 == 0) goto L_0x01d5
            X.5ZB r3 = r0.A03
        L_0x0168:
            java.lang.Object r0 = r4.A02
            X.6Gc r0 = (X.C305016Gc) r0
            X.I0z r0 = r0.A00()
            if (r0 == 0) goto L_0x01d3
            X.5ZB r2 = r0.A00
        L_0x0174:
            java.lang.Object r0 = r4.A02
            X.6Gc r0 = (X.C305016Gc) r0
            X.I0z r0 = r0.A00()
            if (r0 == 0) goto L_0x01d1
            X.5ZB r1 = r0.A01
        L_0x0180:
            java.lang.Object r0 = r4.A02
            X.6Gc r0 = (X.C305016Gc) r0
            X.I0z r0 = r0.A00()
            if (r0 == 0) goto L_0x01cf
            X.5ZB r0 = r0.A02
        L_0x018c:
            r22 = r3
            r23 = r2
            r24 = r1
            r25 = r0
            java.lang.Object[] r2 = new java.lang.Object[]{r19, r20, r21, r22, r23, r24, r25}
            boolean r0 = r9.AGw(r10)
            boolean r0 = X.C51972G9s.A1X(r9, r4, r14, r0)
            boolean r0 = X.C51972G9s.A1X(r9, r11, r13, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x01ac
            if (r1 != r12) goto L_0x01c2
        L_0x01ac:
            X.Ixb r1 = new X.Ixb
            r20 = r15
            r21 = r4
            r22 = r11
            r23 = r13
            r24 = r14
            r25 = r10
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r9.FLL(r1)
        L_0x01c2:
            X.0sP r1 = (X.0sP) r1
            int r0 = r18 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            A00(r10, r9, r1, r2, r0)
            int r5 = r5 + 1
            goto L_0x0053
        L_0x01cf:
            r0 = 0
            goto L_0x018c
        L_0x01d1:
            r1 = 0
            goto L_0x0180
        L_0x01d3:
            r2 = 0
            goto L_0x0174
        L_0x01d5:
            r3 = 0
            goto L_0x0168
        L_0x01d7:
            r1 = 0
            goto L_0x00a0
        L_0x01da:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0024
            r0 = -1747466861(0xffffffff97d7c593, float:-1.3943924E-24)
            X.0fL.A00(r0)
            goto L_0x0024
        L_0x01e8:
            r18 = r8
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I0h.A01(X.5Wy, int):void");
    }
}
