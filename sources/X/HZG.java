package X;

import androidx.compose.ui.Modifier;
import java.util.ArrayList;

public abstract class HZG {
    public static final void A00(C286575Wy r17, String str, String str2, 0sG r20, AnonymousClass62P r21, int i, int i2) {
        int i3;
        C286575Wy r14 = r17;
        r14.ExV(-1909075106);
        int i4 = i2;
        String str3 = str;
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r14, str3) | i2;
        } else {
            i3 = i4;
        }
        AnonymousClass62P<N4G> r2 = r21;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r14, r2);
        }
        int i5 = i;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A07(r14, i5);
        }
        String str4 = str2;
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0R(r14, str4);
        }
        0sG r3 = r20;
        if ((i4 & 24576) == 0) {
            i3 |= G9t.A0I(r14, r3);
        }
        if ((i3 & 9363) != 9362 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-755483160, "com.instagram.creator.agent.settings.facts.fragment.InformationScreen (InformationFragment.kt:90)");
            }
            boolean A1O = C51973G9u.A1O(r14, -2094035796, i3);
            Object ECw = r14.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = C58706IwF.A00(r14, r2, 3);
            }
            C286565Wx A0G = C51965G9l.A0G(r14);
            GZF A01 = C52610GZj.A01(r14, (C62320sa) ECw, i5, (i3 >> 6) & 14, 2);
            Object ECw2 = r14.ECw();
            Object obj = AnonymousClass5XT.A00;
            C262224Cq r6 = ((AnonymousClass6FV) C51974G9v.A0Y(r14, ECw2, obj)).A00;
            Object A0m = C51967G9n.A0m(r14, -2094033240);
            if (A0m == obj) {
                ArrayList A0r = AnonymousClass7TG.A0r(r2);
                for (N4G n4g : r2) {
                    int i6 = n4g.A00;
                    A0r.add(new C53356Gmg(Integer.valueOf(i6), (Integer) null, AnonymousClass05K.A00, (String) null, (String) null));
                }
                A0m = AnonymousClass62Q.A00(A0r);
                r14.FLL(A0m);
            }
            AnonymousClass62P r5 = (AnonymousClass62P) A0m;
            C286565Wx.A0L(A0G, false);
            int A03 = A01.A03();
            boolean A1X = G9t.A1X(r14, r6, A01, -2094026825);
            Object ECw3 = r14.ECw();
            if (A1X || ECw3 == obj) {
                ECw3 = J6W.A00(r14, r5, A01, r6, 33);
            }
            C56262HvW.A00(r14, (Modifier) null, (C54610HKt) null, C51965G9l.A0z(A0G, ECw3), r5, A03, 48, 56, 0);
            C56618I4t.A00(r14);
            C52617GZq.A01((C304836Fk) null, A01, (JNT) null, r14, C287215Zl.A05, C51968G9o.A0O(), (0sP) null, AnonymousClass5PI.A01(r14, new C59428JJd(r2, r3, str3, str4, 1), -701360516), 102236208, 7868);
            if (0fL.A02()) {
                0fL.A00(1045365492);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(r3, r2, str3, str4, i4, i5, 7);
        }
    }
}
