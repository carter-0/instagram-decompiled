package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.RCu  reason: case insensitive filesystem */
public final class C8853RCu extends OutputStream {
    public final ByteBuffer A00;

    public final void write(byte[] bArr, int i, int i2) {
        this.A00.put(bArr, i, i2);
    }

    public C8853RCu(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public final void write(int i) {
        this.A00.put((byte) i);
    }
}
