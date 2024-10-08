package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.4Xa  reason: invalid class name and case insensitive filesystem */
public final class C265974Xa implements ThreadFactory {
    public final /* synthetic */ String A00;

    public C265974Xa(String str) {
        this.A00 = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.A00);
    }
}
