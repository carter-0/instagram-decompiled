package X;

public final class S4W {
    public Object A00;
    public boolean A01 = false;
    public final T9X A02;

    public final void A00(17Z r3, C269504fE r4, C10751RxV rxV) {
        String valueOf;
        this.A01 = true;
        if (r3.A0U()) {
            Object obj = this.A00;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(obj);
            }
            r3.A0H(valueOf);
            return;
        }
        15z r0 = rxV.A01;
        if (r0 != null) {
            r3.A0k(r0);
            rxV.A03.A0A(r3, r4, this.A00);
        }
    }

    public final boolean A01(17Z r3, C269504fE r4, C10751RxV rxV) {
        Object obj = this.A00;
        if (obj == null) {
            return false;
        }
        if (!this.A01 && !rxV.A04) {
            return false;
        }
        if (r3.A0U()) {
            String.valueOf(obj);
            throw new C8144Qhd(r3, "No native support for writing Object Ids");
        }
        rxV.A03.A0A(r3, r4, obj);
        return true;
    }

    public S4W(T9X t9x) {
        this.A02 = t9x;
    }
}
