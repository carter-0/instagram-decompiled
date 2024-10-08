package X;

import java.nio.ByteBuffer;

/* renamed from: X.6B2  reason: invalid class name */
public final class AnonymousClass6B2 extends AnonymousClass3JV implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        float f = 0.0f;
        int A00 = C303816Aw.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            f = byteBuffer.getFloat(A00);
        }
        this.A00 = f;
        float f2 = 0.0f;
        int A002 = C303816Aw.A00(byteBuffer, i, 1);
        if (A002 != 0) {
            f2 = byteBuffer.getFloat(A002);
        }
        this.A01 = f2;
    }
}
