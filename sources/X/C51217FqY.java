package X;

/* renamed from: X.FqY  reason: case insensitive filesystem */
public final class C51217FqY implements Runnable {
    public final /* synthetic */ EDD A00;

    public C51217FqY(EDD edd) {
        this.A00 = edd;
    }

    public final void run() {
        C47483E4i e4i = this.A00.A09;
        if (e4i.A06()) {
            e4i.A0G.setEnabled(true);
            e4i.A0E.setEnabled(true);
            e4i.A0L = false;
        }
    }
}
