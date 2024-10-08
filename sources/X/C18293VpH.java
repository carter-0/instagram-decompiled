package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.VpH  reason: case insensitive filesystem */
public abstract class C18293VpH {
    public static final Handler A00 = AnonymousClass7TF.A0D();

    public static final void A00(Runnable runnable) {
        if (0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
