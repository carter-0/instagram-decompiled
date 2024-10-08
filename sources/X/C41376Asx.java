package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Asx  reason: case insensitive filesystem */
public final /* synthetic */ class C41376Asx implements ThreadFactory {
    public static final C41376Asx A00 = new C41376Asx();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
