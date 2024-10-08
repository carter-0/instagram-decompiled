package X;

import android.media.metrics.LogSessionId;

/* renamed from: X.ToE  reason: case insensitive filesystem */
public abstract class C14012ToE {
    public static void A00(C264894Rs r1, C290385fE r2) {
        LogSessionId A00 = r1.A00();
        if (!A00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            r2.A01.setString("log-session-id", A00.getStringId());
        }
    }
}
