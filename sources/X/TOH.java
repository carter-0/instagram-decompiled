package X;

import exoplayer2.av1.src.Dav1dDecoder;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class TOH implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = Dav1dDecoder.sThreadPoolExecutor;
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }
}
