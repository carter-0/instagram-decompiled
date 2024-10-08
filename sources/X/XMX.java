package X;

public final class XMX extends C272194kI {
    public final C263054Ha A00;
    public final boolean A01;

    public final void A04() {
        if (this.A01) {
            C263054Ha.A01(false);
        } else {
            C263054Ha.A00(false);
        }
    }

    public final boolean A05() {
        if (this.A01) {
            C263054Ha.A01(true);
            return true;
        }
        C263054Ha.A00(true);
        return true;
    }

    public XMX(C263054Ha r1, int i, boolean z) {
        super(i);
        this.A00 = r1;
        this.A01 = z;
    }
}
