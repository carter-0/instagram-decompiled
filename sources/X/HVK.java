package X;

public abstract class HVK {
    public static final void A00(C286575Wy r4, 0sP r5, int i) {
        int i2;
        0qQ.A0B(r5, 0);
        r4.ExV(-1433437924);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r5) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-707955486, "com.instagram.barcelona.interactive.OnEveryFrameWithDeltaSeconds (RepeatWithFrameDeltaSeconds.kt:10)");
            }
            C60340gF r3 = C60340gF.A00;
            boolean A1N = C51973G9u.A1N(r4, -1174302198, i2);
            Object ECw = r4.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new MGA(r5, (AnonymousClass4D7) null, 11);
                r4.FLL(ECw);
            }
            C51972G9s.A0z(r4, ECw, r3);
            if (0fL.A02()) {
                0fL.A00(1408915072);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r5, i, 22);
        }
    }
}
