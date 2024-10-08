package X;

public final class WS4 implements C232262tL {
    public final C61076JwE A00;
    public final String A01;

    public WS4(C61076JwE jwE, String str) {
        0qQ.A0B(str, 2);
        this.A00 = jwE;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61076JwE jwE;
        WS4 ws4 = (WS4) obj;
        C61076JwE jwE2 = this.A00;
        if (ws4 != null) {
            jwE = ws4.A00;
        } else {
            jwE = null;
        }
        return 0qQ.A0K(jwE2, jwE);
    }
}
