package X;

import java.nio.ByteBuffer;

/* renamed from: X.4Q7  reason: invalid class name */
public final class AnonymousClass4Q7 extends C264434Pw {
    public final void E5v(ByteBuffer byteBuffer) {
        int[] iArr = null;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer A02 = A02(((limit - position) / this.A00.A00) * this.A06.A00);
        while (position < limit) {
            for (int i : iArr) {
                A02.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A00.A00;
        }
        byteBuffer.position(limit);
        A02.flip();
    }
}
