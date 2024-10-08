package X;

import java.util.concurrent.Executor;

/* renamed from: X.96r  reason: invalid class name and case insensitive filesystem */
public final class C3737296r implements AnonymousClass9GF {
    public C3736496j A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C3737296r(C3736496j r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void FPX(AnonymousClass9GD r3) {
        if (r3.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new C40754Aik(this));
        }
    }
}
