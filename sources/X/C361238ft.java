package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.8ft  reason: invalid class name and case insensitive filesystem */
public final class C361238ft {
    public final A3Q A00;

    public C361238ft(MediaFormat mediaFormat) {
        0qQ.A0B(mediaFormat, 1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(Pxd.A00(755));
        A3Q a3q = null;
        if (byteBuffer != null) {
            try {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                a3q = new A3Q(byteBuffer.getShort(21));
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        this.A00 = a3q;
    }
}
