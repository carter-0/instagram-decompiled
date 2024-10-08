package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.RCo  reason: case insensitive filesystem */
public final class C8848RCo extends InputStream {
    public int A00 = -1;
    public final ByteBuffer A01;

    public final synchronized void mark(int i) {
        this.A00 = this.A01.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized void reset() {
        int i = this.A00;
        if (i != -1) {
            this.A01.position(i);
        } else {
            throw JTO.A0u("Cannot reset to unset mark position");
        }
    }

    public final int available() {
        return this.A01.remaining();
    }

    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    public final long skip(long j) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }

    public C8848RCo(ByteBuffer byteBuffer) {
        this.A01 = byteBuffer;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & 255;
    }
}
