package X;

import java.util.concurrent.Executor;

/* renamed from: X.5G0  reason: invalid class name */
public enum AnonymousClass5G0 implements Executor {
    ;

    public final String toString() {
        return "DirectExecutor";
    }

    /* access modifiers changed from: public */
    AnonymousClass5G0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
