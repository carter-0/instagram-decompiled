package X;

/* renamed from: X.Q4c  reason: case insensitive filesystem */
public final class C7326Q4c implements Runnable {
    public final /* synthetic */ AnonymousClass60p A00;

    public C7326Q4c(AnonymousClass60p r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass60p r3 = this.A00;
        synchronized (r3) {
            r3.A05();
            Integer num = AnonymousClass05K.A01;
            AnonymousClass60p.A02(r3, "TIMEOUT");
            r3.A05.execute(new Q0N(new Q0M(num), r3));
        }
    }
}
