package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.W0w  reason: case insensitive filesystem */
public final class C18773W0w {
    public static volatile Handler A00;

    public static Handler A00() {
        if (A00 == null) {
            synchronized (C18773W0w.class) {
                if (A00 == null) {
                    A00 = AnonymousClass7TF.A0D();
                }
            }
        }
        return A00;
    }

    public static void A01(Runnable runnable) {
        A00().postDelayed(runnable, 0);
    }

    public static boolean A02() {
        return AnonymousClass7TF.A1W(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
