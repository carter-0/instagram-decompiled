package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.85G  reason: invalid class name */
public final class AnonymousClass85G extends AnonymousClass2Fj {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public final void A06(AnonymousClass07Z r2, AnonymousClass2gO r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        AnonymousClass85G.super.A06(r2, new C352508Dq(r3, this));
    }

    public final void A0B(Object obj) {
        this.A00.set(true);
        AnonymousClass85G.super.A0B(obj);
    }
}
