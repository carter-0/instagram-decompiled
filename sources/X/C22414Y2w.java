package X;

/* renamed from: X.Y2w  reason: case insensitive filesystem */
public final class C22414Y2w implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C22361Y0p A01;

    public C22414Y2w(C22361Y0p y0p, int i) {
        this.A01 = y0p;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass3CG r1;
        C22361Y0p y0p = this.A01;
        int i = this.A00;
        int i2 = y0p.A00 + 1;
        y0p.A00 = i2;
        if (i2 >= i && !y0p.A02 && (r1 = y0p.A01) != null) {
            y0p.A02 = true;
            y0p.A04.A04.remove(r1);
        }
    }
}
