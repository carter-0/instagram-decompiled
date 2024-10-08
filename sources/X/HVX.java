package X;

import androidx.compose.ui.Modifier;

public abstract class HVX {
    public static final void A00(C286575Wy r35, Modifier modifier, String str, int i, int i2, boolean z) {
        int i3;
        C286025Tq A02;
        Modifier modifier2 = modifier;
        C286575Wy r1 = r35;
        r1.ExV(2072622918);
        int i4 = i;
        String str2 = str;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r1, str2) | i;
        } else {
            i3 = i4;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0Z(r1, z2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r1, modifier2);
        }
        if ((i3 & 147) != 146 || !r1.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(949870647, "com.instagram.barcelona.postmedia.ui.AuthorAttribution (AuthorAttribution.kt:21)");
            }
            r1.ExS(-957993752);
            if (z) {
                if (C51967G9n.A1U(r1, 1948635144)) {
                    0fL.A01(-302526017, "com.instagram.barcelona.common.ui.text.prefixWithIgIcon (IgIconPrefix.kt:16)");
                }
                C303876Bd A0b = C51969G9p.A0b();
                String A14 = C51968G9o.A14(r1, str2, 2131953725);
                A0b.A09(A14);
                C303866Bc r2 = C303866Bc.A01;
                C303866Bc.A02(C51968G9o.A0I(r1), A0b, new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65535, 0, 0, 0), A14);
                A02 = A0b.A02();
                if (0fL.A02()) {
                    0fL.A00(-2006886278);
                }
                C51965G9l.A1X(r1, false);
            } else {
                A02 = C51972G9s.A0L(str2).A02();
            }
            C51965G9l.A1X(r1, false);
            float F06 = C51968G9o.A0Y(r1).F06(3.0f);
            long A0I = C51966G9m.A0I(r1);
            AnonymousClass5Z4 A0f = C51966G9m.A0f(r1);
            C291805hu r22 = C291805hu.A03;
            AnonymousClass5ZZ.A00(r1, modifier2, A02, AnonymousClass5Z4.A00(new C291805hu(F06, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5aQ.A00(r1).A14 & 63)], AnonymousClass5RW.A03(AnonymousClass5aQ.A00(r1).A14), AnonymousClass5RW.A02(AnonymousClass5aQ.A00(r1).A14), AnonymousClass5RW.A01(AnonymousClass5aQ.A00(r1).A14), 0.3f), C289325dP.A00(0.0f, 0.0f)), (C289645dx) null, A0f, (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16769023, 0, 0, 0, 0), 0, 1, 2, (i3 >> 3) & 112, 54, 21496, A0I);
            if (0fL.A02()) {
                0fL.A00(2131375729);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7Z(modifier2, str2, i4, i2, z);
        }
    }
}
