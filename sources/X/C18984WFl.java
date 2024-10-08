package X;

import java.util.concurrent.Executor;

/* renamed from: X.WFl  reason: case insensitive filesystem */
public final class C18984WFl implements C13920TlM {
    public final C13920TlM A00;
    public final Executor A01;

    public final void onSuccess(Object obj) {
        this.A01.execute(new C20136Wlw(this, obj));
    }

    public C18984WFl(C13920TlM tlM, Executor executor) {
        this.A01 = executor;
        this.A00 = tlM;
    }

    public final void onError(Throwable th) {
        throw AnonymousClass00P.createAndThrow();
    }
}
