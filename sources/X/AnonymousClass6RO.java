package X;

/* renamed from: X.6RO  reason: invalid class name */
public final class AnonymousClass6RO implements Runnable {
    public final /* synthetic */ AnonymousClass6RK A00;
    public final /* synthetic */ AnonymousClass6RK A01;

    public AnonymousClass6RO(AnonymousClass6RK r1, AnonymousClass6RK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        this.A00.A01.run();
        AnonymousClass6RK r0 = this.A01;
        if (r0 != null) {
            r0.A01.run();
        }
    }
}
