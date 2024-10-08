package X;

public final class WSI implements C232262tL {
    public final C61073JwB A00;
    public final C17464VWr A01;
    public final String A02;

    public WSI(C61073JwB jwB, C17464VWr vWr, String str) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = jwB;
        this.A01 = vWr;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61073JwB jwB;
        WSI wsi = (WSI) obj;
        C61073JwB jwB2 = this.A00;
        if (wsi != null) {
            jwB = wsi.A00;
        } else {
            jwB = null;
        }
        return 0qQ.A0K(jwB2, jwB);
    }
}
