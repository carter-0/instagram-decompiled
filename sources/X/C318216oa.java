package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6oa  reason: invalid class name and case insensitive filesystem */
public final class C318216oa extends AtomicLong implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        StringBuilder sb = new StringBuilder(this.A01);
        sb.append('-');
        sb.append(incrementAndGet());
        String obj = sb.toString();
        if (this.A02) {
            thread = new Thread(runnable, obj);
        } else {
            thread = new Thread(runnable, obj);
        }
        thread.setPriority(this.A00);
        thread.setDaemon(true);
        return thread;
    }

    public final String toString() {
        return 002.A0g("RxThreadFactory[", this.A01, "]");
    }

    public C318216oa(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
