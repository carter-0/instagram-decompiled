package X;

import com.facebook.react.uimanager.UIManagerHelper;

public final class WJf implements C20879X2g {
    public int A00;
    public int A01;
    public final int A02;
    public final C20877X2e A03;
    public final U66 A04;

    public WJf(U66 u66) {
        this.A04 = u66;
        Q6H A022 = UIManagerHelper.A02(u66);
        this.A03 = C13990Tnq.A0K(u66, A022);
        this.A02 = UIManagerHelper.A00(A022);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.W0S, X.UTF] */
    public final void Dip(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        if (this.A01 != min || this.A00 != max) {
            C20877X2e x2e = this.A03;
            ? w0s = new W0S(this.A02, this.A04.getId());
            w0s.A01 = min;
            w0s.A00 = max;
            x2e.APe(w0s);
            this.A01 = min;
            this.A00 = max;
        }
    }
}
