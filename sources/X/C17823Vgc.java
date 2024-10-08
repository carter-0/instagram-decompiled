package X;

/* renamed from: X.Vgc  reason: case insensitive filesystem */
public final class C17823Vgc {
    public long A00 = Long.MIN_VALUE;
    public C18472VsO A01 = null;
    public final /* synthetic */ AnonymousClass507 A02;

    public C17823Vgc(AnonymousClass507 r3) {
        this.A02 = r3;
    }

    public final void A00() {
        C18472VsO vsO = this.A01;
        if (vsO != null) {
            synchronized (vsO) {
                Object obj = vsO.A00;
                if (obj != null) {
                    vsO.A03.A02.A04.A00(obj);
                    vsO.A00 = null;
                }
            }
            this.A01 = null;
        }
    }
}
