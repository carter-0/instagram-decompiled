package X;

public final class WS2 implements C232262tL {
    public final C61079JwH A00;
    public final String A01;

    public WS2(C61079JwH jwH, String str) {
        0qQ.A0B(str, 2);
        this.A00 = jwH;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61079JwH jwH;
        WS2 ws2 = (WS2) obj;
        C61079JwH jwH2 = this.A00;
        if (ws2 != null) {
            jwH = ws2.A00;
        } else {
            jwH = null;
        }
        return 0qQ.A0K(jwH2, jwH);
    }
}
