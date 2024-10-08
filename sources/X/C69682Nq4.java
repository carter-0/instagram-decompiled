package X;

import android.os.Build;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Nq4  reason: case insensitive filesystem */
public abstract class C69682Nq4 {
    public static boolean A00(Handler handler, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C69681Nq3.A00(handler, runnable);
        }
        try {
            return AnonymousClass7TE.A1a(Handler.class.getMethod("hasCallbacks", new Class[]{Runnable.class}).invoke(handler, new Object[]{runnable}));
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw C41845B3m.A0j(cause);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException e2) {
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e2);
        }
    }
}
