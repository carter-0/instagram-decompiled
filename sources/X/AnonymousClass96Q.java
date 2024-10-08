package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.96Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass96Q implements ThreadFactory {
    public static final ThreadFactory A00 = new Object();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
