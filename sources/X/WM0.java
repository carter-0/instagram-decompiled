package X;

public final class WM0 implements C13729Tg0 {
    public final /* synthetic */ C20888X2s A00;
    public final /* synthetic */ C15217UVu A01;
    public final /* synthetic */ C19095WLc A02;

    public WM0(C20888X2s x2s, C15217UVu uVu, C19095WLc wLc) {
        this.A02 = wLc;
        this.A00 = x2s;
        this.A01 = uVu;
    }

    public final void onSuccess(int i) {
        this.A00.APd(new UW2(this.A01, i, true));
    }

    public final void DEm(int i, Throwable th) {
        if (th.getMessage() != null) {
            th.getMessage();
        }
        this.A00.APd(new UW2(this.A01, i, false));
    }
}
