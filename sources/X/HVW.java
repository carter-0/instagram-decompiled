package X;

import androidx.compose.ui.Modifier;

public abstract class HVW {
    public static final void A00(C286575Wy r36, Modifier modifier, String str, int i, int i2) {
        int i3;
        String A00;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r0 = r36;
        r0.ExV(-1966536150);
        int i4 = i2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r0, str2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r0, modifier2);
        }
        if ((i3 & 91) != 18 || !r0.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1940302753, "com.instagram.barcelona.permalink.ui.component.PermalinkReplyVisibilityMessage (PermalinkReplyVisibilityMessage.kt:30)");
            }
            Object A16 = C51966G9m.A16(r0);
            Object A0r = C51965G9l.A0r(r0);
            r0.ExS(-752804829);
            if (str2.length() == 0) {
                A00 = "";
            } else {
                A00 = C288035bG.A00(r0, 2131964884);
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            String A14 = C51968G9o.A14(r0, A00, 2131953670);
            boolean A1Z = G9t.A1Z(r0, A14, A00, -752798024) | AnonymousClass7TF.A1S(i3 & 14, 4);
            Object ECw = r0.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                C303866Bc r1 = C303866Bc.A01;
                AnonymousClass5ZD r16 = AnonymousClass5ZD.A01;
                long j = AnonymousClass5RW.A08;
                0qQ.A0B(A00, 1);
                C303876Bd A0b = C51969G9p.A0b();
                String A002 = AnonymousClass000.A00(423);
                int A0G = C51971G9r.A0G(A14, A00);
                if (A0G >= 0) {
                    int A05 = C51966G9m.A05(A00, A0G);
                    A0b.A09(A14);
                    A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, r16, (C291795ht) null, 65530, j, 0, 0), A0G, A05);
                    ECw = C51967G9n.A0K(A0b, "learn_more_span", str2, A0G, A05);
                    r0.FLL(ECw);
                } else {
                    throw AnonymousClass7TE.A0z(A002);
                }
            }
            C286025Tq r12 = (C286025Tq) ECw;
            C286565Wx.A0L(A0H, false);
            AnonymousClass62O A04 = AnonymousClass62Q.A04("learn_more_span");
            Modifier A0B = C287195Zj.A0B(modifier2, 0.0f, 32.0f, 0.0f, 20.0f);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
            long A01 = AnonymousClass5Z7.A01(21);
            C286575Wy r26 = r0;
            C286025Tq r28 = r12;
            AnonymousClass6E2.A01(r26, A0B, r28, A0c.A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, AnonymousClass5ZD.A05, 3, 0, 6127608, C51966G9m.A0M(r0), AnonymousClass5Z7.A01(15), 0, A01)), new C74189PqV((Object) r12, A0r, A16, str2, 23), A04, 48, 3048, 0);
            if (0fL.A02()) {
                0fL.A00(-686587389);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(modifier2, str2, i4, i, 4);
        }
    }
}
