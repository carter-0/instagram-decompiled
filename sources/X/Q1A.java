package X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public final class Q1A implements C13779Tgu {
    public MediaCodec.BufferInfo A00;
    public boolean A01 = false;
    public final int A02;
    public final WeakReference A03;

    public final void EQ8(int i, int i2, long j, int i3) {
        MediaCodec.BufferInfo bufferInfo = this.A00;
        if (bufferInfo == null) {
            bufferInfo = new MediaCodec.BufferInfo();
            this.A00 = bufferInfo;
        }
        bufferInfo.set(0, i2, j, i3);
    }

    public final MediaCodec.BufferInfo AiO() {
        return this.A00;
    }

    public final ByteBuffer AjB() {
        return (ByteBuffer) this.A03.get();
    }

    public Q1A(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A03 = new WeakReference(byteBuffer);
        this.A02 = i;
        this.A00 = bufferInfo;
    }
}
