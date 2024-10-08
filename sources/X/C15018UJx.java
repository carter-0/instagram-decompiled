package X;

import java.nio.ByteBuffer;

/* renamed from: X.UJx  reason: case insensitive filesystem */
public final class C15018UJx extends V32 implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        byte[] A07 = C18807W3e.A07(byteBuffer, i, 1);
        if (A07 != null) {
            this.A00 = A07;
            return;
        }
        throw new IllegalArgumentException("audio content cannot be null");
    }
}
