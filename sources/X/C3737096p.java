package X;

import java.util.concurrent.Executor;

/* renamed from: X.96p  reason: invalid class name and case insensitive filesystem */
public final class C3737096p implements AnonymousClass9GF {
    public C3736696l A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C3737096p(C3736696l r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void FPX(AnonymousClass9GD r3) {
        if (r3.A0E()) {
            synchronized (this.A01) {
            }
            this.A02.execute(new C3737596u(this, r3));
        }
    }
}
