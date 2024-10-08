package X;

import java.nio.ByteBuffer;

/* renamed from: X.6AE  reason: invalid class name */
public final class AnonymousClass6AE extends AnonymousClass6AF implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        float[] A05 = C303816Aw.A05(byteBuffer, i, 0);
        if (A05 != null) {
            this.A01 = A05;
            this.A00 = A05.length;
            return;
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
