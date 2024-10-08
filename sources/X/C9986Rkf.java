package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Rkf  reason: case insensitive filesystem */
public abstract class C9986Rkf {
    public static final ExecutorService A00;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new TOP());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A00 = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
