package X;

/* renamed from: X.WLz  reason: case insensitive filesystem */
public final class C19118WLz implements C13729Tg0 {
    public final /* synthetic */ C20888X2s A00;
    public final /* synthetic */ C15216UVt A01;
    public final /* synthetic */ C19095WLc A02;

    public C19118WLz(C20888X2s x2s, C15216UVt uVt, C19095WLc wLc) {
        this.A02 = wLc;
        this.A00 = x2s;
        this.A01 = uVt;
    }

    public final void onSuccess(int i) {
        this.A00.APd(new UW0(this.A01, i));
    }

    public final void DEm(int i, Throwable th) {
        if (th.getMessage() != null) {
            th.getMessage();
        }
        this.A00.APd(new UW0(this.A01, i));
    }
}
