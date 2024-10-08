package X;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: X.Q6g  reason: case insensitive filesystem */
public final class C7352Q6g extends MediaDataSource {
    public final /* synthetic */ C11973Sjo A00;
    public final /* synthetic */ ByteBuffer A01;

    public final void close() {
    }

    public C7352Q6g(C11973Sjo sjo, ByteBuffer byteBuffer) {
        this.A00 = sjo;
        this.A01 = byteBuffer;
    }

    public final long getSize() {
        return (long) this.A01.limit();
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.A01;
        if (j >= ((long) byteBuffer.limit())) {
            return -1;
        }
        byteBuffer.position((int) j);
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
