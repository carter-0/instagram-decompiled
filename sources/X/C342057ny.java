package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7ny  reason: invalid class name and case insensitive filesystem */
public final class C342057ny {
    public static final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        if (A02()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }

    public static void A01(String str) {
        if (A02()) {
            throw new IllegalThreadStateException(002.A0g(str, " Current thread: ", Thread.currentThread().getName()));
        }
    }

    public static boolean A02() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
