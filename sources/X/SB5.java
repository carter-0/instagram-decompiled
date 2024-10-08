package X;

import android.os.Handler;
import android.os.Looper;

public abstract class SB5 {
    public static final Handler A00 = AnonymousClass7TF.A0D();

    public static void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
