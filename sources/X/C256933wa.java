package X;

import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.3wa  reason: invalid class name and case insensitive filesystem */
public abstract class C256933wa {
    public static C256683wB A01(C256683wB[] r4) {
        C256683wB r3 = r4[0];
        for (int i = 1; i < r4.length; i++) {
            if (r4[i].A05 > r3.A05) {
                r3 = r4[i];
            }
        }
        return r3;
    }

    public static boolean A02(C256683wB r1) {
        String str = r1.A0S;
        if (str == null || !str.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.4Ty] */
    public static C265464Ty A00(28m r4, String str, int i, long j) {
        VideoBandwidthEstimate A00 = r4.A00();
        if (i != -1 && (i <= 0 || i >= 100)) {
            i = 80;
        }
        long estimatedBitrate = A00.getEstimatedBitrate(j, -1, str);
        long estimatedBitrate2 = A00.getEstimatedBitrate(j, i, str);
        ? obj = new Object();
        obj.A02 = estimatedBitrate;
        obj.A01 = estimatedBitrate2;
        obj.A00 = i;
        return obj;
    }
}
