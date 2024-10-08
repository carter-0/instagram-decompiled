package X;

import java.nio.ByteBuffer;

public final class UKA extends AnonymousClass2e2 implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        int A02 = C18807W3e.A02(byteBuffer, i, 0);
        if (A02 != 0) {
            byteBuffer.getInt(A02);
        }
        C71542dx r0 = (C71542dx) C18807W3e.A04(UKB.class, byteBuffer, i, 1);
        if (r0 != null) {
            this.A03 = r0;
            this.A01 = C18807W3e.A01(byteBuffer, i, 2);
            this.A00 = C18807W3e.A01(byteBuffer, i, 3);
            2dy A03 = C18807W3e.A03(UK3.class, byteBuffer, i, 4);
            if (A03 != null) {
                this.A02 = A03;
                this.A04 = (AnonymousClass61Q[]) C18807W3e.A0A(UK7.class, byteBuffer, i, 5);
                return;
            }
            throw new IllegalArgumentException(C273654mx.A00(3276));
        }
        throw new IllegalArgumentException(C273654mx.A00(3351));
    }
}
