package X;

import java.util.concurrent.ThreadFactory;

public final class TOE implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new C13233TQz(this, runnable);
    }
}
