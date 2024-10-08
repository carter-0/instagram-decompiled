package X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: X.Q0l  reason: case insensitive filesystem */
public final class C7239Q0l {
    public MediaCodec.BufferInfo A00;
    public final int A01;
    public final WeakReference A02;

    public C7239Q0l(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A02 = new WeakReference(byteBuffer);
        this.A01 = i;
        this.A00 = bufferInfo;
    }
}
