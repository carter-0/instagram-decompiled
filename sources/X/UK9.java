package X;

import java.nio.ByteBuffer;

public final class UK9 extends AnonymousClass6AF implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        float[] A08 = C18807W3e.A08(byteBuffer, i, 0);
        if (A08 != null) {
            this.A01 = A08;
            this.A00 = A08.length;
            return;
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
