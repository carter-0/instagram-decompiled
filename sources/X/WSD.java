package X;

public final class WSD implements C232262tL {
    public final C61083JwL A00;
    public final VX2 A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return ((WSP) this.A00.A00).A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61083JwL jwL;
        WSD wsd = (WSD) obj;
        C61083JwL jwL2 = this.A00;
        if (wsd != null) {
            jwL = wsd.A00;
        } else {
            jwL = null;
        }
        return 0qQ.A0K(jwL2, jwL);
    }

    public WSD(C61083JwL jwL, VX2 vx2) {
        this.A00 = jwL;
        this.A01 = vx2;
    }
}
