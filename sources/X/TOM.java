package X;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class TOM implements ThreadFactory {
    public final /* synthetic */ ThreadFactory A00;

    public /* synthetic */ TOM(ThreadFactory threadFactory) {
        this.A00 = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.A00.newThread(new TDR(runnable));
    }
}
