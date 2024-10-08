package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class TOQ implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C12950TFj(this, runnable), 002.A0b(this.A01, " #", this.A02.getAndIncrement()));
    }

    public TOQ(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
