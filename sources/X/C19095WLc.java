package X;

/* renamed from: X.WLc  reason: case insensitive filesystem */
public final class C19095WLc implements C20891X2x {
    public final S1W A00;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.V6t, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void CtB(C20888X2s x2s, Object obj) {
        S1W s1w;
        String str;
        C13729Tg0 wm0;
        V33 v33 = (V33) obj;
        if (v33 instanceof C15213UVq) {
            x2s.APd(new C15222UVz((UVD) v33, new C17188VLs(new Object())));
            return;
        }
        if (v33 instanceof C15216UVt) {
            C15216UVt uVt = (C15216UVt) v33;
            s1w = this.A00;
            str = uVt.A02;
            wm0 = new C19118WLz(x2s, uVt, this);
        } else if (v33 instanceof C15217UVu) {
            C15217UVu uVu = (C15217UVu) v33;
            s1w = this.A00;
            str = uVu.A02;
            wm0 = new WM0(x2s, uVu, this);
        } else {
            return;
        }
        s1w.A00(wm0, str);
    }

    public C19095WLc(S1W s1w) {
        this.A00 = s1w;
    }
}
