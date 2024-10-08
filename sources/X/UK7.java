package X;

import java.nio.ByteBuffer;

public final class UK7 extends AnonymousClass61Q implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        String A06 = C18807W3e.A06(byteBuffer, i, 0);
        if (A06 != null) {
            this.A02 = A06;
            this.A01 = C18807W3e.A01(byteBuffer, i, 1);
            this.A00 = C18807W3e.A01(byteBuffer, i, 2);
            return;
        }
        throw new IllegalArgumentException(C273654mx.A00(3050));
    }
}
