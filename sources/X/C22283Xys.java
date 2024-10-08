package X;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.Xys  reason: case insensitive filesystem */
public final class C22283Xys implements Y8Y {
    public final Context A00;
    public final PlaybackSession A01;
    public final C264744Rc A02 = new C264744Rc();
    public final AnonymousClass4RE A03 = new AnonymousClass4RE();
    public final Y8Z A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();
    public final HashMap A06 = AnonymousClass7TE.A1E();

    public static C22283Xys A00(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C22283Xys(context, mediaMetricsManager.createPlaybackSession());
    }

    public final LogSessionId A01() {
        return this.A01.getSessionId();
    }

    public C22283Xys(Context context, PlaybackSession playbackSession) {
        this.A00 = context.getApplicationContext();
        this.A01 = playbackSession;
        SystemClock.elapsedRealtime();
        C22284Xyt xyt = new C22284Xyt();
        this.A04 = xyt;
        xyt.A01 = this;
    }
}
