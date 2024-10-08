package X;

import java.nio.ByteBuffer;

public final class UK1 extends C71532dv implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        byte[] A07 = C18807W3e.A07(byteBuffer, i, 0);
        if (A07 != null) {
            this.A03 = A07;
            this.A01 = (AnonymousClass6WP) C18807W3e.A03(C15017UJw.class, byteBuffer, i, 1);
            AnonymousClass2e2[] r0 = (AnonymousClass2e2[]) C18807W3e.A0A(UKA.class, byteBuffer, i, 2);
            if (r0 != null) {
                this.A04 = r0;
                int i2 = 0;
                int A02 = C18807W3e.A02(byteBuffer, i, 3);
                if (A02 != 0) {
                    i2 = byteBuffer.getInt(A02);
                }
                this.A00 = i2;
                C18807W3e.A06(byteBuffer, i, 4);
                this.A05 = (WI8[]) C18807W3e.A0A(WI8.class, byteBuffer, i, 5);
                A00();
                return;
            }
            throw new IllegalArgumentException("scenes cannot be null");
        }
        throw new IllegalArgumentException("manifest cannot be null");
    }
}
