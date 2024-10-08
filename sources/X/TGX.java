package X;

public final class TGX implements Runnable {
    public final /* synthetic */ C13115TLz A00;
    public final /* synthetic */ 2R9 A01;

    public TGX(C13115TLz tLz, 2R9 r2) {
        this.A00 = tLz;
        this.A01 = r2;
    }

    public final void run() {
        C13115TLz tLz = this.A00;
        2R9 r3 = this.A01;
        if (r3.A04 <= ((long) tLz.A06)) {
            tLz.A02.remove(r3);
            tLz.A01 -= r3.A03;
            return;
        }
        tLz.A03.remove(r3);
        tLz.A00 -= r3.A03;
    }
}
