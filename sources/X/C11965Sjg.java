package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Sjg  reason: case insensitive filesystem */
public final class C11965Sjg implements C13798ThH {
    public final ByteBuffer A00;

    public final short CAz() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new RCT();
    }

    public final int E6A(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.A00;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    public final long skip(long j) {
        ByteBuffer byteBuffer = this.A00;
        int min = (int) Math.min((long) byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    public C11965Sjg(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public final int CAy() {
        return (CAz() << 8) | CAz();
    }
}
