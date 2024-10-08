package X;

import java.util.ArrayList;

public final class A9Q {
    public boolean A00;
    public final C18660VwH A01;
    public final C344037rD A02;
    public final C345237tA A03 = new C40187AVb(this);
    public volatile boolean A04;

    public final void A00() {
        C18660VwH vwH = this.A01;
        C344847sW r2 = vwH.A0M;
        if (r2 != null) {
            r2.FIv(this.A03, C344877sZ.FRAME_RENDERED);
        }
        vwH.A02();
        if (this.A00) {
            this.A02.Cjf(22, 0);
        }
        this.A00 = false;
    }

    public final void A01() {
        if (!this.A00) {
            this.A02.Cjf(19, 0);
        }
        this.A00 = true;
        C18660VwH vwH = this.A01;
        vwH.A06(AnonymousClass05K.A00);
        WG9.A01(vwH.A0J, new Object[0], 6);
        this.A04 = false;
        C344847sW r2 = vwH.A0M;
        if (r2 != null) {
            r2.EBc(this.A03, C344877sZ.FRAME_RENDERED);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.AVS, java.lang.Object] */
    public A9Q(C18660VwH vwH, C344037rD r8) {
        this.A01 = vwH;
        this.A02 = r8;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ? obj = new Object();
        AA3 aa3 = new AA3(new C40084AQp(obj), -1);
        obj.A02 = aa3;
        obj.A01 = 1;
        obj.A00 = 1;
        aa3.A01 = 480;
        aa3.A02(aa3.A03, aa3.A00);
        A1C.add(obj);
        A1C.add(new AVT());
        WG9.A00(vwH.A0J, A1C, 26);
        vwH.A08 = AnonymousClass05K.A0C;
        this.A00 = false;
    }
}
