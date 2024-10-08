package X;

import android.media.MediaCodec;
import android.media.MediaFormat;

/* renamed from: X.XFv  reason: case insensitive filesystem */
public final class C21128XFv extends MediaCodec.Callback {
    public final /* synthetic */ XIJ A00;

    public C21128XFv(XIJ xij) {
        this.A00 = xij;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.A00.A06.A01(codecException);
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.A00.A01(mediaCodec, i);
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.A00.A02(mediaCodec, i, bufferInfo);
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.A00.A02 = mediaFormat;
    }
}
