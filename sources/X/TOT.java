package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TOT implements ThreadFactory {
    public static final AtomicInteger A00 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, Pxg.A0t("measurement-", Pxe.A14(23), A00.incrementAndGet()));
    }
}
