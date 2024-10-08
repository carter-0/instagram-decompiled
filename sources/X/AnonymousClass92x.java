package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.92x  reason: invalid class name */
public final class AnonymousClass92x implements 1aL {
    public final /* synthetic */ AtomicReference A00;
    public final /* synthetic */ C252683pV A01;

    public final void DUK(Object obj) {
        0qQ.A0B(obj, 0);
        try {
            C301205yj.A00(obj, this.A01);
        } catch (InterruptedException unused) {
        }
    }

    public final void Do4(C65051aA r3) {
        0qQ.A0B(r3, 0);
        if (!1FH.A00((Object) null, r3, this.A00)) {
            r3.dispose();
        }
    }

    public final void onError(Throwable th) {
        0qQ.A0B(th, 0);
        this.A01.AI3(th);
    }

    public AnonymousClass92x(AtomicReference atomicReference, C252683pV r2) {
        this.A01 = r2;
        this.A00 = atomicReference;
    }

    public final void onComplete() {
        this.A01.AI3((Throwable) null);
    }
}
