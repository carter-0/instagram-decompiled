package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.599  reason: invalid class name */
public final class AnonymousClass599 {
    public static AnonymousClass599 A03;
    public Runnable A00;
    public boolean A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());

    public final void A00() {
        Runnable runnable;
        if (this.A01 && (runnable = this.A00) != null) {
            this.A02.removeCallbacks(runnable);
            this.A01 = false;
        }
    }
}
