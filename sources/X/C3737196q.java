package X;

import java.util.concurrent.Executor;

/* renamed from: X.96q  reason: invalid class name and case insensitive filesystem */
public final class C3737196q implements AnonymousClass9GF {
    public C3736596k A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C3737196q(C3736596k r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void FPX(AnonymousClass9GD r3) {
        if (!r3.A0E() && !r3.A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new C40979AmP(this, r3));
        }
    }
}
