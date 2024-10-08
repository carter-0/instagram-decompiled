package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Y5r  reason: case insensitive filesystem */
public final class C22474Y5r extends AtomicReference implements C65051aA {
    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            ((Runnable) andSet).run();
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RunnableDisposable(disposed=");
        A1A.append(DbW.A1a(get()));
        A1A.append(", ");
        A1A.append(get());
        return AnonymousClass7TF.A0l(")", A1A);
    }
}
