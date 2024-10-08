package X;

import java.nio.ByteBuffer;

/* renamed from: X.61P  reason: invalid class name */
public final class AnonymousClass61P extends AnonymousClass61Q implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        String A03 = C303816Aw.A03(byteBuffer, i, 0);
        if (A03 != null) {
            this.A02 = A03;
            float f = 0.0f;
            int A00 = C303816Aw.A00(byteBuffer, i, 1);
            if (A00 != 0) {
                f = byteBuffer.getFloat(A00);
            }
            this.A01 = f;
            float f2 = 0.0f;
            int A002 = C303816Aw.A00(byteBuffer, i, 2);
            if (A002 != 0) {
                f2 = byteBuffer.getFloat(A002);
            }
            this.A00 = f2;
            return;
        }
        throw new IllegalArgumentException("name cannot be null");
    }
}
