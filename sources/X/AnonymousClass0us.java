package X;

import android.os.Handler;

/* renamed from: X.0us  reason: invalid class name */
public final class AnonymousClass0us implements AnonymousClass0u2 {
    public AnonymousClass0u1 A00;
    public final Handler A01;
    public final Runnable A02 = new 0rV(this);

    public final void AWE() {
        AnonymousClass0u1 r1 = this.A00;
        if (r1 != null) {
            r1.E0V(3);
        }
    }

    public final void Ent(AnonymousClass0u1 r1) {
        this.A00 = r1;
    }

    public AnonymousClass0us(Handler handler) {
        this.A01 = handler;
    }

    public final void EHI() {
        throw AnonymousClass00P.createAndThrow();
    }
}
