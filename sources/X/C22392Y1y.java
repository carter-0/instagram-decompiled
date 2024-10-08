package X;

/* renamed from: X.Y1y  reason: case insensitive filesystem */
public final class C22392Y1y implements Runnable {
    public final /* synthetic */ C22361Y0p A00;

    public C22392Y1y(C22361Y0p y0p) {
        this.A00 = y0p;
    }

    public final void run() {
        AnonymousClass3CG r1;
        C22361Y0p y0p = this.A00;
        if (!y0p.A02 && (r1 = y0p.A01) != null) {
            y0p.A02 = true;
            y0p.A04.A04.remove(r1);
        }
    }
}
