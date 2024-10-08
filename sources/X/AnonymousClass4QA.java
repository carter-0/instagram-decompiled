package X;

import java.nio.ByteBuffer;

/* renamed from: X.4QA  reason: invalid class name */
public final class AnonymousClass4QA extends C264434Pw {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public final void E5v(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.A00.A02;
        if (i2 == 536870912) {
            byteBuffer2 = A02((i / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits == A00) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(floatToIntBits);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = A02(i);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits2 == A00) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(floatToIntBits2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }
}
