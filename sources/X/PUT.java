package X;

public final class PUT implements Runnable {
    public final /* synthetic */ C71068Oan A00;

    public PUT(C71068Oan oan) {
        this.A00 = oan;
    }

    public final void run() {
        C71068Oan oan = this.A00;
        Runnable runnable = oan.A05;
        if (runnable != null) {
            C71068Oan.A01(oan, runnable, "Timeout");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
