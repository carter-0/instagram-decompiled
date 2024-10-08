package X;

/* renamed from: X.Hyu  reason: case insensitive filesystem */
public abstract class C56462Hyu {
    public static final C267314bM A00 = new C267304bL(C58532ItR.A00);

    public static final void A00(C286575Wy r7, 0sL r8, int i) {
        int i2;
        0qQ.A0B(r8, 0);
        r7.ExV(-314605014);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, r8) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1498347061, "com.instagram.wonderwall.ui.compose.components.video.ProvideWallMediaPlaybackManager (ProvideWallMediaPlaybackManager.kt:21)");
            }
            Object A0m = C51967G9n.A0m(r7, -1574571925);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = new C55869Hoq();
                r7.FLL(A0m);
            }
            C286565Wx A0H = C51965G9l.A0H(r7, false);
            C60340gF r3 = C60340gF.A00;
            Object A0m2 = C51967G9n.A0m(r7, -1574569807);
            if (A0m2 == obj) {
                A0m2 = new C58106ImS(A0m, (AnonymousClass4D7) null, 4);
                r7.FLL(A0m2);
            }
            C51968G9o.A1E(r7, A0H, A0m2, r3);
            C286715Xm.A00(r7, A00.A02(A0m), r8, ((i2 << 3) & 112) | 8);
            if (0fL.A02()) {
                0fL.A00(1590070743);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, r8, i, 11);
        }
    }
}
