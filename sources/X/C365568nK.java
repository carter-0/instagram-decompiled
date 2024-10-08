package X;

import java.util.concurrent.Executor;

/* renamed from: X.8nK  reason: invalid class name and case insensitive filesystem */
public final class C365568nK implements AnonymousClass9GF {
    public C365558nJ A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C365568nK(C365558nJ r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r2;
    }

    public final void FPX(AnonymousClass9GD r3) {
        synchronized (this.A01) {
        }
        this.A02.execute(new AnonymousClass9TZ(this, r3));
    }
}
