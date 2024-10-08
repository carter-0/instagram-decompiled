package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;

public final class S37 {
    public int A00;
    public MediaCodec A01;
    public boolean A02;
    public final MediaCodec.BufferInfo A03 = new MediaCodec.BufferInfo();
    public final MediaExtractor A04 = new MediaExtractor();
    public final C10538Rts A05;
    public final String A06;

    public final void A00() {
        this.A04.release();
        MediaCodec mediaCodec = this.A01;
        if (mediaCodec != null) {
            0fX.A03(mediaCodec, -462309544);
            this.A01 = null;
        }
    }

    public S37(C10538Rts rts, String str) {
        this.A06 = str;
        this.A05 = rts;
    }
}
