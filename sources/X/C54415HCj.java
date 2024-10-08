package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;

/* renamed from: X.HCj  reason: case insensitive filesystem */
public final class C54415HCj extends 17P implements JSG {
    public final MidCardClipsClickedAction AYD() {
        return (MidCardClipsClickedAction) A0M(-1422950858, J08.A00);
    }

    public final JSD BYM() {
        return (JSD) A05(677356396, C54424HCs.class);
    }

    public final JSH BYQ() {
        return (JSH) A05(-34328026, C54426HCv.class);
    }

    public final C53448Gog F6G() {
        C53457Gop gop;
        MidCardClipsClickedAction AYD = AYD();
        JSD BYM = BYM();
        C53459Gor gor = null;
        if (BYM != null) {
            gop = BYM.F76();
        } else {
            gop = null;
        }
        JSH BYQ = BYQ();
        if (BYQ != null) {
            gor = BYQ.F7A();
        }
        return new C53448Gog(AYD, gop, gor);
    }
}
