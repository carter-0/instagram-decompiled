package X;

import java.nio.ByteBuffer;

public final class WI8 implements X2P {
    public int[] A00;
    public 2dy[] A01;
    public byte[] A02;

    public final void ANd(ByteBuffer byteBuffer, int i) {
        String A06 = C18807W3e.A06(byteBuffer, i, 0);
        if (A06 == null || A06.isEmpty()) {
            throw new IllegalArgumentException("variable name cannot be null");
        }
        int[] A09 = C18807W3e.A09(byteBuffer, i, 1);
        if (A09 != null) {
            this.A00 = A09;
            this.A01 = new 2dy[A09.length];
            byte[] A07 = C18807W3e.A07(byteBuffer, i, 2);
            if (A07 != null) {
                this.A02 = A07;
                return;
            }
            throw new IllegalArgumentException("variable props array cannot be null");
        }
        throw new IllegalArgumentException("variable layerIds array cannot be null");
    }
}
