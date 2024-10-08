package X;

/* renamed from: X.FrN  reason: case insensitive filesystem */
public final class C51268FrN implements Runnable {
    public final /* synthetic */ E4Q A00;

    public C51268FrN(E4Q e4q) {
        this.A00 = e4q;
    }

    public final void run() {
        E4Q e4q = this.A00;
        if (!e4q.isVisible() || e4q.A09) {
            e4q.A0A = true;
            return;
        }
        0hq r0 = e4q.mFragmentManager;
        if (r0 != null) {
            r0.A0c();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
