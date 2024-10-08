package X;

/* renamed from: X.Ifn  reason: case insensitive filesystem */
public final class C57746Ifn implements Runnable {
    public final /* synthetic */ H10 A00;

    public C57746Ifn(H10 h10) {
        this.A00 = h10;
    }

    public final void run() {
        H10 h10 = this.A00;
        if (h10.isResumed()) {
            DbT.A1J(h10);
        }
    }
}
