package X;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.Rlh  reason: case insensitive filesystem */
public abstract class C10044Rlh {
    public static final Method A00;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        A00 = method;
    }
}
