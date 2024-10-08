package X;

/* renamed from: X.96u  reason: invalid class name and case insensitive filesystem */
public final class C3737596u implements Runnable {
    public final /* synthetic */ C3737096p A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public C3737596u(C3737096p r1, AnonymousClass9GD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C3737096p r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.onSuccess(this.A01.A06());
        }
    }
}
