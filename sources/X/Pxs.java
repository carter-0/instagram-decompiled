package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class Pxs implements ThreadFactory {
    public final AtomicInteger A00 = Pxf.A10();
    public final /* synthetic */ Pxr A01;

    public Pxs(Pxr pxr) {
        this.A01 = pxr;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(002.A0O("arch_disk_io_", this.A00.getAndIncrement()));
        return thread;
    }
}
