package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.67V  reason: invalid class name */
public final class AnonymousClass67V extends AtomicReference implements 1aL, C65051aA {
    public final 1aL A00;
    public final AtomicReference A01 = new AtomicReference();

    public final void DUK(Object obj) {
        this.A00.DUK(obj);
    }

    public final void Do4(C65051aA r2) {
        1af.A03(r2, this.A01);
    }

    public final void dispose() {
        1af.A01(this.A01);
        1af.A01(this);
    }

    public final void onComplete() {
        this.A00.onComplete();
    }

    public final void onError(Throwable th) {
        this.A00.onError(th);
    }

    public AnonymousClass67V(1aL r2) {
        this.A00 = r2;
    }
}
