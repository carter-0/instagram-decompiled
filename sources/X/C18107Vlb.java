package X;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: X.Vlb  reason: case insensitive filesystem */
public abstract class C18107Vlb {
    public static void A00(MediaDrm mediaDrm, C264894Rs r3, byte[] bArr) {
        LogSessionId A00 = r3.A00();
        if (!A00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(A00);
        }
    }

    public static boolean A01(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }
}
