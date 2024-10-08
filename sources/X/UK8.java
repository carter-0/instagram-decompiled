package X;

import java.nio.ByteBuffer;

public final class UK8 extends AnonymousClass6B4 implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        float[] A08 = C18807W3e.A08(byteBuffer, i, 0);
        if (A08 != null) {
            this.A00 = A08;
            float[] A082 = C18807W3e.A08(byteBuffer, i, 1);
            if (A082 != null) {
                this.A00 = A082;
                AnonymousClass6BG[] r0 = (AnonymousClass6BG[]) C18807W3e.A0A(UKC.class, byteBuffer, i, 2);
                if (r0 != null) {
                    this.A01 = r0;
                    return;
                }
                throw new IllegalArgumentException("tweens cannot be null");
            }
            throw new IllegalArgumentException("keyframes cannot be null");
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
