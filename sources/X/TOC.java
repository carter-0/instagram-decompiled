package X;

import java.util.concurrent.ThreadFactory;

public final class TOC implements ThreadFactory {
    public int A00;
    public String A01;

    public final Thread newThread(Runnable runnable) {
        return new C13232TQy(runnable, this.A01, this.A00);
    }
}
