package X;

/* renamed from: X.FrM  reason: case insensitive filesystem */
public final class C51267FrM implements Runnable {
    public final /* synthetic */ C47489E4t A00;

    public C51267FrM(C47489E4t e4t) {
        this.A00 = e4t;
    }

    public final void run() {
        C47489E4t e4t = this.A00;
        if (e4t.isAdded()) {
            DbT.A1I(e4t);
        }
    }
}
