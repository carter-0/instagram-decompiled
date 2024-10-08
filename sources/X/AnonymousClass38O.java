package X;

import java.util.concurrent.Executor;

/* renamed from: X.38O  reason: invalid class name */
public final class AnonymousClass38O implements Executor {
    public final /* synthetic */ AnonymousClass38M A00;

    public AnonymousClass38O(AnonymousClass38M r1) {
        this.A00 = r1;
    }

    public final void execute(Runnable runnable) {
        this.A00.A00.post(runnable);
    }
}
