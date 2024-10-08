package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Asw  reason: case insensitive filesystem */
public final /* synthetic */ class C41375Asw implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "BrowserLiteFragment-executor");
    }
}
