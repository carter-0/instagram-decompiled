package X;

import java.nio.ByteBuffer;

/* renamed from: X.6AC  reason: invalid class name */
public final class AnonymousClass6AC extends AnonymousClass6AD implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        2dn[] A06 = C303816Aw.A06(AnonymousClass6BA.class, byteBuffer, i, 0);
        if (A06 != null) {
            this.A01 = A06;
            this.A00 = A06.length;
            return;
        }
        throw new IllegalArgumentException("colors cannot be null");
    }
}
