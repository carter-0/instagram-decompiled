package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.Ru2  reason: case insensitive filesystem */
public final class C10548Ru2 {
    public final C10738RxH A00;
    public final Map A01 = new ConcurrentHashMap();
    public final ScheduledExecutorService A02;

    public /* synthetic */ C10548Ru2(C10738RxH rxH) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.A00 = rxH;
        this.A02 = scheduledThreadPoolExecutor;
    }
}
