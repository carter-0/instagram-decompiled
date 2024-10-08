package X;

public final class WX9 implements AnonymousClass4JX {
    public final /* synthetic */ C15695Uh1 A00;

    public final void Dl3(1Xj r1, GQ0 gq0, AnonymousClass4EA r3, AnonymousClass3W1 r4, int i) {
    }

    public WX9(C15695Uh1 uh1) {
        this.A00 = uh1;
    }

    public final JOE BQ4() {
        return new WX4(this);
    }

    public final void D9y(1Xj r8, GQ0 gq0, AnonymousClass4EA r10, AnonymousClass3W1 r11, int i) {
        C15695Uh1 uh1 = this.A00;
        Boolean bool = uh1.A09;
        if (bool == null) {
            bool = AnonymousClass7TE.A0u();
            uh1.A09 = bool;
        }
        if (bool.booleanValue()) {
            boolean A0N = 0q2.A00(uh1.A0G).A0N(uh1.A04);
            if (!A0N) {
                C15695Uh1.A04(uh1, C243363Yl.LIKED, gq0);
                C15695Uh1.A03(uh1);
            }
            r11.A0J((GQ0) null, A0N, true, true, false);
        }
    }
}
