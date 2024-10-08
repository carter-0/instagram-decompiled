package X;

public abstract class HZM {
    public static final void A00(C286575Wy r4, int i, int i2) {
        int i3;
        r4.ExV(-1274696255);
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r4, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-262386215, "com.instagram.creator.agent.settings.improveai.Layout (ImproveYourAiFragment.kt:46)");
            }
            boolean A1N = C51973G9u.A1N(r4, -571511251, i3);
            Object ECw = r4.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new GLV(i, 12);
                r4.FLL(ECw);
            }
            C51965G9l.A1X(r4, false);
            C56260HvU.A01(r4, "ig_creator_ai_improve_ai", (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(466611458);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            C59347JFz.A00(ASQ, i, i2, 7);
        }
    }
}
