package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HZl  reason: case insensitive filesystem */
public abstract class C54955HZl {
    public static final void A00(C289525dk r22, C286575Wy r23, C331547Rk r24, 0sP r25, int i) {
        int i2;
        C289525dk r3 = r22;
        C331547Rk r1 = r24;
        AnonymousClass7TF.A1H(r3, r1);
        0sP r5 = r25;
        0qQ.A0B(r5, 2);
        C286575Wy r15 = r23;
        r15.ExV(541792803);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, r3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r15, r1);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r5);
        }
        if ((i2 & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-485383941, "com.instagram.direct.messagethread.compose.MessageMetadata (MessageMetadata.kt:27)");
            }
            r15.ExS(1121469724);
            String str = r1.A05;
            if (C51966G9m.A1X(str)) {
                C285245Qk r8 = Modifier.A00;
                Modifier A0B = C287195Zj.A0B(r3.AAz(C287215Zl.A0A, C56164Htt.A00(C287205Zk.A0D(r8, 120.0f), 120.0f, 0.0f)), 8.0f, 0.0f, 0.0f, 0.0f);
                AnonymousClass5RD A0V = C51968G9o.A0V(r15);
                int A00 = C287425a7.A00(r15);
                C286565Wx r11 = (C286565Wx) r15;
                AnonymousClass5RM A04 = C286565Wx.A04(r11);
                Modifier A01 = C287435a8.A01(r15, A0B);
                C51973G9u.A0y(r15, r11);
                C51971G9r.A12(r15, A0V, A04);
                0sL r10 = C287485aD.A02;
                if (r11.A0K || !C51972G9s.A1Q(r15, A00)) {
                    C51971G9r.A13(r15, r10, A00);
                }
                C51965G9l.A18(r15, A01);
                AnonymousClass6FX r6 = AnonymousClass6FX.A00;
                AnonymousClass2DO A002 = C287975bA.A00(r15, r1.A02.A02, 0);
                long A08 = C51965G9l.A08((long) r1.A00);
                C288165bT.A00(r15, (Modifier) null, A002, 48, 20, A08);
                AnonymousClass5ZZ.A0B(r15, C287195Zj.A0B(r6.AB1(C287215Zl.A04, r8), 5.0f, 0.0f, 0.0f, 0.0f), C51966G9m.A0b(r15), str, 5, 0, 2, 0, 384, 12152, A08);
                r15.ASN();
            }
            C51965G9l.A1X(r15, false);
            Modifier AAz = r3.AAz(C287215Zl.A07, Modifier.A00);
            C54956HZm.A00(r15, AAz, r1, r5, C51968G9o.A0Y(r15).AwL() * 31.0f, (i2 & 112) | ((i2 << 3) & 7168));
            if (0fL.A02()) {
                0fL.A00(1474176613);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r3, r1, r5, i3, 38);
        }
    }
}
