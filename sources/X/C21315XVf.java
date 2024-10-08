package X;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* renamed from: X.XVf  reason: case insensitive filesystem */
public abstract class C21315XVf {
    public static C264894Rs A00(Context context, String str) {
        LogSessionId A01;
        C22283Xys A00 = C22283Xys.A00(context);
        if (A00 == null) {
            2AG.A04("ExoPlayerImpl", "MediaMetricsService unavailable.");
            A01 = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            C264894Rs r0 = C264894Rs.A03;
            A01 = A00.A01();
        }
        return new C264894Rs(A01, str);
    }
}
