package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.38E  reason: invalid class name */
public final class AnonymousClass38E implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final /* synthetic */ boolean A01;

    public final Thread newThread(Runnable runnable) {
        String str;
        0qQ.A0B(runnable, 0);
        if (this.A01) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        return new Thread(runnable, 002.A0O(str, this.A00.incrementAndGet()));
    }

    public AnonymousClass38E(boolean z) {
        this.A01 = z;
    }
}
