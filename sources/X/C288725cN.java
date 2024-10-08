package X;

/* renamed from: X.5cN  reason: invalid class name and case insensitive filesystem */
public final class C288725cN extends C267794cD implements AnonymousClass5Qr, AnonymousClass5VH {
    public static final C288735cO A02 = new Object();
    public boolean A00;
    public C268064ch A01;

    public static final void A00(C288725cN r2) {
        C305476Ie r1;
        C268064ch r0 = r2.A01;
        if (r0 != null && r0.COx() && r2.A08) {
            AnonymousClass5Qr A002 = GQ7.A00(r2, C305476Ie.A02);
            if ((A002 instanceof C305476Ie) && (r1 = (C305476Ie) A002) != null) {
                r1.A0H(r2.A01);
            }
        }
    }

    public final boolean A0G() {
        return false;
    }

    public final Object C9j() {
        return A02;
    }

    public final void DIA(C268064ch r3) {
        C305476Ie r1;
        this.A01 = r3;
        if (!this.A00) {
            return;
        }
        if (r3.COx()) {
            A00(this);
        } else if (this.A08) {
            AnonymousClass5Qr A002 = GQ7.A00(this, C305476Ie.A02);
            if ((A002 instanceof C305476Ie) && (r1 = (C305476Ie) A002) != null) {
                r1.A0H((C268064ch) null);
            }
        }
    }
}
