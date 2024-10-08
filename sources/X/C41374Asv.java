package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Asv  reason: case insensitive filesystem */
public final /* synthetic */ class C41374Asv implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "BrowserLiteFragment-executor");
    }
}
