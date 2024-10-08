package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class PyM implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new PyN(runnable));
        newThread.setName(this.A00);
        return newThread;
    }

    public PyM(String str) {
        AnonymousClass3Qk.A03(str, "Name must not be null");
        this.A00 = str;
    }
}
