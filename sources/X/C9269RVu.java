package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: X.RVu  reason: case insensitive filesystem */
public abstract class C9269RVu {
    public static MediaCodec A00(MediaCodec.Callback callback, MediaFormat mediaFormat, String str) {
        MediaCodec mediaCodec = null;
        int i = 0;
        Exception e = null;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                MediaCodec A02 = 0fX.A02(str, 514872199);
                if (callback != null) {
                    A02.setCallback(callback);
                }
                0fX.A07(A02, (MediaCrypto) null, mediaFormat, (Surface) null, 1, -718889878);
                mediaCodec = A02;
            } catch (Exception e2) {
                e = e2;
                i++;
            }
        }
        if (mediaCodec != null) {
            return mediaCodec;
        }
        if (e == null) {
            e = JTO.A0u("Failed to create media codec encode");
        }
        throw e;
    }
}
