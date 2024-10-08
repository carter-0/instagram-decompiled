package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.8ya  reason: invalid class name and case insensitive filesystem */
public abstract class C371548ya {
    public static final void A00(Handler handler, Runnable runnable) {
        Looper looper;
        if (handler != null) {
            looper = handler.getLooper();
        } else {
            looper = null;
        }
        if (0qQ.A0K(looper, Looper.getMainLooper()) || handler == null) {
            runnable.run();
        } else {
            handler.postAtFrontOfQueue(runnable);
        }
    }
}
