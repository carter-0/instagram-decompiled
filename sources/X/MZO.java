package X;

import java.util.concurrent.Executor;

public final class MZO implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
