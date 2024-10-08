package X;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: X.5vv  reason: invalid class name and case insensitive filesystem */
public abstract class C299835vv {
    public static void A00(AudioTrack audioTrack, C264894Rs r3) {
        LogSessionId A00 = r3.A00();
        if (!A00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(A00);
        }
    }
}
