package X;

/* renamed from: X.5mq  reason: invalid class name and case insensitive filesystem */
public final class C294675mq implements Runnable {
    public final /* synthetic */ C294665mp A00;

    public C294675mq(C294665mp r1) {
        this.A00 = r1;
    }

    public final void run() {
        C294665mp r1 = this.A00;
        if (!r1.A00) {
            r1.A00 = true;
            r1.A02.postDelayed(new C294715mu(r1), r1.A01);
        }
    }
}
