package X;

/* renamed from: X.HUb  reason: case insensitive filesystem */
public abstract class C54820HUb {
    public static final void A00(C286575Wy r11, C62320sa r12, C62320sa r13, int i, long j) {
        int i2;
        C62320sa r6 = r12;
        C62320sa r122 = r13;
        int A02 = DbW.A02(1, r6, r13);
        r11.ExV(-1641978535);
        int i3 = i;
        long j2 = j;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(r11.AGt(j2) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r6);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r11, r122);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1016893729, "com.instagram.barcelona.compose.common.RepeatWhileStartedEvery (RepeatWhileStartedEvery.kt:13)");
            }
            Object AJO = r11.AJO(AnonymousClass5YV.A00);
            Long valueOf = Long.valueOf(j2);
            boolean A1Z = C51967G9n.A1Z(r11, AJO, 53450900) | AnonymousClass7TF.A1S(i2 & 14, 4) | C51972G9s.A1L(i2);
            Object ECw = r11.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new MGF(AJO, r6, (AnonymousClass4D7) null, A02, j2);
                r11.FLL(ECw);
            }
            C286565Wx A0G = C51965G9l.A0G(r11);
            C286645Xf.A04(r11, valueOf, (0sL) ECw);
            C60340gF r2 = C60340gF.A00;
            r11.ExS(53456690);
            boolean A1N = C51972G9s.A1N(i2);
            Object ECw2 = r11.ECw();
            if (A1N || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C59099J6h.A01(r11, r122, 26);
            }
            C286565Wx.A0I(A0G);
            C286645Xf.A03(r11, r2, (0sP) ECw2);
            if (0fL.A02()) {
                0fL.A00(1879894286);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59132J7o(j2, r6, r122, i3, 0);
        }
    }
}
