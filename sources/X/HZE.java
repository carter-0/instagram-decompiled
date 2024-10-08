package X;

public abstract class HZE {
    public static final void A00(C286575Wy r7, C59721JVf jVf, C52369GPq gPq, 0sL r10, int i) {
        int i2;
        r7.ExV(-226458617);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, jVf) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r10);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r7, gPq);
        }
        if ((i2 & 147) != 146 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1826916552, "com.instagram.creator.agent.settings.content.sources.fragment.Layout (CreatorAISettingsContentFragment.kt:88)");
            }
            int ordinal = ((C54617HLa) jVf.A01).ordinal();
            if (ordinal == 0) {
                r7.ExS(-981888471);
                GQD.A01(r7, C51967G9n.A0D(C51969G9p.A0U(), 24.0f));
            } else if (ordinal == 1) {
                r7.ExS(-981752939);
                C60340gF r2 = C60340gF.A00;
                boolean A1Z = C51967G9n.A1Z(r7, gPq, -1417142737);
                Object ECw = r7.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = G9w.A0n(r7, gPq, 16);
                }
                C286565Wx A0E = C51975G9x.A0E(r7, ECw, r2);
                boolean A1S = C51973G9u.A1S(r7, jVf, gPq, -1417140049) | C51972G9s.A1L(i2);
                Object ECw2 = r7.ECw();
                if (A1S || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = J6W.A00(r7, gPq, r10, jVf, 32);
                }
                AnonymousClass6HY.A08(r7, C51965G9l.A0z(A0E, ECw2));
            } else if (ordinal == 2) {
                r7.ExS(-980829542);
            } else {
                throw C51973G9u.A0n(r7, -1417147824);
            }
            if (C51970G9q.A1a(r7, false)) {
                0fL.A00(1296878274);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(jVf, gPq, r10, i, 28);
        }
    }
}
