package X;

import android.app.ActivityThread;

/* renamed from: X.4mK  reason: invalid class name and case insensitive filesystem */
public final class C273314mK implements C273294mI {
    public final String getName() {
        return "ActivityThreadWatchdog";
    }

    public final void CoZ() {
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        if (currentActivityThread != null) {
            synchronized (currentActivityThread) {
            }
        }
    }
}
