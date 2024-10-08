package X;

/* renamed from: X.9TZ  reason: invalid class name */
public final class AnonymousClass9TZ implements Runnable {
    public final /* synthetic */ C365568nK A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public AnonymousClass9TZ(C365568nK r1, AnonymousClass9GD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C365568nK r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.D59(this.A01);
        }
    }
}
