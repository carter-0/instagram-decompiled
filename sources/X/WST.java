package X;

public final class WST implements C232262tL {
    public final JZA A00;
    public final C15035UKo A01;
    public final String A02;
    public final String A03;

    public WST(JZA jza, C15035UKo uKo, String str, String str2) {
        0qQ.A0B(str, 2);
        this.A01 = uKo;
        this.A02 = str;
        this.A00 = jza;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C15035UKo uKo;
        WST wst = (WST) obj;
        C15035UKo uKo2 = this.A01;
        if (wst != null) {
            uKo = wst.A01;
        } else {
            uKo = null;
        }
        if (!0qQ.A0K(uKo2, uKo) || !0qQ.A0K(this.A02, wst.A02) || !0qQ.A0K(this.A00, wst.A00)) {
            return false;
        }
        return true;
    }
}
