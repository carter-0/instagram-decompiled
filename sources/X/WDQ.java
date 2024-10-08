package X;

public final class WDQ implements C20936X5e {
    public final /* synthetic */ WDU A00;

    public WDQ(WDU wdu) {
        this.A00 = wdu;
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        if (wDk instanceof C14733U5v) {
            wDk.A00().A0C(false);
        }
        C20936X5e x5e = this.A00.A07;
        if (x5e != null) {
            x5e.D4F(wDk, z);
        }
    }

    public final boolean DVR(C18932WDk wDk) {
        WDU wdu = this.A00;
        if (wDk == wdu.A06) {
            return false;
        }
        ((C14733U5v) wDk).getItem().getItemId();
        C20936X5e x5e = wdu.A07;
        if (x5e != null) {
            return x5e.DVR(wDk);
        }
        return false;
    }
}
