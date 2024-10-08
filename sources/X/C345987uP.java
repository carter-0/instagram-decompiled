package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.7uP  reason: invalid class name and case insensitive filesystem */
public final class C345987uP {
    public final int A00;
    public final FloatBuffer A01;

    public C345987uP(float[] fArr) {
        int length = fArr.length;
        if (length % 2 == 0) {
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(fArr);
            this.A01 = (FloatBuffer) asFloatBuffer.position(0);
            this.A00 = 2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
