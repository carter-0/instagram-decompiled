package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.RCj  reason: case insensitive filesystem */
public final class C8843RCj extends InputStream {
    public final ByteBuffer A00;

    public final int available() {
        return this.A00.remaining();
    }

    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    public C8843RCj(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }
}
