package X;

import java.util.concurrent.Executor;

public final class TO2 implements Executor {
    public static final TO2 A00 = new Object();

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
