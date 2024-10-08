package X;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Xcd  reason: case insensitive filesystem */
public final class C21486Xcd {
    public boolean A00;
    public final Object A01 = Pxe.A0p();
    public final C62320sa A02;
    public final Runnable A03 = new Y1Z(this);
    public final List A04 = AnonymousClass7TE.A1C();
    public final Executor A05;

    public C21486Xcd(Executor executor, C62320sa r3) {
        0qQ.A0B(executor, 1);
        this.A05 = executor;
        this.A02 = r3;
    }

    public final void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            List<C62320sa> list = this.A04;
            for (C62320sa invoke : list) {
                invoke.invoke();
            }
            list.clear();
        }
    }

    public final boolean A01() {
        boolean z;
        synchronized (this.A01) {
            z = this.A00;
        }
        return z;
    }
}
