package X;

import android.os.Handler;
import android.os.Looper;

public abstract class SB0 {
    public static final Handler A00 = AnonymousClass7TF.A0D();

    public static final void A00(Runnable runnable) {
        if (0qQ.A0K(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
