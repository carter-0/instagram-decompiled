package X;

import java.util.concurrent.Executor;

public final class UHO extends C18983WFk {
    public final C18983WFk A00;
    public final Executor A01;

    public UHO(C18983WFk wFk, Executor executor) {
        this.A01 = executor;
        this.A00 = wFk;
    }

    public final void onError(Throwable th) {
        throw AnonymousClass00P.createAndThrow();
    }
}
