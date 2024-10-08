package X;

import android.content.Context;
import android.media.metrics.LogSessionId;

public abstract class XUC {
    public static C22016XrA A00(Context context, C22056Xui xui) {
        LogSessionId A02;
        C22081Xv7 A00 = C22081Xv7.A00(context);
        if (A00 == null) {
            STH.A03("ExoPlayerImpl", "MediaMetricsService unavailable.");
            A02 = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            ((C22080Xv6) xui.A0X).A02.A04(A00);
            C22016XrA xrA = C22016XrA.A02;
            A02 = A00.A02();
        }
        return new C22016XrA(A02);
    }
}
