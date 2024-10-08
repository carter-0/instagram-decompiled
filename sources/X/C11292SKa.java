package X;

import android.media.MediaCodec;
import android.util.Range;
import java.util.Map;

/* renamed from: X.SKa  reason: case insensitive filesystem */
public abstract class C11292SKa {
    public static final Exception A00(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            0fX.A03(mediaCodec, 495570346);
            return null;
        } catch (Exception e) {
            try {
                Thread.sleep(10);
                0fX.A03(mediaCodec, 390960291);
                return null;
            } catch (Exception e2) {
                return new Exception(e2.getMessage(), e);
            }
        }
    }

    public static final Exception A01(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            0fX.A06(mediaCodec, 2017659072);
            return null;
        } catch (Exception e) {
            try {
                Thread.sleep(10);
                0fX.A06(mediaCodec, 1309428391);
                return null;
            } catch (Exception e2) {
                return new Exception(e2.getMessage(), e);
            }
        }
    }

    public static final void A02(Range range, String str, Map map) {
        if (range != null) {
            map.put(str, 0sr.A1P(new Comparable[]{range.getLower(), range.getUpper()}));
        }
    }
}
