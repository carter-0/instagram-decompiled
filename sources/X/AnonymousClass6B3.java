package X;

import java.nio.ByteBuffer;

/* renamed from: X.6B3  reason: invalid class name */
public final class AnonymousClass6B3 extends AnonymousClass6B4 implements C303796Au {
    public float A00;

    public final void ANd(ByteBuffer byteBuffer, int i) {
        float f = -1.0f;
        int A002 = C303816Aw.A00(byteBuffer, i, 0);
        if (A002 != 0) {
            f = byteBuffer.getFloat(A002);
        }
        this.A00 = f;
        float[] A05 = C303816Aw.A05(byteBuffer, i, 1);
        if (A05 != null) {
            this.A00 = A05;
            float[] A052 = C303816Aw.A05(byteBuffer, i, 2);
            if (A052 != null) {
                this.A00 = A052;
                AnonymousClass6BG[] r0 = (AnonymousClass6BG[]) C303816Aw.A06(AnonymousClass6BF.class, byteBuffer, i, 3);
                if (r0 != null) {
                    this.A01 = r0;
                }
            }
        }
    }
}
