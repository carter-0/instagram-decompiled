package X;

import java.nio.ByteBuffer;

public final class UKB extends C71542dx implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        this.A01 = byteBuffer.getFloat(i);
        this.A00 = byteBuffer.getFloat(i + 4);
    }
}
