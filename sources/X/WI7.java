package X;

import java.nio.ByteBuffer;

public final class WI7 implements X2P {
    public float A00;
    public int[] A01;

    public final void ANd(ByteBuffer byteBuffer, int i) {
        0qQ.A0B(byteBuffer, 0);
        this.A00 = C18807W3e.A01(byteBuffer, i, 0);
        int[] A09 = C18807W3e.A09(byteBuffer, i, 1);
        if (A09 != null) {
            this.A01 = A09;
            return;
        }
        throw new IllegalArgumentException("bitmap indices cannot be null");
    }
}
