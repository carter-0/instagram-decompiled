package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TOR implements ThreadFactory {
    public final C13880Tj1 A00;
    public final boolean A01;
    public final String A02;
    public final ThreadFactory A03;
    public final AtomicInteger A04 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A03.newThread(new TFJ(this, runnable));
        newThread.setName(002.A07(this.A04.getAndIncrement(), "glide-", this.A02, "-thread-"));
        return newThread;
    }

    public TOR(C13880Tj1 tj1, String str, ThreadFactory threadFactory, boolean z) {
        this.A03 = threadFactory;
        this.A02 = str;
        this.A00 = tj1;
        this.A01 = z;
    }
}
