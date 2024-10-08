package X;

import android.os.Handler;

/* renamed from: X.8dd  reason: invalid class name and case insensitive filesystem */
public final class C359878dd extends Handler implements C359888de {
    public final boolean CYP() {
        if (Thread.currentThread() == super.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public final boolean E3G(Runnable runnable, String str) {
        return super.post(runnable);
    }
}
