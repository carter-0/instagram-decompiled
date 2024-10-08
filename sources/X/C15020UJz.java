package X;

import java.nio.ByteBuffer;

/* renamed from: X.UJz  reason: case insensitive filesystem */
public final class C15020UJz extends 2dn implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        this.A03 = byteBuffer.get(i) & 255;
        this.A02 = byteBuffer.get(i + 1) & 255;
        this.A01 = byteBuffer.get(i + 2) & 255;
        this.A00 = byteBuffer.get(i + 3) & 255;
    }
}
