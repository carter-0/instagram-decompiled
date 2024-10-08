package X;

import java.util.concurrent.Executor;

/* renamed from: X.WFf  reason: case insensitive filesystem */
public final class C18978WFf implements C13919TlL {
    public final C13919TlL A00;
    public final Executor A01;

    public final void onSuccess() {
        this.A01.execute(new C19938WiB(this));
    }

    public C18978WFf(C13919TlL tlL, Executor executor) {
        this.A01 = executor;
        this.A00 = tlL;
    }

    public final void onError(Throwable th) {
        throw AnonymousClass00P.createAndThrow();
    }
}
